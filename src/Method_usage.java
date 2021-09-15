public class Method_usage {
    public static void main(String[] args) {
        int S = MathUtils.s(5);
        System.out.println(S);

        int V = MathUtils.v(5);
        System.out.println(V);

        int Sum = MathUtils.sum(1,2);
        System.out.println(Sum);

        double SCircle = MathUtils.SCircle(5);
        System.out.println(SCircle);

        double OCircle = MathUtils.OCircle(5);
        System.out.println(OCircle);

        int factorial=MathUtils.factorial(25);
        System.out.println(factorial);

        boolean answer=MathUtils.EvenOdd(2);
        System.out.println(answer);

        boolean pN=MathUtils.primeNumber(10);
        System.out.println(pN);
    }
}
