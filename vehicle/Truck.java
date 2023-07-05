package vehicle;

import java.util.List;
import java.util.Scanner;

public class Truck extends Vehecles implements IVehicle{

    private int truckload;

    public Truck() {

    }

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

    @Override
    public String toString() {
        return "Truck{" +
                "truck load='" + truckload + '\'' +
                super.toString()+'}'+"\n";
    }

    public Truck display1(String chuoi, List<Truck> list) {
        Scanner input = new Scanner(System.in);
        for (Truck truck : list) {
            if (truck.getModel().equals(chuoi)) {
                System.out.println(truck);
            }
//            else {
//                System.out.println("Ko co model truck: ");
//            }
        }
        return null;
    }
}
