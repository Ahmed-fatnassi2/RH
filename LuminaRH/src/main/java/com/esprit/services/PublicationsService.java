package com.esprit.services;

import com.esprit.models.Personne;
import com.esprit.models.Publications;
import com.esprit.utils.DataSource;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class PublicationsService {
    Connection connection = DataSource.getInstance().getConnection();

   // @Override
    public void ajouter2(Publications publications) {
        String req = "INSERT INTO publications (titre, contenue, utilisateur) VALUES ('"+publications.getTitre()+"', '"+publications.getContenue()+"', '"+publications.getUtilisateur().getId()+"')";
        try {
            Statement st = connection.createStatement();
            st.executeUpdate(req);
            System.out.println("Publication ajoutée");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
//   public void ajouter(Publications publications) {
//       String req = "INSERT INTO publications (titre, contenue, utilisateur_id) VALUES (?, ?, ?)";
//
//       try {
//           PreparedStatement pstmt = connection.prepareStatement(req);
//           pstmt.setString(1, publications.getTitre());
//           pstmt.setString(2, publications.getContenue());
//           pstmt.setInt(3, publications.getUtilisateur().getId()); // Store user ID, not object
//
//           pstmt.executeUpdate();
//           System.out.println("Publication ajoutée !");
//       } catch (SQLException e) {
//           System.out.println("Erreur lors de l'ajout de la publication : " + e.getMessage());
//       }
//   }
}
