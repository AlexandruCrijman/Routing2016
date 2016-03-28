package MainTest;

import DAO.MySQLPointDAOImpl;
import services.PointServices;
import utils.UtilsPoint;

import java.awt.*;
import java.sql.SQLException;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Alex on 3/27/2016.
 */
public class testPoint {

    public static void main(String[] args) throws SQLException {
        System.out.println("Hello World");
        Point x = new Point(232, 11);
        Point y = new Point(41, 3121);

        HashSet<Point> t = new HashSet<Point>();
        t.add(x);
     x.setLocation(23,41);
        Point r =x.getLocation();
        t.add(r);
        t.add(y);
       // t.add(x);

        t.add(x. )
        PointServices.createandinsertDBPoints(4,0,90);


    }
}
