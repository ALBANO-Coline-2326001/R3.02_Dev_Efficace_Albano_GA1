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

		System.out.println("Ajout au début: test appendFirst + read");
		DLinkedList list = new DLinkedList();
        list.appendFirt(10);
        list.appendFirt(20);
        list.appendFirt(30);
        list.appendFirt(40);
        System.out.println("Liste après les ajouts : ");
        list.read();

		System.out.println("Ajout à la fin : test appendLast + read");
        list.appendFirt(10);
        list.appendFirt(20);
        list.appendFirt(30);
        list.appendFirt(40);
        System.out.println("Liste après les ajouts : ");
        list.read();

		
		
	}
}
