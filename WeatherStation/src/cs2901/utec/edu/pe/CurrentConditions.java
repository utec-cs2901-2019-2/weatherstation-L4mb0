package cs2901.utec.edu.pe;

public class CurrentConditions implements Observer, DisplayElement {
	private float temperature;
 	private float humidity;
 	private Subject weatherData;
 
 	public CurrentConditions(Subject weatherData) {
  		this.weatherData = weatherData;
  		weatherData.registerObserver(this);
 	}
 
 	public void update(float temperature, float humidity, float pressure) {
  		this.temperature = temperature;
  		this.humidity = humidity;
  		display();
 	}
 
 	public void display() {
  		System.out.println("Current conditions: " + temperature 
   		+ "C degrees and " + humidity + "% humid UWU");
 	}
    
}
