import java.util.*;

public class WeatherData implements Subject {
	public ArrayList<Observer> obs;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){
		obs = new ArrayList<>();
	}

	void registerObserver (Observer o){
		obs.add(o);
	}

	void removeObserver(Observer o){
		int i = obs.indexOf(o);
  		if (i >= 0) {
   			obs.remove(i);
  		}
	}

	public void notifyObservers() {
  		for (int i = 0; i < obs.size(); i++) {
   			Observer obs = (Observer)obs.get(i);
   			obs.update(temperature, humidity, pressure);
  		}
 	}

	public void measurementsChanged() {
  		notifyObservers();
 	}
 
 	public void setMeasurements(float temperature, float humidity, float pressure) {
  		this.temperature = temperature;
  		this.humidity = humidity;
  		this.pressure = pressure;
  		measurementsChanged();
 	}
 
 	public float getTemperature() {
  		return temperature;
	}
 
	public float getHumidity() {
  		return humidity;
 	}
 
 	public float getPressure() {
  		return pressure;
 	}

}
