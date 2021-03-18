/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genconf.modele;

import java.lang.ProcessBuilder.Redirect.Type;
import java.util.Date;

/**
 *
 * @author thomas
 */
public class Communication {
    private Integer id;
    private String titre;
    private String pdf;
    private String video;
    private Date horaire;
    private Hashset<Utilisateur> orateurs;
    private Utilisateur orateurPrincipal;
    private Conference conference;
    private TypeDeCommunication typeCommunication;
    private Session session;

    public Communication(Integer id, String titre, String pdf, Date horaire) {
        this.id = id;
        this.titre = titre;
        this.pdf = pdf;
        //this.horaire = horaire;
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
    public String getVideo(){
        return video;
    }

    public void setOrateur(Utilisateur u){
        orateurs.add(u);
    }

    public void setConference(Conference conf)
    {
        conference=conf;
    }
    public void setTypeDeCommunication(TypeDeCommuncation type){
        this.typeCommunication = type;
    }

    public void setSession(Session s){
        session = s;
    }
}
