package EXAM;

public class Main {
    public static void main(String args[]){
        Complex C1 = new Complex(3, 2);
        C1.toString();
        Complex C2 = new Complex(9, 5);
        C2.toString();
        // for Storing the sum
        Complex C3 = new Complex();
        C3 = C3.add(C1, C2);
        // printing the sum
        System.out.print("Tong");
        C3.toString();
        C3 = C3.subtract(C1, C2);
        System.out.print("Hieu");
        C3.toString();
        C3 = C3.multiply(C1, C2);
        System.out.print("Tich");
        C3.toString();
        C3 = C3.divide(C1, C2);
        System.out.print("Thuong");
        C3.toString();
    }
}
