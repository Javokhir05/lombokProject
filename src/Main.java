import lombok.*;
@Data
@AllArgsConstructor

 class carWithLombok {
    private String brand;
    private String model;
    private int year;
}
public class Main {
    public static void main(String[] args) {
        carWithLombok car1 = new carWithLombok("Toyota", "Corolla", 2021);
        carWithLombok car2 = new carWithLombok("GLE", "Mercedes", 2023);
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        int year = car1.getYear();
        car1.setYear(year + 1);
        System.out.println(car1.getYear());
        System.out.println("car1.equals(car2): " + car1.equals(car2));
        System.out.println("car1.hashCode(): " + car1.hashCode());
        System.out.println("car2.hashCode(): " + car2.hashCode());
        System.out.println("car1: " + car1);
    }
}