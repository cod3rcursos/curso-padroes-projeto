package br.com.cod3r.factory.app.dbadapter.after.db;

public class PostgresDB implements DB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Postgres database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Postgres database");
	}
}
