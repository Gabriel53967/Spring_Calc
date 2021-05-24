package com.daniel;

public class Calculadora {
	private float num1;
	private float num2;
	private char operador;
	private float resultado;
	
	
	public float getNum1() {
		return num1;
	}
	public void setNum1(float num1) {
		this.num1 = num1;
	}
	public float getNum2() {
		return num2;
	}
	public void setNum2(float num2) {
		this.num2 = num2;
	}
	public char getOperador() {
		return operador;
	}
	public void setOperador(char operador) {
		this.operador = operador;
	}
	public float getResultado() {
		return resultado;
	}
	public void setResultado(float resultado) {
		this.resultado = resultado;
	}
	
	public void Calcular() 
	{
		switch(operador) {
		case '+':
			resultado = num1+num2;
			break;
		case '-':
			resultado = num1-num2;
			break;
		case '*':
			resultado = num1*num2;
			break;
		case '/':
			resultado = num1/num2;
			break;
		default:
			break;
		}
	}

}
