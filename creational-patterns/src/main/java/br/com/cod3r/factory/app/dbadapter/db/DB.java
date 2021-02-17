package br.com.cod3r.factory.app.dbadapter.db;

public interface DB {
	void query(String sql);
	void update(String sql);
}
