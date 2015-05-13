package nyc.c4q.yuliyakaleda.calculator;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;


public class MainActivity extends ActionBarActivity {

    TextView display;

    Button bClear;
    Button bSum;
    Button bSubtraction;
    Button bDivision;
    Button bMultiplication;
    Button bDot;
    Button bOpenParen;
    Button bClosedParen;
    Button bSin;
    Button bCos;
    Button bTan;
    Button bLN;
    Button bLog;
    Button bOneDivideX;
    Button bAbs;
    Button bYToPowX;
    Button bPI;
    Button bE;
    Button bEToPowX;
    Button bXToPow2;
    Button bEqual;
    Button bPerCent;

    Button b1;
    Button b2;
    Button b3;
    Button b4;
    Button b5;
    Button b6;
    Button b7;
    Button b8;
    Button b9;
    Button b0;

    private static final String DISPLAY_RESULT_KEY = "displayResult";
    String result = "testing";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        display = (TextView) findViewById(R.id.enter_numbers);

        ArrayList<Button> buttons = new ArrayList<Button>();
        b1 = (Button) findViewById(R.id.button_1);
        b2 = (Button) findViewById(R.id.button_2);
        b3 = (Button) findViewById(R.id.button_3);
        b4 = (Button) findViewById(R.id.button_4);
        b5 = (Button) findViewById(R.id.button_5);
        b6 = (Button) findViewById(R.id.button_6);
        b7 = (Button) findViewById(R.id.button_7);
        b8 = (Button) findViewById(R.id.button_8);
        b9 = (Button) findViewById(R.id.button_9);
        b0 = (Button) findViewById(R.id.button_0);
        bDot = (Button) findViewById(R.id.button_dot);
        bSum = (Button) findViewById(R.id.sum);
        bSubtraction = (Button) findViewById(R.id.subtraction);
        bDivision = (Button) findViewById(R.id.division);
        bMultiplication = (Button) findViewById(R.id.multiplication);
        bOpenParen = (Button) findViewById(R.id.open_parenthesis);
        bClosedParen = (Button) findViewById(R.id.closed_parenthesis);
        bClear = (Button) findViewById(R.id.AC);
        bSin = (Button) findViewById(R.id.sin);
        bCos = (Button) findViewById(R.id.cos);
        bTan = (Button) findViewById(R.id.tan);
        bLN = (Button) findViewById(R.id.b_ln);
        bLog = (Button) findViewById(R.id.button_log);
        bOneDivideX = (Button) findViewById(R.id.button_1_divide_x);
        bAbs = (Button) findViewById(R.id.button_abs);
        bYToPowX = (Button) findViewById(R.id.button_y_pow_x);
        bPI = (Button) findViewById(R.id.button_PI);
        bE = (Button) findViewById(R.id.button_E);
        bEToPowX = (Button) findViewById(R.id.button_e_pow_x);
        bXToPow2 = (Button) findViewById(R.id.button_x_pow_2);
        bEqual = (Button) findViewById(R.id.b_equal);
        bPerCent = (Button) findViewById(R.id.button_per_cent);

        buttons.add(b1);
        buttons.add(b2);
        buttons.add(b3);
        buttons.add(b4);
        buttons.add(b5);
        buttons.add(b6);
        buttons.add(b7);
        buttons.add(b8);
        buttons.add(b9);
        buttons.add(b0);
        buttons.add(bDot);
        buttons.add(bSum);
        buttons.add(bSubtraction);
        buttons.add(bDivision);
        buttons.add(bMultiplication);
        buttons.add(bOpenParen);
        buttons.add(bClosedParen);
        buttons.add(bEqual);


            for (Button btn : buttons) {
                btn.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        switch (view.getId()) {
                            case R.id.button_1:
                                display.append(b1.getText());
                                break;
                            case R.id.button_2:
                                display.append(b2.getText());
                                break;
                            case R.id.button_3:
                                display.append(b3.getText());
                                break;
                            case R.id.button_4:
                                display.append(b4.getText());
                                break;
                            case R.id.button_5:
                                display.append(b5.getText());
                                break;
                            case R.id.button_6:
                                display.append(b6.getText());
                                break;
                            case R.id.button_7:
                                display.append(b7.getText());
                                break;
                            case R.id.button_8:
                                display.append(b8.getText());
                                break;
                            case R.id.button_9:
                                display.append(b9.getText());
                                break;
                            case R.id.button_0:
                                display.append(b0.getText());
                                break;
                            case R.id.button_dot:
                                display.append(bDot.getText());
                                break;
                            case R.id.sum:
                                display.append(bSum.getText());
                                break;
                            case R.id.subtraction:
                                display.append(bSubtraction.getText());
                                break;
                            case R.id.division:
                                display.append(bDivision.getText());
                                break;
                            case R.id.multiplication:
                                display.append(bMultiplication.getText());
                                break;
                            case R.id.open_parenthesis:
                                display.append(bOpenParen.getText());
                                break;
                            case R.id.closed_parenthesis:
                                display.append(bClosedParen.getText());
                                break;
                        }
                    }
                });
            }

            bClear.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View view) {
                    display.setText("");
                }
            });

            if (bSin != null) {
                bSin.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("sin");
                    }
                });
            }

            if (bCos != null) {
                bCos.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("cos");
                    }
                });
            }

            if (bTan != null) {
                bTan.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("tan");
                    }
                });
            }

            if (bLN != null) {
                bLN.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("ln");
                    }
                });
            }

            if (bLog != null) {
                bLog.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("Log");
                    }
                });
            }

            if (bOneDivideX != null) {
                bOneDivideX.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("1/");
                    }
                });
            }

            if (bAbs != null) {
                bAbs.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("|");
                    }
                });
            }

            if (bYToPowX != null) {
                bYToPowX.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("^");
                    }
                });
            }

            if (bPI != null) {
                bPI.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("pi");
                    }
                });
            }

            if (bE != null) {
                bE.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("E");
                    }
                });
            }

            if (bEToPowX != null) {
                bEToPowX.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("e^");
                    }
                });
            }

            if (bXToPow2 != null) {
                bXToPow2.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append("^2");
                    }
                });
            }

            if (bPerCent != null) {
                bPerCent.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        display.append(bPerCent.getText());
                    }
                });
            }

            bEqual.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    String input = display.getText().toString();
                    result = Parser.parse(input);
                    display.setText(result);
                }
            });


            if (savedInstanceState != null) {
                String displayResult = savedInstanceState.getString(DISPLAY_RESULT_KEY);
                display.setText(displayResult);

            }
        }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString(DISPLAY_RESULT_KEY, display.getText().toString());
    }

}


