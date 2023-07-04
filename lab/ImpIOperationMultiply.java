package lab;

public class ImpIOperationMultiply implements ITinhToan, IAccuracy {
    private int accuracy;

    @Override
    public void doOperation(float num1, float num2) {
        System.out.println("\n");
        System.out.printf("Result ADD = %." + this.accuracy + "f", (num1 * num2));
    }

    @Override
    public void setAccuracy(int accuracy) {
        this.accuracy = accuracy;
    }

}