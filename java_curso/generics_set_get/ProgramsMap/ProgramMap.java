package java_curso.generics_set_get.ProgramsMap;

import java.util.Map;
import java.util.TreeMap;

public class ProgramMap {
    public static void main(String[] args) {
       
        Map<String, String> cookies = new TreeMap<>();
        cookies.put("username", "maria"); //adc key e value no Map cookies
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "99771122");
        cookies.remove("email"); //remove key 
        cookies.put("phone", "99771133");
        
        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone"));//se contem phone em cookies
        System.out.println("Phone number: " + cookies.get("phone")); //o valor da chave da key phone
        System.out.println("Email: " + cookies.get("email"));
        System.out.println("Size: " + cookies.size()); //tamanho de cookies
    
        System.out.println("ALL COOKIES:");
        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key)); //imprimindo todos as keys
        }
    }
}
