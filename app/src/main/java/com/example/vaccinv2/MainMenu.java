package com.example.vaccinv2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.Map;

public class MainMenu extends AppCompatActivity {
    private Button button;
    private Button button2;
    private Button button3;
    private Button button4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu);



        button = findViewById(R.id.button);
        button.setOnClickListener(v -> OpenGoogleMapsVaccin());

        button2 = findViewById(R.id.button2);
        button2.setOnClickListener(v -> OpenQuestions());

        button3 = findViewById(R.id.button3);
        button3.setOnClickListener(v -> OpenAiJeLeDroit());

        button4 = findViewById(R.id.button4);
        button4.setOnClickListener(v -> OpencGoogleMapsCircle());
    }

    public void OpenGoogleMapsVaccin(){

        Intent intent = new Intent (this, MapsActivity.class);

        startActivity(intent);
    }


    public void OpencGoogleMapsCircle(){

        Intent intent = new Intent (this, MapsCircle.class);

        startActivity(intent);
    }


    public void OpenQuestions(){
        // Il faut que Questions soit une activity (classe!) (comme MapsActivity)
        Intent intent = new Intent (this, Questions.class);
        startActivity(intent);
    }

    public void OpenAiJeLeDroit(){

        // Il faut que AiJeLeDroit soit une activity (classe!) (comme MapsActivity)
        System.out.println("Hello w");
        Intent intent = new Intent (getApplicationContext(), AiJeLeDroit.class);
        startActivity(intent);

    }


}