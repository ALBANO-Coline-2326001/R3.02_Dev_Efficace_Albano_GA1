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
    }

    public void removeLast() {
        DNode last = trailer.getPrev();
        trailer.setPrev(last.getPrev());
        last.getPrev().setNext(trailer);
    }

    public void echange(DNode x, DNode y) {
        if (x == null || y == null || x == y) {
            return;
        }

        DNode xPrev = x.getPrev();
        DNode xNext = x.getNext();
        DNode yPrev = y.getPrev();
        DNode yNext = y.getNext();

            if (xPrev != null) xPrev.setNext(y);
            if (xNext != null) xNext.setPrev(y);
            if (yPrev != null) yPrev.setNext(x);
            if (yNext != null) yNext.setPrev(x);

            x.setPrev(yPrev);
            x.setNext(yNext);
            y.setPrev(xPrev);
            y.setNext(xNext);
        }

    
    public void countNodes() {
       int count = 1;
       DNode current = head;
       while (current.getNext() != head) {
           count++;
           current = current.getNext();
           }
       return count;
    }


    @Override
        public boolean equals(Object obj) {
    

}
