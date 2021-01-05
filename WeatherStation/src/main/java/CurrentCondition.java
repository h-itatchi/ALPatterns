import javafx.application.Platform;
import javafx.scene.control.Label;

public class CurrentCondition extends Display {

    public Label temperature;
    public Label humidity;
    public Label pressure;

    public CurrentCondition(WeatherData weatherData) {
        super(weatherData);
        this.setFxmlPath("/currentWeather.fxml");
        update();
    }

    @Override
    public void update() {
        super.update();
        double temp=weatherData.getTemperature();
        double hum=weatherData.getHumidity();
        double pres=weatherData.getPressure();
        Platform.runLater(() -> {
            temperature.setText("Temperature : " + temp + " C°");
            humidity.setText("Humidity : " + hum + " %");
            pressure.setText("Pressure : " + pres + " Hg");
        });
    }
}
