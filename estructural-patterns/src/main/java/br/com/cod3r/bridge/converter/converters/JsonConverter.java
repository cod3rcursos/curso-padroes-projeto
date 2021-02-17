package br.com.cod3r.bridge.converter.converters;

import br.com.cod3r.bridge.converter.employees.Employee;

public class JsonConverter {

	public String getEmployeeFormated(Employee emp) {
		StringBuilder builder = new StringBuilder();
		builder.append("{\n")
			.append("\t\"name\": \"").append(emp.getName()).append("\"\n")
			.append("\t\"age\": \"").append(emp.getAge()).append("\"\n")
			.append("\t\"salary\": \"").append(emp.getSalary()).append("\"\n")
		.append("}");
		
		return builder.toString();
	}

}
