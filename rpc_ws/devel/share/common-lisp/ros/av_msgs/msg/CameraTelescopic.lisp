; Auto-generated. Do not edit!


(cl:in-package av_msgs-msg)


;//! \htmlinclude CameraTelescopic.msg.html

(cl:defclass <CameraTelescopic> (roslisp-msg-protocol:ros-message)
  ((header
    :reader header
    :initarg :header
    :type std_msgs-msg:Header
    :initform (cl:make-instance 'std_msgs-msg:Header))
   (img_up
    :reader img_up
    :initarg :img_up
    :type sensor_msgs-msg:Image
    :initform (cl:make-instance 'sensor_msgs-msg:Image)))
)

(cl:defclass CameraTelescopic (<CameraTelescopic>)
  ())

(cl:defmethod cl:initialize-instance :after ((m <CameraTelescopic>) cl:&rest args)
  (cl:declare (cl:ignorable args))
  (cl:unless (cl:typep m 'CameraTelescopic)
    (roslisp-msg-protocol:msg-deprecation-warning "using old message class name av_msgs-msg:<CameraTelescopic> is deprecated: use av_msgs-msg:CameraTelescopic instead.")))

(cl:ensure-generic-function 'header-val :lambda-list '(m))
(cl:defmethod header-val ((m <CameraTelescopic>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader av_msgs-msg:header-val is deprecated.  Use av_msgs-msg:header instead.")
  (header m))

(cl:ensure-generic-function 'img_up-val :lambda-list '(m))
(cl:defmethod img_up-val ((m <CameraTelescopic>))
  (roslisp-msg-protocol:msg-deprecation-warning "Using old-style slot reader av_msgs-msg:img_up-val is deprecated.  Use av_msgs-msg:img_up instead.")
  (img_up m))
(cl:defmethod roslisp-msg-protocol:serialize ((msg <CameraTelescopic>) ostream)
  "Serializes a message object of type '<CameraTelescopic>"
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'header) ostream)
  (roslisp-msg-protocol:serialize (cl:slot-value msg 'img_up) ostream)
)
(cl:defmethod roslisp-msg-protocol:deserialize ((msg <CameraTelescopic>) istream)
  "Deserializes a message object of type '<CameraTelescopic>"
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'header) istream)
  (roslisp-msg-protocol:deserialize (cl:slot-value msg 'img_up) istream)
  msg
)
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql '<CameraTelescopic>)))
  "Returns string type for a message object of type '<CameraTelescopic>"
  "av_msgs/CameraTelescopic")
(cl:defmethod roslisp-msg-protocol:ros-datatype ((msg (cl:eql 'CameraTelescopic)))
  "Returns string type for a message object of type 'CameraTelescopic"
  "av_msgs/CameraTelescopic")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql '<CameraTelescopic>)))
  "Returns md5sum for a message object of type '<CameraTelescopic>"
  "2377dbfb1d7f0da98e845c57caac477d")
(cl:defmethod roslisp-msg-protocol:md5sum ((type (cl:eql 'CameraTelescopic)))
  "Returns md5sum for a message object of type 'CameraTelescopic"
  "2377dbfb1d7f0da98e845c57caac477d")
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql '<CameraTelescopic>)))
  "Returns full string definition for message of type '<CameraTelescopic>"
  (cl:format cl:nil "std_msgs/Header header~%sensor_msgs/Image img_up ~%#长焦摄像头图像~%~%~%================================================================================~%MSG: std_msgs/Header~%# Standard metadata for higher-level stamped data types.~%# This is generally used to communicate timestamped data ~%# in a particular coordinate frame.~%# ~%# sequence ID: consecutively increasing ID ~%uint32 seq~%#Two-integer timestamp that is expressed as:~%# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called 'secs')~%# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called 'nsecs')~%# time-handling sugar is provided by the client library~%time stamp~%#Frame this data is associated with~%# 0: no frame~%# 1: global frame~%string frame_id~%~%================================================================================~%MSG: sensor_msgs/Image~%# This message contains an uncompressed image~%# (0, 0) is at top-left corner of image~%#~%~%Header header        # Header timestamp should be acquisition time of image~%                     # Header frame_id should be optical frame of camera~%                     # origin of frame should be optical center of cameara~%                     # +x should point to the right in the image~%                     # +y should point down in the image~%                     # +z should point into to plane of the image~%                     # If the frame_id here and the frame_id of the CameraInfo~%                     # message associated with the image conflict~%                     # the behavior is undefined~%~%uint32 height         # image height, that is, number of rows~%uint32 width          # image width, that is, number of columns~%~%# The legal values for encoding are in file src/image_encodings.cpp~%# If you want to standardize a new string format, join~%# ros-users@lists.sourceforge.net and send an email proposing a new encoding.~%~%string encoding       # Encoding of pixels -- channel meaning, ordering, size~%                      # taken from the list of strings in include/sensor_msgs/image_encodings.h~%~%uint8 is_bigendian    # is this data bigendian?~%uint32 step           # Full row length in bytes~%uint8[] data          # actual matrix data, size is (step * rows)~%~%~%"))
(cl:defmethod roslisp-msg-protocol:message-definition ((type (cl:eql 'CameraTelescopic)))
  "Returns full string definition for message of type 'CameraTelescopic"
  (cl:format cl:nil "std_msgs/Header header~%sensor_msgs/Image img_up ~%#长焦摄像头图像~%~%~%================================================================================~%MSG: std_msgs/Header~%# Standard metadata for higher-level stamped data types.~%# This is generally used to communicate timestamped data ~%# in a particular coordinate frame.~%# ~%# sequence ID: consecutively increasing ID ~%uint32 seq~%#Two-integer timestamp that is expressed as:~%# * stamp.sec: seconds (stamp_secs) since epoch (in Python the variable is called 'secs')~%# * stamp.nsec: nanoseconds since stamp_secs (in Python the variable is called 'nsecs')~%# time-handling sugar is provided by the client library~%time stamp~%#Frame this data is associated with~%# 0: no frame~%# 1: global frame~%string frame_id~%~%================================================================================~%MSG: sensor_msgs/Image~%# This message contains an uncompressed image~%# (0, 0) is at top-left corner of image~%#~%~%Header header        # Header timestamp should be acquisition time of image~%                     # Header frame_id should be optical frame of camera~%                     # origin of frame should be optical center of cameara~%                     # +x should point to the right in the image~%                     # +y should point down in the image~%                     # +z should point into to plane of the image~%                     # If the frame_id here and the frame_id of the CameraInfo~%                     # message associated with the image conflict~%                     # the behavior is undefined~%~%uint32 height         # image height, that is, number of rows~%uint32 width          # image width, that is, number of columns~%~%# The legal values for encoding are in file src/image_encodings.cpp~%# If you want to standardize a new string format, join~%# ros-users@lists.sourceforge.net and send an email proposing a new encoding.~%~%string encoding       # Encoding of pixels -- channel meaning, ordering, size~%                      # taken from the list of strings in include/sensor_msgs/image_encodings.h~%~%uint8 is_bigendian    # is this data bigendian?~%uint32 step           # Full row length in bytes~%uint8[] data          # actual matrix data, size is (step * rows)~%~%~%"))
(cl:defmethod roslisp-msg-protocol:serialization-length ((msg <CameraTelescopic>))
  (cl:+ 0
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'header))
     (roslisp-msg-protocol:serialization-length (cl:slot-value msg 'img_up))
))
(cl:defmethod roslisp-msg-protocol:ros-message-to-list ((msg <CameraTelescopic>))
  "Converts a ROS message object to a list"
  (cl:list 'CameraTelescopic
    (cl:cons ':header (header msg))
    (cl:cons ':img_up (img_up msg))
))
