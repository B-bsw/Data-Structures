package lab5;

public class DoubleLinked {
	DNode head,curr,prev,next;

	DoubleLinked(){
		head = new DNode();
	}

	DoubleLinked(int item){
		DNode newNode = new DNode(item);
		head = newNode;
	}

	void insertDlink(int item) {
		DNode newNode = new DNode(item);
		curr = head;
		newNode.setRLink(curr);
		curr.setLlink(newNode);
		head = newNode;
	}

	int deleteDlink(int sData) {
		boolean ans = searchData(sData);
		int status = -1;
		if (ans == true) {
			if (curr.getLlink() == null) {
				head = curr.getRLink();
				if (head != null) {
					head.setLlink(null);
				}
			} else if (curr.getRLink() == null) {
				prev.setRLink(null);
			} else {
				prev.setRLink(curr.getRLink());
				curr.getRLink().setLlink(prev);
			}
			status = 0;
		}
		return status;
	}

	boolean searchData(int sData) {
		boolean ans =  false;
		curr = head;
		while(curr != null){
			if(curr.getItem() == sData) {
				return true;
			}else {
				prev = curr;
				curr = curr.getRLink();
			}
		}
		return ans;
	}

	void printDlink() {
		System.out.println("Data in linkedlist");
		curr = head;
		while(curr.getRLink() != null) {
			System.out.print(curr.getItem() + "\t");
			curr = curr.getRLink();
		}
		System.out.println();
	}
}

