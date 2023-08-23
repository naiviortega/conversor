package com.conversor.moneda;

import javax.swing.*;

import com.conversor.vista.ConversorMenu;

public class Moneda {

	private String[] monedas;
	private double total;
	private ConversionM conversion = new ConversionM();
	
	/**
	 * Instancia una interfaz con las opciones de conversion de moneda disponibles, muestra su resultado y permite seguirlo utilizando
	 * las veces que se necesite o requiera
	 * @param monto
	 */

	public Moneda(double monto) {
		monedas = new String[] { "De Pesos a Dólar", "De Pesos a Euros", "De Pesos a Libras", "De Pesos a Yen",
				"De Pesos a Won Coreano", "De Dólar a Pesos", "De Euros a Pesos", "De Libras a Pesos", "De Yen a Pesos",
				"De Won Coreano a Pesos" };

		String s = (String) JOptionPane.showInputDialog(null, "Seleccione el tipo de moneda a convertir", "Monedas",
				JOptionPane.PLAIN_MESSAGE, null, monedas, monedas[0]);

		switch (s) {
		case "De Pesos a Dólar":
			total = conversion.PesosDolar(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Dolares");
			break;
		case "De Pesos a Euros":
			total = conversion.PesosEuro(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Euros");
			break;
		case "De Pesos a Libras":
			total = conversion.PesosLibra(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Libras");
			break;
		case "De Pesos a Yen":
			total = conversion.PesosYen(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Yenes");
			break;
		case "De Pesos a Won Coreano":
			total = conversion.PesosWon(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Wones");
			break;
		case "De Dólar a Pesos":
			total = conversion.DolarPesos(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
			break;
		case "De Euros a Pesos":
			total = conversion.EuroPesos(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
			break;
		case "De Libras a Pesos":
			total = conversion.LibraPesos(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
			break;
		case "De Yen a Pesos":
			total = conversion.YenPesos(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
			break;
		case "De Won Coreano a Pesos":
			total = conversion.WonPesos(monto);
			JOptionPane.showMessageDialog(null, "Tienes $" + total + " Pesos");
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
