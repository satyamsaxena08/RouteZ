package com.Routez.payload;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class RouteDto {
    private String fromLocation;
    private String toLocation;
    private String fromDate;
    private String toDate;
    private String totalDuration;
    private String fromTime;
    private String toTime;
}


//    private List<Long> busIds; // Assuming bus IDs are used for association with buses
//    private List<Long> subRouteIds; // Assuming sub-route IDs are used for association with sub-routes


//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class RouteDto {
//
//    private long routeID;
//    private String fromLocation;
//    private String toLocation;
//    private String fromDate;
//    private String toDate;
//    private String totalDuration;
//    private String fromTime;
//    private String toTime;
//}


