package com.udemy.seleniumdesign.strategy;

public class Order {

    private String orderNumber;

    private PaymentScreen paymentScreen;

    public PaymentScreen getPaymentScreen() {
		return paymentScreen;
	}

	public void setPaymentScreen(PaymentScreen paymentScreen) {
		this.paymentScreen = paymentScreen;
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Order() {
		super();
	}

	public Order(String orderNumber) {
		super();
		this.orderNumber = orderNumber;
	}

	public String placeOrder(){
        System.out.println("order placed & order no is : " + orderNumber);
        System.out.println("order placed through : " + this.paymentScreen.getPaymentOption());
        return orderNumber;
    }

}
