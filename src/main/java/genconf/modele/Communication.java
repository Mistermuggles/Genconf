/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genconf.modele;

import java.util.Date;

/**
 *
 * @author thomas
 */
public class Communication {
    private Integer id;
    private String titre;
    private String pdf;
    private Date horaire;

    public Communication(Integer id, String titre, String pdf, Date horaire) {
        this.id = id;
        this.titre = titre;
        this.pdf = pdf;
        this.horaire = horaire;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getPdf() {
        return pdf;
    }

    public void setPdf(String pdf) {
        this.pdf = pdf;
    }

    public Date getHoraire() {
        return horaire;
    }

    public void setHoraire(Date horaire) {
        this.horaire = horaire;
    }
    
}
