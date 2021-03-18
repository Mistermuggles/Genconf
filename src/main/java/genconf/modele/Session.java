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
public class Session {
    private String titre;
    private Date horaire;
    private boolean video;
    private boolean pleniere;

    public Session(String titre, Date horaire, boolean video, boolean pleniere) {
        this.titre = titre;
        this.horaire = horaire;
        this.video = video;
        this.pleniere = pleniere;
    }    

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public Date getHoraire() {
        return horaire;
    }

    public void setHoraire(Date horaire) {
        this.horaire = horaire;
    }

    public boolean getVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }

    public boolean getPleniere() {
        return pleniere;
    }

    public void setPleniere(boolean pleniere) {
        this.pleniere = pleniere;
    }
    
}
