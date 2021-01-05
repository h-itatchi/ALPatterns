import javafx.application.Platform;
import javafx.scene.control.Label;

public class Statistics extends Display{

    public Label avgTemp;
    public Label minTemp;
    public Label maxTemp;

    private double avg,min,max;

    public Statistics(WeatherData weatherData) {
        super(weatherData);
        this.setFxmlPath("/statisticWeather.fxml");
        avg= weatherData.getTemperature();
        min=avg;
        max=avg;
        update();
    }

    @Override
    public void update() {
        super.update();
        double temp=weatherData.getTemperature();
        avg=(avg+temp)/2;
        min= Math.min(min, temp);
        max=Math.max(max,temp);
        Platform.runLater(()->{
            avgTemp.setText("AVG Temperature : "+String.format("%.2f", avg)+"C°");
            minTemp.setText("Min Temperature : "+min+"C°");
            maxTemp.setText("Max Temperature : "+max+"C°");
        });
    }
}
