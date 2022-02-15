package d11;

public class Vehicle {
    //Motorcycle, car, bus
    private String type;
    //Suzuki, Opel, Man
    private String brand;
    private int year;

    public Vehicle(String type, String brand, int year) {
        if(type.equals("MOTORCYCLE") || type.equals("BUS") ||type.equals("CAR")) {
            this.type = type;
            this.brand = brand;
            this.year = year;
        }else{
            throw new RuntimeException();
        }
    }

    public static void main(String[] args) {
        new Vehicle("sdsf0", "bmw", 444);
        System.out.println("The end");
    }
}
