package test;
import test.Node;

public class MyClass {

		public static void main(String[] args) {
			System.out.println("--------------------");
			System.out.println("------- EXO1 -------");
			System.out.println("--------------------");
			System.out.println("------- 1 -------");
			Node test = new Node(1);
			System.out.println("Test du toString de Node");
			System.out.println(test);

			System.out.println("Ajout de 1 : test append + read");
			SLinkedList liste = new SLinkedList(test);
			liste.append(2);
			liste.read();
			
			System.out.println("Suppression de 1 : test delete + read");
			liste.delete(0);
			liste.read();
			
			System.out.println("Update de 1 : test update + read");
			liste.append(2);
			liste.append(3);
			liste.update(0,1);
			liste.read();
			
			System.out.println("------- 2 -------");
			System.out.println("insereDebut 0");
			Node debut = new Node(0);
			liste.insereDebut(debut);
			liste.read();
			
			
			System.out.println("------- 3 -------");
			System.out.println("avantDernier");
			liste.read();
			liste.avantDernier();
			
			
			System.out.println("------- 4 -------");
			System.out.println("Reverse");
			liste.reverse();
			liste.read();
			
			System.out.println("------- 5 -------");
			System.out.println("echange");
			liste.echange(3,2);
			liste.read();

			
		}
}
