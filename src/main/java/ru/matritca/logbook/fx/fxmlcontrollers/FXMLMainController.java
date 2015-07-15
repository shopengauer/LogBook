package ru.matritca.logbook.fx.fxmlcontrollers;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.context.SecurityContextHolder;
import ru.matritca.logbook.security.SecurityConfiguration;

import javax.annotation.PostConstruct;


/**
 * Created by vasiliy on 26.06.15.
 */
public class FXMLMainController {

    private Stage stage;

    @FXML
    private Button submitButton;

    @FXML
    private Label loginLabel;

    @FXML
    private AnchorPane view;

    @FXML
    private TextField usernameTextField;

    @FXML
    private PasswordField passwordField;

    @Autowired
    private AuthenticationManager authenticationManager;


    @PostConstruct
    public void init(){
        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                stage = new Stage();
            }
        });

        submitButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Authentication authToken = new UsernamePasswordAuthenticationToken(usernameTextField.getText(), passwordField.getText());
                try {
                    authToken = authenticationManager.authenticate(authToken);
                    SecurityContextHolder.getContext().setAuthentication(authToken);
                    loginLabel.setText("Auth OK");
                } catch (AuthenticationException e) {
                   // System.out.println("Login failure, please try again:");
                    loginLabel.setText("Login failure, please try again:");
                    return;
                }
               //root stage.close();
            }
        });

    }





    public AnchorPane getView() {

        return view;
    }

    public Stage getStage() {
        return stage;
    }

    public void setStage(Stage stage) {
        this.stage = stage;
    }

    public TextField getUsernameTextField() {
        return usernameTextField;
    }

    public PasswordField getPasswordField() {
        return passwordField;
    }
}
