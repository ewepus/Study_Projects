package Lab_work_9;

public class Vehicle {
    protected Integer passengers;

    protected Vehicle(Integer passengers) {
        this.setPassengers(passengers);
    }

    protected void setPassengers(Integer passengers) {
        if (passengers < 0) {
            throw new IllegalArgumentException("Invalid negative number! Argument: passengers");
        }
        if (passengers == 0) {
            throw new IllegalArgumentException("Need passengers to drive!");
        }
        this.passengers = passengers;
    }
}
//var_3
