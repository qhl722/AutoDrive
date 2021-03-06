// Generated by gencpp from file av_msgs/Trajectory.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_TRAJECTORY_H
#define AV_MSGS_MESSAGE_TRAJECTORY_H


#include <string>
#include <vector>
#include <map>

#include <ros/types.h>
#include <ros/serialization.h>
#include <ros/builtin_message_traits.h>
#include <ros/message_operations.h>

#include <av_msgs/Pose.h>
#include <av_msgs/Pose.h>

namespace av_msgs
{
template <class ContainerAllocator>
struct Trajectory_
{
  typedef Trajectory_<ContainerAllocator> Type;

  Trajectory_()
    : initial_pose()
    , poses()
    , driving_direction(0)
    , driving_state(0)  {
    }
  Trajectory_(const ContainerAllocator& _alloc)
    : initial_pose(_alloc)
    , poses(_alloc)
    , driving_direction(0)
    , driving_state(0)  {
  (void)_alloc;
    }



   typedef  ::av_msgs::Pose_<ContainerAllocator>  _initial_pose_type;
  _initial_pose_type initial_pose;

   typedef std::vector< ::av_msgs::Pose_<ContainerAllocator> , typename ContainerAllocator::template rebind< ::av_msgs::Pose_<ContainerAllocator> >::other >  _poses_type;
  _poses_type poses;

   typedef uint8_t _driving_direction_type;
  _driving_direction_type driving_direction;

   typedef uint8_t _driving_state_type;
  _driving_state_type driving_state;




  typedef boost::shared_ptr< ::av_msgs::Trajectory_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::Trajectory_<ContainerAllocator> const> ConstPtr;

}; // struct Trajectory_

typedef ::av_msgs::Trajectory_<std::allocator<void> > Trajectory;

typedef boost::shared_ptr< ::av_msgs::Trajectory > TrajectoryPtr;
typedef boost::shared_ptr< ::av_msgs::Trajectory const> TrajectoryConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::Trajectory_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::Trajectory_<ContainerAllocator> >::stream(s, "", v);
return s;
}

} // namespace av_msgs

namespace ros
{
namespace message_traits
{



// BOOLTRAITS {'IsFixedSize': False, 'IsMessage': True, 'HasHeader': False}
// {'sensor_msgs': ['/opt/ros/jade/share/sensor_msgs/cmake/../msg'], 'geometry_msgs': ['/opt/ros/jade/share/geometry_msgs/cmake/../msg'], 'std_msgs': ['/opt/ros/jade/share/std_msgs/cmake/../msg'], 'av_msgs': ['/home/zhouji/Documents/autodrive/rpc_ws/src/common/av_msgs/msg']}

// !!!!!!!!!!! ['__class__', '__delattr__', '__dict__', '__doc__', '__eq__', '__format__', '__getattribute__', '__hash__', '__init__', '__module__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', '_parsed_fields', 'constants', 'fields', 'full_name', 'has_header', 'header_present', 'names', 'package', 'parsed_fields', 'short_name', 'text', 'types']




template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::Trajectory_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::Trajectory_<ContainerAllocator> const>
  : FalseType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Trajectory_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Trajectory_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Trajectory_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Trajectory_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::Trajectory_<ContainerAllocator> >
{
  static const char* value()
  {
    return "11573a4fb030f7929e047f56621802a1";
  }

  static const char* value(const ::av_msgs::Trajectory_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0x11573a4fb030f792ULL;
  static const uint64_t static_value2 = 0x9e047f56621802a1ULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::Trajectory_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/Trajectory";
  }

  static const char* value(const ::av_msgs::Trajectory_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::Trajectory_<ContainerAllocator> >
{
  static const char* value()
  {
    return "Pose initial_pose\n\
Pose[] poses\n\
uint8 driving_direction\n\
uint8 driving_state\n\
\n\
================================================================================\n\
MSG: av_msgs/Pose\n\
# 时间戳\n\
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

  static const char* value(const ::av_msgs::Trajectory_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::Trajectory_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.initial_pose);
      stream.next(m.poses);
      stream.next(m.driving_direction);
      stream.next(m.driving_state);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct Trajectory_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::Trajectory_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::Trajectory_<ContainerAllocator>& v)
  {
    s << indent << "initial_pose: ";
    s << std::endl;
    Printer< ::av_msgs::Pose_<ContainerAllocator> >::stream(s, indent + "  ", v.initial_pose);
    s << indent << "poses[]" << std::endl;
    for (size_t i = 0; i < v.poses.size(); ++i)
    {
      s << indent << "  poses[" << i << "]: ";
      s << std::endl;
      s << indent;
      Printer< ::av_msgs::Pose_<ContainerAllocator> >::stream(s, indent + "    ", v.poses[i]);
    }
    s << indent << "driving_direction: ";
    Printer<uint8_t>::stream(s, indent + "  ", v.driving_direction);
    s << indent << "driving_state: ";
    Printer<uint8_t>::stream(s, indent + "  ", v.driving_state);
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_TRAJECTORY_H
