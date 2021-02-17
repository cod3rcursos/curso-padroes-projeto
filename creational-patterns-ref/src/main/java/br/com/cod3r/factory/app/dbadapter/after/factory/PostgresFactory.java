package br.com.cod3r.factory.app.dbadapter.after.factory;

import br.com.cod3r.factory.app.dbadapter.after.db.DB;
import br.com.cod3r.factory.app.dbadapter.after.db.PostgresDB;

public class PostgresFactory implements DBFactory {

	@Override
	public DB getDatabase() {
		return new PostgresDB();
	}

}
