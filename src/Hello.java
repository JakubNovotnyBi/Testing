import java.util.Scanner;
public class Hello {

    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in,"Windows-1250");
        System.out.print("Napiš a: ");
        int a= sc.nextInt();
        System.out.print("Napiš b: ");
        int b= sc.nextInt();
        System.out.print("Napiš c: ");
        int c= sc.nextInt();


        calculate(a,b,c);
    }
    public static void calculate(int a, int b, int c){
        double D=(b*b)-4*(a*c);

        if (D>=0){
            D=Math.sqrt(D);
            double vysledek1 = (-b + D)/(2*a);
            double vysledek2 = (-b - D)/(2*a);
            System.out.println("Výsledkem je " + vysledek1);
            System.out.println("Výsledkem je " + vysledek2);
        }
        else{
            System.out.println("Nemá řešení");
        }
    }
}
