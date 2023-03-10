package com.example.ratatouille23mobile.Login;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.ratatouille23mobile.Homepage.homepage;
import com.example.ratatouille23mobile.R;

public class schermataLogin extends AppCompatActivity {

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
                    Toast.makeText(schermataLogin.this, "Login effettuato con successo",Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(schermataLogin.this, homepage.class));
                } else{
                    Toast.makeText(schermataLogin.this, "Login fallito", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

}
