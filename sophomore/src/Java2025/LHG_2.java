package Java2025;

class Vehicle {
    protected String modelName;
    protected int price;

    public Vehicle(String modelName, int price) {
        this.modelName = modelName;
        this.price = price;
    }
}

class Car extends Vehicle {
    private int displacement;

    public Car(String modelName, int price, int displacement) {
        super(modelName, price);
        this.displacement = displacement;
    }

    public double calculateDuty() {
        if (displacement >= 3000) {
            return price * 0.05;
        } else if (displacement >= 1500) {
            return price * 0.03;
        } else {
            return price * 0.01;
        }
    }

    public String getInfo() {
        return String.format("모델명: %s, 가격: %d, 배기량: %d, 세금: %.2f", modelName, price, displacement, calculateDuty());
    }
}

public class LHG_2 {
    public static void main(String[] args) {
        Car[] cars = {
            new Car("벤츠", 4000, 3500),
            new Car("그랜져", 3000, 2000),
            new Car("아반테", 1500, 1000)
        };

        printCarInfo(cars);
    }

    private static void printCarInfo(Car[] cars) {
        for (Car car : cars) {
            System.out.println(car.getInfo());
        }
    }
}
