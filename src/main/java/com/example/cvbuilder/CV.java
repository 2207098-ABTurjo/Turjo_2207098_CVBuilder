package com.example.cvbuilder;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class CV {

    @FXML private Label nameo;
    @FXML private Label emailo;
    @FXML private Label phoneo;
    @FXML private Label addresso;
    @FXML private Label eduo;
    @FXML private Label skillo;
    @FXML private Label worko;
    @FXML private Label projecto;

    public void setData(String name, String email, String phone,
                        String address, String edu, String skills,
                        String work, String project) {

        nameo.setText(name);
        emailo.setText(email);
        phoneo.setText(phone);
        addresso.setText(address);
        eduo.setText(edu);
        skillo.setText(skills);
        worko.setText(work);
        projecto.setText(project);
    }
}
