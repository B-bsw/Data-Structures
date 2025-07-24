// สรวิชญ์ ทัศดร 673380065-6 sec2
import java.util.ArrayList;
import java.util.List;

public class SLinkStack {
	SNode head,curr,prev;

	SLinkStack(){
		head = new SNode();
	}

	SLinkStack(String item){
		SNode newNode = new SNode(item);
		head = newNode;
	}

	public void pushSLink(String item) {
		SNode newNode = new SNode(item);
		curr = head;
		newNode.setLink(curr);
		head = newNode;
	}

	public String popSLink() {
		String item = "-1";
		if(head != null) {
			curr = head;
			item = curr.getItem();
			head = curr.getLink();
		}
		return item;
	}

	public int getTop() {
		int  top = 0;
		if(head.getItem() == null) {
			top = -1;
		}
		return top;
	}


}
