package com.lpu.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.lpu.dao.JDBCWithMySql;

class JDBCWithMySqlTest {

	@Test
	void testCreateStatement() {
		System.out.println("I am testing");
	}
	
	@Test
	void testInsertStatement() {
		JDBCWithMySql.insert();
	}
	
	
	@Test
	void testPreparedStatement() {
		System.out.println("I am testing Preparedstatent");
		JDBCWithMySql.insertWithParams(9, "NewWorld9");
	}

}
