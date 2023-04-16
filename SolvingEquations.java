import java.util.Scanner;
public class SolvingEquations {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("This program solve the linear system: \n"
                + "a1*x + b1*y = c1\n"
                + "a2*x + b2*y = c2\n");
        System.out.print("Enter a1: ");
        double a1 = scanner.nextDouble();
        System.out.print("Enter b1: ");
        double b1 = scanner.nextDouble();
        System.out.print("Enter c1: ");
        double c1 = scanner.nextDouble();
        System.out.print("Enter a2: ");
        double a2 = scanner.nextDouble();
        System.out.print("Enter b2: ");
        double b2 = scanner.nextDouble();
        System.out.print("Enter c2: ");
        double c2 = scanner.nextDouble();

        double D = a1*b2 - a2*b1;
        double Dx = c1*b2 - c2*b1;
        double Dy = a1*c2 - a2*c1;

        if(D != 0){
            System.out.print("Solution: x = " + Dx/D + " y = " + Dy/D);
        }
        if(D == 0 && (Dx != 0 || Dy != 0)) System.out.print("This system has no solution!\n");
        if ( D == 0 && Dx == 0 && Dy == 0) System.out.print("This system has infinite solution!\n");
    }
}