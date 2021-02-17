package br.com.cod3r.singleton.connectionPool.after;

import br.com.cod3r.singleton.connectionPool.after.conn.Connection;
import br.com.cod3r.singleton.connectionPool.after.conn.ConnectionPool;

public class Client {
	public static void doQuery1() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A1");
	}
	
	public static void doQuery2() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A2");
	}
	
	public static void doQuery3() {
		ConnectionPool pool = ConnectionPool.getInstance();
		Connection conn = pool.getConnection();
		if(conn != null)
			conn.query("SELECT * FROM A3");
	}

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Connection Pool Size: " + ConnectionPool.POOL_SIZE);
		int pool = ConnectionPool.POOL_SIZE;
		System.out.println(pool);
		doQuery1();
		doQuery2();
		doQuery3();
	}
}
