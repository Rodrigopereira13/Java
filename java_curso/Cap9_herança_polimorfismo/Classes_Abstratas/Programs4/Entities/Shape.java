package java_curso.Cap9_herança_polimorfismo.Classes_Abstratas.Programs4.Entities;

import java_curso.Cap9_herança_polimorfismo.Classes_Abstratas.Programs4.Entities.enums.Color;

public abstract class Shape {
    
    private Color color;
	
	public Shape() {
	}
	
	public Shape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public abstract double area();
}
