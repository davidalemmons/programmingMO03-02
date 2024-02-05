import java.util.Scanner;
import java.math.BigInteger;

public class TestRationalBigInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first rational number: ");
        BigInteger numerator1 = input.nextBigInteger();
        BigInteger denominator1 = input.nextBigInteger();
        Rational r1 = new Rational(numerator1, denominator1);

        System.out.print("Enter the second rational number: ");
        BigInteger numerator2 = input.nextBigInteger();
        BigInteger denominator2 = input.nextBigInteger();
        Rational r2 = new Rational(numerator2, denominator2);

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
