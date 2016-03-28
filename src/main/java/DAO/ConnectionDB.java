package DAO;


import java.sql.*;
import java.util.Properties;


public class ConnectionDB {

    private static String DB_USER = "root";
    private static String DB_PASS ="";


    public static Connection getConnecton() throws SQLException
    {
        //registerJDBCDriver();
        Connection conn = null;
        Properties connectionProps = new Properties();
        connectionProps.put("user", DB_USER);
        connectionProps.put("password", DB_PASS);

        try {
            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/",connectionProps);
            System.out.println("DB Connected!");
        }
        catch (SQLException e)
        {
            System.out.println("DB not Connected!");
            e.printStackTrace();

        }
        return conn;
    }




    public static void registerJDBCDriver(){
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        }
        catch(ClassNotFoundException ex) {
            System.out.println("Error: unable to load driver class!");
            System.exit(1);
        }

    }
}


