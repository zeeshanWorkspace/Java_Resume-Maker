package com.zeeshan.resumemaker;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainEvent implements Initializable {
    @FXML
    Button sButton,iButton,aButton,dButton;
    @FXML
    ImageView sImage,iImage,aImage,dImage;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        sImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Parent root= null;
                try {
                    root = FXMLLoader.load(getClass().getResource("s.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene=sButton.getScene();
                scene.setRoot(root);
            }
        });
        iImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Parent root= null;
                try {
                    root = FXMLLoader.load(getClass().getResource("i.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene=iButton.getScene();
                scene.setRoot(root);
            }
        });
        aImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Parent root= null;
                try {
                    root = FXMLLoader.load(getClass().getResource("a.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene=sButton.getScene();
                scene.setRoot(root);
            }
        });
        dImage.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                Parent root= null;
                try {
                    root = FXMLLoader.load(getClass().getResource("d.fxml"));
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
                Scene scene=sButton.getScene();
                scene.setRoot(root);
            }
        });
    }
    public void Simple(ActionEvent e) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("s.fxml"));
        Scene scene=sButton.getScene();
        scene.setRoot(root);
    }
    public void Intermediate(ActionEvent e) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("i.fxml"));
        Scene scene=sButton.getScene();
        scene.setRoot(root);
    }
    public void Advanced(ActionEvent e) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("a.fxml"));
        Scene scene=sButton.getScene();
        scene.setRoot(root);
    }
    public void Developer(ActionEvent e) throws IOException {
        Parent root=FXMLLoader.load(getClass().getResource("d.fxml"));
        Scene scene=sButton.getScene();
        scene.setRoot(root);
    }
    public void Exit(ActionEvent e){
        System.exit(0);
    }
}