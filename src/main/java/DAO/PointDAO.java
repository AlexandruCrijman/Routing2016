package DAO;

import java.awt.*;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * Created by Alex on 3/27/2016.
 */
public interface PointDAO {

    public void insert(Point point);
    public void update(Point point);
    public void delete(Point point);
    public Point extract();
    public ArrayList<Point> extractAll();
}
