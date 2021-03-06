/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.facebook.buck.distributed.thrift;

import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;

import org.apache.thrift.scheme.TupleScheme;
import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.protocol.TProtocolException;
import org.apache.thrift.EncodingUtils;
import org.apache.thrift.TException;
import org.apache.thrift.async.AsyncMethodCallback;
import org.apache.thrift.server.AbstractNonblockingServer.*;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.EnumMap;
import java.util.Set;
import java.util.HashSet;
import java.util.EnumSet;
import java.util.Collections;
import java.util.BitSet;
import java.nio.ByteBuffer;
import java.util.Arrays;
import javax.annotation.Generated;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@SuppressWarnings({"cast", "rawtypes", "serial", "unchecked"})
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-12-07")
public class BuildJob implements org.apache.thrift.TBase<BuildJob, BuildJob._Fields>, java.io.Serializable, Cloneable, Comparable<BuildJob> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("BuildJob");

  private static final org.apache.thrift.protocol.TField BUILD_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("buildId", org.apache.thrift.protocol.TType.STRUCT, (short)1);
  private static final org.apache.thrift.protocol.TField DEBUG_FIELD_DESC = new org.apache.thrift.protocol.TField("debug", org.apache.thrift.protocol.TType.STRUCT, (short)2);
  private static final org.apache.thrift.protocol.TField STATUS_FIELD_DESC = new org.apache.thrift.protocol.TField("status", org.apache.thrift.protocol.TType.I32, (short)3);
  private static final org.apache.thrift.protocol.TField BUCK_VERSION_FIELD_DESC = new org.apache.thrift.protocol.TField("buckVersion", org.apache.thrift.protocol.TType.STRUCT, (short)4);
  private static final org.apache.thrift.protocol.TField SLAVE_INFO_BY_RUN_ID_FIELD_DESC = new org.apache.thrift.protocol.TField("slaveInfoByRunId", org.apache.thrift.protocol.TType.MAP, (short)5);
  private static final org.apache.thrift.protocol.TField DOT_FILES_FIELD_DESC = new org.apache.thrift.protocol.TField("dotFiles", org.apache.thrift.protocol.TType.LIST, (short)6);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new BuildJobStandardSchemeFactory());
    schemes.put(TupleScheme.class, new BuildJobTupleSchemeFactory());
  }

  public BuildId buildId; // optional
  public DebugInfo debug; // optional
  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus status; // optional
  public BuckVersion buckVersion; // optional
  public Map<String,BuildSlaveInfo> slaveInfoByRunId; // optional
  public List<PathInfo> dotFiles; // optional

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    BUILD_ID((short)1, "buildId"),
    DEBUG((short)2, "debug"),
    /**
     * 
     * @see BuildStatus
     */
    STATUS((short)3, "status"),
    BUCK_VERSION((short)4, "buckVersion"),
    SLAVE_INFO_BY_RUN_ID((short)5, "slaveInfoByRunId"),
    DOT_FILES((short)6, "dotFiles");

    private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

    static {
      for (_Fields field : EnumSet.allOf(_Fields.class)) {
        byName.put(field.getFieldName(), field);
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, or null if its not found.
     */
    public static _Fields findByThriftId(int fieldId) {
      switch(fieldId) {
        case 1: // BUILD_ID
          return BUILD_ID;
        case 2: // DEBUG
          return DEBUG;
        case 3: // STATUS
          return STATUS;
        case 4: // BUCK_VERSION
          return BUCK_VERSION;
        case 5: // SLAVE_INFO_BY_RUN_ID
          return SLAVE_INFO_BY_RUN_ID;
        case 6: // DOT_FILES
          return DOT_FILES;
        default:
          return null;
      }
    }

    /**
     * Find the _Fields constant that matches fieldId, throwing an exception
     * if it is not found.
     */
    public static _Fields findByThriftIdOrThrow(int fieldId) {
      _Fields fields = findByThriftId(fieldId);
      if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
      return fields;
    }

    /**
     * Find the _Fields constant that matches name, or null if its not found.
     */
    public static _Fields findByName(String name) {
      return byName.get(name);
    }

    private final short _thriftId;
    private final String _fieldName;

    _Fields(short thriftId, String fieldName) {
      _thriftId = thriftId;
      _fieldName = fieldName;
    }

    public short getThriftFieldId() {
      return _thriftId;
    }

    public String getFieldName() {
      return _fieldName;
    }
  }

  // isset id assignments
  private static final _Fields optionals[] = {_Fields.BUILD_ID,_Fields.DEBUG,_Fields.STATUS,_Fields.BUCK_VERSION,_Fields.SLAVE_INFO_BY_RUN_ID,_Fields.DOT_FILES};
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.BUILD_ID, new org.apache.thrift.meta_data.FieldMetaData("buildId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildId.class)));
    tmpMap.put(_Fields.DEBUG, new org.apache.thrift.meta_data.FieldMetaData("debug", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, DebugInfo.class)));
    tmpMap.put(_Fields.STATUS, new org.apache.thrift.meta_data.FieldMetaData("status", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, BuildStatus.class)));
    tmpMap.put(_Fields.BUCK_VERSION, new org.apache.thrift.meta_data.FieldMetaData("buckVersion", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuckVersion.class)));
    tmpMap.put(_Fields.SLAVE_INFO_BY_RUN_ID, new org.apache.thrift.meta_data.FieldMetaData("slaveInfoByRunId", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.MapMetaData(org.apache.thrift.protocol.TType.MAP, 
            new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.STRING), 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, BuildSlaveInfo.class))));
    tmpMap.put(_Fields.DOT_FILES, new org.apache.thrift.meta_data.FieldMetaData("dotFiles", org.apache.thrift.TFieldRequirementType.OPTIONAL, 
        new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
            new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, PathInfo.class))));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(BuildJob.class, metaDataMap);
  }

  public BuildJob() {
    this.status = com.facebook.buck.distributed.thrift.BuildStatus.UNKNOWN;

  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public BuildJob(BuildJob other) {
    if (other.isSetBuildId()) {
      this.buildId = new BuildId(other.buildId);
    }
    if (other.isSetDebug()) {
      this.debug = new DebugInfo(other.debug);
    }
    if (other.isSetStatus()) {
      this.status = other.status;
    }
    if (other.isSetBuckVersion()) {
      this.buckVersion = new BuckVersion(other.buckVersion);
    }
    if (other.isSetSlaveInfoByRunId()) {
      Map<String,BuildSlaveInfo> __this__slaveInfoByRunId = new HashMap<String,BuildSlaveInfo>(other.slaveInfoByRunId.size());
      for (Map.Entry<String, BuildSlaveInfo> other_element : other.slaveInfoByRunId.entrySet()) {

        String other_element_key = other_element.getKey();
        BuildSlaveInfo other_element_value = other_element.getValue();

        String __this__slaveInfoByRunId_copy_key = other_element_key;

        BuildSlaveInfo __this__slaveInfoByRunId_copy_value = new BuildSlaveInfo(other_element_value);

        __this__slaveInfoByRunId.put(__this__slaveInfoByRunId_copy_key, __this__slaveInfoByRunId_copy_value);
      }
      this.slaveInfoByRunId = __this__slaveInfoByRunId;
    }
    if (other.isSetDotFiles()) {
      List<PathInfo> __this__dotFiles = new ArrayList<PathInfo>(other.dotFiles.size());
      for (PathInfo other_element : other.dotFiles) {
        __this__dotFiles.add(new PathInfo(other_element));
      }
      this.dotFiles = __this__dotFiles;
    }
  }

  public BuildJob deepCopy() {
    return new BuildJob(this);
  }

  @Override
  public void clear() {
    this.buildId = null;
    this.debug = null;
    this.status = com.facebook.buck.distributed.thrift.BuildStatus.UNKNOWN;

    this.buckVersion = null;
    this.slaveInfoByRunId = null;
    this.dotFiles = null;
  }

  public BuildId getBuildId() {
    return this.buildId;
  }

  public BuildJob setBuildId(BuildId buildId) {
    this.buildId = buildId;
    return this;
  }

  public void unsetBuildId() {
    this.buildId = null;
  }

  /** Returns true if field buildId is set (has been assigned a value) and false otherwise */
  public boolean isSetBuildId() {
    return this.buildId != null;
  }

  public void setBuildIdIsSet(boolean value) {
    if (!value) {
      this.buildId = null;
    }
  }

  public DebugInfo getDebug() {
    return this.debug;
  }

  public BuildJob setDebug(DebugInfo debug) {
    this.debug = debug;
    return this;
  }

  public void unsetDebug() {
    this.debug = null;
  }

  /** Returns true if field debug is set (has been assigned a value) and false otherwise */
  public boolean isSetDebug() {
    return this.debug != null;
  }

  public void setDebugIsSet(boolean value) {
    if (!value) {
      this.debug = null;
    }
  }

  /**
   * 
   * @see BuildStatus
   */
  public BuildStatus getStatus() {
    return this.status;
  }

  /**
   * 
   * @see BuildStatus
   */
  public BuildJob setStatus(BuildStatus status) {
    this.status = status;
    return this;
  }

  public void unsetStatus() {
    this.status = null;
  }

  /** Returns true if field status is set (has been assigned a value) and false otherwise */
  public boolean isSetStatus() {
    return this.status != null;
  }

  public void setStatusIsSet(boolean value) {
    if (!value) {
      this.status = null;
    }
  }

  public BuckVersion getBuckVersion() {
    return this.buckVersion;
  }

  public BuildJob setBuckVersion(BuckVersion buckVersion) {
    this.buckVersion = buckVersion;
    return this;
  }

  public void unsetBuckVersion() {
    this.buckVersion = null;
  }

  /** Returns true if field buckVersion is set (has been assigned a value) and false otherwise */
  public boolean isSetBuckVersion() {
    return this.buckVersion != null;
  }

  public void setBuckVersionIsSet(boolean value) {
    if (!value) {
      this.buckVersion = null;
    }
  }

  public int getSlaveInfoByRunIdSize() {
    return (this.slaveInfoByRunId == null) ? 0 : this.slaveInfoByRunId.size();
  }

  public void putToSlaveInfoByRunId(String key, BuildSlaveInfo val) {
    if (this.slaveInfoByRunId == null) {
      this.slaveInfoByRunId = new HashMap<String,BuildSlaveInfo>();
    }
    this.slaveInfoByRunId.put(key, val);
  }

  public Map<String,BuildSlaveInfo> getSlaveInfoByRunId() {
    return this.slaveInfoByRunId;
  }

  public BuildJob setSlaveInfoByRunId(Map<String,BuildSlaveInfo> slaveInfoByRunId) {
    this.slaveInfoByRunId = slaveInfoByRunId;
    return this;
  }

  public void unsetSlaveInfoByRunId() {
    this.slaveInfoByRunId = null;
  }

  /** Returns true if field slaveInfoByRunId is set (has been assigned a value) and false otherwise */
  public boolean isSetSlaveInfoByRunId() {
    return this.slaveInfoByRunId != null;
  }

  public void setSlaveInfoByRunIdIsSet(boolean value) {
    if (!value) {
      this.slaveInfoByRunId = null;
    }
  }

  public int getDotFilesSize() {
    return (this.dotFiles == null) ? 0 : this.dotFiles.size();
  }

  public java.util.Iterator<PathInfo> getDotFilesIterator() {
    return (this.dotFiles == null) ? null : this.dotFiles.iterator();
  }

  public void addToDotFiles(PathInfo elem) {
    if (this.dotFiles == null) {
      this.dotFiles = new ArrayList<PathInfo>();
    }
    this.dotFiles.add(elem);
  }

  public List<PathInfo> getDotFiles() {
    return this.dotFiles;
  }

  public BuildJob setDotFiles(List<PathInfo> dotFiles) {
    this.dotFiles = dotFiles;
    return this;
  }

  public void unsetDotFiles() {
    this.dotFiles = null;
  }

  /** Returns true if field dotFiles is set (has been assigned a value) and false otherwise */
  public boolean isSetDotFiles() {
    return this.dotFiles != null;
  }

  public void setDotFilesIsSet(boolean value) {
    if (!value) {
      this.dotFiles = null;
    }
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case BUILD_ID:
      if (value == null) {
        unsetBuildId();
      } else {
        setBuildId((BuildId)value);
      }
      break;

    case DEBUG:
      if (value == null) {
        unsetDebug();
      } else {
        setDebug((DebugInfo)value);
      }
      break;

    case STATUS:
      if (value == null) {
        unsetStatus();
      } else {
        setStatus((BuildStatus)value);
      }
      break;

    case BUCK_VERSION:
      if (value == null) {
        unsetBuckVersion();
      } else {
        setBuckVersion((BuckVersion)value);
      }
      break;

    case SLAVE_INFO_BY_RUN_ID:
      if (value == null) {
        unsetSlaveInfoByRunId();
      } else {
        setSlaveInfoByRunId((Map<String,BuildSlaveInfo>)value);
      }
      break;

    case DOT_FILES:
      if (value == null) {
        unsetDotFiles();
      } else {
        setDotFiles((List<PathInfo>)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case BUILD_ID:
      return getBuildId();

    case DEBUG:
      return getDebug();

    case STATUS:
      return getStatus();

    case BUCK_VERSION:
      return getBuckVersion();

    case SLAVE_INFO_BY_RUN_ID:
      return getSlaveInfoByRunId();

    case DOT_FILES:
      return getDotFiles();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case BUILD_ID:
      return isSetBuildId();
    case DEBUG:
      return isSetDebug();
    case STATUS:
      return isSetStatus();
    case BUCK_VERSION:
      return isSetBuckVersion();
    case SLAVE_INFO_BY_RUN_ID:
      return isSetSlaveInfoByRunId();
    case DOT_FILES:
      return isSetDotFiles();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof BuildJob)
      return this.equals((BuildJob)that);
    return false;
  }

  public boolean equals(BuildJob that) {
    if (that == null)
      return false;

    boolean this_present_buildId = true && this.isSetBuildId();
    boolean that_present_buildId = true && that.isSetBuildId();
    if (this_present_buildId || that_present_buildId) {
      if (!(this_present_buildId && that_present_buildId))
        return false;
      if (!this.buildId.equals(that.buildId))
        return false;
    }

    boolean this_present_debug = true && this.isSetDebug();
    boolean that_present_debug = true && that.isSetDebug();
    if (this_present_debug || that_present_debug) {
      if (!(this_present_debug && that_present_debug))
        return false;
      if (!this.debug.equals(that.debug))
        return false;
    }

    boolean this_present_status = true && this.isSetStatus();
    boolean that_present_status = true && that.isSetStatus();
    if (this_present_status || that_present_status) {
      if (!(this_present_status && that_present_status))
        return false;
      if (!this.status.equals(that.status))
        return false;
    }

    boolean this_present_buckVersion = true && this.isSetBuckVersion();
    boolean that_present_buckVersion = true && that.isSetBuckVersion();
    if (this_present_buckVersion || that_present_buckVersion) {
      if (!(this_present_buckVersion && that_present_buckVersion))
        return false;
      if (!this.buckVersion.equals(that.buckVersion))
        return false;
    }

    boolean this_present_slaveInfoByRunId = true && this.isSetSlaveInfoByRunId();
    boolean that_present_slaveInfoByRunId = true && that.isSetSlaveInfoByRunId();
    if (this_present_slaveInfoByRunId || that_present_slaveInfoByRunId) {
      if (!(this_present_slaveInfoByRunId && that_present_slaveInfoByRunId))
        return false;
      if (!this.slaveInfoByRunId.equals(that.slaveInfoByRunId))
        return false;
    }

    boolean this_present_dotFiles = true && this.isSetDotFiles();
    boolean that_present_dotFiles = true && that.isSetDotFiles();
    if (this_present_dotFiles || that_present_dotFiles) {
      if (!(this_present_dotFiles && that_present_dotFiles))
        return false;
      if (!this.dotFiles.equals(that.dotFiles))
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_buildId = true && (isSetBuildId());
    list.add(present_buildId);
    if (present_buildId)
      list.add(buildId);

    boolean present_debug = true && (isSetDebug());
    list.add(present_debug);
    if (present_debug)
      list.add(debug);

    boolean present_status = true && (isSetStatus());
    list.add(present_status);
    if (present_status)
      list.add(status.getValue());

    boolean present_buckVersion = true && (isSetBuckVersion());
    list.add(present_buckVersion);
    if (present_buckVersion)
      list.add(buckVersion);

    boolean present_slaveInfoByRunId = true && (isSetSlaveInfoByRunId());
    list.add(present_slaveInfoByRunId);
    if (present_slaveInfoByRunId)
      list.add(slaveInfoByRunId);

    boolean present_dotFiles = true && (isSetDotFiles());
    list.add(present_dotFiles);
    if (present_dotFiles)
      list.add(dotFiles);

    return list.hashCode();
  }

  @Override
  public int compareTo(BuildJob other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetBuildId()).compareTo(other.isSetBuildId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuildId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buildId, other.buildId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDebug()).compareTo(other.isSetDebug());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDebug()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.debug, other.debug);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetStatus()).compareTo(other.isSetStatus());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetStatus()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.status, other.status);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetBuckVersion()).compareTo(other.isSetBuckVersion());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetBuckVersion()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.buckVersion, other.buckVersion);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetSlaveInfoByRunId()).compareTo(other.isSetSlaveInfoByRunId());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetSlaveInfoByRunId()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.slaveInfoByRunId, other.slaveInfoByRunId);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetDotFiles()).compareTo(other.isSetDotFiles());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetDotFiles()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.dotFiles, other.dotFiles);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    return 0;
  }

  public _Fields fieldForId(int fieldId) {
    return _Fields.findByThriftId(fieldId);
  }

  public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
    schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
  }

  public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
    schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder("BuildJob(");
    boolean first = true;

    if (isSetBuildId()) {
      sb.append("buildId:");
      if (this.buildId == null) {
        sb.append("null");
      } else {
        sb.append(this.buildId);
      }
      first = false;
    }
    if (isSetDebug()) {
      if (!first) sb.append(", ");
      sb.append("debug:");
      if (this.debug == null) {
        sb.append("null");
      } else {
        sb.append(this.debug);
      }
      first = false;
    }
    if (isSetStatus()) {
      if (!first) sb.append(", ");
      sb.append("status:");
      if (this.status == null) {
        sb.append("null");
      } else {
        sb.append(this.status);
      }
      first = false;
    }
    if (isSetBuckVersion()) {
      if (!first) sb.append(", ");
      sb.append("buckVersion:");
      if (this.buckVersion == null) {
        sb.append("null");
      } else {
        sb.append(this.buckVersion);
      }
      first = false;
    }
    if (isSetSlaveInfoByRunId()) {
      if (!first) sb.append(", ");
      sb.append("slaveInfoByRunId:");
      if (this.slaveInfoByRunId == null) {
        sb.append("null");
      } else {
        sb.append(this.slaveInfoByRunId);
      }
      first = false;
    }
    if (isSetDotFiles()) {
      if (!first) sb.append(", ");
      sb.append("dotFiles:");
      if (this.dotFiles == null) {
        sb.append("null");
      } else {
        sb.append(this.dotFiles);
      }
      first = false;
    }
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
    if (buildId != null) {
      buildId.validate();
    }
    if (debug != null) {
      debug.validate();
    }
    if (buckVersion != null) {
      buckVersion.validate();
    }
  }

  private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
    try {
      write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
    try {
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class BuildJobStandardSchemeFactory implements SchemeFactory {
    public BuildJobStandardScheme getScheme() {
      return new BuildJobStandardScheme();
    }
  }

  private static class BuildJobStandardScheme extends StandardScheme<BuildJob> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, BuildJob struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // BUILD_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buildId = new BuildId();
              struct.buildId.read(iprot);
              struct.setBuildIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // DEBUG
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.debug = new DebugInfo();
              struct.debug.read(iprot);
              struct.setDebugIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // STATUS
            if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
              struct.status = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
              struct.setStatusIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // BUCK_VERSION
            if (schemeField.type == org.apache.thrift.protocol.TType.STRUCT) {
              struct.buckVersion = new BuckVersion();
              struct.buckVersion.read(iprot);
              struct.setBuckVersionIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // SLAVE_INFO_BY_RUN_ID
            if (schemeField.type == org.apache.thrift.protocol.TType.MAP) {
              {
                org.apache.thrift.protocol.TMap _map32 = iprot.readMapBegin();
                struct.slaveInfoByRunId = new HashMap<String,BuildSlaveInfo>(2*_map32.size);
                String _key33;
                BuildSlaveInfo _val34;
                for (int _i35 = 0; _i35 < _map32.size; ++_i35)
                {
                  _key33 = iprot.readString();
                  _val34 = new BuildSlaveInfo();
                  _val34.read(iprot);
                  struct.slaveInfoByRunId.put(_key33, _val34);
                }
                iprot.readMapEnd();
              }
              struct.setSlaveInfoByRunIdIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // DOT_FILES
            if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
              {
                org.apache.thrift.protocol.TList _list36 = iprot.readListBegin();
                struct.dotFiles = new ArrayList<PathInfo>(_list36.size);
                PathInfo _elem37;
                for (int _i38 = 0; _i38 < _list36.size; ++_i38)
                {
                  _elem37 = new PathInfo();
                  _elem37.read(iprot);
                  struct.dotFiles.add(_elem37);
                }
                iprot.readListEnd();
              }
              struct.setDotFilesIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          default:
            org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
        }
        iprot.readFieldEnd();
      }
      iprot.readStructEnd();

      // check for required fields of primitive type, which can't be checked in the validate method
      struct.validate();
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot, BuildJob struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      if (struct.buildId != null) {
        if (struct.isSetBuildId()) {
          oprot.writeFieldBegin(BUILD_ID_FIELD_DESC);
          struct.buildId.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.debug != null) {
        if (struct.isSetDebug()) {
          oprot.writeFieldBegin(DEBUG_FIELD_DESC);
          struct.debug.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.status != null) {
        if (struct.isSetStatus()) {
          oprot.writeFieldBegin(STATUS_FIELD_DESC);
          oprot.writeI32(struct.status.getValue());
          oprot.writeFieldEnd();
        }
      }
      if (struct.buckVersion != null) {
        if (struct.isSetBuckVersion()) {
          oprot.writeFieldBegin(BUCK_VERSION_FIELD_DESC);
          struct.buckVersion.write(oprot);
          oprot.writeFieldEnd();
        }
      }
      if (struct.slaveInfoByRunId != null) {
        if (struct.isSetSlaveInfoByRunId()) {
          oprot.writeFieldBegin(SLAVE_INFO_BY_RUN_ID_FIELD_DESC);
          {
            oprot.writeMapBegin(new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, struct.slaveInfoByRunId.size()));
            for (Map.Entry<String, BuildSlaveInfo> _iter39 : struct.slaveInfoByRunId.entrySet())
            {
              oprot.writeString(_iter39.getKey());
              _iter39.getValue().write(oprot);
            }
            oprot.writeMapEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      if (struct.dotFiles != null) {
        if (struct.isSetDotFiles()) {
          oprot.writeFieldBegin(DOT_FILES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.dotFiles.size()));
            for (PathInfo _iter40 : struct.dotFiles)
            {
              _iter40.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
      }
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class BuildJobTupleSchemeFactory implements SchemeFactory {
    public BuildJobTupleScheme getScheme() {
      return new BuildJobTupleScheme();
    }
  }

  private static class BuildJobTupleScheme extends TupleScheme<BuildJob> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, BuildJob struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetBuildId()) {
        optionals.set(0);
      }
      if (struct.isSetDebug()) {
        optionals.set(1);
      }
      if (struct.isSetStatus()) {
        optionals.set(2);
      }
      if (struct.isSetBuckVersion()) {
        optionals.set(3);
      }
      if (struct.isSetSlaveInfoByRunId()) {
        optionals.set(4);
      }
      if (struct.isSetDotFiles()) {
        optionals.set(5);
      }
      oprot.writeBitSet(optionals, 6);
      if (struct.isSetBuildId()) {
        struct.buildId.write(oprot);
      }
      if (struct.isSetDebug()) {
        struct.debug.write(oprot);
      }
      if (struct.isSetStatus()) {
        oprot.writeI32(struct.status.getValue());
      }
      if (struct.isSetBuckVersion()) {
        struct.buckVersion.write(oprot);
      }
      if (struct.isSetSlaveInfoByRunId()) {
        {
          oprot.writeI32(struct.slaveInfoByRunId.size());
          for (Map.Entry<String, BuildSlaveInfo> _iter41 : struct.slaveInfoByRunId.entrySet())
          {
            oprot.writeString(_iter41.getKey());
            _iter41.getValue().write(oprot);
          }
        }
      }
      if (struct.isSetDotFiles()) {
        {
          oprot.writeI32(struct.dotFiles.size());
          for (PathInfo _iter42 : struct.dotFiles)
          {
            _iter42.write(oprot);
          }
        }
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, BuildJob struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(6);
      if (incoming.get(0)) {
        struct.buildId = new BuildId();
        struct.buildId.read(iprot);
        struct.setBuildIdIsSet(true);
      }
      if (incoming.get(1)) {
        struct.debug = new DebugInfo();
        struct.debug.read(iprot);
        struct.setDebugIsSet(true);
      }
      if (incoming.get(2)) {
        struct.status = com.facebook.buck.distributed.thrift.BuildStatus.findByValue(iprot.readI32());
        struct.setStatusIsSet(true);
      }
      if (incoming.get(3)) {
        struct.buckVersion = new BuckVersion();
        struct.buckVersion.read(iprot);
        struct.setBuckVersionIsSet(true);
      }
      if (incoming.get(4)) {
        {
          org.apache.thrift.protocol.TMap _map43 = new org.apache.thrift.protocol.TMap(org.apache.thrift.protocol.TType.STRING, org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.slaveInfoByRunId = new HashMap<String,BuildSlaveInfo>(2*_map43.size);
          String _key44;
          BuildSlaveInfo _val45;
          for (int _i46 = 0; _i46 < _map43.size; ++_i46)
          {
            _key44 = iprot.readString();
            _val45 = new BuildSlaveInfo();
            _val45.read(iprot);
            struct.slaveInfoByRunId.put(_key44, _val45);
          }
        }
        struct.setSlaveInfoByRunIdIsSet(true);
      }
      if (incoming.get(5)) {
        {
          org.apache.thrift.protocol.TList _list47 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
          struct.dotFiles = new ArrayList<PathInfo>(_list47.size);
          PathInfo _elem48;
          for (int _i49 = 0; _i49 < _list47.size; ++_i49)
          {
            _elem48 = new PathInfo();
            _elem48.read(iprot);
            struct.dotFiles.add(_elem48);
          }
        }
        struct.setDotFilesIsSet(true);
      }
    }
  }

}

