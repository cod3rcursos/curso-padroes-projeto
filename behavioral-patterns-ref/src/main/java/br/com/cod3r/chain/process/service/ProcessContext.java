package br.com.cod3r.chain.process.service;

import java.util.LinkedHashMap;
import java.util.Map;

public class ProcessContext {
	private Map<String, Object> context;
	private Object processResult;
	
	public ProcessContext() {
		context = new LinkedHashMap<String, Object>();
	}

	public Object get(String key) throws Exception {
		return context.get(key);
	}

	public Object put(String key, Object value) {
		return context.put(key, value);
	}

	public Object remove(String key) {
		return context.remove(key);
	}
	
	public void reset() {
		context = new LinkedHashMap<String, Object>();
		processResult = null;
	}
	
	public void addProcessResult(Object result) {
		this.processResult = result;
	}
	
	public Object getProcessResult() {
		return processResult;
	}
}
