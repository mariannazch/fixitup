package com.fixitup.MainApp;

module FixitUp {
	exports com.fixitup.MainApp;
	exports com.database;
	exports com.testunits;
	requires java.desktop;
	requires java.sql;
	requires junit;
	requires org.junit.jupiter.api;
}
