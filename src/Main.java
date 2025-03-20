import lombok.*;
@Data
@AllArgsConstructor
@Getter
@Setter
// there are more than these annotations that I didn't use

 class carWithLombok {
    private String brand;
    private String model;
    private int year;
    private String color;
}
public class Main {
    public static void main(String[] args) {
        carWithLombok car1 = new carWithLombok("Toyota", "Corolla", 2021, "black");
        carWithLombok car2 = new carWithLombok("GLE", "Mercedes", 2023, "white");
        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car1.getBrand());
        int year = car1.getYear();
        car1.setYear(year + 1);
        System.out.println(car1.getYear());
        System.out.println("Are these objects equal: " + car1.equals(car2));
        System.out.println("The hashCode of this object is: " + car1.hashCode());
        System.out.println("The hashCode of this object is:  " + car2.hashCode());
    }
}