package vehicle;

import java.util.Scanner;

public class Truck extends Vehecles implements IVehicle{

    private int truckload;

    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap truck load: ");
        truckload=Integer.parseInt(input.nextLine());
        super.input();
    }

    @Override
    public void display() {

        super.display();
        System.out.println("Truck load: "+truckload+
                ", maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice()
        );
    }
}
