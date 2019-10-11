import java.util.*;
/**
 * Write a description of class Driver here.
 *
 * @author (Sean de Silva)
 * @version (a version number or a date)
 */
public class Driver
{
    public static void main (String []args)
    {
        Car car1 = new Car("Nissan", "Altima", 24000);
        Car car2 = new Car("Nissan", "Sentra", 17890);
        Car car3 = new Car("Honda", "Civic", 19450);
        Car car4 = new Car("Honda", "Accord", 23720);
        
        List<Car> cars = new ArrayList<Car>();
        
        cars.add(car2);
        cars.add(car1);
        cars.add(car3);
        cars.add(car4);
        
        System.out.print("Unsorted List" + cars);
        
       Collections.sort(cars);
        
       System.out.print("\n");
       System.out.print("Sorted List by Make and Model" + cars);
        
        Collections.sort(cars, new CompareCar());
        System.out.print("\n");
        System.out.print("Sorted List by Price" + cars);
        
        
    }
}
