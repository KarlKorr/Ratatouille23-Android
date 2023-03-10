package com.example.ratatouille23mobile;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.ratatouille23mobile.Homepage.homepage;
import com.example.ratatouille23mobile.Login.schermataLogin;

public class MainActivity extends AppCompatActivity {

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

}