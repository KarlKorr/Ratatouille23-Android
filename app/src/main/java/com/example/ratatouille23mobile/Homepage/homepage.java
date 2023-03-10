package com.example.ratatouille23mobile.Homepage;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ratatouille23mobile.R;
import com.example.ratatouille23mobile.registraOrdinazioni.RegistraOrdinazioni;

public class homepage extends AppCompatActivity {

    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.homepage);

        Button visualizzaAvvisiButton = findViewById(R.id.visualizzaAvvisiButton);
        Button registraOrdinazioneButton = findViewById(R.id.registraOrdinazioneButton);

        registraOrdinazioneButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent openRegistraOrdinazioni = new Intent(homepage.this, RegistraOrdinazioni.class);
                startActivity(openRegistraOrdinazioni);
            }
        });
    }



}
