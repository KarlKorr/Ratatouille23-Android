package com.example.ratatouille23mobile.registraOrdinazioni;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.example.ratatouille23mobile.R;

public class RegistraOrdinazioni extends AppCompatActivity {

    private LinearLayout selezionePiattiLabel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registra_ordinazioni);
        selezionePiattiLabel = findViewById(R.id.selezionePiattiLabel);
        Button aggiungiCategoriaButton = findViewById(R.id.aggiungiCategoriaButton);
        aggiungiCategoriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creaNuovaCategoria();
                System.out.println("A sfaccimm ra gent.");
            }
        });
    }

    private void creaNuovaCategoria() {

        ConstraintLayout constLay = new ConstraintLayout(this);
        constLay.setId(View.generateViewId());
        constLay.setBackgroundResource(R.drawable.label_button);
        ConstraintLayout.LayoutParams layoutParams = new ConstraintLayout.LayoutParams(dpToPx(275), dpToPx(159));
        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        layoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;

        // Aggiunta del nuovo ConstraintLayout al LinearLayout esistente

        selezionePiattiLabel.addView(constLay, layoutParams);

        // Creazione del Button all'interno del nuovo ConstraintLayout
        Button nuovoButton = new Button(this);
        nuovoButton.setId(View.generateViewId());
        nuovoButton.setText("Nuova categoria");

        // Impostazione dei parametri del layout per il Button

        ConstraintLayout.LayoutParams buttonLayoutParams = new ConstraintLayout.LayoutParams(
            ConstraintLayout.LayoutParams.WRAP_CONTENT, ConstraintLayout.LayoutParams.WRAP_CONTENT);
        buttonLayoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.bottomToBottom = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.startToStart = ConstraintLayout.LayoutParams.PARENT_ID;
        buttonLayoutParams.endToEnd = ConstraintLayout.LayoutParams.PARENT_ID;

        // Aggiunta del Button al nuovo ConstraintLayout
        constLay.addView(nuovoButton, buttonLayoutParams);

       // LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) constLay.getLayoutParams();
       // layoutParams.width = 275;
       // layoutParams.height = 159;
       // constLay.setLayoutParams(layoutParams);


    }

    private int dpToPx(int dp){
        float density = getResources().getDisplayMetrics().density;
        return Math.round((float) dp * density);
    }


}