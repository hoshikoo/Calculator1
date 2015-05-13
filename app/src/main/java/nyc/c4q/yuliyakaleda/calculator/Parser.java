package nyc.c4q.yuliyakaleda.calculator;

import com.fathzer.soft.javaluator.DoubleEvaluator;

/**
 * Created by July on 5/12/15.
 */
public class Parser {

    /** The most simple class to use the built-in real expression evaluator.*/
        public static String parse(String s) {
            // Create a new evaluator
            DoubleEvaluator evaluator = new DoubleEvaluator();
            //String expression = "(2^3-1)*sin(pi/4)/ln(pi^2)";
            // Evaluate an expression
            Double result = evaluator.evaluate(s);
            // Output the result
            //System.out.println(expression + " = " + result);
            return "" + result;
        }
    }
