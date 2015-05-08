package nyc.c4q.yuliyakaleda.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    String mInput = "";
    String firstNum = "";
    String secondNum = "";
    String num = "";
    String operator = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button one = (Button) findViewById(R.id.button_1);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mInput = mInput + 1;
            }
        });

        Button two = (Button) findViewById(R.id.button_2);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mInput = mInput + 2;
            }
        });

        Button equal = (Button) findViewById(R.id.button_equal);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mInput = mInput + "=";
            }
        });

        Button plus = (Button) findViewById(R.id.button_sum);
        one.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mInput = mInput + "+";
            }
        });

        for (int i = 0; i < mInput.length(); i++) {
            if (Character.isDigit(mInput.charAt(i))) {
                if (!Character.isDigit(mInput.charAt(i+1))) {
                    ///int num1 = Integer.parseInt(mInput.charAt(i));
                }
            }


            if (mInput.charAt(i) == ')') {
                if (!Character.isDigit(mInput.charAt(i-1)) && (mInput.charAt(i-1)== '*' || mInput.charAt(i-1)== '/') {
                    firstNum +=
                }
            }

                if (Character.isDigit(mInput.charAt(i))) {
                    num += mInput.charAt(i-1);
                    firstNum = num;
                    num = "";
                }
//            else {
//                    if (mInput.charAt(i) == '+' ) {
//                        plus(firstNum,)
            }
        }
    }
