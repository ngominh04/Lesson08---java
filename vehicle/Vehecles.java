package vehicle;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Scanner;

public class Vehecles implements IVehicle {
    private String maker;
    private String model;
    private double price;

    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap maker: ");
        maker=input.nextLine();
        System.out.println("Nhap model: ");
        model=input.nextLine();
        System.out.println("nhap price: ");
        price=Double.parseDouble(input.nextLine());
    }

    @Override
    public void display() {
        System.out.println("Maker "+maker+";\tModel "+model+";\tPrice "+price);
    }
}
