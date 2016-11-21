; Auto-generated. Do not edit!


(cl:in-package av_msgs-msg)


;//! \htmlinclude CameraBinocular.msg.html

(cl:defclass <CameraBinocular> (roslisp-msg-protocol:ros-message)
  ((header
    :reader header
    :initarg :header
    :type std_msgs-msg:Header
    :initform (cl:make-instance 'std_msgs-msg:Header))
   (img_left
    :reader img_left
    :initarg :img_left
    :type sensor_msgs-msg:Image
    :initform (cl:make-instance 'sensor_msgs-msg:Image))
   (img_right
    :reader img_right
    :initarg :img_right
    :type sensor_msgs-msg:Image
    :initform (cl:make-instance 'sensor_msgs-msg:Image)))
)

(cl:defclass CameraBinocular (<CameraBinocular>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <CameraBinocular>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'CameraBinocular)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name av_msgs-msg:<CameraBinocular> is deprecated: use av_msgs-msg:CameraBinocular instead.")))

(cl:ensure-generic-function 'header-val :lambda-list '(m))
(cl:defmethod header-val ((m <CameraBinocular>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader av_msgs-msg:header-val is deprecated.  Use av_msgs-msg:header instead.")
  (header m))

(cl:ensure-generic-function 'img_left-val :lambda-list '(m))
(cl:defmethod img_left-val ((m <CameraBinocular>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader av_msgs-msg:img_left-val is deprecated.  Use av_msgs-msg:img_left instead.")
  (img_left m))

(cl:ensure-generic-function 'img_right-val :lambda-list '(m))
(cl:defmethod img_right-val ((m <CameraBinocular>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader av_msgs-msg:img_right-val is deprecated.  Use av_msgs-msg:img_right instead.")
  (img_right m))
(cl:defmethod roslisp-msg-protocol:serialize ((msg <CameraBinocular>) ostream)
  "Serializes a message object of type '<CameraBinocular>"
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'header) ostream)
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'img_left) ostream)
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'img_right) ostream)
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <CameraBinocular>) istream)
  "Deserializes a message object of type '<CameraBinocular>"
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'header) istream)
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'img_left) istream)
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'img_right) istream)
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<CameraBinocular>)))
  "Returns string type for a message object of type '<CameraBinocular>"
  "av_msgs/CameraBinocular")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'CameraBinocular)))
  "Returns string type for a message object of type 'CameraBinocular"
  "av_msgs/CameraBinocular")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<CameraBinocular>)))
  "Returns md5sum for a message object of type '<CameraBinocular>"
  "70b7e839a03a5e2d2c1d6da956f454b1")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'CameraBinocular)))
  "Returns md5sum for a message object of type 'CameraBinocular"
  "70b7e839a03a5e2d2c1d6da956f454b1")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<CameraBinocular>)))
  "Returns full string definition for message of type '<CameraBinocular>"
  (cl:format cl:nil "std_msgs/Header header~%sensor_msgs/Image img_left  ~%#双目摄像头左图像~%sensor_msgs/Image img_right ~%#双目摄像头右图像~%~%~%================================================================================~%MSG: std_msgs/Header~%# Standard metadata for higher-level stamped data types.~%# This is generally used to communicate timestamped data ~%# in a particular coordinate frame.~%# ~%# sequence ID: consecutively increasing ID ~%uint32 seq~%#Two-integer timestamp that is expressed as:~%# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called 'secs')~%# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called 'nsecs')~%# time-handling sugar is provided by the client library~%time stamp~%#Frame this data is associated with~%# 0: no frame~%# 1: global frame~%string frame_id~%~%================================================================================~%MSG: sensor_msgs/Image~%# This message contains an uncompressed image~%# (0, 0) is at top-left corner of image~%#~%~%Header header        # Header timestamp should be acquisition time of image~%                     # Header frame_id should be optical frame of camera~%                     # origin of frame should be optical center of cameara~%                     # +x should point to the right in the image~%                     # +y should point down in the image~%                     # +z should point into to plane of the image~%                     # If the frame_id here and the frame_id of the CameraInfo~%                     # message associated with the image conflict~%                     # the behavior is undefined~%~%uint32 height         # image height, that is, number of rows~%uint32 width          # image width, that is, number of columns~%~%# The legal values for encoding are in file src/image_encodings.cpp~%# If you want to standardize a new string format, join~%# ros-users@lists.sourceforge.net and send an email proposing a new encoding.~%~%string encoding       # Encoding of pixels -- channel meaning, ordering, size~%                      # taken from the list of strings in include/sensor_msgs/image_encodings.h~%~%uint8 is_bigendian    # is this data bigendian?~%uint32 step           # Full row length in bytes~%uint8[] data          # actual matrix data, size is (step * rows)~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'CameraBinocular)))
  "Returns full string definition for message of type 'CameraBinocular"
  (cl:format cl:nil "std_msgs/Header header~%sensor_msgs/Image img_left  ~%#双目摄像头左图像~%sensor_msgs/Image img_right ~%#双目摄像头右图像~%~%~%================================================================================~%MSG: std_msgs/Header~%# Standard metadata for higher-level stamped data types.~%# This is generally used to communicate timestamped data ~%# in a particular coordinate frame.~%# ~%# sequence ID: consecutively increasing ID ~%uint32 seq~%#Two-integer timestamp that is expressed as:~%# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called 'secs')~%# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called 'nsecs')~%# time-handling sugar is provided by the client library~%time stamp~%#Frame this data is associated with~%# 0: no frame~%# 1: global frame~%string frame_id~%~%================================================================================~%MSG: sensor_msgs/Image~%# This message contains an uncompressed image~%# (0, 0) is at top-left corner of image~%#~%~%Header header        # Header timestamp should be acquisition time of image~%                     # Header frame_id should be optical frame of camera~%                     # origin of frame should be optical center of cameara~%                     # +x should point to the right in the image~%                     # +y should point down in the image~%                     # +z should point into to plane of the image~%                     # If the frame_id here and the frame_id of the CameraInfo~%                     # message associated with the image conflict~%                     # the behavior is undefined~%~%uint32 height         # image height, that is, number of rows~%uint32 width          # image width, that is, number of columns~%~%# The legal values for encoding are in file src/image_encodings.cpp~%# If you want to standardize a new string format, join~%# ros-users@lists.sourceforge.net and send an email proposing a new encoding.~%~%string encoding       # Encoding of pixels -- channel meaning, ordering, size~%                      # taken from the list of strings in include/sensor_msgs/image_encodings.h~%~%uint8 is_bigendian    # is this data bigendian?~%uint32 step           # Full row length in bytes~%uint8[] data          # actual matrix data, size is (step * rows)~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <CameraBinocular>))
  (cl:+ 0
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'header))
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'img_left))
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'img_right))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <CameraBinocular>))
  "Converts a ROS message object to a list"
  (cl:list 'CameraBinocular
    (cl:cons ':header (header msg))
    (cl:cons ':img_left (img_left msg))
    (cl:cons ':img_right (img_right msg))
))
