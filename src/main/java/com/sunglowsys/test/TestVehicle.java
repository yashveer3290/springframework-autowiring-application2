package com.sunglowsys.test;

import com.sunglowsys.service.VehicleService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestVehicle {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.scan("com.sunglowsys.repository");
        context.scan("com.sunglowsys.service");
        context.refresh();

        VehicleService vehicleService = context.getBean(VehicleService.class);
        vehicleService.service();
        context.close();

    }
}
