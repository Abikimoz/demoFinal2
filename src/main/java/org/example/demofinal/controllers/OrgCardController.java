package org.example.demofinal.controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import org.example.demofinal.models.Org;

public class OrgCardController {
    @FXML private Label orgTypeNameLabel;
    @FXML private Label ceoLabel;
    @FXML private Label phoneLabel;
    @FXML private Label reteLabel;

    private Org org;

    public void setOrg(Org org) {
        this.org = org;
        orgTypeNameLabel.setText(org.getOrg_type() + " | " + org.getNames());
        ceoLabel.setText(org.getCeo());
        phoneLabel.setText("+7 " + org.getPhone());
        reteLabel.setText("Рейтинг: " + org.getRating());
    }
}
