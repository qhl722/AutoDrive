// Generated by gencpp from file av_msgs/IbeoPointList.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_IBEOPOINTLIST_H
#define AV_MSGS_MESSAGE_IBEOPOINTLIST_H


#include <string>
#include <vector>
#include <map>

#include <ros/types.h>
#include <ros/serialization.h>
#include <ros/builtin_message_traits.h>
#include <ros/message_operations.h>

#include <av_msgs/IbeoPoint.h>

namespace av_msgs
{
template <class ContainerAllocator>
struct IbeoPointList_
{
  typedef IbeoPointList_<ContainerAllocator> Type;

  IbeoPointList_()
    : timestamp(0)
    , ibeo_point_list()  {
    }
  IbeoPointList_(const ContainerAllocator& _alloc)
    : timestamp(0)
    , ibeo_point_list(_alloc)  {
  (void)_alloc;
    }



   typedef uint64_t _timestamp_type;
  _timestamp_type timestamp;

   typedef std::vector< ::av_msgs::IbeoPoint_<ContainerAllocator> , typename ContainerAllocator::template rebind< ::av_msgs::IbeoPoint_<ContainerAllocator> >::other >  _ibeo_point_list_type;
  _ibeo_point_list_type ibeo_point_list;




  typedef boost::shared_ptr< ::av_msgs::IbeoPointList_<ContainerAllocator> > Ptr;
  typedef boost::shared_ptr< ::av_msgs::IbeoPointList_<ContainerAllocator> const> ConstPtr;

}; // struct IbeoPointList_

typedef ::av_msgs::IbeoPointList_<std::allocator<void> > IbeoPointList;

typedef boost::shared_ptr< ::av_msgs::IbeoPointList > IbeoPointListPtr;
typedef boost::shared_ptr< ::av_msgs::IbeoPointList const> IbeoPointListConstPtr;

// constants requiring out of line definition



template<typename ContainerAllocator>
std::ostream& operator<<(std::ostream& s, const ::av_msgs::IbeoPointList_<ContainerAllocator> & v)
{
ros::message_operations::Printer< ::av_msgs::IbeoPointList_<ContainerAllocator> >::stream(s, "", v);
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
struct IsFixedSize< ::av_msgs::IbeoPointList_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct IsFixedSize< ::av_msgs::IbeoPointList_<ContainerAllocator> const>
  : FalseType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::IbeoPointList_<ContainerAllocator> >
  : TrueType
  { };

template <class ContainerAllocator>
struct IsMessage< ::av_msgs::IbeoPointList_<ContainerAllocator> const>
  : TrueType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::IbeoPointList_<ContainerAllocator> >
  : FalseType
  { };

template <class ContainerAllocator>
struct HasHeader< ::av_msgs::IbeoPointList_<ContainerAllocator> const>
  : FalseType
  { };


template<class ContainerAllocator>
struct MD5Sum< ::av_msgs::IbeoPointList_<ContainerAllocator> >
{
  static const char* value()
  {
    return "5e8e53115c68cc8aab3056cdae033bf9";
  }

  static const char* value(const ::av_msgs::IbeoPointList_<ContainerAllocator>&) { return value(); }
  static const uint64_t static_value1 = 0x5e8e53115c68cc8aULL;
  static const uint64_t static_value2 = 0xab3056cdae033bf9ULL;
};

template<class ContainerAllocator>
struct DataType< ::av_msgs::IbeoPointList_<ContainerAllocator> >
{
  static const char* value()
  {
    return "av_msgs/IbeoPointList";
  }

  static const char* value(const ::av_msgs::IbeoPointList_<ContainerAllocator>&) { return value(); }
};

template<class ContainerAllocator>
struct Definition< ::av_msgs::IbeoPointList_<ContainerAllocator> >
{
  static const char* value()
  {
    return "uint64 timestamp\n\
IbeoPoint[] ibeo_point_list\n\
\n\
================================================================================\n\
MSG: av_msgs/IbeoPoint\n\
uint8 device_id\n\
uint8 echo\n\
uint16 flags\n\
uint8 layer\n\
float32 position_x\n\
float32 position_y\n\
float32 position_z\n\
";
  }

  static const char* value(const ::av_msgs::IbeoPointList_<ContainerAllocator>&) { return value(); }
};

} // namespace message_traits
} // namespace ros

namespace ros
{
namespace serialization
{

  template<class ContainerAllocator> struct Serializer< ::av_msgs::IbeoPointList_<ContainerAllocator> >
  {
    template<typename Stream, typename T> inline static void allInOne(Stream& stream, T m)
    {
      stream.next(m.timestamp);
      stream.next(m.ibeo_point_list);
    }

    ROS_DECLARE_ALLINONE_SERIALIZER
  }; // struct IbeoPointList_

} // namespace serialization
} // namespace ros

namespace ros
{
namespace message_operations
{

template<class ContainerAllocator>
struct Printer< ::av_msgs::IbeoPointList_<ContainerAllocator> >
{
  template<typename Stream> static void stream(Stream& s, const std::string& indent, const ::av_msgs::IbeoPointList_<ContainerAllocator>& v)
  {
    s << indent << "timestamp: ";
    Printer<uint64_t>::stream(s, indent + "  ", v.timestamp);
    s << indent << "ibeo_point_list[]" << std::endl;
    for (size_t i = 0; i < v.ibeo_point_list.size(); ++i)
    {
      s << indent << "  ibeo_point_list[" << i << "]: ";
      s << std::endl;
      s << indent;
      Printer< ::av_msgs::IbeoPoint_<ContainerAllocator> >::stream(s, indent + "    ", v.ibeo_point_list[i]);
    }
  }
};

} // namespace message_operations
} // namespace ros

#endif // AV_MSGS_MESSAGE_IBEOPOINTLIST_H