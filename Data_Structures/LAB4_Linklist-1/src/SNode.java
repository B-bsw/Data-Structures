// สรวิชญ์ ทัศดร 673380065-6 sec2
public class SNode {
	private String item;
	private SNode link;

	public SNode() {link = null;}
	public SNode(String item) {
		this.item = item;
	}

	public SNode(String item,SNode link) {
		this.item = item;
		this.link = link;
	}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public SNode getLink() {
		return link;
	}
	public void setLink(SNode link) {
		this.link = link;
	}


}
