// Generated by gencpp from file av_msgs/getPointOnRoad.msg
// DO NOT EDIT!


#ifndef AV_MSGS_MESSAGE_GETPOINTONROAD_H
#define AV_MSGS_MESSAGE_GETPOINTONROAD_H

#include <ros/service_traits.h>


#include <av_msgs/getPointOnRoadRequest.h>
#include <av_msgs/getPointOnRoadResponse.h>


namespace av_msgs
{

struct getPointOnRoad
{

typedef getPointOnRoadRequest Request;
typedef getPointOnRoadResponse Response;
Request request;
Response response;

typedef Request RequestType;
typedef Response ResponseType;

}; // struct getPointOnRoad
} // namespace av_msgs


namespace ros
{
namespace service_traits
{


template<>
struct MD5Sum< ::av_msgs::getPointOnRoad > {
  static const char* value()
  {
    return "738f40f3eff47b68be9fc103c5b62eb4";
  }

  static const char* value(const ::av_msgs::getPointOnRoad&) { return value(); }
};

template<>
struct DataType< ::av_msgs::getPointOnRoad > {
  static const char* value()
  {
    return "av_msgs/getPointOnRoad";
  }

  static const char* value(const ::av_msgs::getPointOnRoad&) { return value(); }
};


// service_traits::MD5Sum< ::av_msgs::getPointOnRoadRequest> should match 
// service_traits::MD5Sum< ::av_msgs::getPointOnRoad > 
template<>
struct MD5Sum< ::av_msgs::getPointOnRoadRequest>
{
  static const char* value()
  {
    return MD5Sum< ::av_msgs::getPointOnRoad >::value();
  }
  static const char* value(const ::av_msgs::getPointOnRoadRequest&)
  {
    return value();
  }
};

// service_traits::DataType< ::av_msgs::getPointOnRoadRequest> should match 
// service_traits::DataType< ::av_msgs::getPointOnRoad > 
template<>
struct DataType< ::av_msgs::getPointOnRoadRequest>
{
  static const char* value()
  {
    return DataType< ::av_msgs::getPointOnRoad >::value();
  }
  static const char* value(const ::av_msgs::getPointOnRoadRequest&)
  {
    return value();
  }
};

// service_traits::MD5Sum< ::av_msgs::getPointOnRoadResponse> should match 
// service_traits::MD5Sum< ::av_msgs::getPointOnRoad > 
template<>
struct MD5Sum< ::av_msgs::getPointOnRoadResponse>
{
  static const char* value()
  {
    return MD5Sum< ::av_msgs::getPointOnRoad >::value();
  }
  static const char* value(const ::av_msgs::getPointOnRoadResponse&)
  {
    return value();
  }
};

// service_traits::DataType< ::av_msgs::getPointOnRoadResponse> should match 
// service_traits::DataType< ::av_msgs::getPointOnRoad > 
template<>
struct DataType< ::av_msgs::getPointOnRoadResponse>
{
  static const char* value()
  {
    return DataType< ::av_msgs::getPointOnRoad >::value();
  }
  static const char* value(const ::av_msgs::getPointOnRoadResponse&)
  {
    return value();
  }
};

} // namespace service_traits
} // namespace ros

#endif // AV_MSGS_MESSAGE_GETPOINTONROAD_H
