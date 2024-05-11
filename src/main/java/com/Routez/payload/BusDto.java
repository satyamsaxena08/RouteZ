package com.Routez.payload;


import com.Routez.entity.Driver;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDto {

    private String busNumber;
    private String busType;
    private double price;
    private int totalSeats;
    private int availableSeats;
    private RouteDto route;
    private List<SubRouteDto> subRoutes;

}

//@Data
//@AllArgsConstructor
//@NoArgsConstructor
//public class BusDto {
//
//    private long busID;
//    private String busNumber;
//    private String busType;
//    private double price;
//    private int totalSeats;
//    private int availableSeats;
//}

