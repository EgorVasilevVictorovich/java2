package com.example.myapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    float deposit = 1000;
    float wage= 2500;
    float percent = 5 ;
    float telescope = 14000;
    float p = 1000;
    float i =0 ;
    public float sav(){
        return (1+(percent/100)/12);
    }

    public float cikl(){
        while(p<telescope){
            i++;
            p = (sav() * (p+wage));
            return cikl();}
        return i;
    }



    public float c1(){i++;
        return sav() * (deposit+wage) ;
    }
    public float c2(){
        i++;
        return sav() * (c1()+wage) ;
    } public float c3(){
        i++;
    return sav() * (c2()+wage) ;
    }
    public float c4(){
        i++;
        return sav() * (c3()+wage) ;
    }
    public float c5(){
        i++;
        return sav() * (c4()+wage) ;
    }
    public float c6(){
        i++;
        return sav() * (c5()+wage) ;
    }


    private TextView balanceOut;
    private TextView depositOut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        balanceOut = findViewById(R.id. balanceOut);
        balanceOut.setText("Вам осталось накопить на телескоп "+cikl() +" месяцев");
        depositOut= findViewById(R.id.depositOut);
        depositOut.setText("Первночальный вклад: "+ deposit  +"" +"    Ежемесячное пополнение вклада: " +
                " " + wage + "     Первый месяц:   "+ c1() +"    Второй месяц:  " + c2() + "      Третий месяц;    " +c3() + "      Четвёртый месяц:    " +c4() + "     Пятый месяц:    " +c5() + "     Шестой месяц:    " + c6());
    }
}