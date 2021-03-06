package ru.matritca.logbook.fx.fxmlconfigs;



import javafx.fxml.FXMLLoader;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import ru.matritca.logbook.fx.fxmlcontrollers.FXMLAppController;
import ru.matritca.logbook.fx.fxmlcontrollers.FXMLMainController;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by vasiliy on 15.06.15.
 */
@Configuration
public class FXMLControllersConfig {

    private Logger logger = LoggerFactory.getLogger(FXMLMainController.class);

    @Bean
    public FXMLMainController fxmlController() throws IOException {
        return (FXMLMainController) loadController("/fxmlschemas/FXMLMainSchema.fxml");
    }

    @Bean
    public FXMLAppController fxmlAppController() throws IOException {
        return (FXMLAppController) loadController("/fxmlschemas/FXMLAppSchema.fxml");
    }

    protected Object loadController(String url) throws IOException {
        try
                (InputStream fxmlStream = getClass().getResourceAsStream(url)) {
            FXMLLoader loader = new FXMLLoader();
            loader.load(fxmlStream);
            return loader.getController();
        }
    }


//    @Bean
//    @Qualifier(value = "comPortConfigStage")
//    public Stage createComPortConfigStage(){
//        return new Stage();
//    }


}
