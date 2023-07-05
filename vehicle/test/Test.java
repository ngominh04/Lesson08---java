package vehicle.test;

import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehecles;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chon;int n=1;


        Car car = new Car();

        Truck truck =new Truck();
        do {
            System.out.println("\n");
            System.out.println("1.Input\n2.Display\n3.Sort by price\n4.Search by model\n5.Exit");
            System.out.println("Nhap so ban muon chon: ");chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    for (int i = 0; i < n; i++) {
                        System.out.println("Nhap car thu "+(i+1));
                        car.input();
                        System.out.println("Nhap truck thu "+(i+1));
                        truck.input();
                    }

                    break;
                case 2:
                    for (int i = 0; i < n; i++) {
                        System.out.println("thong tin car thu "+(i+1));
                        car.display();
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("thong tin truck thu "+(i+1));
                        truck.display();
                    }
                    break;
                case 3:
                    System.out.println("DS truoc khi sort: ");
                    for (int i = 0; i < n; i++) {
                        System.out.println("thong tin car thu "+(i+1));
                        car.display();
                    }
                    for (int i = 0; i < n; i++) {
                        System.out.println("thong tin truck thu "+(i+1));
                        truck.display();
                    }
                    System.out.println("DS sau khi sort theo price: ");

                    break;
                case 4:
                    String nhapChuoi;
                    System.out.println("Nhap chuoi model:");
                    nhapChuoi=input.nextLine();
                    System.out.println("DS car co chuoi model vua nhap: ");
                    car.display1(nhapChuoi,n);
                    break;

                case 5:
                    return;
            }
        }while (true);

    }
}
