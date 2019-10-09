public class WeatherStation{
	public static void main(String[] args) {
  		WeatherData weatherData = new WeatherData();
 
  		CurrentConditions currentDisplay = new CurrentConditions(weatherData);
  		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
  		ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

  		weatherData.setMeasurements(20, 65, 30.4f);
  		weatherData.setMeasurements(18, 70, 29.2f);
  		weatherData.setMeasurements(26, 90, 29.2f);
 	}
}
