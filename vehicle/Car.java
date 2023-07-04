package vehicle;

import java.util.Scanner;

public class Car extends Vehecles implements IVehicle{
    private String color;

    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap color: ");
        color=input.nextLine();
        super.input();
    }

    @Override
    public void display() {
        System.out.println("color: "+color);
        super.display();
    }
}
