// Generated by gencpp from file av_msgs/Pose.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_POSE_H
#define AV_MSGS_MESSAGE_POSE_H


#include <string>
#include <vector>
#include <map>

#include <ros/types.h>
#include <ros/serialization.h>
#include <ros/builtin_message_traits.h>
#include <ros/message_operations.h>


namespace av_msgs
{
template <class ContainerAllocator>
struct Pose_
{
  typedef Pose_<ContainerAllocator> Type;

  Pose_()
    : timestamp(0)
    , x(0.0)
    , y(0.0)
    , theta(0.0)
    , curvature(0.0)
    , velocity(0.0)
    , acceleration(0.0)  {
    }
  Pose_(const ContainerAllocator& _alloc)
    : timestamp(0)
    , x(0.0)
    , y(0.0)
    , theta(0.0)
    , curvature(0.0)
    , velocity(0.0)
    , acceleration(0.0)  {
  (void)_alloc;
    }



   typedef uint64_t _timestamp_type;
  _timestamp_type timestamp;

   typedef double _x_type;
  _x_type x;

   typedef double _y_type;
  _y_type y;

   typedef double _theta_type;
  _theta_type theta;

   typedef double _curvature_type;
  _curvature_type curvature;

   typedef double _velocity_type;
  _velocity_type velocity;

   typedef double _acceleration_type;
  _acceleration_type acceleration;




  typedef boost::shared_ptr< ::av_msgs::Pose_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::Pose_<ContainerAllocator> const> ConstPtr;

}; // struct Pose_

typedef ::av_msgs::Pose_<std::allocator<void> > Pose;

typedef boost::shared_ptr< ::av_msgs::Pose > PosePtr;
typedef boost::shared_ptr< ::av_msgs::Pose const> PoseConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::Pose_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::Pose_<ContainerAllocator> >::stream(s, "", v);
return s;
}

} // namespace av_msgs

namespace ros
{
namespace message_traits
{



// BOOLTRAITS {'IsFixedSize': True, 'IsMessage': True, 'HasHeader': False}
// {'sensor_msgs': ['/opt/ros/jade/share/sensor_msgs/cmake/../msg'], 'geometry_msgs': ['/opt/ros/jade/share/geometry_msgs/cmake/../msg'], 'std_msgs': ['/opt/ros/jade/share/std_msgs/cmake/../msg'], 'av_msgs': ['/home/zhouji/Documents/autodrive/cakin_ws/src/mustang/common/av_msgs/msg']}

// !!!!!!!!!!! ['__class__', '__delattr__', '__dict__', '__doc__', '__eq__', '__format__', '__getattribute__', '__hash__', '__init__', '__module__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', '_parsed_fields', 'constants', 'fields', 'full_name', 'has_header', 'header_present', 'names', 'package', 'parsed_fields', 'short_name', 'text', 'types']




template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::Pose_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::Pose_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Pose_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Pose_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Pose_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Pose_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::Pose_<ContainerAllocator> >
{
  static const char* value()
  {
    return "0b505a0e63316b91a76662fa8302f48a";
  }

  static const char* value(const ::av_msgs::Pose_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0x0b505a0e63316b91ULL;
  static const uint64_t static_value2 = 0xa76662fa8302f48aULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::Pose_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/Pose";
  }

  static const char* value(const ::av_msgs::Pose_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::Pose_<ContainerAllocator> >
{
  static const char* value()
  {
    return "# 时间戳\n\
uint64 timestamp\n\
# 轨迹x坐标\n\
float64 x\n\
# 轨迹y坐标\n\
float64 y\n\
# 轨迹朝向角坐标\n\
float64 theta\n\
# 曲率\n\
float64 curvature\n\
# 速度\n\
float64 velocity\n\
# 加速度\n\
float64 acceleration\n\
";
  }

  static const char* value(const ::av_msgs::Pose_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::Pose_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.timestamp);
      stream.next(m.x);
      stream.next(m.y);
      stream.next(m.theta);
      stream.next(m.curvature);
      stream.next(m.velocity);
      stream.next(m.acceleration);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct Pose_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::Pose_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::Pose_<ContainerAllocator>& v)
  {
    s << indent << "timestamp: ";
    Printer<uint64_t>::stream(s, indent + "  ", v.timestamp);
    s << indent << "x: ";
    Printer<double>::stream(s, indent + "  ", v.x);
    s << indent << "y: ";
    Printer<double>::stream(s, indent + "  ", v.y);
    s << indent << "theta: ";
    Printer<double>::stream(s, indent + "  ", v.theta);
    s << indent << "curvature: ";
    Printer<double>::stream(s, indent + "  ", v.curvature);
    s << indent << "velocity: ";
    Printer<double>::stream(s, indent + "  ", v.velocity);
    s << indent << "acceleration: ";
    Printer<double>::stream(s, indent + "  ", v.acceleration);
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_POSE_H
