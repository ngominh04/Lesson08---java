package lab2;

import java.util.Scanner;

public class MainClass {
    public void nhapDuLieu(){
        NhapLieu nhap =new NhapLieu();

        System.out.println("nhap so nguyen");
        System.out.println("Value = "+nhap.inputInt());

        System.out.println("nhap so thuc");
        System.out.println("Value = "+nhap.inputFloat());

        System.out.println("nhap so chuoi");
        System.out.println("Value = "+nhap.inputString());

    }
    private class NhapLieu{
        public String inputString(){
            Scanner i = new Scanner(System.in);
            return i.nextLine();
        }
        public int inputInt(){
            Scanner i =new Scanner(System.in);
            do{
                try{
                    int number = Integer.parseInt(i.nextLine());
                    return number;
                }catch (Exception e){
                    System.out.println("Vui long nhap so nguyen");
                }
            }while (true);
        }
        public float inputFloat(){
            Scanner i = new Scanner(System.in);
            do{
                try{
                    float number = Float.parseFloat(i.nextLine());
                    return number;
                }catch (Exception e){
                    System.out.println("Vui long nhap so thuc");
                }
            }while (true);
        }
    }


    public static void main(String[] args) {
        MainClass main = new MainClass();
        main.nhapDuLieu();
    }
}
