package br.com.cod3r.factory.app.dbadapter.before.db;

public class OracleDB {

	public void query(String sql) {
		System.out.println("Querying " + sql + " in Oracle database");
	}
	
	public void update(String sql) {
		System.out.println("Uptade querry " + sql + " in Oracle database");
	}
}
