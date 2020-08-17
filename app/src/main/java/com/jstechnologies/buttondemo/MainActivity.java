package com.jstechnologies.buttondemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Declaring Button
    Button btn1,btn2,btn3,btn4,btn5,btn6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Referencing the button by its ID
        btn1=findViewById(R.id.Btn1);
        btn2=findViewById(R.id.Btn2);
        btn3=findViewById(R.id.Btn3);
        btn4=findViewById(R.id.Btn4);
        btn5=findViewById(R.id.Btn5);
        btn6=findViewById(R.id.Btn6);
        //Setting Button OnClick Event.. This event triggers when user clicks the button
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Basic button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Simple button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Customised button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });
        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Stroke button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });
        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Stroke with color button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });
        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //This is the code which is executed when the User clicks button
                //For now we will just show a Toast message that the user clicked this button
                //To show a toast follow this
                Toast.makeText(MainActivity.this,"Gradient button has been clicked",Toast.LENGTH_SHORT).show();
                //Thats it... lets run now

            }
        });

    }
}