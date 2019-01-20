
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list = new LinkedList();
		
		list.insert(1);
		list.insert(2);
		list.insertAtStart(0);
		list.insertAt(1, 5);
		list.insertAt(2, 3);
		list.deleteAt(0);
		list.deleteAt(1);
		list.show();
	}

}
