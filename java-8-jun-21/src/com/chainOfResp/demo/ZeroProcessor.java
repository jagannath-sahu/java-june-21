package com.chainOfResp.demo;

class ZeroProcessor extends Processor {
	public ZeroProcessor(Processor processor) {
		super(processor); //creating super object
		//super();
	}

	public void process(Number request) {
		if (request.getNumber() == 0) {
			System.out.println("ZeroProcessor : " + request.getNumber());
		} else {
			super.process(request); //using super object
		}
	}
}