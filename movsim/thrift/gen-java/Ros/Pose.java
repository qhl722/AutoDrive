/**
 * Autogenerated by Thrift Compiler (0.9.3)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package Ros;

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
@Generated(value = "Autogenerated by Thrift Compiler (0.9.3)", date = "2016-10-26")
public class Pose implements org.apache.thrift.TBase<Pose, Pose._Fields>, java.io.Serializable, Cloneable, Comparable<Pose> {
  private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("Pose");

  private static final org.apache.thrift.protocol.TField TIMESTAMP_FIELD_DESC = new org.apache.thrift.protocol.TField("timestamp", org.apache.thrift.protocol.TType.I64, (short)1);
  private static final org.apache.thrift.protocol.TField X_FIELD_DESC = new org.apache.thrift.protocol.TField("x", org.apache.thrift.protocol.TType.DOUBLE, (short)2);
  private static final org.apache.thrift.protocol.TField Y_FIELD_DESC = new org.apache.thrift.protocol.TField("y", org.apache.thrift.protocol.TType.DOUBLE, (short)3);
  private static final org.apache.thrift.protocol.TField THETA_FIELD_DESC = new org.apache.thrift.protocol.TField("theta", org.apache.thrift.protocol.TType.DOUBLE, (short)4);
  private static final org.apache.thrift.protocol.TField CURVATURE_FIELD_DESC = new org.apache.thrift.protocol.TField("curvature", org.apache.thrift.protocol.TType.DOUBLE, (short)5);
  private static final org.apache.thrift.protocol.TField VELOCITY_FIELD_DESC = new org.apache.thrift.protocol.TField("velocity", org.apache.thrift.protocol.TType.DOUBLE, (short)6);
  private static final org.apache.thrift.protocol.TField ACCELERATION_FIELD_DESC = new org.apache.thrift.protocol.TField("acceleration", org.apache.thrift.protocol.TType.DOUBLE, (short)7);

  private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
  static {
    schemes.put(StandardScheme.class, new PoseStandardSchemeFactory());
    schemes.put(TupleScheme.class, new PoseTupleSchemeFactory());
  }

  public long timestamp; // required
  public double x; // required
  public double y; // required
  public double theta; // required
  public double curvature; // required
  public double velocity; // required
  public double acceleration; // required

  /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
  public enum _Fields implements org.apache.thrift.TFieldIdEnum {
    TIMESTAMP((short)1, "timestamp"),
    X((short)2, "x"),
    Y((short)3, "y"),
    THETA((short)4, "theta"),
    CURVATURE((short)5, "curvature"),
    VELOCITY((short)6, "velocity"),
    ACCELERATION((short)7, "acceleration");

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
        case 1: // TIMESTAMP
          return TIMESTAMP;
        case 2: // X
          return X;
        case 3: // Y
          return Y;
        case 4: // THETA
          return THETA;
        case 5: // CURVATURE
          return CURVATURE;
        case 6: // VELOCITY
          return VELOCITY;
        case 7: // ACCELERATION
          return ACCELERATION;
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
  private static final int __TIMESTAMP_ISSET_ID = 0;
  private static final int __X_ISSET_ID = 1;
  private static final int __Y_ISSET_ID = 2;
  private static final int __THETA_ISSET_ID = 3;
  private static final int __CURVATURE_ISSET_ID = 4;
  private static final int __VELOCITY_ISSET_ID = 5;
  private static final int __ACCELERATION_ISSET_ID = 6;
  private byte __isset_bitfield = 0;
  public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
  static {
    Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
    tmpMap.put(_Fields.TIMESTAMP, new org.apache.thrift.meta_data.FieldMetaData("timestamp", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.I64)));
    tmpMap.put(_Fields.X, new org.apache.thrift.meta_data.FieldMetaData("x", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.Y, new org.apache.thrift.meta_data.FieldMetaData("y", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.THETA, new org.apache.thrift.meta_data.FieldMetaData("theta", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.CURVATURE, new org.apache.thrift.meta_data.FieldMetaData("curvature", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.VELOCITY, new org.apache.thrift.meta_data.FieldMetaData("velocity", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    tmpMap.put(_Fields.ACCELERATION, new org.apache.thrift.meta_data.FieldMetaData("acceleration", org.apache.thrift.TFieldRequirementType.DEFAULT, 
        new org.apache.thrift.meta_data.FieldValueMetaData(org.apache.thrift.protocol.TType.DOUBLE)));
    metaDataMap = Collections.unmodifiableMap(tmpMap);
    org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(Pose.class, metaDataMap);
  }

  public Pose() {
  }

  public Pose(
    long timestamp,
    double x,
    double y,
    double theta,
    double curvature,
    double velocity,
    double acceleration)
  {
    this();
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    this.x = x;
    setXIsSet(true);
    this.y = y;
    setYIsSet(true);
    this.theta = theta;
    setThetaIsSet(true);
    this.curvature = curvature;
    setCurvatureIsSet(true);
    this.velocity = velocity;
    setVelocityIsSet(true);
    this.acceleration = acceleration;
    setAccelerationIsSet(true);
  }

  /**
   * Performs a deep copy on <i>other</i>.
   */
  public Pose(Pose other) {
    __isset_bitfield = other.__isset_bitfield;
    this.timestamp = other.timestamp;
    this.x = other.x;
    this.y = other.y;
    this.theta = other.theta;
    this.curvature = other.curvature;
    this.velocity = other.velocity;
    this.acceleration = other.acceleration;
  }

  public Pose deepCopy() {
    return new Pose(this);
  }

  @Override
  public void clear() {
    setTimestampIsSet(false);
    this.timestamp = 0;
    setXIsSet(false);
    this.x = 0.0;
    setYIsSet(false);
    this.y = 0.0;
    setThetaIsSet(false);
    this.theta = 0.0;
    setCurvatureIsSet(false);
    this.curvature = 0.0;
    setVelocityIsSet(false);
    this.velocity = 0.0;
    setAccelerationIsSet(false);
    this.acceleration = 0.0;
  }

  public long getTimestamp() {
    return this.timestamp;
  }

  public Pose setTimestamp(long timestamp) {
    this.timestamp = timestamp;
    setTimestampIsSet(true);
    return this;
  }

  public void unsetTimestamp() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  /** Returns true if field timestamp is set (has been assigned a value) and false otherwise */
  public boolean isSetTimestamp() {
    return EncodingUtils.testBit(__isset_bitfield, __TIMESTAMP_ISSET_ID);
  }

  public void setTimestampIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __TIMESTAMP_ISSET_ID, value);
  }

  public double getX() {
    return this.x;
  }

  public Pose setX(double x) {
    this.x = x;
    setXIsSet(true);
    return this;
  }

  public void unsetX() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __X_ISSET_ID);
  }

  /** Returns true if field x is set (has been assigned a value) and false otherwise */
  public boolean isSetX() {
    return EncodingUtils.testBit(__isset_bitfield, __X_ISSET_ID);
  }

  public void setXIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __X_ISSET_ID, value);
  }

  public double getY() {
    return this.y;
  }

  public Pose setY(double y) {
    this.y = y;
    setYIsSet(true);
    return this;
  }

  public void unsetY() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __Y_ISSET_ID);
  }

  /** Returns true if field y is set (has been assigned a value) and false otherwise */
  public boolean isSetY() {
    return EncodingUtils.testBit(__isset_bitfield, __Y_ISSET_ID);
  }

  public void setYIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __Y_ISSET_ID, value);
  }

  public double getTheta() {
    return this.theta;
  }

  public Pose setTheta(double theta) {
    this.theta = theta;
    setThetaIsSet(true);
    return this;
  }

  public void unsetTheta() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __THETA_ISSET_ID);
  }

  /** Returns true if field theta is set (has been assigned a value) and false otherwise */
  public boolean isSetTheta() {
    return EncodingUtils.testBit(__isset_bitfield, __THETA_ISSET_ID);
  }

  public void setThetaIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __THETA_ISSET_ID, value);
  }

  public double getCurvature() {
    return this.curvature;
  }

  public Pose setCurvature(double curvature) {
    this.curvature = curvature;
    setCurvatureIsSet(true);
    return this;
  }

  public void unsetCurvature() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __CURVATURE_ISSET_ID);
  }

  /** Returns true if field curvature is set (has been assigned a value) and false otherwise */
  public boolean isSetCurvature() {
    return EncodingUtils.testBit(__isset_bitfield, __CURVATURE_ISSET_ID);
  }

  public void setCurvatureIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __CURVATURE_ISSET_ID, value);
  }

  public double getVelocity() {
    return this.velocity;
  }

  public Pose setVelocity(double velocity) {
    this.velocity = velocity;
    setVelocityIsSet(true);
    return this;
  }

  public void unsetVelocity() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __VELOCITY_ISSET_ID);
  }

  /** Returns true if field velocity is set (has been assigned a value) and false otherwise */
  public boolean isSetVelocity() {
    return EncodingUtils.testBit(__isset_bitfield, __VELOCITY_ISSET_ID);
  }

  public void setVelocityIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __VELOCITY_ISSET_ID, value);
  }

  public double getAcceleration() {
    return this.acceleration;
  }

  public Pose setAcceleration(double acceleration) {
    this.acceleration = acceleration;
    setAccelerationIsSet(true);
    return this;
  }

  public void unsetAcceleration() {
    __isset_bitfield = EncodingUtils.clearBit(__isset_bitfield, __ACCELERATION_ISSET_ID);
  }

  /** Returns true if field acceleration is set (has been assigned a value) and false otherwise */
  public boolean isSetAcceleration() {
    return EncodingUtils.testBit(__isset_bitfield, __ACCELERATION_ISSET_ID);
  }

  public void setAccelerationIsSet(boolean value) {
    __isset_bitfield = EncodingUtils.setBit(__isset_bitfield, __ACCELERATION_ISSET_ID, value);
  }

  public void setFieldValue(_Fields field, Object value) {
    switch (field) {
    case TIMESTAMP:
      if (value == null) {
        unsetTimestamp();
      } else {
        setTimestamp((Long)value);
      }
      break;

    case X:
      if (value == null) {
        unsetX();
      } else {
        setX((Double)value);
      }
      break;

    case Y:
      if (value == null) {
        unsetY();
      } else {
        setY((Double)value);
      }
      break;

    case THETA:
      if (value == null) {
        unsetTheta();
      } else {
        setTheta((Double)value);
      }
      break;

    case CURVATURE:
      if (value == null) {
        unsetCurvature();
      } else {
        setCurvature((Double)value);
      }
      break;

    case VELOCITY:
      if (value == null) {
        unsetVelocity();
      } else {
        setVelocity((Double)value);
      }
      break;

    case ACCELERATION:
      if (value == null) {
        unsetAcceleration();
      } else {
        setAcceleration((Double)value);
      }
      break;

    }
  }

  public Object getFieldValue(_Fields field) {
    switch (field) {
    case TIMESTAMP:
      return getTimestamp();

    case X:
      return getX();

    case Y:
      return getY();

    case THETA:
      return getTheta();

    case CURVATURE:
      return getCurvature();

    case VELOCITY:
      return getVelocity();

    case ACCELERATION:
      return getAcceleration();

    }
    throw new IllegalStateException();
  }

  /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
  public boolean isSet(_Fields field) {
    if (field == null) {
      throw new IllegalArgumentException();
    }

    switch (field) {
    case TIMESTAMP:
      return isSetTimestamp();
    case X:
      return isSetX();
    case Y:
      return isSetY();
    case THETA:
      return isSetTheta();
    case CURVATURE:
      return isSetCurvature();
    case VELOCITY:
      return isSetVelocity();
    case ACCELERATION:
      return isSetAcceleration();
    }
    throw new IllegalStateException();
  }

  @Override
  public boolean equals(Object that) {
    if (that == null)
      return false;
    if (that instanceof Pose)
      return this.equals((Pose)that);
    return false;
  }

  public boolean equals(Pose that) {
    if (that == null)
      return false;

    boolean this_present_timestamp = true;
    boolean that_present_timestamp = true;
    if (this_present_timestamp || that_present_timestamp) {
      if (!(this_present_timestamp && that_present_timestamp))
        return false;
      if (this.timestamp != that.timestamp)
        return false;
    }

    boolean this_present_x = true;
    boolean that_present_x = true;
    if (this_present_x || that_present_x) {
      if (!(this_present_x && that_present_x))
        return false;
      if (this.x != that.x)
        return false;
    }

    boolean this_present_y = true;
    boolean that_present_y = true;
    if (this_present_y || that_present_y) {
      if (!(this_present_y && that_present_y))
        return false;
      if (this.y != that.y)
        return false;
    }

    boolean this_present_theta = true;
    boolean that_present_theta = true;
    if (this_present_theta || that_present_theta) {
      if (!(this_present_theta && that_present_theta))
        return false;
      if (this.theta != that.theta)
        return false;
    }

    boolean this_present_curvature = true;
    boolean that_present_curvature = true;
    if (this_present_curvature || that_present_curvature) {
      if (!(this_present_curvature && that_present_curvature))
        return false;
      if (this.curvature != that.curvature)
        return false;
    }

    boolean this_present_velocity = true;
    boolean that_present_velocity = true;
    if (this_present_velocity || that_present_velocity) {
      if (!(this_present_velocity && that_present_velocity))
        return false;
      if (this.velocity != that.velocity)
        return false;
    }

    boolean this_present_acceleration = true;
    boolean that_present_acceleration = true;
    if (this_present_acceleration || that_present_acceleration) {
      if (!(this_present_acceleration && that_present_acceleration))
        return false;
      if (this.acceleration != that.acceleration)
        return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    List<Object> list = new ArrayList<Object>();

    boolean present_timestamp = true;
    list.add(present_timestamp);
    if (present_timestamp)
      list.add(timestamp);

    boolean present_x = true;
    list.add(present_x);
    if (present_x)
      list.add(x);

    boolean present_y = true;
    list.add(present_y);
    if (present_y)
      list.add(y);

    boolean present_theta = true;
    list.add(present_theta);
    if (present_theta)
      list.add(theta);

    boolean present_curvature = true;
    list.add(present_curvature);
    if (present_curvature)
      list.add(curvature);

    boolean present_velocity = true;
    list.add(present_velocity);
    if (present_velocity)
      list.add(velocity);

    boolean present_acceleration = true;
    list.add(present_acceleration);
    if (present_acceleration)
      list.add(acceleration);

    return list.hashCode();
  }

  @Override
  public int compareTo(Pose other) {
    if (!getClass().equals(other.getClass())) {
      return getClass().getName().compareTo(other.getClass().getName());
    }

    int lastComparison = 0;

    lastComparison = Boolean.valueOf(isSetTimestamp()).compareTo(other.isSetTimestamp());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTimestamp()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.timestamp, other.timestamp);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetX()).compareTo(other.isSetX());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetX()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.x, other.x);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetY()).compareTo(other.isSetY());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetY()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.y, other.y);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetTheta()).compareTo(other.isSetTheta());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetTheta()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.theta, other.theta);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetCurvature()).compareTo(other.isSetCurvature());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetCurvature()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.curvature, other.curvature);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetVelocity()).compareTo(other.isSetVelocity());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetVelocity()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.velocity, other.velocity);
      if (lastComparison != 0) {
        return lastComparison;
      }
    }
    lastComparison = Boolean.valueOf(isSetAcceleration()).compareTo(other.isSetAcceleration());
    if (lastComparison != 0) {
      return lastComparison;
    }
    if (isSetAcceleration()) {
      lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.acceleration, other.acceleration);
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
    StringBuilder sb = new StringBuilder("Pose(");
    boolean first = true;

    sb.append("timestamp:");
    sb.append(this.timestamp);
    first = false;
    if (!first) sb.append(", ");
    sb.append("x:");
    sb.append(this.x);
    first = false;
    if (!first) sb.append(", ");
    sb.append("y:");
    sb.append(this.y);
    first = false;
    if (!first) sb.append(", ");
    sb.append("theta:");
    sb.append(this.theta);
    first = false;
    if (!first) sb.append(", ");
    sb.append("curvature:");
    sb.append(this.curvature);
    first = false;
    if (!first) sb.append(", ");
    sb.append("velocity:");
    sb.append(this.velocity);
    first = false;
    if (!first) sb.append(", ");
    sb.append("acceleration:");
    sb.append(this.acceleration);
    first = false;
    sb.append(")");
    return sb.toString();
  }

  public void validate() throws org.apache.thrift.TException {
    // check for required fields
    // check for sub-struct validity
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
      // it doesn't seem like you should have to do this, but java serialization is wacky, and doesn't call the default constructor.
      __isset_bitfield = 0;
      read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
    } catch (org.apache.thrift.TException te) {
      throw new java.io.IOException(te);
    }
  }

  private static class PoseStandardSchemeFactory implements SchemeFactory {
    public PoseStandardScheme getScheme() {
      return new PoseStandardScheme();
    }
  }

  private static class PoseStandardScheme extends StandardScheme<Pose> {

    public void read(org.apache.thrift.protocol.TProtocol iprot, Pose struct) throws org.apache.thrift.TException {
      org.apache.thrift.protocol.TField schemeField;
      iprot.readStructBegin();
      while (true)
      {
        schemeField = iprot.readFieldBegin();
        if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
          break;
        }
        switch (schemeField.id) {
          case 1: // TIMESTAMP
            if (schemeField.type == org.apache.thrift.protocol.TType.I64) {
              struct.timestamp = iprot.readI64();
              struct.setTimestampIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 2: // X
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.x = iprot.readDouble();
              struct.setXIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 3: // Y
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.y = iprot.readDouble();
              struct.setYIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 4: // THETA
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.theta = iprot.readDouble();
              struct.setThetaIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 5: // CURVATURE
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.curvature = iprot.readDouble();
              struct.setCurvatureIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 6: // VELOCITY
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.velocity = iprot.readDouble();
              struct.setVelocityIsSet(true);
            } else { 
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
            }
            break;
          case 7: // ACCELERATION
            if (schemeField.type == org.apache.thrift.protocol.TType.DOUBLE) {
              struct.acceleration = iprot.readDouble();
              struct.setAccelerationIsSet(true);
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

    public void write(org.apache.thrift.protocol.TProtocol oprot, Pose struct) throws org.apache.thrift.TException {
      struct.validate();

      oprot.writeStructBegin(STRUCT_DESC);
      oprot.writeFieldBegin(TIMESTAMP_FIELD_DESC);
      oprot.writeI64(struct.timestamp);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(X_FIELD_DESC);
      oprot.writeDouble(struct.x);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(Y_FIELD_DESC);
      oprot.writeDouble(struct.y);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(THETA_FIELD_DESC);
      oprot.writeDouble(struct.theta);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(CURVATURE_FIELD_DESC);
      oprot.writeDouble(struct.curvature);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(VELOCITY_FIELD_DESC);
      oprot.writeDouble(struct.velocity);
      oprot.writeFieldEnd();
      oprot.writeFieldBegin(ACCELERATION_FIELD_DESC);
      oprot.writeDouble(struct.acceleration);
      oprot.writeFieldEnd();
      oprot.writeFieldStop();
      oprot.writeStructEnd();
    }

  }

  private static class PoseTupleSchemeFactory implements SchemeFactory {
    public PoseTupleScheme getScheme() {
      return new PoseTupleScheme();
    }
  }

  private static class PoseTupleScheme extends TupleScheme<Pose> {

    @Override
    public void write(org.apache.thrift.protocol.TProtocol prot, Pose struct) throws org.apache.thrift.TException {
      TTupleProtocol oprot = (TTupleProtocol) prot;
      BitSet optionals = new BitSet();
      if (struct.isSetTimestamp()) {
        optionals.set(0);
      }
      if (struct.isSetX()) {
        optionals.set(1);
      }
      if (struct.isSetY()) {
        optionals.set(2);
      }
      if (struct.isSetTheta()) {
        optionals.set(3);
      }
      if (struct.isSetCurvature()) {
        optionals.set(4);
      }
      if (struct.isSetVelocity()) {
        optionals.set(5);
      }
      if (struct.isSetAcceleration()) {
        optionals.set(6);
      }
      oprot.writeBitSet(optionals, 7);
      if (struct.isSetTimestamp()) {
        oprot.writeI64(struct.timestamp);
      }
      if (struct.isSetX()) {
        oprot.writeDouble(struct.x);
      }
      if (struct.isSetY()) {
        oprot.writeDouble(struct.y);
      }
      if (struct.isSetTheta()) {
        oprot.writeDouble(struct.theta);
      }
      if (struct.isSetCurvature()) {
        oprot.writeDouble(struct.curvature);
      }
      if (struct.isSetVelocity()) {
        oprot.writeDouble(struct.velocity);
      }
      if (struct.isSetAcceleration()) {
        oprot.writeDouble(struct.acceleration);
      }
    }

    @Override
    public void read(org.apache.thrift.protocol.TProtocol prot, Pose struct) throws org.apache.thrift.TException {
      TTupleProtocol iprot = (TTupleProtocol) prot;
      BitSet incoming = iprot.readBitSet(7);
      if (incoming.get(0)) {
        struct.timestamp = iprot.readI64();
        struct.setTimestampIsSet(true);
      }
      if (incoming.get(1)) {
        struct.x = iprot.readDouble();
        struct.setXIsSet(true);
      }
      if (incoming.get(2)) {
        struct.y = iprot.readDouble();
        struct.setYIsSet(true);
      }
      if (incoming.get(3)) {
        struct.theta = iprot.readDouble();
        struct.setThetaIsSet(true);
      }
      if (incoming.get(4)) {
        struct.curvature = iprot.readDouble();
        struct.setCurvatureIsSet(true);
      }
      if (incoming.get(5)) {
        struct.velocity = iprot.readDouble();
        struct.setVelocityIsSet(true);
      }
      if (incoming.get(6)) {
        struct.acceleration = iprot.readDouble();
        struct.setAccelerationIsSet(true);
      }
    }
  }

}
