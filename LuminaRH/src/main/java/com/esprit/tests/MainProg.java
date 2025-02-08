package com.esprit.tests;

import com.esprit.models.Personne;
import com.esprit.models.Publications;
import com.esprit.models.Utilisateur;
import com.esprit.services.PersonneService;
import com.esprit.services.PublicationsService;
import com.esprit.services.UtilisateurService;
import com.esprit.utils.DataSource;

public class MainProg {
    public static void main(String[] args) {
        UtilisateurService ut = new UtilisateurService();
        Utilisateur utilisateur= new Utilisateur(1, "ahmedfatnassi95@yahoo.fr", "ahmed", "fatnassi");
        //ut.ajouter(utilisateur);
        PublicationsService pub = new PublicationsService();
        pub.ajouter2(new Publications("formations", "une formation azertyu", utilisateur));
//        ps.modifier(new Personne(2,"Youssef", "Ahmed"));
//        ps.supprimer(new Personne(2,"", ""));
     //   System.out.println(ps.rechercher());
    }
}
