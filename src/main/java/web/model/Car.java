package web.model;

public class Car {
    private int VIN;
    private String model;
    private int mileage;

    public Car() {
    }

    public Car(int VIN, String model, int mileage) {
        this.VIN = VIN;
        this.model = model;
        this.mileage = mileage;
    }

    public int getVIN() {
        return VIN;
    }

    public void setVIN(int VIN) {
        this.VIN = VIN;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "VIN=" + VIN +
                ", model='" + model + '\'' +
                ", mileage=" + mileage +
                '}';
    }
}
