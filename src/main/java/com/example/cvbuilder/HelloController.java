package com.example.cvbuilder;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class HelloController {

    public TextField name;
    public TextField email;
    public TextField phone;
    public TextArea address;
    public TextArea edu;
    public TextArea skills;
    public TextArea work;
    public TextArea project;

    public void button(ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("CV.fxml"));
            Parent root = loader.load();
            CV controller = loader.getController();
            controller.setData(
                    name.getText(),
                    email.getText(),
                    phone.getText(),
                    address.getText(),
                    edu.getText(),
                    skills.getText(),
                    work.getText(),
                    project.getText()
            );
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            Scene scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
