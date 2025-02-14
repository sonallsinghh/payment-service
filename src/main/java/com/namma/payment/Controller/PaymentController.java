package com.namma.payment.Controller;

import com.namma.payment.Model.PaymentRequest;
//import com.namma.payment.Model.Penalty;
//import com.namma.payment.Model.Transaction;
//import com.namma.payment.Service.PaymentHistoryService;
import com.namma.payment.Service.PaymentService;
//import com.namma.payment.Service.PenaltyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/payments")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

//    @Autowired
//    private PenaltyService penaltyService;
//
//    @Autowired
//    private PaymentHistoryService paymentHistoryService;

    @GetMapping("/fare")
    public ResponseEntity<Double> getFare(
            @RequestParam String userId,
            @RequestParam String paymentMethod) {

        Double finalFare = paymentService.pay(userId, paymentMethod);
        return ResponseEntity.ok(finalFare);
    }



//    @PostMapping("/penalty")
//    public ResponseEntity<Penalty> chargePenalty(@RequestBody PenaltyRequest penaltyRequest) {
//        Penalty penalty = penaltyService.chargePenalty(penaltyRequest.getUserId());
//        return ResponseEntity.ok(penalty);
//    }
//
//    @GetMapping("/history/{userId}")
//    public ResponseEntity<List<Transaction>> getPaymentHistory(@PathVariable String userId) {
//        List<Transaction> history = paymentHistoryService.getPaymentHistory(userId);
//        return ResponseEntity.ok(history);
//    }
}
