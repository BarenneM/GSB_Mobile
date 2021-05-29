package com.example.gsb;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.gsb.entite.Rapport;

import java.util.List;

public class RapportItemAdapter extends BaseAdapter {

    private Context context;
    private List<Rapport> rapports;
    private LayoutInflater inflater;

    // constructeur
    public RapportItemAdapter(Context context, List<Rapport> rapports) {
        this.context = context;
        this.rapports = rapports;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return rapports.size();
    }

    @Override
    public Rapport getItem(int position) {
        return rapports.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup parent) {
        view = inflater.inflate(R.layout.adapter_item, null);

        //Recuperer le infos de l'objet courrant
        Rapport currentRapport = getItem(i);
        String itemMotif = currentRapport.getMotif();
        String itemBilan = currentRapport.getBilan();

        //On recupere le champs dans lequel on doit positionner le motif et le bilan
        TextView itemMotifView = view.findViewById(R.id.item_motif);
        itemMotifView.setText(itemMotif);
        TextView itemBilanView = view.findViewById(R.id.item_bilan);
        itemBilanView.setText(itemBilan);


        return view;
    }
}
