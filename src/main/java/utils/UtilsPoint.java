package utils;

import java.awt.*;
import java.util.Random;

/**
 * Created by Alex on 3/27/2016.
 */
public class UtilsPoint {
    private static UtilsPoint ourInstance = new UtilsPoint();
    private static Random random = new Random();
    private static int seed=0;
    private  Point thePoint = new Point();



    public static UtilsPoint getInstance() {
        return ourInstance;
    }

    private UtilsPoint() {
    }


    public static Point randomPoints(double min, double max) {



        random.setSeed(seed);
        seed+=18;

        thePoint.setLocation(random.nextDouble() * (max - min) + min ,
                random.nextDouble() * (max - min) + min);
        // thePoint.setPointY(random.nextDouble() * (max - min) + min);

        System.out.println(thePoint);




        return thePoint;
    }
}
