/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genconf.modele;

/**
 *
 * @author thomas
 */
public class TypeDeCommuncation {
    
    private String libelle;
    private boolean pdf;
    private boolean video;

    public TypeDeCommuncation(String libelle, boolean pdf, boolean video) {
        this.libelle = libelle;
        this.pdf = pdf;
        this.video = video;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public boolean getPdf() {
        return pdf;
    }

    public void setPdf(boolean pdf) {
        this.pdf = pdf;
    }

    public boolean getVideo() {
        return video;
    }

    public void setVideo(boolean video) {
        this.video = video;
    }
    
    
    
    
}
