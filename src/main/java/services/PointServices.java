package services;

import DAO.MySQLPointDAOImpl;
import utils.UtilsPoint;

import java.awt.*;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by Alex on 3/27/2016.
 */
public class PointServices {
    private static PointServices ourInstance = new PointServices();
    private static MySQLPointDAOImpl DBPointImpl = new MySQLPointDAOImpl();

    public static PointServices getInstance() {
        return ourInstance;
    }

    private PointServices() {

    }
    public static Set<Point> createPoints(int pointsNumber, int rangeMin, int rangeMax)
    {
        Set<Point> listPoints = new HashSet<Point>();


        while(listPoints.size()<pointsNumber)
        {
            listPoints.add(UtilsPoint.randomPoints(rangeMin, rangeMax));
            System.out.println(listPoints.size());


        }
        return listPoints;
    }
    public static void createandinsertDBPoints(int pointsNumber, int rangeMin, int rangeMax)
    {
        Set<Point> listPoints = new HashSet<Point>();


        for (int i=0; i<4; i++)
        {
            listPoints.add(UtilsPoint.randomPoints(rangeMin, rangeMax));
           // System.out.println(listPoints.size());


        }
        for(Point i:listPoints)
        {
            System.out.print(i);
        }
    }
}

