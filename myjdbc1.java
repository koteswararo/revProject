import java.sql.*;    

class myjdbc1{
 public static void main(String args[]){  
     try{  
  
          
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root123"); 
         Statement stmt=con.createStatement();   
      
         // Executing SQL query  
         ResultSet rs=stmt.executeQuery("select * from dosusers");    
     //   boolean b=rs.next();
       // System.out.println(b);
         while(rs.next()){    
             System.out.println(rs.getString(1)+":"+rs.getString(2)+":"+rs.getString(3)+":"+rs.getString(4));    
         }  
         // Closing connection  
         con.close();      
     }catch(Exception e){ System.out.println("error connecting db"+e);}    
 }    
   
}
