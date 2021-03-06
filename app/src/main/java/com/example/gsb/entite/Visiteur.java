package com.example.gsb.entite;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Visiteur implements Serializable {
    private Long id;
    private String nom;
    private LocalDate dateEmbauche;
    private List<Rapport> rapports;

    public Visiteur() {
        rapports = new ArrayList<>();
    }
    public Visiteur(String nom, LocalDate dateEmbauche) {
        this.nom = nom;
        this.dateEmbauche = dateEmbauche;
        rapports = new ArrayList<>();
    }
    public void addRapport(Rapport rapport) {
        rapports.add(rapport);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public LocalDate getDateEmbauche() {
        return dateEmbauche;
    }

    public void setDateEmbauche(LocalDate dateEmbauche) {
        this.dateEmbauche = dateEmbauche;
    }

    public List<Rapport> getRapports() {
        return rapports;
    }

    public void setRapports(List<Rapport> rapports) {
        this.rapports = rapports;
    }

    @Override
    public String toString() {
        return "Visiteur{" +
                "id=" + id +
                ", nom='" + nom + '\'' +
                ", dateEmbauche=" + dateEmbauche +
                ", rapports=" + rapports +
                '}';
    }
}
