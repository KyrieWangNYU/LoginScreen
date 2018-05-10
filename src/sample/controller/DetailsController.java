package sample.controller;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;

import javax.lang.model.element.Name;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by kyrie on 5/10/18.
 */
public class DetailsController {
    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Label detailsWelcomeLabel;

    @FXML
    private Label detailsName;

    @FXML
    private Label detialsAge;

    @FXML
    private Label detailsProfession;

    @FXML
    private Hyperlink detailsWeb;

    @FXML
    private Hyperlink detailsLinkedIn;

    @FXML
    void initialize() {
        detailsLinkedIn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://www.linkedin.com/in/keheng-wang"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
        detailsWeb.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                if (Desktop.isDesktopSupported()){
                    try {
                        Desktop.getDesktop().browse(new URI("https://github.com/KyrieWangNYU"));
                    } catch (IOException e) {
                        e.printStackTrace();
                    } catch (URISyntaxException e) {
                        e.printStackTrace();
                    }
                }
            }
        });
    }
    void setName(String name, String Profession, int Age){
        detialsAge.setText("Age: " + Age);
        detailsProfession.setText("Profession: " + Profession);
        detailsWelcomeLabel.setText("Welcome " + name);
        detailsName.setText("Name: " + name);
    }
}
