// Generated by gencpp from file av_msgs/getLocalLanemarkers.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_GETLOCALLANEMARKERS_H
#define AV_MSGS_MESSAGE_GETLOCALLANEMARKERS_H

#include <ros/service_traits.h>


#include <av_msgs/getLocalLanemarkersRequest.h>
#include <av_msgs/getLocalLanemarkersResponse.h>


namespace av_msgs
{

struct getLocalLanemarkers
{

typedef getLocalLanemarkersRequest Request;
typedef getLocalLanemarkersResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;

}; // struct getLocalLanemarkers
} // namespace av_msgs


namespace ros
{
namespace service_traits
{


template<>
struct MD5Sum< ::av_msgs::getLocalLanemarkers > {
  static const char* value()
  {
    return "a154757fc95dc3366fcef9af186dff3e";
  }

  static const char* value(const ::av_msgs::getLocalLanemarkers&) { return value(); }
};

template<>
struct DataType< ::av_msgs::getLocalLanemarkers > {
  static const char* value()
  {
    return "av_msgs/getLocalLanemarkers";
  }

  static const char* value(const ::av_msgs::getLocalLanemarkers&) { return value(); }
};


// service_traits::MD5Sum< ::av_msgs::getLocalLanemarkersRequest> should match 
// service_traits::MD5Sum< ::av_msgs::getLocalLanemarkers > 
template<>
struct MD5Sum< ::av_msgs::getLocalLanemarkersRequest>
{
  static const char* value()
  {
    return MD5Sum< ::av_msgs::getLocalLanemarkers >::value();
  }
  static const char* value(const ::av_msgs::getLocalLanemarkersRequest&)
  {
    return value();
  }
};

// service_traits::DataType< ::av_msgs::getLocalLanemarkersRequest> should match 
// service_traits::DataType< ::av_msgs::getLocalLanemarkers > 
template<>
struct DataType< ::av_msgs::getLocalLanemarkersRequest>
{
  static const char* value()
  {
    return DataType< ::av_msgs::getLocalLanemarkers >::value();
  }
  static const char* value(const ::av_msgs::getLocalLanemarkersRequest&)
  {
    return value();
  }
};

// service_traits::MD5Sum< ::av_msgs::getLocalLanemarkersResponse> should match 
// service_traits::MD5Sum< ::av_msgs::getLocalLanemarkers > 
template<>
struct MD5Sum< ::av_msgs::getLocalLanemarkersResponse>
{
  static const char* value()
  {
    return MD5Sum< ::av_msgs::getLocalLanemarkers >::value();
  }
  static const char* value(const ::av_msgs::getLocalLanemarkersResponse&)
  {
    return value();
  }
};

// service_traits::DataType< ::av_msgs::getLocalLanemarkersResponse> should match 
// service_traits::DataType< ::av_msgs::getLocalLanemarkers > 
template<>
struct DataType< ::av_msgs::getLocalLanemarkersResponse>
{
  static const char* value()
  {
    return DataType< ::av_msgs::getLocalLanemarkers >::value();
  }
  static const char* value(const ::av_msgs::getLocalLanemarkersResponse&)
  {
    return value();
  }
};

} // namespace service_traits
} // namespace ros

#endif // AV_MSGS_MESSAGE_GETLOCALLANEMARKERS_H
