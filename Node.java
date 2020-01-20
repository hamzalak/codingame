package game.code;
import java.util.*  ; 
import java.math.*; 
class Node {
	Node left, right;
	Integer value ;
public Node(int num) {
	this.value = num;
}

public Node() {
	
}
public static List<Node> affectNode(Node node){
	ArrayList<Node> nodeList = new ArrayList<>() ;
    node.left = new Node((int)Math.random()*100) ; 	
    node.right = new Node((int)Math.random()*100) ; 	
	nodeList.add(node.left) ; 
	nodeList.add(node.right) ; 
	return nodeList ; 
}
public static Node createNode(Integer number) {
  return new Node(number);
}
public Node find(int value) {
	if(this.value == value) {
	return this;
}
else if(value < this.value)
	if(this.left != null)
	 return this.left.find(value);
	else return new Node();
else
    if(this.right != null)
      return this.right.find(value);
    else return new Node();
}
public static void main(String[] args) {
	 Node node = createNode(9);
		Node n2 = node.left = createNode(7);
		Node n3 = node.right = createNode(13);
		n3.left = null;
		Node n4 = n2.left = createNode(5);
		Node n5 = n2.right = createNode(8);
		n5.left = n5.right = null;
		Node n6 = n3.right = createNode(17);
		Node n7 = n4.left = createNode(2);
		Node n8 = n4.right = createNode(6);Node n9 = n6.left = createNode(16);
		n6.right = null;
		n7.left = n7.right = n8.left = n8.right =n9.left = n9.right = null;
	    Node n = node.find(41);
	//if(n==null)
	//else
 	  System.out.println("find returns " +n.value);


}
}
