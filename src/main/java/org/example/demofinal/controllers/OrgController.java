package org.example.demofinal.controllers;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import org.example.demofinal.MasterApp;
import org.example.demofinal.models.Org;
import org.example.demofinal.dao.OrgDao;

import java.sql.SQLException;
import java.util.List;

public class OrgController {
    @FXML
    private VBox orgContainer;
    private ObservableList<Org> orgsData = FXCollections.observableArrayList();
    private OrgDao orgDao;

    private void addOrgCard(Org org) {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(MasterApp.class.getResource("org-card.fxml"));
            HBox card = fxmlLoader.load();
            OrgCardController controller = fxmlLoader.getController();
            controller.setOrg(org);
            orgContainer.getChildren().add(card);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    private void loadOrgs() {
        try {
            List<Org> orgs = orgDao.getAllOrgs();
            orgsData.setAll(orgs);
            orgsData.forEach(this::addOrgCard);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @FXML
    private void initialize() {
        try {
            orgDao = new OrgDao();
            loadOrgs();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
