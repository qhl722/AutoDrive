#ifndef MUSTANG_AV_COMM_COMM_H
#define MUSTANG_AV_COMM_COMM_H

#include <av_comm/log4ros.h>

#include <chrono>

namespace av_comm {

template <class Rep = uint64_t, class Period = std::milli> Rep Now() {
    using namespace std::chrono;
    return time_point_cast <duration <Rep, Period>> (
        system_clock::now()).time_since_epoch().count();
}
enum SENSOR_TYPE {
    VELODYNE,
    CAMERA,
    RADAR,
    IBEO,
    CAMERA_VELODYNE,
    OTHER_SENSOR
};

enum CLASS_TYPE {
    VEHICLE,
    TRUCK,
    BUS,
    PED,
    CYCLIST,
    UNKOWN,
    NOT_GIVEN
};

} // namespace av_comm

#endif // MUSTANG_AV_COMM_COMM_H


