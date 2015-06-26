package ru.matritca.logbook;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import ru.matritca.logbook.fx.fxmlcontrollers.FXMLMainController;

@SpringBootApplication
@ComponentScan(basePackages = "ru.matritca.logbook.*")
public class LogBookApplication extends AbstractJavaFxApplicationSupport{


    @Autowired
    private FXMLMainController mainController;

    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene((Parent)mainController.getView(), 1000, 700);


        //   primaryStage.setFullScreen(true);
        //  primaryStage.setResizable(false);


        //  scene.getStylesheets().add("/styles/fxmlschema.css");
        primaryStage.setScene(scene);
        primaryStage.setTitle("Logbook client");
        primaryStage.show();

    }

    public static void main(String[] args) {
        launchApp(LogBookApplication.class, args);
    }
}
