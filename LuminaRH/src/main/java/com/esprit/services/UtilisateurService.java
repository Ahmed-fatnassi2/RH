package com.esprit.services;

import com.esprit.models.Personne;
import com.esprit.models.Utilisateur;
import com.esprit.utils.DataSource;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class UtilisateurService implements IService<Utilisateur> {

    Connection connection = DataSource.getInstance().getConnection();

    @Override
    public void ajouter(Utilisateur utilisateur) {
        String req = "INSERT INTO utilisateur (nom, prenom, email) VALUES ('"+utilisateur.getNom()+"', '"+utilisateur.getPrenom()+"', '"+utilisateur.getEmail()+"')";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(req);
            System.out.println("Utilisateur ajoutée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void modifier(Utilisateur utilisateur) {

    }

    @Override
    public void supprimer(Utilisateur utilisateur) {

    }

    @Override
    public List<Utilisateur> rechercher() {
        return List.of();
    }

//    @Override
//    public void modifier(Personne personne) {
//        String req = "UPDATE personne SET nom='"+personne.getNom()+"' ,prenom='"+personne.getPrenom()+"' WHERE id="+personne.getId();
//        try {
//            Statement st = connection.createStatement();
//            st.executeUpdate(req);
//            System.out.println("Personne modifiée");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

//    @Override
//    public void supprimer(Personne personne) {
//        String req = "DELETE FROM personne WHERE id="+personne.getId();
//        try {
//            Statement st = connection.createStatement();
//            st.executeUpdate(req);
//            System.out.println("Personne supprimée");
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//    }

//    @Override
//    public List<Personne> rechercher() {
//        List<Personne> personnes = new ArrayList<>();
//
//        String req = "SELECT * FROM personne";
//        try {
//            Statement st = connection.createStatement();
//            ResultSet rs = st.executeQuery(req);
//            while (rs.next()) {
//                personnes.add(new Personne(rs.getInt("id"), rs.getString("nom"), rs.getString("prenom")));
//            }
//        } catch (SQLException e) {
//            System.out.println(e.getMessage());
//        }
//
//        return personnes;
//    }
}
