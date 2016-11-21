# This Python file uses the following encoding: utf-8
"""autogenerated by genpy from av_msgs/GridMap.msg. Do not edit."""
import sys
python3 = True if sys.hexversion > 0x03000000 else False
import genpy
import struct


class GridMap(genpy.Message):
  _md5sum = "c2e2c1220954a6d55dc0c1c7ef445fe5"
  _type = "av_msgs/GridMap"
  _has_header = False #flag to mark the presence of a Header object
  _full_text = """int32 width
int32 length
int32 center_x
int32 center_y
uint8[] grid_map
"""
  __slots__ = ['width','length','center_x','center_y','grid_map']
  _slot_types = ['int32','int32','int32','int32','uint8[]']

  def __init__(self, *args, **kwds):
    """
    Constructor. Any message fields that are implicitly/explicitly
    set to None will be assigned a default value. The recommend
    use is keyword arguments as this is more robust to future message
    changes.  You cannot mix in-order arguments and keyword arguments.

    The available fields are:
       width,length,center_x,center_y,grid_map

    :param args: complete set of field values, in .msg order
    :param kwds: use keyword arguments corresponding to message field names
    to set specific fields.
    """
    if args or kwds:
      super(GridMap, self).__init__(*args, **kwds)
      #message fields cannot be None, assign default values for those that are
      if self.width is None:
        self.width = 0
      if self.length is None:
        self.length = 0
      if self.center_x is None:
        self.center_x = 0
      if self.center_y is None:
        self.center_y = 0
      if self.grid_map is None:
        self.grid_map = ''
    else:
      self.width = 0
      self.length = 0
      self.center_x = 0
      self.center_y = 0
      self.grid_map = ''

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
      buff.write(_struct_4i.pack(_x.width, _x.length, _x.center_x, _x.center_y))
      _x = self.grid_map
      length = len(_x)
      # - if encoded as a list instead, serialize as bytes instead of string
      if type(_x) in [list, tuple]:
        buff.write(struct.pack('<I%sB'%length, length, *_x))
      else:
        buff.write(struct.pack('<I%ss'%length, length, _x))
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
      end += 16
      (_x.width, _x.length, _x.center_x, _x.center_y,) = _struct_4i.unpack(str[start:end])
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      start = end
      end += length
      self.grid_map = str[start:end]
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
      buff.write(_struct_4i.pack(_x.width, _x.length, _x.center_x, _x.center_y))
      _x = self.grid_map
      length = len(_x)
      # - if encoded as a list instead, serialize as bytes instead of string
      if type(_x) in [list, tuple]:
        buff.write(struct.pack('<I%sB'%length, length, *_x))
      else:
        buff.write(struct.pack('<I%ss'%length, length, _x))
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
      end += 16
      (_x.width, _x.length, _x.center_x, _x.center_y,) = _struct_4i.unpack(str[start:end])
      start = end
      end += 4
      (length,) = _struct_I.unpack(str[start:end])
      start = end
      end += length
      self.grid_map = str[start:end]
      return self
    except struct.error as e:
      raise genpy.DeserializationError(e) #most likely buffer underfill

_struct_I = genpy.struct_I
_struct_4i = struct.Struct("<4i")