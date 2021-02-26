interface ICar {
    int gear = 0;

    public void engineStart();// abstract method

    public void changeGear(int newGear);

    public void stopCar(int a);

}

class Car implements ICar {
    int gear;

    public void engineStart() {
        gear = 1;
    }

    public void changeGear(int newGear) {
        gear = newGear;

    }

    public void stopCar(int a) {
        gear = 0;
    }
}

public class InterfaceCar {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.engineStart();
        System.out.println(car1.gear);
        car1.changeGear(5);
        System.out.println(car1.gear);
        car1.stopCar(0);
        System.out.println(car1.gear);
    }

}
