package com.udemy.seleniumdesign.strategy;

public class Order {

    private String orderNumber;

    private PaymentOption paymentOption;

    private Item item;

    public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	public PaymentOption getPaymentOption() {
		return paymentOption;
	}

	public void setPaymentOption(PaymentOption paymentOption) {
		this.paymentOption = paymentOption;
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
        System.out.println("order placed successfully");
        System.out.println("order placed through : " + this.getPaymentOption());
        return orderNumber;
    }

}
