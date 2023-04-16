import java.util.Scanner;

public class Calculate {
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Nhập hai số: ");
        double a = keyboard.nextDouble();
        double b = keyboard.nextDouble();
        System.out.println("Tổng là: "+(a+b));
        System.out.println("Hiệuu là: "+(a-b));
        System.out.println("Tích là: "+(a*b));
        System.out.println("Thương là: "+(a/b));
    }
}
