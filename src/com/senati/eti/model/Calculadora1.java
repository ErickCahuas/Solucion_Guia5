package com.senati.eti.model;

public class Calculadora1 {
	
	// Atributos 
	
	private float numero1;
	private float numero2;
		
	// definir metodos getters and setters 
	// Get : obtener valor del atributo
    // Set : definir un valor para el atributo 
		
		
	// Sintaxis de una Funcion   ---> Devolver un resultado
	public float getNumero1() {
		return this.numero1;
			
	}
	
	//Sintaxis de un procedimiento -----> Ejecutar un bloque de codigo
	
	public void setNumero1(float num1) { 
			
		this.numero1 = num1;
	}
		
	public float getNumero2() {
		return this.numero2;
	}
		
	public void setNumero2(float num2) {
		this.numero2 = num2;
	}
		
	// Definir los constructores 
	// Constructor: Permite iniciar los valores para 
	// los atributos de la clase
	// Sobrecarga: Dos constructores pero con diferentes sintaxis 
		
	// Constructor Vacio 
	public Calculadora1 (){
			
	}
	//Constructor con parametros de entrada
	
	public Calculadora1(float n1, float n2) {
		this.numero1 = n1;
		this.numero2 = n2;
	}
		
	// Los metodos personalizados 
		
	public float Suma() {
		return this.numero1 + this.numero2;
	}
	public float Resta() {
		return this.numero1 - this.numero2;
	}
	public float Multiplicacion() {
		return this.numero1 * this.numero2;
	}
	public float Division() {
		return this.numero1 / this.numero2;
	}
	public float Restoentero() {
		return this.numero1 % this.numero2;
	}	
}