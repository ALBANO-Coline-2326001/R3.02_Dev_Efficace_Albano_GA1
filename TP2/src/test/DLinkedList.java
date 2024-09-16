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

    
	
    public void appendFisrt(int element) {
        DNode newNode = new DNode(element, header.getNext(), header);
        header.getNext().setPrev(newNode);
        header.setNext(newNode);
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

    public void removeFirst() {
        DNode first = header.getNext();
        header.setNext(first.getNext());
        first.getNext().setPrev(header);
        size--;
    }

    public void removeLast() {
        DNode last = trailer.getPrev();
        trailer.setPrev(last.getPrev());
        last.getPrev().setNext(trailer);
        size--;
    }
    
    
    
    
    
    

}
