import java.util.ArrayList;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherData implements Observable {

    private ArrayList<Observer> observers = new ArrayList<>();

    public WeatherData() {
        Timer timer = new Timer();
        timer.schedule(new TimerTask() {
            public void run() {
                notifyObservers();
            }
        }, 0, 3 * 1000);
    }

    public double getTemperature() {
        return (new Random().nextInt(40));
    }

    public double getHumidity() {
        return (new Random().nextInt(70)) + 20;
    }

    public double getPressure() {
        return (new Random().nextInt(4)) + 27;
    }

    @Override
    public void addObserver(Observer observer) {
        if (!observers.contains(observer)) {
            observers.add(observer);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        observers.forEach(o -> o.update());
    }
}
