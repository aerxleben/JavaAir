
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
    
    
    public static ArrayList<String> getData(Connection dbConnection
            , String query) 
            throws Exception{
        ArrayList<String> dataList = null; 
        try{
            if(dbConnection != null){
                dataList = new ArrayList<String>();
            
            
            }//end if
        }//end try
        catch(Exception x){
            throw x;
        }//end catch
        
        
        return dataList;
    }
}
