# This Python file uses the following encoding: utf-8
"""autogenerated by genpy from av_msgs/Pose.msg. Do not edit."""
import sys
python3 = True if sys.hexversion > 0x03000000 else False
import genpy
import struct


class Pose(genpy.Message):
  _md5sum = "0b505a0e63316b91a76662fa8302f48a"
  _type = "av_msgs/Pose"
  _has_header = False #flag to mark the presence of a Header object
  _full_text = """# 时间戳
uint64 timestamp
# 轨迹x坐标
float64 x
# 轨迹y坐标
float64 y
# 轨迹朝向角坐标
float64 theta
# 曲率
float64 curvature
# 速度
float64 velocity
# 加速度
float64 acceleration
"""
  __slots__ = ['timestamp','x','y','theta','curvature','velocity','acceleration']
  _slot_types = ['uint64','float64','float64','float64','float64','float64','float64']

  def __init__(self, *args, **kwds):
    """
    Constructor. Any message fields that are implicitly/explicitly
    set to None will be assigned a default value. The recommend
    use is keyword arguments as this is more robust to future message
    changes.  You cannot mix in-order arguments and keyword arguments.

    The available fields are:
       timestamp,x,y,theta,curvature,velocity,acceleration

    :param args: complete set of field values, in .msg order
    :param kwds: use keyword arguments corresponding to message field names
    to set specific fields.
    """
    if args or kwds:
      super(Pose, self).__init__(*args, **kwds)
      #message fields cannot be None, assign default values for those that are
      if self.timestamp is None:
        self.timestamp = 0
      if self.x is None:
        self.x = 0.
      if self.y is None:
        self.y = 0.
      if self.theta is None:
        self.theta = 0.
      if self.curvature is None:
        self.curvature = 0.
      if self.velocity is None:
        self.velocity = 0.
      if self.acceleration is None:
        self.acceleration = 0.
    else:
      self.timestamp = 0
      self.x = 0.
      self.y = 0.
      self.theta = 0.
      self.curvature = 0.
      self.velocity = 0.
      self.acceleration = 0.

  def _get_types(self):
    """
    internal API method
    """
    return self._slot_types

  def serialize(self, buff):
    """
    serialize message into buffer
    :param buff: buffer, ``StringIO``
    """
    try:
      _x = self
      buff.write(_struct_Q6d.pack(_x.timestamp, _x.x, _x.y, _x.theta, _x.curvature, _x.velocity, _x.acceleration))
    except struct.error as se: self._check_types(struct.error("%s: '%s' when writing '%s'" % (type(se), str(se), str(locals().get('_x', self)))))
    except TypeError as te: self._check_types(ValueError("%s: '%s' when writing '%s'" % (type(te), str(te), str(locals().get('_x', self)))))

  def deserialize(self, str):
    """
    unpack serialized message in str into this message instance
    :param str: byte array of serialized message, ``str``
    """
    try:
      end = 0
      _x = self
      start = end
      end += 56
      (_x.timestamp, _x.x, _x.y, _x.theta, _x.curvature, _x.velocity, _x.acceleration,) = _struct_Q6d.unpack(str[start:end])
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill


  def serialize_numpy(self, buff, numpy):
    """
    serialize message with numpy array types into buffer
    :param buff: buffer, ``StringIO``
    :param numpy: numpy python module
    """
    try:
      _x = self
      buff.write(_struct_Q6d.pack(_x.timestamp, _x.x, _x.y, _x.theta, _x.curvature, _x.velocity, _x.acceleration))
    except struct.error as se: self._check_types(struct.error("%s: '%s' when writing '%s'" % (type(se), str(se), str(locals().get('_x', self)))))
    except TypeError as te: self._check_types(ValueError("%s: '%s' when writing '%s'" % (type(te), str(te), str(locals().get('_x', self)))))

  def deserialize_numpy(self, str, numpy):
    """
    unpack serialized message in str into this message instance using numpy for array types
    :param str: byte array of serialized message, ``str``
    :param numpy: numpy python module
    """
    try:
      end = 0
      _x = self
      start = end
      end += 56
      (_x.timestamp, _x.x, _x.y, _x.theta, _x.curvature, _x.velocity, _x.acceleration,) = _struct_Q6d.unpack(str[start:end])
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill

_struct_I = genpy.struct_I
_struct_Q6d = struct.Struct("<Q6d")
