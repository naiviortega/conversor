package com.conversor.temperatura;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversionT {
	
	private double total;
	
	public double CelsiusFahrenheit(double temperatura) {
		total = (temperatura * 1.8) + 32;
		return RedondearValor(total);
	}
	public double FahrenheitCelsius(double temperatura) {
		total = (temperatura - 32) / 1.8;
		return RedondearValor(total);
	}
	
	public double CelsiusKelvin(double temperatura) {
		total = temperatura + 273.15;
		return RedondearValor(total);
	}
	public double KelvinCelsius(double temperatura) {
		total = temperatura - 273.15;
		return RedondearValor(total);
	}
	
	public double FahrenheitKelvin(double temperatura) {
		total = (temperatura + 459.67) / 1.8;
		return RedondearValor(total);
	}
	public double KelvinFahrenheit(double temperatura) {
		total = (temperatura * 1.8) - 459.67;
		return RedondearValor(total);
	}
	
	public double RedondearValor(double cant) {
		BigDecimal bd = new BigDecimal(cant).setScale(2, RoundingMode.HALF_UP);
		cant = bd.doubleValue();
		return cant;
	}
	
}
