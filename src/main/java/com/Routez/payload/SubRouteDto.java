package com.Routez.payload;



import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SubRouteDto {


    private String fromLocation;
    private String toLocation;
    private String fromDate;
    private String toDate;
    private String totalDuration;
    private String fromTime;
    private String toTime;
//    private long routeId; // Assuming route ID is used for association with the route
}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class SubRouteDto {
//
//    private long subRouteID;
//    private String fromLocation;
//    private String toLocation;
//    private String fromDate;
//    private String toDate;
//    private String totalDuration;
//    private String fromTime;
//    private String toTime;
//}
