package json_practice.basics;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car {
    public String brand;
    public int price;

    Car(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }
}

public class CarToJson {
    public static void main(String[] args) throws Exception {

        Car car = new Car("Toyota", 1500000);
        ObjectMapper mapper = new ObjectMapper();

        System.out.println(mapper.writeValueAsString(car));
    }
}
