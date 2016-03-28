package DAO;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Alex on 3/27/2016.
 */
public class MySQLPointDAOImpl implements PointDAO {







    public void insert(Point point) {

        Connection conn=null;
        try {
            conn = ConnectionDB.getConnecton();
            String query="INSERT INTO `licenta2016`.`points` VALUES(NULL, ? , ?);";




            PreparedStatement stmt = conn.prepareStatement(query);
            stmt.setDouble(1, point.getX());
            stmt.setDouble(2, point.getY());
            stmt.execute();
            System.out.println("Point Added");

        } catch (SQLException e) {
            e.printStackTrace();
        }





    }

    public void update(Point point) {

    }

    public void delete(Point point) {

    }

    public Point extract() {
        return null;
    }

    public ArrayList<Point> extractAll() {
        return null;
    }
}
