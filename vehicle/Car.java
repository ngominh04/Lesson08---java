package vehicle;

import java.util.Collections;
import java.util.Scanner;

public class Car extends Vehecles {
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void input() {
        Scanner input=new Scanner(System.in);
        System.out.println("Nhap color: ");
        color=input.nextLine();
        super.input();
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Color= "+color+
                ", maker='" + getMaker() + '\'' +
                ", model='" + getModel() + '\'' +
                ", price=" + getPrice()
                );
    }


    public void display1(String nhapChuoi,int n){
        for (int i = 0; i < n; i++) {
            if(nhapChuoi != getModel()){
                System.out.println("Color= "+color+
                        ", maker='" + getMaker() + '\'' +
                        ", model='" + getModel() + '\'' +
                        ", price=" + getPrice()
                );
            }else {
                System.out.println("Khong co model vua nhap: ");
            }
        }

    }
}
