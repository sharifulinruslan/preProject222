package web.model;

public class Car {
    private int VIN;
    private String model;
    private String mileage;

    public Car(int VIN, String model, String mileage) {
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

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }
}
