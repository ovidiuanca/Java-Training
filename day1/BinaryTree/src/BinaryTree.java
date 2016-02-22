import java.util.Stack;

/**
 * User:    ovidiu
 * Package: BinaryTree
 * Date:    2/22/16
 * Time:    2:42 PM
 */
public class BinaryTree {
    private Node root;

    BinaryTree(){
        root = null;
    }
    public void addNode(int value){
        Node newNode = new Node();
        newNode.data = value;
        if (root == null)
            root = newNode;
        else {
            Node current = root;
            Node parent;
            while (current != null){
                parent = current;
                if (value < current.data) {
                    current = current.left;
                    if (current == null) {
                        parent.left = newNode;
                    }
                } else {
                    current = current.right;
                    if (current == null) {
                        parent.right = newNode;
                    }
                }
            }
        }
    } // end addNode function

    public Node getSuccessor(Node delNode) {
        Node successorParent = delNode;
        Node successor = delNode;
        Node current = delNode.right;
        while (current != null) {
            successorParent = successor;
            successor = current;
            current = current.left;
        }
        if (successor != delNode.right) {
            successorParent.left = successor.right;
            successor.right = delNode.right;
        }
        return successor;
    }

    public void delete(int value) // delete node with given value
    {                           // (assumes non-empty list)
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;

        while(current.data != value) {
            parent = current;
            if(value < current.data) {
                isLeftChild = true;
                current = current.left;
            } else {
                isLeftChild = false;
                current = current.right;
            }
            if(current == null)
                return;
        }
        // if no children, delete it
        if(current.left == null &&
                current.right == null)
        {
            if(current == root)
                root = null;
            else if(isLeftChild)
                parent.left = null;
            else
                parent.right = null;
        }

        // if no right child, replace with left subtree
        else if(current.right == null)
            if(current == root)
                root = current.left;
            else if(isLeftChild)
                parent.left = current.left;
            else
                parent.right = current.left;

        else if(current.left == null)
            if(current == root)
                root = current.right;
            else if(isLeftChild)
                parent.left = current.right;
            else
                parent.right = current.right;

        else {
            Node successor = getSuccessor(current);

            if(current == root)
                root = successor;
            else if(isLeftChild)
                parent.left = successor;
            else
                parent.right = successor;
            successor.left = current.left;
        }
        return;
    }

    public void traverseAndPrint(Node node){
        if (node != null) {
            traverseAndPrint(node.left);
            node.printNode();
            traverseAndPrint(node.right);
        }
    }

    public void displayTree(){
            Stack globalStack = new Stack();
            globalStack.push(root);
            int nBlanks = 32;
            boolean isRowEmpty = false;
            System.out.println("......................................................");
            while(isRowEmpty == false)
            {
                Stack localStack = new Stack();
                isRowEmpty = true;

                for(int j = 0; j < nBlanks; j++)
                    System.out.print(' ');

                while(globalStack.isEmpty() == false) {
                    Node temp = (Node)globalStack.pop();
                    if(temp != null) {
                        System.out.print(temp.data);
                        localStack.push(temp.left);
                        localStack.push(temp.right);

                        if(temp.left != null || temp.right != null)
                            isRowEmpty = false;
                    } else {
                        System.out.print("--");
                        localStack.push(null);
                        localStack.push(null);
                    }
                    for(int j=0; j < nBlanks * 2 - 2; j++)
                        System.out.print(' ');
                }
                System.out.println();
                nBlanks /= 2;
                while(localStack.isEmpty() == false)
                    globalStack.push(localStack.pop());
            }
            System.out.println("......................................................");
    }
}