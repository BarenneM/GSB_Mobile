package com.example.gsb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private String TAGlogin = "EditText";
    private String TAGpassword = "EditText";
    private EditText login;
    private EditText password;
    private TextView resultatTexte;
    //public ArrayList<Rapport> rapports;
    private DateTimeFormatter formatter;
    private LocalDate date;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        login = (EditText)findViewById(R.id.login);
        password = (EditText)findViewById(R.id.password);
        resultatTexte = (TextView)findViewById(R.id.result);

        Button submit = (Button)findViewById(R.id.submit);
        submit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        Log.i(TAGlogin,"Texte ecrit = "+login.getText().toString());
        Log.i(TAGpassword,"Texte ecrit = "+password.getText().toString());
        login(login, password);
        Intent intent = new Intent(MainActivity.this, RapportActivity.class);
        startActivity(intent);
    }

    public void login(EditText login, EditText password){
        resultatTexte.setText(login.getText().toString() + " " + password.getText().toString());
        //Rapport rapport1 = new Rapport(null, "bilan1", "motif1");
        //Rapport rapport2 = new Rapport(null, "bilan2", "motif2");
        //rapports.add(rapport1, rapport2);

        /*
        formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        date = LocalDate.parse("2018-12-01", formatter);
        rapports.add(new Rapport(date, "bilan1", "motif1"));
        rapports.add(new Rapport(date, "bilan2", "motif2"));
        //rapports = null;

        // On positionne la liste des rapports dans la variable globale
        singleToneClass singleToneClass = com.example.authentication.singleToneClass.getInstance();
        singleToneClass.setRapports(rapports);*/
    }
}