
package java_air.database;

import java.sql.*;
import java.util.ArrayList;

public class DataClient {
    
    private static final String dbUrl = "jdbc:sqlite:java_air.db";
    
    
    private static Connection getConnection() 
            throws SQLException{
        Connection dbConnection = null;
        try{
            dbConnection = DriverManager.getConnection(dbUrl);
        }
        catch(SQLException e){
            throw e;
        }
        
        return dbConnection;
    }//end getConnection()
    
    
    public static ResultSet getData(Connection dbConnection
            , String query) 
            throws Exception{
        ResultSet set = null;
        try{
            if(dbConnection == null){ throw new NullPointerException(); }
            
            Statement stmt = dbConnection.createStatement();
            set = stmt.executeQuery(query);
            
            stmt.close();
            dbConnection.close();
        }//end try
        catch(Exception x){
            throw x;
        }//end catch
        
        return set;
    }//end getData()
    
    public static void dbInsertOrUpdate(Connection dbConnection
            , String query) throws Exception{
        try{
            if(dbConnection == null){ throw new NullPointerException(); }
            
            Statement stmt = dbConnection.createStatement();
            int res = stmt.executeUpdate(query);
            
            if(res <= 0){ throw new Exception("No Rows Inserted/Updated"); }
            
            stmt.close();
            dbConnection.commit();
            dbConnection.close();
        }
        catch(Exception x){
            throw x;
        }
    }//get insertData()
}
