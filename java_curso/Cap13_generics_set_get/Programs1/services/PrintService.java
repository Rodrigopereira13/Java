package java_curso.Cap13_generics_set_get.Programs1.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> { //coloca na classe <> para falar que é generico
    private List<T> list = new ArrayList<>(); //lista generica

	public void addValue(T value) { //adicionar o valor na list
		list.add(value);
	}

	public T first() {  //metodo first para retornar o primeiro elemento
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {   //printar 
		System.out.print("[");
		if (!list.isEmpty()) {
			System.out.print(list.get(0));
		}
		for (int i = 1; i < list.size(); i++) {
			System.out.print(", " + list.get(i));
		}
		System.out.println("]");
	}
}
