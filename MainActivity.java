package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import java.util.Locale;
import android.speech.tts.TextToSpeech;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements
        TextToSpeech.OnInitListener
{
    TextToSpeech ts;
EditText et;
String no,op;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        et=findViewById(R.id.et1);
        ts=new TextToSpeech(this,this);
    }
    public void one(View v)
    {
       String sno=et.getText().toString();
       int no=Integer.parseInt(sno);
       int n=no*10+1;
       et.setText(n+"");
    }
    public void two(View v)
    {
        String sno2=et.getText().toString();
        int no2=Integer.parseInt(sno2);
        int n2=no2*10+2;
        et.setText(n2+"");
    }
    public void three(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+3;
        et.setText(n+"");
    }
    public void four(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+4;
        et.setText(n+"");
    }
    public void five(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+5;
        et.setText(n+"");
    }
    public void six(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+6;
        et.setText(n+"");
    }
    public void seven(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+7;
        et.setText(n+"");
    }
    public void eight(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+8;
        et.setText(n+"");
    }
    public void nine(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+9;
        et.setText(n+"");
    }
    public void zero(View v)
    {
        String sno=et.getText().toString();
        int no=Integer.parseInt(sno);
        int n=no*10+0;
        et.setText(n+"");
    }
    public void plus(View v)
    {
        no=et.getText().toString();
        op="+";
        et.setText("0");
    }
    public void subt(View v)
    {
        no=et.getText().toString();
        op="-";
        et.setText("0");
    }
    public void divide(View v)
    {
        no=et.getText().toString();
        op="/";
        et.setText("0");
    }
    public void mult(View v)
    {
        no=et.getText().toString();
        op="*";
        et.setText("0");
    }
    public void equa(View v)
    {
        if(op.equals("+"))
        {
            et.setText(Integer.parseInt(no)+ Integer.parseInt(et.getText().toString())+"");
            String s=et.getText().toString();
            ts.setLanguage(Locale.ENGLISH);
            ts.speak(s,TextToSpeech.QUEUE_FLUSH,null,null);
        }
        else if(op.equals("-"))
        {
            et.setText(Integer.parseInt(no)- Integer.parseInt(et.getText().toString())+"");
            String s=et.getText().toString();
            ts.setLanguage(Locale.ENGLISH);
            ts.speak(s,TextToSpeech.QUEUE_FLUSH,null,null);
        }
        if(op.equals("*"))
        {
            et.setText(Integer.parseInt(no)*Integer.parseInt(et.getText().toString())+"");
            String s=et.getText().toString();
            ts.setLanguage(Locale.ENGLISH);
            ts.speak(s,TextToSpeech.QUEUE_FLUSH,null,null);
        }
        if(op.equals("/"))
        {
            et.setText(Integer.parseInt(no)/Integer.parseInt(et.getText().toString())+"");
            String s=et.getText().toString();
            ts.setLanguage(Locale.ENGLISH);
            ts.speak(s,TextToSpeech.QUEUE_FLUSH,null,null);
        }


    }
    public void clear(View v)
    {
        et.setText("0");
        op=" ";
        no=" ";
    }

    @Override
    public void onInit(int i) {
        ts.setLanguage(Locale.ENGLISH);
        ts.speak("",TextToSpeech.QUEUE_FLUSH,null,null);
    }
    public void ctof(View v)
    { String sno1=et.getText().toString();
        float no1=Float.parseFloat(sno1);
        float f=(float)(no1*1.8)+32;
        String fs=String.valueOf(f);
        Toast.makeText(this, no1+" Degree Celsius is: "+ f+" degree Fahrenheit", Toast.LENGTH_SHORT).show();
        ts.setLanguage(Locale.ENGLISH);
        ts.speak(no1+" degree Celsius is:"+fs+"degree Fahrenheit",TextToSpeech.QUEUE_FLUSH,null,null);
    }
    public void ftoc(View v)
    { String sno1=et.getText().toString();
        float no1=Float.parseFloat(sno1);
        float f= (float) ((no1-32)*0.55);
        String fs=String.valueOf(f);
        Toast.makeText(this, no1+" Degree Fahrenheit  is:"+ f+"degree celsius", Toast.LENGTH_SHORT).show();
        ts.setLanguage(Locale.ENGLISH);
        ts.speak(no1+"Degree Fahrenheit is:"+fs+"degree celsius",TextToSpeech.QUEUE_FLUSH,null,null);
    }
    public void mtok(View v)
    { String sno1=et.getText().toString();
        float no1=Float.parseFloat(sno1);
        float f=no1/1000;
        String fs=String.valueOf(f);
        Toast.makeText(this, no1+" Meter is:"+ f+"kilometers", Toast.LENGTH_SHORT).show();
        ts.setLanguage(Locale.ENGLISH);
        ts.speak(no1+" Meter is:"+fs+"kilometers",TextToSpeech.QUEUE_FLUSH,null,null);
    }
    public void ktom(View v)
    { String sno1=et.getText().toString();
        float no1=Float.parseFloat(sno1);
        float f=(float)(no1*1000);
        //casting is done here so that we get accurate point values
        String fs=String.valueOf(f);
        Toast.makeText(this, no1+" Kilometer is:"+ f+"meters", Toast.LENGTH_SHORT).show();
        ts.setLanguage(Locale.ENGLISH);
        ts.speak(no1+" Kilometer is:"+fs+"Meters",TextToSpeech.QUEUE_FLUSH,null,null);
    }
}
