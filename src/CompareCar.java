import java.util.*;

/**
 * Write a description of class CompareCar here.
 *
 * @author (Sean de Silva)
 * @version (a version number or a date)
 */
public class CompareCar implements Comparator<Car>
{
    @Override
    public int compare(Car left, Car right)
    {
        return left.getPrice() - right.getPrice();

    }
}
