package java_curso.generics_set_get.ProgramsMap;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class ProgramMap1 {
    public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);

		Map<String, Integer> votes = new LinkedHashMap<>();

		System.out.print("Enter file full path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			String line = br.readLine();
			while (line != null) {
				
				String[] fields = line.split(","); //separar por virgula
				String name = fields[0]; //pegar name
				int count = Integer.parseInt(fields[1]); //pegar o numero de votos

				if (votes.containsKey(name)) { //se contem o msm nome 
					int votesSoFar = votes.get(name); // armazenar o numero do msm nome
					votes.put(name, count + votesSoFar); // soma o numero de voto com a somatiria
				}
				else {
					votes.put(name, count);
				}
				
				line = br.readLine();
			}
			
			for (String key : votes.keySet()) {
				System.out.println(key + ": " + votes.get(key));
			}
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
