public class Car {
    public String model;
    public String color;
    public String fuelType;
    public String makeYear;

    public Car() {
    }


    public Car(String model, String color, String fuelType, String makeYear) {
        this.model = model;
        this.makeYear = makeYear;
        this.fuelType = fuelType;
        this.color = color;

    }

    public void startEngine() {
        System.out.println("Silnik " + this.model + " ZROBIl BRUMBUM");
    }
    public void stopEngine(){
        System.out.println("silnik hamuje o");

    }
}
