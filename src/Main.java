import java.util.function.UnaryOperator;

public class Main {
    public static void main(String[] args) {
        UnaryOperator<Double> sqrt = x->Math.sqrt(x);
        double nomber = 5.0;
        double summa = sqrt.apply(nomber);
        System.out.println(summa);
    }
}