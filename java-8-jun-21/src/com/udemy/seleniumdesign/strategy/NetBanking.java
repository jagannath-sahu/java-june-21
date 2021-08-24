package com.udemy.seleniumdesign.strategy;

import java.util.Map;

public class NetBanking implements PaymentOption {

    private String bank;

    private String account;

    private String pin;

    public NetBanking(String bank, String account, String pin) {
		super();
		this.bank = bank;
		this.account = account;
		this.pin = pin;
	}

    public NetBanking() {
		super();
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

	public String getAccount() {
		return account;
	}

	public void setAccount(String account) {
		this.account = account;
	}

	public String getPin() {
		return pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	@Override
	public String toString() {
		return "NetBanking [bank=" + bank + ", account=" + account + ", pin=" + pin + "]";
	}

	@Override
    public void enterPaymentInformation(Map<String, String> paymentDetails) throws Exception {
		if(paymentDetails.get("bank") == null || paymentDetails.get("account") == null || paymentDetails.get("pin") == null) {
			throw new Exception("invalid card details");
		}
        this.bank = paymentDetails.get("bank");
        this.account = paymentDetails.get("account");
        this.pin = paymentDetails.get("pin");
    }
}
