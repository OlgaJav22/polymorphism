package autoracing;

public class Car {

    private String brand;
    private String model;
    private double engineCapacity;

    public Car(String brand, String model, double engineCapacity) {
        if (brand != null && !brand.isEmpty() && !brand.isBlank()) {
            this.brand = brand;
        }
        setModel(model);
        setEngineCapacity(engineCapacity);
    }


    public void startMoving() {

    }

    public void finishTheMovement() {

    }

    public String toString() {
        return "\t" + getBrand() + " " + getModel() + "; объем двигателя: " + getEngineCapacity() + "л.";
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null && !model.isBlank() && !model.isEmpty()) {
            this.model = model;
        }
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        if (engineCapacity > 0) {
            this.engineCapacity = engineCapacity;
        } else {
            this.engineCapacity = 0;
        }
    }

}
