
/**
 * Write a description of class Car here.
 *
 * @author (Sean de Silva)
 * @version (a version number or a date)
 */
public class Car implements Comparable<Car>
{
    private String make;
    private String model;
    private int price;

    public Car(String carmake, String carmodel, int price)
    {
        this.make = carmake;
        this.model = carmodel;
        this.price = price;

    }

    public int getPrice()
    {
        return price;

    }


    @Override
    public int compareTo(Car car)
    {
        int result = make.compareTo(car.make);
        if (result == 0)

            return model.compareTo(car.model);
        else
            return result;

    }


    public String toString()
    {
        return "Car:" + make + " - " + model + "-" + price;

    }
}
