package test;

public class MainDLinkedList {
	public static void main(String[] args) {
		System.out.println("--------------------");
		System.out.println("------- EXO1 -------");
		System.out.println("--------------------");
		System.out.println("------- 1 -------");
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
		
	}
}
