public class Main {
    public static void main (String args[]){
        System.out.println("Hello World");
        System.out.println("cześć PIotr");

        Car Polonez = new Car();
        Car Kia = new Car("Sportage", "Grey", "Diesel", "2011");

        Kia.startEngine();
        Kia.stopEngine(" 50");


    }
}
