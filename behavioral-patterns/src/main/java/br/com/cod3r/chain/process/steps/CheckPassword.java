package br.com.cod3r.chain.process.steps;

import br.com.cod3r.chain.process.service.ProcessContext;

public class CheckPassword extends ProcessStep {

	public CheckPassword(Object... args) {
		super(args);
	}

	@Override
	public ProcessContext execute(ProcessContext context) throws Exception {
		String passwdInput = (String) context.get("input.password");
		String passwdDb = (String) context.get("user.password");
		if(!passwdDb.equals(passwdInput)) throw new Exception("Password don't match");
		return next(context, true);
	}

}
