package test;

public class DNode {
	private int element;
	private DNode next, prev;
	
	
	public DNode(int element) {
		this.element = element;
		this.next = null;
		this.prev = null;
	}


	public DNode(int element, DNode next, DNode prev) {
		super();
		this.element = element;
		this.next = next;
		this.prev = prev;
	}


	public int getElement() {
		return element;
	}


	public void setElement(int element) {
		this.element = element;
	}


	public DNode getNext() {
		return next;
	}


	public void setNext(DNode next) {
		this.next = next;
	}


	public DNode getPrev() {
		return prev;
	}


	public void setPrev(DNode prev) {
		this.prev = prev;
	}
	
	@Override
	public String toString() {
		return Integer.toString(element);
	}
	
	
	
}
