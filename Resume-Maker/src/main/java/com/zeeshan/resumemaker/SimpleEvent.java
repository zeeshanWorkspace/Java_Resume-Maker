package com.zeeshan.resumemaker;

import com.itextpdf.text.Document;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.PdfWriter;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URL;
import java.nio.file.Path;
import java.util.ResourceBundle;
import javafx.scene.layout.GridPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;
public class SimpleEvent implements Initializable {
    FileChooser fileChooser;
    @FXML
    private GridPane panel;
    @FXML
    private Label name,field,phone,email,website,aboutme,skills,projects,education,experience,languages,hobby;
    @FXML
    private TextField fnf,ff,pnf,emf,wf;
    @FXML
    private TextArea aboa,skia,proa,edua,expa,lana,hoba;
    @FXML
    private Button backButton,exitButton;
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
    public void Update(ActionEvent e){
        name.setText(fnf.getText());
        field.setText(ff.getText());
        phone.setText(pnf.getText());
        email.setText(emf.getText());
        website.setText(wf.getText());
        aboutme.setText(aboa.getText());
        skills.setText(skia.getText());
        projects.setText(proa.getText());
        education.setText(edua.getText());
        experience.setText(expa.getText());
        languages.setText(lana.getText());
        hobby.setText(hoba.getText());
    }
    public void Newfile(ActionEvent e)throws Exception{
        Parent root=FXMLLoader.load(getClass().getResource("s.fxml"));
        Scene scene=backButton.getScene();
        scene.setRoot(root);
    }
    public void PDFsave(ActionEvent e){

        fileChooser=new FileChooser();
        fileChooser.setTitle("Save PDF");

        File file=fileChooser.showSaveDialog(null);

        Path path=Path.of(String.valueOf(file));

        System.out.println(path);
        Click s=new Click();

        // * * * * * * * * * *

        Document document=new Document(PageSize.B4, 0, 0, 50, 0);
        try {
            PdfWriter.getInstance(document, new FileOutputStream(path+".pdf"));
            document.open();

            Image imageRight = Image.getInstance("Data\\file.view.temp");
            imageRight.setAlignment(imageRight.ALIGN_CENTER);

            document.add(imageRight);

            Alert a=new Alert(Alert.AlertType.INFORMATION);
            a.setHeaderText(null);
            a.setContentText("Your PDF has been created...!");
            a.setTitle("PDF Created...!");
            a.show();
        }
        catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
        document.close();
    }
    public void Back(ActionEvent e)throws Exception{
        Alert a=new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Back?");
        a.setHeaderText(null);
        a.setContentText("Are you sure to go 'BACK'?\nPlease save your work.");
        if(a.showAndWait().get().equals(ButtonType.OK)){
            Parent root= FXMLLoader.load(getClass().getResource("theme.fxml"));
            Scene scene=backButton.getScene();
            scene.setRoot(root);
        }
        a.show();
    }
    public void Exit(ActionEvent e){
        Alert a=new Alert(Alert.AlertType.CONFIRMATION);
        a.setTitle("Exit?");
        a.setHeaderText(null);
        a.setContentText("Are you sure to 'EXIT'?\nPlease save your work.");
        if(a.showAndWait().get().equals(ButtonType.OK)){
            Stage stage=(Stage) exitButton.getScene().getWindow();
            stage.close();
        }
        a.show();
    }
}
