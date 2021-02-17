package br.com.cod3r.proxy.remoteResource.services;

public class ResourceProxy implements Resource {
	private Resource realResource;
	private String validToken = "v@lid!";
	private String tokenProvided;
	
	public ResourceProxy(String tokenProvided) {
		this.tokenProvided = tokenProvided;
	}

	@Override
	public String getData() {
		if(!tokenProvided.equals(validToken)) return "Invalid Token";
		if(realResource == null) {
			try {
				realResource = new ResourceImpl();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return realResource.getData();
	}
}
