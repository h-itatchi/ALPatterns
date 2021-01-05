import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        // Data
        WeatherData weatherData = new WeatherData();
        // Observers
        Display currentCondition = new CurrentCondition(weatherData);
        Display statistics = new Statistics(weatherData);
        // Display
        currentCondition.display();
        statistics.display();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
