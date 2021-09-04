package com.chainOfResp.demo;

class PositiveProcessor extends Processor {

	public PositiveProcessor(Processor processor) {
		super(processor); //creating super object
		//super();
	}

	public void process(Number request) {
		if (request.getNumber() > 0) {
			System.out.println("PositiveProcessor : " + request.getNumber());
		} else {
			super.process(request); //using super object
		}
	}
}