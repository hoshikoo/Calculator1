package nyc.c4q.yuliyakaleda.calculator;

/**
 * Created by July on 5/5/15.
 */
public class Methods {
    long result = 0;

    public static double sum(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static String division(double a, double b) {
        if (b == 0) {
           return "Invalid Expression";
        }
        return "" + a / b;
    }

    public static double perCent (double a) {
        return a * 0.01;
    }

    public static double syn(double a) {
        return Math.sin(a);
    }

    public static double cos(double a) {
        return Math.cos(a);
    }

    public static double tan(double a) {
        return Math.tan(a);
    }

    public static double log(double a) {
        return Math.log10(a);
    }

    public static String ln(double a) {
        String result = "";
        if (a==1) {
            return result + 0;
        }
        else if ( a ==0 ) {
            return "Infinity";
        }
        else {

        }
        return result;
    }

    public static double toPower (int a, int b) {
        int result = a;
        for (int i = 0; i < b-1; i ++) {
            result = result * a;
        }
        return result;
    }


}
