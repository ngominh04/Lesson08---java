package vehicle;

import java.util.Collections;
import java.util.Scanner;

public class Vehecles implements IVehicle {
    private String maker;
    private String model;
    private double price;

    public String getMaker() {
        return maker;
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

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
    public String toString() {
        return ",\tmaker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price ;
    }

    @Override
    public void display() {

    }


}
