package com.appwallaz.calculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    float a = 0;
    float b= 0;
    float res=0;
    boolean flag;
    boolean flag1;
    boolean flagm,flagd;

    Button one, two, three, four, five, six, seven, eight, nine, zero, dot, plus, min, div, mul, per, c, eq, pm;
    TextView display;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        display = (TextView) findViewById(R.id.tvdis);
         one = (Button) findViewById(R.id.one);
         two = (Button) findViewById(R.id.two);
         three = (Button) findViewById(R.id.three);
         four = (Button) findViewById(R.id.four);
         five = (Button) findViewById(R.id.five);
         six = (Button) findViewById(R.id.six);
         seven = (Button) findViewById(R.id.seven);
         eight = (Button) findViewById(R.id.eight);
         nine = (Button) findViewById(R.id.nine);
         zero = (Button) findViewById(R.id.zero);
         dot = (Button) findViewById(R.id.dot);
         plus = (Button) findViewById(R.id.plus);
         min = (Button) findViewById(R.id.min);
         div = (Button) findViewById(R.id.div);
         mul = (Button) findViewById(R.id.mul);
         per = (Button) findViewById(R.id.per);
         c = (Button) findViewById(R.id.c);
         eq = (Button) findViewById(R.id.eq);
         pm = (Button) findViewById(R.id.pm);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);
        five.setOnClickListener(this);
        six.setOnClickListener(this);
        seven.setOnClickListener(this);
        eight.setOnClickListener(this);
        nine.setOnClickListener(this);
        zero.setOnClickListener(this);
        dot.setOnClickListener(this);
        plus.setOnClickListener(this);
        min.setOnClickListener(this);
        div.setOnClickListener(this);
        mul.setOnClickListener(this);
        per.setOnClickListener(this);
        c.setOnClickListener(this);
        eq.setOnClickListener(this);
        pm.setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.one:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 1;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 1;
                        display.setText(b + "");
                    }
                }
                    else {
                    if (a == 0) {
                        a = 1;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 1;
                        display.setText(a + "");
                    }
                }


                break;

            case R.id.two:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 2;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 2;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 2;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 2;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.three:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 3;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 3;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 3;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 3;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.four:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 4;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 4;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 4;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 4;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.five:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 5;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 5;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 5;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 5;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.six:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 6;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 6;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 6;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 6;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.seven:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 7;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 7;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 7;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 7;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.eight:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 8;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 8;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 8;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 8;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.nine:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 9;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 9;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 9;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 9;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.zero:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    if (b == 0) {
                        b = 0;
                        display.setText(b + "");
                    } else {
                        b = b * 10;
                        b = b + 0;
                        display.setText(b + "");
                    }
                }
                else {
                    if (a == 0) {
                        a = 0;
                        display.setText(a + "");
                    } else {
                        a = a * 10;
                        a = a + 0;
                        display.setText(a + "");
                    }
                }
                break;

            case R.id.plus:

                flag = true;
                break;

            case R.id.eq:
                if(flag==true) {
                    res = a + b;
                    display.setText(res+"");
                }
                else if(flag1==true)
                {
                    res = a - b;
                    display.setText(res+"");
                }
                else if(flagm==true)
                {
                    res=a*b;
                    display.setText(res+"");
                }
                else
                {
                    res=a/b;
                    display.setText(res+"");
                }
                break;

            case R.id.c:
                a=0;
                b=0;
                res=0;
                flag=false;
                flag1=false;
                flagd=false;
                flagm=false;
                display.setText(res+"");
                break;

            case R.id.min:

                flag1=true;
                break;
            case R.id.pm:
                if(flag==true || flag1==true || flagm==true || flagd==true) {
                    b = 0 - b;
                    display.setText(b + "");
                }
                else{
                    a=0-a;
                    display.setText(a+"");
                }
                break;

            case R.id.mul:
                flagm=true;
                break;

            case R.id.div:
                flagd=true;
                break;





            default:
                break;
        }
    }
}


