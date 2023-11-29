package java_curso.Cap8_enumeracao_composicao.Program3.Progrm;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java_curso.Cap8_enumeracao_composicao.Program3.enteties.Coment;
import java_curso.Cap8_enumeracao_composicao.Program3.enteties.Post;

public class Program3 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy  HH:mm:ss");

        Coment c1 = new Coment("Have a nice trip!");
        Coment c2 = new Coment("Wow that's awesome!");
        Post p1 = new Post(sdf.parse("21/06/2018  13:05:44"),
        "Traveling to New Zeland",
        "I'm going to visit this wonderful country!",
        12);

        p1.addComent(c1);
        p1.addComent(c2);

        Coment c3 = new Coment("Good night");
		Coment c4 = new Coment("May the Force be with you");
		Post p2 = new Post(
				sdf.parse("28/07/2018 23:14:19"), 
				"Good night guys", 
				"See you tomorrow", 
				5);
		p2.addComent(c3);
		p2.addComent(c4);
		
		System.out.println(p1);
		System.out.println(p2);

    }

}
