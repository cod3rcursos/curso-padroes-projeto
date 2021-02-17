package br.com.cod3r.chain.processplus;

import br.com.cod3r.chain.processplus.service.GenericService;
import br.com.cod3r.chain.processplus.service.ProcessContext;
import br.com.cod3r.chain.processplus.service.ServicesCatalog;

public class Client {

	public static void main(String[] args) {
		ProcessContext ctx = new ProcessContext();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		Object response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "anotherUser@email.com");
		ctx.put("password", "1234");
		ctx.put("name", "Another User");
		response = GenericService.run(ServicesCatalog.saveUserProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("email", "user@email.com");
		ctx.put("password", "123456");
		
		response = GenericService.run(ServicesCatalog.loginProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("token", "USER@EMAIL.COM");
		response = GenericService.run(ServicesCatalog.getUsersProcess, ctx);
		System.out.println(response);
		
		ctx.reset();
		ctx.put("token", "Invalid token");
		response = GenericService.run(ServicesCatalog.getUsersProcess, ctx);
		System.out.println(response);
	}
}
