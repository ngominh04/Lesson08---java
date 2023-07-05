package vehicle;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Car extends Vehecles {
    private String color;

    public Car() {

    }


    @Override
    public void input() {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhap color: ");
        color = input.nextLine();
        super.input();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color= " + color +
                ", maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice()
        );
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                super.toString()+'}'+"\n";
    }

    public Car display1(String chuoi, List<Car> list) {
        Scanner input = new Scanner(System.in);
        for (Car car : list) {
            if (car.getModel().equals(chuoi)) {
                System.out.println(car);
            }
//            else {
//                System.out.println("Ko co model car: ");
//            }
        }
        return null;
    }

}

