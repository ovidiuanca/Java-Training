/**
 * User:    ovidiu
 * Package: BinaryTree
 * Date:    2/22/16
 * Time:    3:40 PM
 */
public class Main {
    public static void main(String[] args){
        BinaryTree MyTree = new BinaryTree();

        MyTree.addNode(20);
        MyTree.addNode(10);
        MyTree.addNode(30);
        MyTree.addNode(12);
        MyTree.addNode(29);
        MyTree.addNode(88);
        MyTree.addNode(33);
        MyTree.displayTree();
    }
}
