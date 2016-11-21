// Generated by gencpp from file av_msgs/RadarObject.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_RADAROBJECT_H
#define AV_MSGS_MESSAGE_RADAROBJECT_H


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
struct RadarObject_
{
  typedef RadarObject_<ContainerAllocator> Type;

  RadarObject_()
    : id(0)
    , range(0.0)
    , angle(0.0)
    , velocity(0.0)
    , accel(0.0)
    , msg()  {
    }
  RadarObject_(const ContainerAllocator& _alloc)
    : id(0)
    , range(0.0)
    , angle(0.0)
    , velocity(0.0)
    , accel(0.0)
    , msg(_alloc)  {
  (void)_alloc;
    }



   typedef uint64_t _id_type;
  _id_type id;

   typedef float _range_type;
  _range_type range;

   typedef float _angle_type;
  _angle_type angle;

   typedef float _velocity_type;
  _velocity_type velocity;

   typedef float _accel_type;
  _accel_type accel;

   typedef std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other >  _msg_type;
  _msg_type msg;




  typedef boost::shared_ptr< ::av_msgs::RadarObject_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::RadarObject_<ContainerAllocator> const> ConstPtr;

}; // struct RadarObject_

typedef ::av_msgs::RadarObject_<std::allocator<void> > RadarObject;

typedef boost::shared_ptr< ::av_msgs::RadarObject > RadarObjectPtr;
typedef boost::shared_ptr< ::av_msgs::RadarObject const> RadarObjectConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::RadarObject_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::RadarObject_<ContainerAllocator> >::stream(s, "", v);
return s;
}

} // namespace av_msgs

namespace ros
{
namespace message_traits
{



// BOOLTRAITS {'IsFixedSize': False, 'IsMessage': True, 'HasHeader': False}
// {'sensor_msgs': ['/opt/ros/jade/share/sensor_msgs/cmake/../msg'], 'geometry_msgs': ['/opt/ros/jade/share/geometry_msgs/cmake/../msg'], 'std_msgs': ['/opt/ros/jade/share/std_msgs/cmake/../msg'], 'av_msgs': ['/home/zhouji/Documents/autodrive/cakin_ws/src/mustang/common/av_msgs/msg']}

// !!!!!!!!!!! ['__class__', '__delattr__', '__dict__', '__doc__', '__eq__', '__format__', '__getattribute__', '__hash__', '__init__', '__module__', '__ne__', '__new__', '__reduce__', '__reduce_ex__', '__repr__', '__setattr__', '__sizeof__', '__str__', '__subclasshook__', '__weakref__', '_parsed_fields', 'constants', 'fields', 'full_name', 'has_header', 'header_present', 'names', 'package', 'parsed_fields', 'short_name', 'text', 'types']




template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::RadarObject_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::RadarObject_<ContainerAllocator> const>
  : FalseType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::RadarObject_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::RadarObject_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::RadarObject_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::RadarObject_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::RadarObject_<ContainerAllocator> >
{
  static const char* value()
  {
    return "04d2359ae111a6d565942bf7ca37cffd";
  }

  static const char* value(const ::av_msgs::RadarObject_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0x04d2359ae111a6d5ULL;
  static const uint64_t static_value2 = 0x65942bf7ca37cffdULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::RadarObject_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/RadarObject";
  }

  static const char* value(const ::av_msgs::RadarObject_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::RadarObject_<ContainerAllocator> >
{
  static const char* value()
  {
    return "uint64 id               # 物体ID\n\
\n\
float32 range           # 物体的距离 0 到 204.7 m\n\
float32 angle           # 物体的方向角 -51.2 to 51.1 deg\n\
float32 velocity        # 物体的速度    -81.92 to 81.91 m/s\n\
float32 accel           # 物体的加速度  -25.60 to 25.55 m/s/s\n\
string msg\n\
\n\
";
  }

  static const char* value(const ::av_msgs::RadarObject_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::RadarObject_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.id);
      stream.next(m.range);
      stream.next(m.angle);
      stream.next(m.velocity);
      stream.next(m.accel);
      stream.next(m.msg);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct RadarObject_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::RadarObject_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::RadarObject_<ContainerAllocator>& v)
  {
    s << indent << "id: ";
    Printer<uint64_t>::stream(s, indent + "  ", v.id);
    s << indent << "range: ";
    Printer<float>::stream(s, indent + "  ", v.range);
    s << indent << "angle: ";
    Printer<float>::stream(s, indent + "  ", v.angle);
    s << indent << "velocity: ";
    Printer<float>::stream(s, indent + "  ", v.velocity);
    s << indent << "accel: ";
    Printer<float>::stream(s, indent + "  ", v.accel);
    s << indent << "msg: ";
    Printer<std::basic_string<char, std::char_traits<char>, typename ContainerAllocator::template rebind<char>::other > >::stream(s, indent + "  ", v.msg);
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_RADAROBJECT_H
