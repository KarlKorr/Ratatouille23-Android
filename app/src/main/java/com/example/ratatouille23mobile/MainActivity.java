package com.example.ratatouille23mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.example.ratatouille23mobile.View.schermataLogin;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Mostra la schermata di benvenuto per 3 secondi
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                // Avvia la Homepage dopo 3 secondi
                Intent intent = new Intent(MainActivity.this, schermataLogin.class);
                startActivity(intent);

                // Applica un'animazione di transizione
                overridePendingTransition(R.anim.slide_in_right, R.anim.slide_out_left);

                // Chiude la MainActivity
                finish();
            }
        }, 2000);
    }





    /*

    EditText username;
    EditText password;
    Button loginButton;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schermata_login);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(username.getText().toString().equals("user") && password.getText().toString().equals("1234")){
                    Toast.makeText(MainActivity.this, "Login effettuato con successo",Toast.LENGTH_SHORT).show();
                    // startActivity(new Intent(MainActivity.this, homepage.class));
                    Intent intent = new Intent(MainActivity.this, homepage.class);
                    startActivity(intent);
                } else{
                    Toast.makeText(MainActivity.this, "Login fallito", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

     */

}