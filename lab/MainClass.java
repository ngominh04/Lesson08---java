package lab;

public class MainClass {
    public void phepTinh(ITinhToan phepTinh, float num1, float num2){
        phepTinh.doOperation(num1,num2);
    }

    public static void main(String[] args) {
        MainClass main = new MainClass();

        ImIOperationAdd add =new ImIOperationAdd();
        add.setAccuracy(IAccuracy.TWO_NUMBER);
        main.phepTinh(add,6,9);

        ImpIOperationSubtract sub =new ImpIOperationSubtract();
        sub.setAccuracy(IAccuracy.THREE_NUMBER);
        main.phepTinh(sub,9,6);

        ImpIOperationMultiply multi =new ImpIOperationMultiply();
        multi.setAccuracy(IAccuracy.FOR_NUMBER);
        main.phepTinh(multi,3,3);
    }
}
