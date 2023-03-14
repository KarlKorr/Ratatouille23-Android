package com.example.ratatouille23mobile.View;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.ratatouille23mobile.Model.Piatto;
import com.example.ratatouille23mobile.R;
import com.example.ratatouille23mobile.Utils.Piatti_RecyclerViewAdapter;
import com.example.ratatouille23mobile.Presenter.registraOrdinazioniPresenter;
import com.example.ratatouille23mobile.Utils.SpaceItemDecoration;

import java.util.ArrayList;

public class RegistraOrdinazioni extends AppCompatActivity {

    private LinearLayout selezionePiattiLabel;
    private registraOrdinazioniPresenter presenter = new registraOrdinazioniPresenter();

    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
    private ArrayList<Piatto> listaPiatti = new ArrayList<>();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.registra_ordinazioni);
        selezionePiattiLabel = findViewById(R.id.selezionePiattiLabel);
        try {
            listaPiatti = presenter.caricaListaPiatti();
        } catch (Exception e) {
            System.out.println("Qualcosa è andato storto.");
        }
        Button aggiungiCategoriaButton = findViewById(R.id.aggiungiCategoriaButton);
        recyclerView = findViewById(R.id.RecyclerView);
        adapter = new Piatti_RecyclerViewAdapter(this, listaPiatti);
        int spacingInPixels = getResources().getDimensionPixelSize(R.dimen.spacing);
        recyclerView.addItemDecoration(new SpaceItemDecoration(spacingInPixels));
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(layoutManager);

        aggiungiCategoriaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                creaNuovaCategoria();
                System.out.println("A sfaccimm ra gent.");
            }
        });
    }

    private void creaNuovaCategoria() {


        // Creazione del Button all'interno del nuovo ConstraintLayout
        Button nuovoButton = new Button(this);
        nuovoButton.setId(View.generateViewId());
        nuovoButton.setText("Nuova categoria");
        nuovoButton.setBackgroundResource(R.drawable.rounded_button);
        nuovoButton.setTextColor(R.drawable.white_rectangle_background);



        // Impostazione dei parametri del layout per il Button

        LinearLayout.LayoutParams buttonLayoutParams = new LinearLayout.LayoutParams(
           LinearLayout.LayoutParams.WRAP_CONTENT, LinearLayout.LayoutParams.WRAP_CONTENT);
      buttonLayoutParams.setMargins(30, 30, 30, 0);
        // Aggiunta del Button al nuovo ConstraintLayout
        selezionePiattiLabel.addView(nuovoButton, buttonLayoutParams);

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