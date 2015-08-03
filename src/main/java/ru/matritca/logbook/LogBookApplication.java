package ru.matritca.logbook;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import org.hibernate.annotations.Proxy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ru.matritca.logbook.fx.fxmlcontrollers.FXMLMainController;

import javax.annotation.PostConstruct;

@SpringBootApplication
@ComponentScan(basePackages = "ru.matritca.logbook.*")
public class LogBookApplication extends AbstractJavaFxApplicationSupport{

    @Autowired
    private FXMLMainController mainController;


    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene((Parent)mainController.getView(), 388, 262);

        Stage  stage = mainController.getStage();
        stage.setResizable(false);
        stage.initStyle(StageStyle.UTILITY);
        stage.setScene(scene);
        stage.setIconified(true);
      //  stage.ic
        stage.setTitle("Аккаунт");
        stage.show();

    }

    public static void main(String[] args) {
        launchApp(LogBookApplication.class, args);
    }
}
