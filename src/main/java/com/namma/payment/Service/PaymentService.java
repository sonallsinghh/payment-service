package com.namma.payment.Service;

//import com.namma.payment.Model.Transaction;
//import com.namma.payment.Repository.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;


@Service
public class PaymentService {
    //@Autowired
    //private TransactionRepository transactionRepository;

    @Autowired
    private RestTemplate restTemplate;  // Used to call Metro service

    public Double pay(String userId, String paymentMethod) {
        // Fetch fare from Metro microservice
        String metroServiceUrl = "http://localhost:8000/metro/check-out/fare?userId=" + userId;
        Double fare = restTemplate.getForObject(metroServiceUrl, Double.class);

        if (fare == null) {
            throw new RuntimeException("Could not retrieve fare for user: " + userId);
        }

        // Apply 10% discount if MetroCard is used
        if ("MetroCard".equalsIgnoreCase(paymentMethod)) {
            fare *= 0.9;
        }

        // Create transaction
//        Transaction transaction = new Transaction();
//        transaction.setUserId(userId);
//        transaction.setAmount(fare);
//        transaction.setPaymentMethod(paymentMethod);
//        transaction.setTimestamp(LocalDateTime.now());

//        return transactionRepository.save(transaction);

            return fare;

    }
}
