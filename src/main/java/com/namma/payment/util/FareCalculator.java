//package com.namma.payment.util;
//
//import org.springframework.stereotype.Component;
//
//import java.time.LocalDateTime;
//
//@Component
//public class FareCalculator {
//    public double calculateFare(Ticket ticket, String paymentMethod) {
//        // Logic to calculate fare based on ticket details and payment method
//        double baseFare = 2.0; // Example base fare
//
//        // Check for peak hours
//        LocalDateTime now = LocalDateTime.now();
//        if (isPeakHour(now)) {
//            baseFare *= 1.2; // 20% increase during peak hours
//        }
//
//        return baseFare;
//    }
//
//    private boolean isPeakHour(LocalDateTime time) {
//        // Logic to determine if the current time is peak hour
//        return false;
//    }
//}
//
