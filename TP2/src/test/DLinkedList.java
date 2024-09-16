package test;

public class DLinkedList {
    private DNode header, trailer;
    private long size;

    public DLinkedList() {
        header = new DNode(0, null, null);
        trailer = new DNode(0, header, null);
        header.setNext(trailer);
        size = 0;
    }
    
    

    public DLinkedList(long size, DNode header, DNode trailer) {
		super();
		this.header = header;
		this.trailer = trailer;
		this.size = size;
	}



	public boolean isEmpty() {
        return size == 0;
    }

    
	
    public void appendFirt(int element) {
        DNode newNode = new DNode(element, header.getNext(), header);
        header.getNext().setPrev(newNode);
        header.setNext(newNode);
        size++;
    }

    
    public void appendLast(int element) {
        DNode newNode = new DNode(element, trailer, trailer.getPrev());
        trailer.getPrev().setNext(newNode);
        trailer.setPrev(newNode);
        size++;
    }
    
    
    public void read() {
        DNode current = header.getNext();
        while (current != trailer) {
            System.out.print(current.getElement() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    
    
    
    
    
    
    
    
    

}





















/*
public void update(int index, int element) {
    if (index < 0 || index >= size) {
        System.out.println("Index hors limites.");
        return;
    }

    DNode current = header.getNext(); // Commence juste après l'en-tête
    for (int i = 0; i < index; i++) {
        current = current.getNext();
    }

    current.setElement(element);
}

// Supprimer un élément à une position donnée (Delete)
public void delete(int index) {
    if (index < 0 || index >= size) {
        System.out.println("Index hors limites.");
        return;
    }

    DNode current = header.getNext(); // Commence juste après l'en-tête
    for (int i = 0; i < index; i++) {
        current = current.getNext();
    }

    current.getPrev().setNext(current.getNext());
    current.getNext().setPrev(current.getPrev());
    size--;
}

// Obtenir la taille de la liste
public long getSize() {
    return size;
}

// Méthode principale pour tester les opérations CRUD
public static void main(String[] args) {
    DLinkedList list = new DLinkedList();

    // Ajouter des éléments
    list.addLast(10);
    list.addLast(20);
    list.addLast(30);
    list.addLast(40);
    System.out.println("Liste après les ajouts : ");
    list.display();

    // Mettre à jour le deuxième élément
    list.update(1, 25);
    System.out.println("Liste après mise à jour de l'élément à l'index 1 : ");
    list.display();

    // Supprimer le troisième élément
    list.delete(2);
    System.out.println("Liste après suppression de l'élément à l'index 2 : ");
    list.display();
}*/
