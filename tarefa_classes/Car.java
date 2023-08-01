public /**
        * A class representing a car object.
        */
public class Car {
    private String make;
    private String model;
    private int year;

    /**
     * Constructs a new Car object with the given make, model, and year.
     *
     * @param make  the make of the car
     * @param model the model of the car
     * @param year  the year the car was made
     */
    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    /**
     * Gets the make of the car.
     *
     * @return the make of the car
     */
    public String getMake() {
        return make;
    }

    /**
     * Gets the model of the car.
     *
     * @return the model of the car
     */
    public String getModel() {
        return model;
    }

    /**
     * Gets the year the car was made.
     *
     * @return the year the car was made
     */
    public int getYear() {
        return year;
    }

    /**
     * Returns a string representation of the car object.
     *
     * @return a string representation of the car object
     */
    @Override
    public String toString() {
        return year + " " + make + " " + model;
    }
}