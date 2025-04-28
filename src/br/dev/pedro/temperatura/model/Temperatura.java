package br.dev.pedro.temperatura.model;

public class Temperatura {
	private double celsius;

	public double getCelsius() {
		return celsius;

	}

	public void setCelsius(double celsius) {

		this.celsius = celsius;
	}

	public double converterParaKelvin() {
		double kelvin = celsius + 273;
		return kelvin;
	}

	public double converterParaFahrenheit() {
		double fahrenheit = (celsius * 1.8) + 32;
		return fahrenheit;
	}

}