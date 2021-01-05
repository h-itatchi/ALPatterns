import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public abstract class Display extends AnchorPane implements Observer, IDisplay {

    protected WeatherData weatherData;
    private String fxmlPath;
    private Stage stage;

    public Display(WeatherData weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update() {
        //
    }

    @Override
    public void display() {
        LoadFXML();
        stage = new Stage();
        Scene scene = new Scene(this);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.setOnHidden((e) -> {
            System.exit(0);
        });
        stage.show();
    }

    private void LoadFXML() {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(fxmlPath));
        fxmlLoader.setRoot(this);
        fxmlLoader.setController(this);
        try {
            fxmlLoader.load();
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    public void setFxmlPath(String fxmlPath) {
        this.fxmlPath = fxmlPath;
    }
}
