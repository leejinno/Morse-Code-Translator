/*
 * ID: 6588152        NAME: Jinnipa Leepong
 * SEC: 2
 */

public class BinaryTree<E extends Comparable<E>> {
    Node<E> root;

    public BinaryTree() {
        root = null;
    }

    // INCOMPLETE
    private String addToSubTree(Node<E> n, E v) {    
    	//CODE HERE
    	if(v.compareTo(n.getValue()) < 0) {
    		if (n.getLeft() != null) {
    			return addToSubTree(n.getLeft(), v);
            } else {
                if(v.compareTo(root.getValue()) > 0) {
                	n.setLeft(new Node<>(v));
                	return "RightSubTree(" + v + ")";
                } else {
                    n.setLeft(new Node<>(v));
                    return "LeftSubTree(" + v + ")";
                }
            }
    		
    	} else if (v.compareTo(n.getValue()) > 0) {
            if (n.getRight() != null) {
            	return addToSubTree(n.getRight(), v);
            } else {
            	if(v.compareTo(root.getValue()) < 0) {
            		n.setRight(new Node<>(v));
                    return "LeftSubTree(" + v + ")";
            	} else {
            		n.setRight(new Node<>(v));
                    return "RightSubTree(" + v + ")";
            	}
            }
        }
        	return ""; 
        	
    }

 // INCOMPLETE    
    public String add(E v) {
        
    	if (root == null) {
    		root = new Node<>(v);
    		return "Root(" + v + ")";
        } else {
            return addToSubTree(root, v);
        }
		
    }

    // INCOMPLETE.
    private void inOrder(Node<E> n) {
       //CODE HERE
    	if(n!=null) {
    		inOrder(n.getLeft());
        	System.out.print(n.getValue() + " ");
        	inOrder(n.getRight());
    	}
    }

    // INCOMPLETE.
    private void preOrder(Node<E> n)
    {
        //CODE HERE
    	if(n!=null) {		
    		System.out.print(n.getValue() + " ");
    		preOrder(n.getLeft());
    		preOrder(n.getRight());
    	}
    }

    // INCOMPLETE.
    private void postOrder(Node<E> n)
    {
    	//CODE HERE
    	if(n!=null) {
    		postOrder(n.getLeft());
        	postOrder(n.getRight());
        	System.out.print(n.getValue() + " ");
    	}
    }

    public void traversal()
    {
        System.out.print("Inorder traversal: ");
        inOrder(root);
        System.out.println();
        
        System.out.print("Preorder traversal: ");
        preOrder(root);
        System.out.println();
        
        System.out.print("Postorder traversal: ");
        postOrder(root);
        System.out.println();
    }
}
