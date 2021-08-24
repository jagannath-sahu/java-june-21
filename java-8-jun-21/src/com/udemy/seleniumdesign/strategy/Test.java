package com.udemy.seleniumdesign.strategy;

import java.util.HashMap;
import java.util.Map;

public class Test {

	public static void main(String[] args) {
		Map<String, String> cc = new HashMap<>();
        cc.put("cc", "1231231231");
        cc.put("year", "2023");
        cc.put("cvv", "123");

        Map<String, String> nb = new HashMap<>();
        nb.put("bank", "HDFC");
        nb.put("account", "10988323000020");
        nb.put("pin", "4765");

        UserInformation userInformation = new UserInformation("vinoth", "selvaraj", "udemy@gmail.com");

        Order order = new Order("12345");
        PaymentScreen paymentScreen = new PaymentScreen();
        paymentScreen.setUserInformation(userInformation);
        paymentScreen.setOrder(order);
        System.out.println("all available payment options : " + PaymentOptionFactory.getAllAvailablePaymentOptions());
        paymentScreen.setPaymentOption(PaymentOptionFactory.get("CC")); // strategy
        try {
			paymentScreen.pay(cc);
			String orderNumber = paymentScreen.getOrder().placeOrder();

	        System.out.println(
	                "Order Number : " + orderNumber
	        );
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("----------------------------------------------");
        System.out.println();

        Order order1 = new Order("45986");
        PaymentScreen paymentScreen1 = new PaymentScreen();
        paymentScreen1.setUserInformation(userInformation);
        paymentScreen1.setOrder(order1);
        System.out.println("all available payment options : " + PaymentOptionFactory.getAllAvailablePaymentOptions());
        paymentScreen1.setPaymentOption(PaymentOptionFactory.get("NB")); // strategy
        try {
        	paymentScreen1.pay(nb);
			String orderNumber = paymentScreen1.getOrder().placeOrder();

	        System.out.println(
	                "Order Number : " + orderNumber
	        );
		} catch (Exception e) {
			e.printStackTrace();
		}

        System.out.println("----------------------------------------------");
        System.out.println();

        Order order2 = new Order("37788");
        PaymentScreen paymentScreen2 = new PaymentScreen();
        paymentScreen2.setUserInformation(userInformation);
        paymentScreen2.setOrder(order2);
        System.out.println("all available payment options : " + PaymentOptionFactory.getAllAvailablePaymentOptions());
        paymentScreen2.setPaymentOption(PaymentOptionFactory.get("NB")); // strategy
        try {
        	paymentScreen2.pay(cc);
			String orderNumber = paymentScreen2.getOrder().placeOrder();

	        System.out.println(
	                "Order Number : " + orderNumber
	        );
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
