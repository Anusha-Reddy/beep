/* University: University of Illinois at Chicago
 * Class: CS 441, Distributed Object Programming Using Middleware
 * Date: Fall 2013
 * Professor: Mark Grechanik
 * Group: 1
 */

package database;

import java.sql.ResultSet;
import java.util.ArrayList;

public interface MysqlFacet {
	
	// Pass any query
	public ResultSet query(String query);

	// INSERT into <table> (<column>) values('<contents>')
	public boolean insert(ArrayList<String> contents, String table, String column);
	
	// INSERT into <table> (<column>) values('<content>')
	public boolean insert(String content, String table, String column);
	
	// UPDATE <table> SET <column> = '<value>' WHERE <where> ='<whereValue>'
	public boolean update(String table, String column, String value, String where, String whereValue);
	
	// UPDATE <table> SET <column> = '<value>' WHERE <where> ='<whereValue>'
	public boolean update(String table, String column, int value, String where, String whereValue);
	
	// SELECT <what> FROM <table> WHERE <where> = '<whereValue>'
	public String get(String what, String table, String where, String whereValue, ArrayList<String> contents);
}
