package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ListActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.gsb.entite.Rapport;

import java.util.ArrayList;
import java.util.List;

public class RapportActivity extends AppCompatActivity {
    private ArrayAdapter<String> adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rapport);

        // Liste des rapports
        List<Rapport> rapports = new ArrayList<Rapport>();
        rapports.add(new Rapport(null, "Le medecin avait l'air interesse", "Pas encore visite"));
        rapports.add(new Rapport(null, "L'infirmier ne semble pas interesse", "Contre visite"));

        //
        ListView rapportListView = findViewById(R.id.listView);
        rapportListView.setAdapter(new RapportItemAdapter(this,  rapports));

        /*
        // On cree l'ArrayAdapter
        ArrayAdapter<String> listDataAdapter = new ArrayAdapter<String>(this, R.layout.activity_list_rapport_row, R.id.listRowTextView, listData);

        // On set cet adapter sur l'objet ListView interne
        this.setListAdapter(listDataAdapter);
         */
    }
}