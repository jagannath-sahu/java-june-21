package com.udemy.seleniumdesign.strategy;

import java.util.Map;

public class PaymentScreen {

    private UserInformation userInformation;
    private Order order;
    private PaymentOption paymentOption;

    public PaymentScreen() {
		super();
	}

	public PaymentScreen(UserInformation userInformation, Order order, PaymentOption paymentOption){
        this.userInformation = userInformation;
        this.order = order;
        this.paymentOption = paymentOption;
    }

    public void setUserInformation(UserInformation userInformation) {
		this.userInformation = userInformation;
	}

	public UserInformation getUserInformation() {
        return userInformation;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
		this.order = order;
	}

	public void setPaymentOption(PaymentOption paymentOption) {
        this.paymentOption = paymentOption;
    }

    public PaymentOption getPaymentOption() {
		return paymentOption;
	}

	public void pay(Map<String, String> paymentDetails) throws Exception{
        this.paymentOption.enterPaymentInformation(paymentDetails);
        this.order.setPaymentScreen(this);
    }
}
