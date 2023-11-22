package java_curso.c_interface.Programs3.model.entities;

import java_curso.c_interface.Programs3.model.enums.Color;

public abstract class AbstractShape implements Shape{
    private Color color;

	public AbstractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}


}
