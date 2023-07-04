package vehicle.test;

import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehecles;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chon;int n=3;

        System.out.println("1.Input\n2.Display\n3.Sort by price\n4.Search by model\n5.Exit");
        System.out.println("Nhap so ban muon chon: ");chon=Integer.parseInt(input.nextLine());
        if (chon == 1){
            Car car = new Car();

            Truck truck =new Truck();

            for (int i = 0; i < n; i++) {
                System.out.println("Nhap car thu "+(i+1));
                car.input();
                System.out.println("Nhap truck thu "+(i+1));
                truck.input();
            }

            for (int i = 0; i < n; i++) {
                System.out.println("thong tin car thu "+(i+1));
                car.display();
                System.out.println("thong tin truck thu "+(i+1));
                truck.display();
            }

        }
        if(chon == 2){

        }
    }
}
