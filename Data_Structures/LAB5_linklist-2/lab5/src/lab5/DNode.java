package lab5;

public class DNode {
	int item;
	DNode RLink;
	DNode Llink;
	DNode(){
		this.Llink = null;
		this.RLink = null;
	}
	
	DNode(int item){
		this.item = item;
		this.Llink = null;
		this.RLink = null;
	}
	
	DNode(int item , DNode RLink , DNode Llink){
		this.item = item;
		this.Llink = Llink;
		this.RLink = RLink;
	}
	public int getItem() {
		return item;
	}
	public void setItem(int item) {
		this.item = item;
	}
	public DNode getRLink() {
		return RLink;
	}
	public void setRLink(DNode rLink) {
		RLink = rLink;
	}
	public DNode getLlink() {
		return Llink;
	}
	public void setLlink(DNode link) {
		this.Llink = link;
	}
	
}
