/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genconf.modele;

import java.util.Date;
import java.util.HashSet;

import javax.sound.midi.Track;

/**
 *
 * @author thomas
 */
public class Session {
    private String titre;
    private Date horaire;
    private boolean video;
    private boolean pleniere;
    private HashSet<Communication> communications;
    private Conference conference;
    private HashSet<Utilisateur> animateurs;
    private HashSet<Track> tracks;

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

    public void setCommunications(Communication com)
    {
        communications.add(com);
    }

    public void setConference(Conference conf){
        conference = conf;
    }

    public void setTrack(Track track){
        tracks.add(track);
    }



    
}
