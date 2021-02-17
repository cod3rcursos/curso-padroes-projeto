package br.com.cod3r.chain.processplus.steps;

import br.com.cod3r.chain.processplus.service.ProcessContext;

public abstract class ProcessStep {
	protected ProcessStep nextStep;
	protected Object[] args;
	
	public ProcessStep(Object... args) {
		this.args = args;
	}

	public abstract ProcessContext execute(ProcessContext context) throws Exception;
	
	public void setNextStep(ProcessStep next) {
		this.nextStep = next;
	}
	
	protected ProcessContext next(ProcessContext context, Object actualResult) throws Exception {
		context.addProcessResult(actualResult);
		return this.nextStep != null? nextStep.execute(context): context;
	}
 }
