package com.conversor.moneda;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversionM {
	
	private double total;
	private double pesos;
	private double dolar;
	private double euro;
	private double libra;
	private double yen;
	private double won;
	
	/**
	 * Metodos utilizados para la conversion de las distintas monedas disponibles, devolviendo el resultado de la conversion por
	 * la cantidad ingresada con anterioridad
	 * @param monto
	 * @return
	 */
	
	public double PesosDolar(double monto) {
		dolar = 0.059;
		total = monto*dolar;
		return RedondearValor(total);
	}
	public double DolarPesos(double monto) {
		pesos = 16.91;
		total = pesos*monto;
		return RedondearValor(total);
	}
	
	public double PesosEuro(double monto) {
		euro = 0.055;
		total = monto*euro;
		return RedondearValor(total);
	}
	public double EuroPesos(double monto) {
		pesos = 18.34;
		total = pesos*monto;
		return RedondearValor(total);
	}
	
	public double PesosLibra(double monto) {
		libra = 0.046;
		total = monto*libra;
		return RedondearValor(total);
	}
	public double LibraPesos(double monto) {
		pesos = 21.53;
		total = pesos*monto;
		return RedondearValor(total);
	}
	
	public double PesosYen(double monto) {
		yen = 8.62;
		total = monto*yen;
		return RedondearValor(total);
	}
	public double YenPesos(double monto) {
		pesos = 0.12;
		total = pesos*monto;
		return RedondearValor(total);
	}
	
	public double PesosWon(double monto) {
		won = 79.42;
		total = monto*won;
		return RedondearValor(total);
	}
	public double WonPesos(double monto) {
		pesos = 0.013;
		total = pesos*monto;
		return RedondearValor(total);
	}
	
	public double RedondearValor(double cant) {
		BigDecimal bd = new BigDecimal(cant).setScale(2, RoundingMode.HALF_UP);
		cant = bd.doubleValue();
		return cant;
	}
	
}
