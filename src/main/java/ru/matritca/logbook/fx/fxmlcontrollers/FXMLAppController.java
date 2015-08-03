package ru.matritca.logbook.fx.fxmlcontrollers;

import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;

import javax.annotation.PostConstruct;
import java.security.Principal;

/**
 * Created by Vasiliy on 30.07.2015.
 */
public class FXMLAppController {


    private Stage stage;

    @FXML
    private AnchorPane appAnchor;

    @FXML
    private Label userNameLabel;

    @Autowired
    private Authentication authentication;


    @PostConstruct
    public void init() {

        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                stage = new Stage();
            }
        });
//        authentication = SecurityContextHolder.getContext().getAuthentication();
//       userNameLabel.setText(authentication.getPrincipal().toString());


    }


    public Stage getStage() {
        return stage;
    }

    public void startApp(){
        Scene scene = new Scene((Parent)appAnchor, 600, 700);

        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.setTitle("Электронный формуляр");
        stage.show();
        authentication = SecurityContextHolder.getContext().getAuthentication();
        userNameLabel.setText(authentication.getName() + authentication.getAuthorities().toArray()[0]);
    }

}
