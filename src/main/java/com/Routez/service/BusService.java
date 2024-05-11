package com.Routez.service;

import com.Routez.entity.Bus;
import com.Routez.entity.Route;
import com.Routez.entity.SubRoute;
import com.Routez.payload.BusDto;
import com.Routez.payload.SubRouteDto;
import com.Routez.repository.BusRepository;
import com.Routez.repository.DriverRepository;
import com.Routez.repository.RouteRepository;
import com.Routez.repository.SubRouteRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

//bus and route OneToOne Mapping
//@Service
//public class BusService {
//    @Autowired
//    private BusRepository busRepository;
//    @Autowired
//    private DriverRepository driverRepository;
//    @Autowired
//    private RouteRepository routeRepository;
//    @Autowired
//    private SubRouteRepository subRouteRepository;
//
//    public void createBus(BusDto busDto) {
//
//        //Create Route Entity
//        Route route = new Route();
//        route.setFromLocation(busDto.getRoute().getFromLocation());
//        route.setToLocation(busDto.getRoute().getToLocation());
//        route.setFromDate(busDto.getRoute().getFromDate());
//        route.setToDate(busDto.getRoute().getToDate());
//        route.setTotalDuration(busDto.getRoute().getTotalDuration());
//        route.setFromTime(busDto.getRoute().getFromTime());
//        route.setToTime(busDto.getRoute().getToTime());
//
//        //save Route entity
//        Route savedRoute = routeRepository.save(route);
//
//        //Create bus entity
//        Bus bus = new Bus();
//        bus.setBusNumber(busDto.getBusNumber());
//        bus.setBusType(busDto.getBusType());
//        bus.setPrice(busDto.getPrice());
//        bus.setTotalSeats(busDto.getTotalSeats());
//        bus.setAvailableSeats(busDto.getAvailableSeats());
//
//        //associate Bus with route 46:16 5/3/24 aug23 // Set the saved Route entity in the Bus entity
//        bus.setRoute(route);
//
//        //save BusEntity
//        Bus savedBud = busRepository.save(bus);
//
//        Route routeUpdate = routeRepository.findById(savedRoute.getId()).get();
//        routeUpdate.setBus(savedBud);
//        routeRepository.save(routeUpdate);
//
//
//        //if there are SubRoute, create and save them
//        if (busDto.getSubRoutes() != null && !busDto.getSubRoutes().isEmpty()) {
//            for (SubRouteDto subRouteDto : busDto.getSubRoutes()) {
//                SubRoute subRoute = new SubRoute();
//                subRoute.setFromLocation(subRouteDto.getFromLocation());
//                subRoute.setToLocation(subRouteDto.getToLocation());
//                subRoute.setFromDate(subRouteDto.getFromDate());
//                subRoute.setFromDate(subRouteDto.getFromDate());
//                subRoute.setToDate(subRouteDto.getToDate());
//                subRoute.setTotalDuration(subRouteDto.getTotalDuration());
//                subRoute.setToTime(subRouteDto.getToTime());
//                subRoute.setFromTime(subRouteDto.getFromTime());
//
//                //Associate SubRoute with Route
//                subRoute.setRoute(route);
//
//                //save SubRoute Entity
//                subRouteRepository.save(subRoute);
//            }
//        }
//
//
//    }
//
//
//}
@Service
public class BusService {

    @Autowired
    private BusRepository busRepository;

    @Autowired
    private DriverRepository driverRepository;

    @Autowired
    private RouteRepository routeRepository;

    @Autowired
    private SubRouteRepository subRouteRepository;


    public void createBus(BusDto busDto) {
//        // Create Route Entity
//        Route route = new Route();
//        route.setFromLocation(busDto.getRoute().getFromLocation());
//        route.setToLocation(busDto.getRoute().getToLocation());
//        route.setFromDate(busDto.getRoute().getFromDate());
//        route.setToDate(busDto.getRoute().getToDate());
//        route.setTotalDuration(busDto.getRoute().getTotalDuration());
//        route.setFromTime(busDto.getRoute().getFromTime());
//        route.setToTime(busDto.getRoute().getToTime()); // Corrected attribute assignment
//
//        // Save Route entity
//        Route savedRoute = routeRepository.save(route);
//
//        // Create bus entity
//        Bus bus = new Bus();
//        bus.setBusNumber(busDto.getBusNumber());
//        bus.setBusType(busDto.getBusType());
//        bus.setPrice(busDto.getPrice());
//        bus.setTotalSeats(busDto.getTotalSeats());
//        bus.setAvailableSeats(busDto.getAvailableSeats());
//
//        // Associate Bus with Route
//        bus.setRoute(savedRoute); // Set the saved Route entity in the Bus entity
//
//        // Save BusEntity
//        Bus savedBus = busRepository.save(bus);
//
//        // If there are SubRoutes, create and save them
//        if (busDto.getSubRoutes() != null && !busDto.getSubRoutes().isEmpty()) {
//            for (SubRouteDto subRouteDto : busDto.getSubRoutes()) {
//                SubRoute subRoute = new SubRoute();
//                subRoute.setFromLocation(subRouteDto.getFromLocation());
//                subRoute.setToLocation(subRouteDto.getToLocation());
//                subRoute.setFromDate(subRouteDto.getFromDate()); // Set fromDate only once
//                subRoute.setToDate(subRouteDto.getToDate());
//                subRoute.setTotalDuration(subRouteDto.getTotalDuration());
//                subRoute.setToTime(subRouteDto.getToTime());
//                subRoute.setFromTime(subRouteDto.getFromTime());
//
//                // Associate SubRoute with Route
//                subRoute.setRoute(savedRoute); // Associate SubRoute with the saved Route
//
//                // Save SubRoute Entity
//                subRouteRepository.save(subRoute);
//            }
//        }


        // 1. Create a Bus object
        Bus bus = new Bus();
        bus.setAvailableSeats(30);
        bus.setBusNumber("XYZ123");
        bus.setBusType("AC");
        bus.setPrice(500.0f);
        bus.setTotalSeats(50);

// 2. Save the Bus object (replace with your actual persistence layer interaction)
        busRepository.save(bus);
        Long busId = bus.getId(); // Get the generated ID

// 3. Create a Route object
        Route route = new Route();
        route.setBus(bus); // Set the ID of the previously saved bus
        route.setFromDate("2024-05-15");
        route.setFromLocation("City A");
        route.setFromTime("10:00");
        route.setToDate("2024-05-15");
        route.setToLocation("City B");
        route.setToTime("15:00");
        route.setTotalDuration("5h");

// 4. Save the Route object (replace with your actual persistence layer interaction)
        routeRepository.save(route);
        Long routeId = route.getId(); // Get the generated ID

// 5. Create a SubRoute object
        SubRoute subRoute = new SubRoute();
        subRoute.setRoute(route); // Set the ID of the previously saved route
        subRoute.setFromDate("2024-05-15");
        subRoute.setFromLocation("Town X");
        subRoute.setFromTime("11:00");
        subRoute.setToDate("2024-05-15");
        subRoute.setToLocation("Town Y");
        subRoute.setToTime("12:00");
        subRoute.setTotalDuration("1h");

// 6. Save the SubRoute object (replace with your actual persistence layer interaction)
        subRouteRepository.save(subRoute);

// If saving is successful, you should have a SubRoute associated with the created Route.

// You can then check the database or logs to see if the subroute data is saved correctly.
    }
}


