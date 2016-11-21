// Generated by gencpp from file av_msgs/Dest.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_DEST_H
#define AV_MSGS_MESSAGE_DEST_H


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
struct Dest_
{
  typedef Dest_<ContainerAllocator> Type;

  Dest_()
    : timestamp(0)
    , x(0.0)
    , y(0.0)
    , z(0.0)  {
    }
  Dest_(const ContainerAllocator& _alloc)
    : timestamp(0)
    , x(0.0)
    , y(0.0)
    , z(0.0)  {
  (void)_alloc;
    }



   typedef uint64_t _timestamp_type;
  _timestamp_type timestamp;

   typedef double _x_type;
  _x_type x;

   typedef double _y_type;
  _y_type y;

   typedef double _z_type;
  _z_type z;




  typedef boost::shared_ptr< ::av_msgs::Dest_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::Dest_<ContainerAllocator> const> ConstPtr;

}; // struct Dest_

typedef ::av_msgs::Dest_<std::allocator<void> > Dest;

typedef boost::shared_ptr< ::av_msgs::Dest > DestPtr;
typedef boost::shared_ptr< ::av_msgs::Dest const> DestConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::Dest_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::Dest_<ContainerAllocator> >::stream(s, "", v);
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
struct IsFixedSize< ::av_msgs::Dest_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::Dest_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Dest_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::Dest_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Dest_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::Dest_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::Dest_<ContainerAllocator> >
{
  static const char* value()
  {
    return "6c10cde1b8b9e8a057e1c14d95aa29e9";
  }

  static const char* value(const ::av_msgs::Dest_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0x6c10cde1b8b9e8a0ULL;
  static const uint64_t static_value2 = 0x57e1c14d95aa29e9ULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::Dest_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/Dest";
  }

  static const char* value(const ::av_msgs::Dest_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::Dest_<ContainerAllocator> >
{
  static const char* value()
  {
    return "# 目的地坐标\n\
uint64 timestamp\n\
float64 x\n\
float64 y\n\
float64 z\n\
\n\
";
  }

  static const char* value(const ::av_msgs::Dest_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::Dest_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.timestamp);
      stream.next(m.x);
      stream.next(m.y);
      stream.next(m.z);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct Dest_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::Dest_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::Dest_<ContainerAllocator>& v)
  {
    s << indent << "timestamp: ";
    Printer<uint64_t>::stream(s, indent + "  ", v.timestamp);
    s << indent << "x: ";
    Printer<double>::stream(s, indent + "  ", v.x);
    s << indent << "y: ";
    Printer<double>::stream(s, indent + "  ", v.y);
    s << indent << "z: ";
    Printer<double>::stream(s, indent + "  ", v.z);
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_DEST_H