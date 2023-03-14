package com.example.ratatouille23mobile.Model;

import java.util.ArrayList;

public class Piatto {
    private String nomePiatto;
    private float costoPiatto;
    private String allergeni;
    private String descrizione;
    ArrayList<Piatto> listaPiatti = new ArrayList<Piatto>();

    public Piatto(){}

    public Piatto(String nomePiatto, float costoPiatto, String allergeni, String descrizione) {
        this.nomePiatto = nomePiatto;
        this.costoPiatto = costoPiatto;
        this.allergeni = allergeni;
        this.descrizione = descrizione;
    }


    public ArrayList<Piatto> getAllPiatti(){
        Piatto p1 = new Piatto("Prosciutto", 10, "Nessun allergeno", "Un semplice antipasto");
        Piatto p2 = new Piatto("Cuolli di cazzo", 20, "Lattosio(sborra)", "Per chi adora il pesce fresco");
        listaPiatti.add(p1);
        listaPiatti.add(p2);
        return listaPiatti;


    }

    public String getNomePiatto() {
        return nomePiatto;
    }

    public void setNomePiatto(String nomePiatto) {
        this.nomePiatto = nomePiatto;
    }

    public float getCostoPiatto() {
        return costoPiatto;
    }

    public void setCostoPiatto(float costoPiatto) {
        this.costoPiatto = costoPiatto;
    }

    public String getAllergeni() {
        return allergeni;
    }

    public void setAllergeni(String allergeni) {
        this.allergeni = allergeni;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }
}
