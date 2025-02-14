//package com.namma.payment.Service;
//
//import com.namma.payment.Model.Penalty;
//import com.namma.payment.Repository.PenaltyRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//import org.springframework.web.client.RestTemplate;
//
//import java.time.LocalDateTime;
//
//
//
//@Service
//public class PenaltyService {
//
//    @Autowired
//    private PenaltyRepository penaltyRepository;
//
//    @Autowired
//    private RestTemplate restTemplate;
//
//    @Value("${user.service.url}")
//    private String userServiceUrl;
//
//    public Penalty chargePenalty(String userId) {
//        // Retrieve user details using RestTemplate
//        String url = userServiceUrl + "/api/profile/" + userId;
//        User user = restTemplate.getForObject(url, User.class);
//
//        // Calculate penalty amount
//        double penaltyAmount = calculatePenaltyAmount(user);
//
//        // Create penalty
//        Penalty penalty = new Penalty();
//        penalty.setUserId(userId);
//        penalty.setAmount(penaltyAmount);
//        penalty.setTimestamp(LocalDateTime.now());
//
//        return penaltyRepository.save(penalty);
//    }
//
//    private double calculatePenaltyAmount(User user) {
//        // Logic to calculate penalty amount
//        return 5.0; // Example penalty amount
//    }
//}
