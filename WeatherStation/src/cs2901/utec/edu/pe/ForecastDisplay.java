public class ForecastDisplay implements Observer, DisplayElement{
	private float currentPressure = 30.00f;
	private float lastPressure;
	private WeatherData weatherData;

	public ForecastDisplay (WeatherData weatherData){
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	public void update(float temp, float humidity, float pressure) {
                lastPressure = currentPressure;
  		currentPressure = pressure;
  		display();
 	}

	public void display() {
  	System.out.print("This is the UWU forecast: ");
  		if (currentPressure > lastPressure) {
   			System.out.println("Good weather comming up UWU");
  		} else if (currentPressure == lastPressure) {
   			System.out.println("Same weather UWU");
  		} else if (currentPressure < lastPressure) {
   			System.out.println("Getting colder OWO");
  		}
 	}
}
