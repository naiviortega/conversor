package com.conversor.temperatura;

import javax.swing.*;

import com.conversor.vista.ConversorMenu;

public class Temperatura {
	
	private String[] temperaturas;
	private double total;
	private ConversionT conversion = new ConversionT();
	
	public Temperatura(double temperatura) {
		temperaturas = new String[] {"Convertir de Celsius a Fahrenheit", "Convertir de Celsius a Kelvin", 
				"Convertir de Fahrenheit a Celsius", "Convertir de Fahrenheit a Kelvin", "Convertir de Kelvin a Celsius", 
				"Convertir de Kelvin a Fahrenheit"};
		
		String s = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de temperatura a convertir", "Temperaturas",
				JOptionPane.PLAIN_MESSAGE, null, temperaturas, temperaturas[0]);
		
		switch (s) {
		case "Convertir de Celsius a Fahrenheit":
			total = conversion.CelsiusFahrenheit(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "ºF");
			break;
		case "Convertir de Celsius a Kelvin":
			total = conversion.CelsiusKelvin(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "K");
			break;
		case "Convertir de Fahrenheit a Celsius":
			total = conversion.FahrenheitCelsius(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "ºC");
			break;
		case "Convertir de Fahrenheit a Kelvin":
			total = conversion.FahrenheitKelvin(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "K");
			break;
		case "Convertir de Kelvin a Celsius":
			total = conversion.KelvinCelsius(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "ºC");
			break;
		case "Convertir de Kelvin a Fahrenheit":
			total = conversion.KelvinFahrenheit(temperatura);
			JOptionPane.showMessageDialog(null, "La temperatura es " + total + "ºF");
			break;
		default:
			break;
		}

		int n = JOptionPane.showConfirmDialog(null, "¿Desea continuar?",
				"Seleccione una opcion", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null);
		
		if (n == 0) {
			ConversorMenu vista = new ConversorMenu();
		} else {
			JOptionPane.showMessageDialog(null, "Programa Terminado");
		}
	}
	
}
