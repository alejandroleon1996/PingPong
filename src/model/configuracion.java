package model;

public class configuracion {
	
	public int altura;
	public int velocidad;
	public String color;
	
	public configuracion(int altura, int velocidad, String color) {
		this.altura = altura;
		this.velocidad = velocidad;
		this.color = color;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(int velocidad) {
		this.velocidad = velocidad;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
}
