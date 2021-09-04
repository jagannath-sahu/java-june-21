package com.chainOfResp.demo;

abstract class Processor
{
    private Processor processor;

    public Processor() {
		super();
	}

	public Processor(Processor processor){
        this.processor = processor;
    };

    public void process(Number request){
        if(processor != null)
            processor.process(request);
    };
}