package vehicle.test;

import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehecles;


import java.util.*;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int chon;

        List<Car> list1=new ArrayList<Car>();
        List<Truck> list2=new ArrayList<Truck>();

        do {
            Car car = new Car();
            Truck truck =new Truck();
            System.out.println("\n");
            System.out.println("1.Input\n2.Display\n3.Sort by price\n4.Search by model\n5.Exit");
            System.out.println("Nhap so ban muon chon: ");
            chon=Integer.parseInt(input.nextLine());
            switch (chon){
                case 1:
                    int n;
                    System.out.println("Nhap n: ");
                    n=Integer.parseInt(input.nextLine());
                    for (int i = 0; i < n; i++) {

                        System.out.println("Nhap car thu "+(i+1));
                        car.input();
                        list1.add(car);
                        System.out.println("Nhap truck thu "+(i+1));

                        truck.input();
                        list2.add(truck);
                    }
                    break;
                case 2:
                    for (int i = 0; i < list1.size(); i++) {
                        System.out.println("thong tin  "+list1.get(i));
                    }
                    for (int i = 0; i < list2.size(); i++) {
                        System.out.println("thong tin  "+list2.get(i));
                    }
//                    for (int i = 0; i < n; i++) {
//                        System.out.println("thong tin truck thu "+(i+1));
//                        truck.display();
//                    }
                    break;
                case 3:

                    System.out.println("DS truoc khi sort: ");
                    System.out.println(list1);
                    System.out.println(list2);
                    System.out.println("DS sau khi sort theo price: ");
                    // sắp xếp sort
                    System.out.println("Tang dan >>>>>>>>>>>>>>>.\n");
                    List<Vehecles> carList = list1.stream().sorted(Comparator.comparingDouble(Vehecles::getPrice)).collect(Collectors.toList());
                    System.out.println(carList);
                    List<Vehecles> truckList = list2.stream().sorted(Comparator.comparingDouble(Vehecles::getPrice)).collect(Collectors.toList());
                    System.out.println(truckList);
                    // trg hopwj giảm thêm .reversed() trong .sorted(Comparator.(.....))
                    System.out.println("Giam dan <<<<<<<<<<<<<<<.\n");
                    List<Vehecles> carList1 = list1.stream().sorted(Comparator.comparingDouble(Vehecles::getPrice).reversed()).collect(Collectors.toList());
                    System.out.println(carList1);
                    List<Vehecles> truckList1 = list2.stream().sorted(Comparator.comparingDouble(Vehecles::getPrice).reversed()).collect(Collectors.toList());
                    System.out.println(truckList1);

                case 4:
                    String chuoi;
                    System.out.println("Nhap chuoi model:");
                    chuoi=input.nextLine();
//                    Car car=new Car();
                    car.display1(chuoi,list1);
//                    Truck truck=new Truck();
                    truck.display1(chuoi,list2);
                    break;
                case 5:
                    return;
            }
        }while (true);

    }
}
