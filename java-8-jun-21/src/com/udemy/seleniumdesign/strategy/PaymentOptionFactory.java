package com.udemy.seleniumdesign.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.function.Supplier;

public class PaymentOptionFactory {

    private static final Supplier<PaymentOption> CC = () -> new CreditCard();
    private static final Supplier<PaymentOption> NB = () -> new NetBanking();

    private static final Map<String, Supplier<PaymentOption>> paymentOptionMAP = new HashMap<>();

    static {
    	paymentOptionMAP.put("CC", CC);
    	paymentOptionMAP.put("NB", NB);
    }

    public static PaymentOption get(String option){
        return paymentOptionMAP.get(option).get();
    }

    public static Set<String> getAllAvailablePaymentOptions(){
        return paymentOptionMAP.keySet();
    }

}
