/*
 * Copyright 2016-present Facebook, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.facebook.buck.parser;

import com.facebook.buck.cli.BuckConfig;
import com.facebook.buck.config.ConfigView;
import com.facebook.buck.io.ExecutableFinder;
import com.facebook.buck.python.PythonBuckConfig;
import com.facebook.buck.util.MoreCollectors;
import com.facebook.buck.util.WatchmanWatcher;
import com.facebook.buck.util.immutables.BuckStyleImmutable;
import com.google.common.base.Splitter;
import com.google.common.base.Strings;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.ImmutableSet;

import org.immutables.value.Value;

import java.nio.file.Path;
import java.util.Optional;
import java.util.regex.Pattern;


@Value.Immutable(builder = false, copy = false)
@BuckStyleImmutable
abstract class AbstractParserConfig implements ConfigView<BuckConfig> {

  public static final boolean DEFAULT_ALLOW_EMPTY_GLOBS = true;
  public static final String DEFAULT_BUILD_FILE_NAME = "BUCK";
  public static final String BUILDFILE_SECTION_NAME = "buildfile";
  public static final String INCLUDES_PROPERTY_NAME = "includes";

  private static final long NUM_PARSING_THREADS_DEFAULT = 1L;

  public enum GlobHandler {
    PYTHON,
    WATCHMAN,
    MERCURIAL,
    ;
  }

  public enum WatchmanGlobSanityCheck {
    NONE,
    STAT,
    ;
  }

  public enum AllowSymlinks {
    ALLOW,
    WARN,
    FORBID,
    ;
  }

  public enum BuildFileSearchMethod {
    FILESYSTEM_CRAWL,
    WATCHMAN,
    ;
  }

  /**
   * Controls whether default flavors should be applied to unflavored targets.
   */
  public enum ApplyDefaultFlavorsMode {
    ENABLED,
    DISABLED
  }

  @Value.Lazy
  public boolean getAllowEmptyGlobs() {
    return getDelegate()
        .getValue("build", "allow_empty_globs").map(Boolean::parseBoolean).orElse(
            DEFAULT_ALLOW_EMPTY_GLOBS);
  }

  @Value.Lazy
  public String getBuildFileName() {
    return getDelegate().getValue(BUILDFILE_SECTION_NAME, "name").orElse(DEFAULT_BUILD_FILE_NAME);
  }

  /**
   * A (possibly empty) sequence of paths to files that should be included by default when
   * evaluating a build file.
   */
  @Value.Lazy
  public Iterable<String> getDefaultIncludes() {
    ImmutableMap<String, String> entries =
        getDelegate().getEntriesForSection(BUILDFILE_SECTION_NAME);
    String includes = Strings.nullToEmpty(entries.get("includes"));
    return Splitter.on(' ').trimResults().omitEmptyStrings().split(includes);
  }

  @Value.Lazy
  public boolean getEnforceBuckPackageBoundary() {
    return getDelegate().getBooleanValue("project", "check_package_boundary", true);
  }

  /**
   * A list of absolute paths under which buck package boundary checks should not be performed.
   */
  @Value.Lazy
  public ImmutableList<Path> getBuckPackageBoundaryExceptions() {
    return getDelegate().getOptionalPathList("project", "package_boundary_exceptions")
        .orElse(ImmutableList.of());
  }

  @Value.Lazy
  public ImmutableSet<Pattern> getTempFilePatterns() {
    return getDelegate().getListWithoutComments("project", "temp_files").stream()
        .map(Pattern::compile)
        .collect(MoreCollectors.toImmutableSet());
  }

  @Value.Lazy
  public Optional<ImmutableList<Path>> getReadOnlyPaths() {
    return getDelegate().getOptionalPathList("project", "read_only_paths");
  }

  @Value.Lazy
  public AllowSymlinks getAllowSymlinks() {
    return getDelegate().getEnum("project", "allow_symlinks", AllowSymlinks.class).orElse(
        AllowSymlinks.WARN);
  }

  @Value.Lazy
  public Optional<BuildFileSearchMethod> getBuildFileSearchMethod() {
    return
        getDelegate().getEnum("project", "build_file_search_method", BuildFileSearchMethod.class);
  }

  @Value.Lazy
  public GlobHandler getGlobHandler() {
    return
        getDelegate().getEnum(
            "project",
            "glob_handler",
            GlobHandler.class).orElse(GlobHandler.PYTHON);
  }

  @Value.Lazy
  public WatchmanGlobSanityCheck getWatchmanGlobSanityCheck() {
    return getDelegate()
        .getEnum("project", "watchman_glob_sanity_check", WatchmanGlobSanityCheck.class).orElse(
            WatchmanGlobSanityCheck.STAT);
  }

  @Value.Lazy
  public Optional<Long> getWatchmanQueryTimeoutMs() {
    return getDelegate().getLong("project", "watchman_query_timeout_ms");
  }

  @Value.Lazy
  public boolean getWatchCells() {
    return getDelegate().getBooleanValue("project", "watch_cells", false);
  }

  @Value.Lazy
  public WatchmanWatcher.CursorType getWatchmanCursor() {
    return getDelegate()
      .getEnum("project", "watchman_cursor", WatchmanWatcher.CursorType.class)
      .orElse(WatchmanWatcher.CursorType.NAMED);
  }

  @Value.Lazy
  public boolean getEnableParallelParsing() {
    return getDelegate().getBooleanValue("project", "parallel_parsing", true);
  }

  @Value.Lazy
  public boolean getTrackCellAgnosticTarget() {
    return getDelegate().getBooleanValue("project", "track_cell_agnostic_target", false);
  }

  @Value.Lazy
  public int getNumParsingThreads() {
    if (!getEnableParallelParsing()) {
      return 1;
    }

    int value = getDelegate()
        .getLong("project", "parsing_threads").orElse(NUM_PARSING_THREADS_DEFAULT)
        .intValue();

    return Math.min(value, getDelegate().getNumThreads());
  }

  @Value.Lazy
  public ApplyDefaultFlavorsMode getDefaultFlavorsMode() {
    return getDelegate().getEnum(
        "project",
        "default_flavors_mode",
        ApplyDefaultFlavorsMode.class).orElse(ApplyDefaultFlavorsMode.ENABLED);
  }

  @Value.Lazy
  public boolean getEnableBuildFileSandboxing() {
    return getDelegate().getBooleanValue("project", "enable_build_file_sandboxing", false);
  }

  @Value.Lazy
  public ImmutableList<String> getBuildFileImportWhitelist() {
    return getDelegate().getListWithoutComments("project", "build_file_import_whitelist");
  }

  /**
   * Returns the path to python interpreter. If python is specified in the
   * 'python_interpreter' key of the 'parser' section that is used and an
   * error reported if invalid.
   *
   * If none has been specified, consult the PythonBuckConfig for an interpreter.
   *
   * @return The found python interpreter.
   */
  @Value.Lazy
  public String getPythonInterpreter(Optional<String> configPath, ExecutableFinder exeFinder) {
    PythonBuckConfig pyconfig = new PythonBuckConfig(getDelegate(), exeFinder);
    if (configPath.isPresent()) {
      return pyconfig.getPythonInterpreter(configPath);
    }

    // Fall back to the Python section configuration
    return pyconfig.getPythonInterpreter();
  }

  @Value.Lazy
  public String getPythonInterpreter(ExecutableFinder exeFinder) {
    Optional<String> configPath = getDelegate().getValue(
        "parser",
        "python_interpreter"
    );
    return getPythonInterpreter(configPath, exeFinder);
  }

  /**
   * Returns the module search path PYTHONPATH to set for the parser, as
   * specified by the 'python_path' key of the 'parser' section.
   *
   * @return The PYTHONPATH value or an empty string if not set.
   */
  @Value.Lazy
  public Optional<String> getPythonModuleSearchPath() {
    return getDelegate().getValue("parser", "python_path");
  }

}
