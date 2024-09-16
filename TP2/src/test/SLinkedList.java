package test;

public class SLinkedList {
	private Node head;
	private long size;
	

	public SLinkedList() {
		head = null;
		size = 0;
	}


	public SLinkedList(Node head) {
		super();
		this.head = head;
	}


	public SLinkedList(Node head, long size) {
		super();
		this.head = head;
		this.size = size;
	}
	

	
	
	public void insereDebut(Node node) {
		if (head != node) {
			node.setNext(head);
			head = node;
		}
			
		
	}
	
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }


    public void read() {
        Node current = head;       
        String affichage = head.toString();
    	while (current.getNext() != null) {
    		current = current.getNext();
    		affichage = affichage + ", "+ current;
    	}
    	System.out.println(affichage + '\n');
    }
    
    
    public boolean update(int index, int data) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                current.setElement(data);
                return true;
            }
            current = current.getNext();
            count++;
        }
        return false; 
    }

    
   
    
    public boolean delete(int index) {
        if (head == null) {
            return false;
        }

        if (index == 0) {
            head = head.getNext();
            return true;
        }

        Node current = head;
        Node avant = null;
        int count = 0;

        while (current != null) {
            if (count == index) {
                if (avant != null) {
                    avant.setNext(current.getNext());
                }
                return true;
            }
            avant = current;
            current = current.getNext();
            count++;
        }
        return false; 
    }
    
    public void avantDernier() {
        if (head == null) {
            System.out.println("Liste vide");;
        }

        if (head.getNext() == null) {
            head = head.getNext();
            System.out.println("Liste contenant un seul indice");;
        }
        
    	Node avant = head;
        Node current = head.getNext();
        while (current != null) {
        	current = current.getNext();
        	if (current != null) {
        		avant = avant.getNext();
        	}
        }
        System.out.println(avant);
    }
    
    
    public void reverse() {
        Node avant = null;
        Node current = head;
        Node next = null;
        
        while (current != null) {
            next = current.getNext(); 
            current.setNext(avant); 
            avant = current;
            current = next; 
            head = avant;
        }
	}
    

    public void echange(int echange1,int echange2) {
		Node newNode=head;

		
		while(newNode.getNext()!=null) {
			if(newNode.getElement()==echange1) {
				newNode.setElement(echange2);
				newNode=newNode.getNext();
			}
			if(newNode.getElement()==echange2) {
				newNode.setElement(echange1);
				newNode=newNode.getNext();
			}
			newNode=newNode.getNext();
		}
	}
    
    
    
    
}






























/*

public class LinkedList {
    private Node head;

    public LinkedList() {
        this.head = null;
    }

    // Ajouter un élément à la fin (Create)
    public void append(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Lire la liste (Read)
    public void display() {
        if (head == null) {
            System.out.println("La liste est vide");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();

        // Ajouter des éléments
        ll.append(1);
        ll.append(2);
        ll.append(3);

        // Lire la liste
        System.out.println("Liste après ajout :");
        ll.display();

        // Mettre à jour un élément
        ll.update(1, 5);
        System.out.println("Liste après mise à jour de l'index 1 :");
        ll.display();

        // Supprimer un élément
        ll.delete(0);
        System.out.println("Liste après suppression de l'index 0 :");
        ll.display();
    }
}
*/