package com.emanueltobias.chain.processplus.steps;

import com.emanueltobias.chain.processplus.service.ProcessContext;

public class CreateMap extends ProcessStep {

	public CreateMap(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		context.encapsulate((String) args[0]);
		return next(context, true);
	}

}
