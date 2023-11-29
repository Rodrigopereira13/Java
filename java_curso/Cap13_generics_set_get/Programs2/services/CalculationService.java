package java_curso.Cap13_generics_set_get.Programs2.services;

import java.util.List;

public class CalculationService {
    public static <T extends Comparable<T>> T max(List<T> list) { //metodo max generico <T> que extende ou seja
		                                                         //  tbm pode ser um subtipo de comparable ou comparable
		
        if (list.isEmpty()) {
			throw new IllegalStateException("List can't be empty");
		} 
		
        T max = list.get(0); 
		for (T item : list) {
			if (item.compareTo(max) > 0) { //comparar item com maz e se for maior que 0
				max = item;                //colocar item na variavel max
			}
		}
		return max;
	}
}
