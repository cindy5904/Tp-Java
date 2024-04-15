package Thermometre;

public class Main {
    public static void main(String[] args) {
        Thermometre thermometre1 = new Thermometre(20, Thermometre.UniteTemperature.CELSIUS);
        Thermometre thermometre2 = new Thermometre(20, Thermometre.UniteTemperature.FAHRENHEIT);

        System.out.println("Température en Kelvin: " + thermometre1.getTemperatureKelvin());
        System.out.println("Température en Celsius: " + thermometre1.getTemperatureCelsius());
        System.out.println("Température en Fahrenheit: " + thermometre1.getTemperatureFahrenheit());

        thermometre1.setTemperatureFahrenheit(123);
        System.out.println("Après conversion");

        System.out.println("Température en Kelvin: " + thermometre1.getTemperatureKelvin());
        System.out.println("Température en Celsius: " + thermometre1.getTemperatureCelsius());
        System.out.println("Température en Fahrenheit: " + thermometre1.getTemperatureFahrenheit());

        System.out.println("----------------------");

        System.out.println("Température en Kelvin : " + thermometre2.getTemperatureKelvin());
        System.out.println("Température en Celsius : " + thermometre2.getTemperatureCelsius());
        System.out.println("Température en Fahrenheit : " + thermometre2.getTemperatureFahrenheit());

    }
}
