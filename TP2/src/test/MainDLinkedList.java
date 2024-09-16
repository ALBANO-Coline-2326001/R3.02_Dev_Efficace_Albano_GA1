package test;

public class MainDLinkedList {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("------- EXO1 -------");
		System.out.println("--------------------");
		System.out.println("------- 6 -------");
		DNode test = new DNode(0);
		System.out.println("Test du toString de Node");
		System.out.println(test);

		System.out.println("Ajout : test appendFirst + read");
		DLinkedList list = new DLinkedList();
        list.appendFisrt(10);
        list.appendFisrt(20);
        list.appendFisrt(30);
        list.appendFisrt(40);
        System.out.println("Liste après les ajouts : ");
        list.read();

		System.out.println("supprimer au début: test appendFirst + read");
        list.removeFirst();
        System.out.println("Liste après suppression : ");
        list.read();

		System.out.println("supprimer à la fin: test appendFirst + read");
        list.removeLast();
        System.out.println("Liste après suppression : ");
        list.read();

		System.out.println("------- 7 -------");
	    System.out.println("Echange de deux noeuds");
        list.read();
        DNode node1 = list.header.getNext();
        DNode node2 = list.trailer.getPrev();
        list.echange(n1, n2);
        list.read();

        System.out.println("------- 8 -------");
        System.out.println("La fonction de la liste doublement chainées est plus rapide car elle manipule
         les références des nœuds sans avoir à parcourir la liste.
         Alors que la fonciton de la liste simplement chainé a  une complexité O(n) car elle parcourt
         la liste pour trouver les nœuds.");


        System.out.println("------- 9 -------");
        DNode node1 = new DNode(1);
        DNode node2 = new DNode(2);
        node1.setNext(node2);
        node2.setNext(node1);
        node1.setPrev(node2);
        node2.setPrev(node1);
        System.out.println("list.countNodes()");

        System.out.println("------- 10 -------");


	}
}
