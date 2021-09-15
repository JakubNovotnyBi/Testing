public class MathUtils {
    public static int s(int a) {
        return a * a;
    }

    public static int v(int a) {
        return s(a) * a;
    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double SCircle(int r) {
        return Math.PI * r * r;
    }

    public static double OCircle(int r) {
        return 2 * Math.PI * r;
    }

    public static int factorial(int f) {

        int help = 1;
        for (int i = f; i > 0; i--) {
            help *= i;
        }
        return help;
    }
    public static boolean EvenOdd(int n){
        return n % 2 == 0;
    }

    public static boolean primeNumber(int pN){
        for(int x = pN - 1; x > 1; x--) {
            if(pN % x == 0) {
                return false;
            }
        }
        return true;
    }
}
