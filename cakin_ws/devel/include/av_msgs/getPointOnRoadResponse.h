// Generated by gencpp from file av_msgs/getPointOnRoadResponse.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_GETPOINTONROADRESPONSE_H
#define AV_MSGS_MESSAGE_GETPOINTONROADRESPONSE_H


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
struct getPointOnRoadResponse_
{
  typedef getPointOnRoadResponse_<ContainerAllocator> Type;

  getPointOnRoadResponse_()
    : result()  {
    }
  getPointOnRoadResponse_(const ContainerAllocator& _alloc)
    : result(_alloc)  {
  (void)_alloc;
    }



   typedef std::vector<uint8_t, typename ContainerAllocator::template rebind<uint8_t>::other >  _result_type;
  _result_type result;




  typedef boost::shared_ptr< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> const> ConstPtr;

}; // struct getPointOnRoadResponse_

typedef ::av_msgs::getPointOnRoadResponse_<std::allocator<void> > getPointOnRoadResponse;

typedef boost::shared_ptr< ::av_msgs::getPointOnRoadResponse > getPointOnRoadResponsePtr;
typedef boost::shared_ptr< ::av_msgs::getPointOnRoadResponse const> getPointOnRoadResponseConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >::stream(s, "", v);
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
struct IsFixedSize< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> const>
  : FalseType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
{
  static const char* value()
  {
    return "cfa26713f7564a36d6c15c911217d3b9";
  }

  static const char* value(const ::av_msgs::getPointOnRoadResponse_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0xcfa26713f7564a36ULL;
  static const uint64_t static_value2 = 0xd6c15c911217d3b9ULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/getPointOnRoadResponse";
  }

  static const char* value(const ::av_msgs::getPointOnRoadResponse_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
{
  static const char* value()
  {
    return "bool[] result\n\
\n\
";
  }

  static const char* value(const ::av_msgs::getPointOnRoadResponse_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.result);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct getPointOnRoadResponse_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::getPointOnRoadResponse_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::getPointOnRoadResponse_<ContainerAllocator>& v)
  {
    s << indent << "result[]" << std::endl;
    for (size_t i = 0; i < v.result.size(); ++i)
    {
      s << indent << "  result[" << i << "]: ";
      Printer<uint8_t>::stream(s, indent + "  ", v.result[i]);
    }
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_GETPOINTONROADRESPONSE_H