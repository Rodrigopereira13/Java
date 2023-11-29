package java_curso.Cap4_orientacao_objetos.dolar_reais;

public class CurrencyConverter {

    public static double IOF = 0.06; //static pq é fixo
    
    public static double converter(double montante, double dolarprice){
        return montante * dolarprice * (1 + IOF);
    }
    
}
