package com.example.gsb.entite;

import java.io.Serializable;
import java.time.LocalDate;

public class Rapport implements Serializable {
    private Long id;
    private LocalDate date;
    private String bilan;
    private String motif;
    //private List<Offre> offres;

    public Rapport() {}
    public Rapport(LocalDate date, String bilan, String motif) {
        System.out.println("Rapport - constructeur");
        this.date = date;
        this.bilan = bilan;
        this.motif = motif;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getBilan() {
        return bilan;
    }

    public void setBilan(String bilan) {
        this.bilan = bilan;
    }

    public String getMotif() {
        return motif;
    }

    public void setMotif(String motif) {
        this.motif = motif;
    }

    @Override
    public String toString() {
        return "Rapport [date=" + date + ", bilan=" + bilan + ", motif=" + motif + "]";
    }
}
