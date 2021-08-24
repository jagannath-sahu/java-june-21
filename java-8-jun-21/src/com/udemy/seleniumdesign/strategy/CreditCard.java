package com.udemy.seleniumdesign.strategy;

import java.util.Map;

public class CreditCard implements PaymentOption {

    private String cc;

    private String year;

    private String cvv;

    public String getCc() {
		return cc;
	}

	public void setCc(String cc) {
		this.cc = cc;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	public CreditCard() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CreditCard(String cc, String year, String cvv) {
		super();
		this.cc = cc;
		this.year = year;
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "CreditCard [cc=" + cc + ", year=" + year + ", cvv=" + cvv + "]";
	}

	@Override
    public void enterPaymentInformation(Map<String, String> paymentDetails) throws Exception {
		if(paymentDetails.get("cc") == null  || paymentDetails.get("year") == null|| paymentDetails.get("cvv") == null) {
			throw new Exception("invalid credit card");
		}
        this.cc = paymentDetails.get("cc");
        this.year = paymentDetails.get("year");
        this.cvv = paymentDetails.get("cvv");
    }
}
