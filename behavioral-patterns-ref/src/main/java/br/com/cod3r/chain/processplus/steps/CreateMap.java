package br.com.cod3r.chain.processplus.steps;

import br.com.cod3r.chain.processplus.service.ProcessContext;

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
