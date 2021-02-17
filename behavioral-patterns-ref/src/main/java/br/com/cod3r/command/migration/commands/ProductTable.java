package br.com.cod3r.command.migration.commands;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

public class ProductTable extends MigrationCommand {
	
	public ProductTable(Map<String, List<String>> database) {
		super(database);
	}

	@Override
	public void execute() {
		List<String> columns = new ArrayList<String>(Arrays.asList("Id", "Description", "Price"));
		database.put("Product", columns);
	}

	@Override
	public void undo() {
		database.remove("Product");
	}

}
