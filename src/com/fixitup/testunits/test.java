package com.testunits;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.*;

import java.sql.Connection;
import java.sql.SQLException;

import org.junit.jupiter.api.Test;

import com.database.Database_Connector;

class test {

	@Test
	void connection_to_databse() throws SQLException {
	Database_Connector dbCon = new Database_Connector(); 
	Connection db;
	db = Database_Connector.connector();
	assertTrue("This will succeed.", db.isClosed());

	//εισόδου τιμή  True
	//εξόδου τιμή 	true
	//οριακή τιμή   true 

} 

		@Test
		void connection_to_databse_false() throws SQLException {
		Database_Connector dbCon = new Database_Connector(); 
		Connection db;
		db = Database_Connector.connector();
		assertEquals(true, db.isClosed());
		
		//εισόδου τιμή  True
		//εξόδου τιμή 	true
		//οριακή τιμή   true 
		}

@Test
void query_database() throws SQLException {
Database_Connector dbCon = new Database_Connector(); 
Connection db;
db = Database_Connector.connector();
String uname ="Admin";
String password ="Admin";
String query = Database_Connector.loginq(db,uname,password);
assertEquals(true, query.isEmpty());	
	//εισόδου τιμή  True
	//εξόδου τιμή 	true
	//οριακή τιμή   true 
}

@Test
void query_database_false_uname() throws SQLException {
Database_Connector dbCon = new Database_Connector(); 
Connection db;
db = Database_Connector.connector();
String uname ="Admi";
String password ="Admin";
String query = Database_Connector.loginq(db,uname,password);
assertEquals(false, query.isEmpty());
	//εισόδου τιμή  False
	//εξόδου τιμή 	false
	//οριακή τιμή   false 
}
@Test
void query_database_false_password() throws SQLException {
Database_Connector dbCon = new Database_Connector(); 
Connection db;
db = Database_Connector.connector();
String uname ="Admin";
String password ="Amin";
String query = Database_Connector.loginq(db,uname,password);
assertEquals(false, query.isEmpty());

//εισόδου τιμή  False
//εξόδου τιμή 	false
//οριακή τιμή   false 
}
}
	
