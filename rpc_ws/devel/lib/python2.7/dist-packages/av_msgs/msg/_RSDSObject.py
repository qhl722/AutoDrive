# This Python file uses the following encoding: utf-8
"""autogenerated by genpy from av_msgs/RSDSObject.msg. Do not edit."""
import sys
python3 = True if sys.hexversion > 0x03000000 else False
import genpy
import struct


class RSDSObject(genpy.Message):
  _md5sum = "fc65ae1aba0b450ccf817515a12e2dd0"
  _type = "av_msgs/RSDSObject"
  _has_header = False #flag to mark the presence of a Header object
  _full_text = """uint64 id # object id
float32 x_pos 
float32 x_vel
float32 x_acc
float32 y_pos
float32 y_vel
float32 y_acc
int32 tracker_status
int32 station_flags

"""
  __slots__ = ['id','x_pos','x_vel','x_acc','y_pos','y_vel','y_acc','tracker_status','station_flags']
  _slot_types = ['uint64','float32','float32','float32','float32','float32','float32','int32','int32']

  def __init__(self, *args, **kwds):
    """
    Constructor. Any message fields that are implicitly/explicitly
    set to None will be assigned a default value. The recommend
    use is keyword arguments as this is more robust to future message
    changes.  You cannot mix in-order arguments and keyword arguments.

    The available fields are:
       id,x_pos,x_vel,x_acc,y_pos,y_vel,y_acc,tracker_status,station_flags

    :param args: complete set of field values, in .msg order
    :param kwds: use keyword arguments corresponding to message field names
    to set specific fields.
    """
    if args or kwds:
      super(RSDSObject, self).__init__(*args, **kwds)
      #message fields cannot be None, assign default values for those that are
      if self.id is None:
        self.id = 0
      if self.x_pos is None:
        self.x_pos = 0.
      if self.x_vel is None:
        self.x_vel = 0.
      if self.x_acc is None:
        self.x_acc = 0.
      if self.y_pos is None:
        self.y_pos = 0.
      if self.y_vel is None:
        self.y_vel = 0.
      if self.y_acc is None:
        self.y_acc = 0.
      if self.tracker_status is None:
        self.tracker_status = 0
      if self.station_flags is None:
        self.station_flags = 0
    else:
      self.id = 0
      self.x_pos = 0.
      self.x_vel = 0.
      self.x_acc = 0.
      self.y_pos = 0.
      self.y_vel = 0.
      self.y_acc = 0.
      self.tracker_status = 0
      self.station_flags = 0

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
      buff.write(_struct_Q6f2i.pack(_x.id, _x.x_pos, _x.x_vel, _x.x_acc, _x.y_pos, _x.y_vel, _x.y_acc, _x.tracker_status, _x.station_flags))
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
      end += 40
      (_x.id, _x.x_pos, _x.x_vel, _x.x_acc, _x.y_pos, _x.y_vel, _x.y_acc, _x.tracker_status, _x.station_flags,) = _struct_Q6f2i.unpack(str[start:end])
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
      buff.write(_struct_Q6f2i.pack(_x.id, _x.x_pos, _x.x_vel, _x.x_acc, _x.y_pos, _x.y_vel, _x.y_acc, _x.tracker_status, _x.station_flags))
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
      end += 40
      (_x.id, _x.x_pos, _x.x_vel, _x.x_acc, _x.y_pos, _x.y_vel, _x.y_acc, _x.tracker_status, _x.station_flags,) = _struct_Q6f2i.unpack(str[start:end])
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill

_struct_I = genpy.struct_I
_struct_Q6f2i = struct.Struct("<Q6f2i")