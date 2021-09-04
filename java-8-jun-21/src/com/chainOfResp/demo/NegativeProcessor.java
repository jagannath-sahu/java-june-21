package com.chainOfResp.demo;

class NegativeProcessor extends Processor {
	public NegativeProcessor(Processor processor) {
		super(processor); //creating super object
		//super();
	}

	public void process(Number request) {
		if (request.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + request.getNumber());
		} else {
			super.process(request); //using super object
		}
	}
}