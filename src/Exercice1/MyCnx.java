package Exercice1;

import java.sql.*;
class MyCnx {
	
	 Connection con =null;
	 Statement stm =null;
	 ResultSet rs=null;
	 
	
	 public MyCnx() {
		  try {
			 Class.forName("com.mysql.jdbc.Driver");
			  con=DriverManager.getConnection("jdbc:mysql://localhost/bookstore","root","" );
			
		 }
		  catch(ClassNotFoundException e) { e.printStackTrace();}
		 
		  catch (SQLException e) {e.printStackTrace();}
	 }
	 
		public  void insertBook() {
			 try {
			 stm =con.createStatement();
			 String req1="insert into book(title , author, price , releasedate) values ('les miserable','victor hugo',30,'2020-11-22')";
			 int a = stm.executeUpdate(req1);
			}
			 catch (SQLException e) { e.printStackTrace();}
			 
			 }
		
		public void displayBook() 
		    {   
			    
		    try {
		    	stm =  con.createStatement(); 
		    	 String req2="select *from book "; 
		    ResultSet rs = stm.executeQuery(req2);
		    int i=0;
		    while (rs.next()) {
		       i++;

		        
		        System.out.println("id : " + rs.getInt("id"));
		        System.out.println("title : " + rs.getString("title"));
		        System.out.println("author : " + rs.getString("author"));
		        System.out.println("price : " + rs.getFloat("price"));
		        System.out.println("date: " + rs.getDate("releasedate"));
		    }
		    }
		    catch(SQLException e){e.printStackTrace();}
		    }
		
	 

	
	
}
