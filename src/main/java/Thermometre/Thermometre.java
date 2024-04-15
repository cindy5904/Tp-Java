package Thermometre;

public class Thermometre {
    private double temperatureKelvin;

    public enum UniteTemperature {
        KELVIN,
        CELSIUS,
        FAHRENHEIT
    }
    public Thermometre(double temperature, UniteTemperature unite) {
        switch (unite) {
            case KELVIN:
                this.temperatureKelvin = temperature;
                break;
            case CELSIUS:
                setTemperatureCelsius(temperature);
                break;
            case FAHRENHEIT:
                setTemperatureFahrenheit(temperature);
                break;
        }
    }

    public double getTemperatureKelvin() {
        return temperatureKelvin;
    }

    public void setTemperatureKelvin(double temperatureKelvin) {
        this.temperatureKelvin = temperatureKelvin;
    }

    public double getTemperatureCelsius() {
        return temperatureKelvin - 273.15;
    }

    public void setTemperatureCelsius(double temperatureCelsius) {
        this.temperatureKelvin = temperatureCelsius + 273.15;
    }

    public double getTemperatureFahrenheit() {
        return (temperatureKelvin - 273.15) * 9 / 5 + 32;
    }

    public void setTemperatureFahrenheit(double temperatureFahrenheit) {
        this.temperatureKelvin = (temperatureFahrenheit - 32) * 5 / 9 + 273.15;
    }


}
