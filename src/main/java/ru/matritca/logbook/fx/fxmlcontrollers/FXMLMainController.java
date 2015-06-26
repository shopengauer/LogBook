package ru.matritca.logbook.fx.fxmlcontrollers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import ru.matritca.logbook.security.SecurityConfiguration;

import javax.annotation.PostConstruct;


/**
 * Created by vasiliy on 26.06.15.
 */
public class FXMLMainController {

    private Stage stage;

    @FXML
    private Button btn;

    @PostConstruct
    public void init(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                stage = new Stage();
            }
        });

        btn.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                stage.close();
                //stage.show();
            }
        });

    }


    @FXML
    private AnchorPane view;


    public AnchorPane getView() {

        return view;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }
}
