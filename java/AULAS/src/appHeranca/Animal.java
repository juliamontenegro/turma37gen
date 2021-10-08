package appHeranca;

import java.util.Scanner;

import entitiesHeranca.Cachorro;
import entitiesHeranca.Cavalo;
import entitiesHeranca.Preguica;

public class Animal {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		String aux1, aux2, aux3;
		
		Cachorro cachorro = new Cachorro ("Nick ",2);
		Cavalo cavalo = new Cavalo ("Trevor ",3);
		Preguica preguica = new Preguica ("Joaquina ",4);
		
		System.out.println("Digite o som do cachorro: ");
		aux1 = leia.next();
		
		System.out.println("Digite o som do cavalo: ");
		aux2 = leia.next();
		
		System.out.println("Digite o som da preguiça: ");
		aux3 = leia.next();
		
		cachorro.correr();
		System.out.println(" " + cachorro.getNome() + cachorro.getIdade() + " ");
		cachorro.emitirSom(aux1);
		
		cavalo.correr();
		System.out.println(" " + cavalo.getNome() + cavalo.getIdade() + " ");
		cavalo.emitirSom(aux2);
		
		preguica.subir();
		System.out.println(" " + preguica.getNome() + preguica.getIdade() + " ");
		preguica.emitirSom(aux3);
		
		
		
		
		
		
	}

}
