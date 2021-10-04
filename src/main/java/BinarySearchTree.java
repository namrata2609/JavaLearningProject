public class BinarySearchTree {

    BinarySearchTreeNode root;
    BinarySearchTree(){
        this.root = null;
    }

    public void insert(int value){
        if(this.root == null){
           this.root = new BinarySearchTreeNode(value);
           return;
        }

        BinarySearchTreeNode parent = null;
        BinarySearchTreeNode current = this.root;

        while (current!=null){
            parent = current;
              if(current.getValue()<value){
                 current = current.getRight();
              }else if(current.getValue()>value){
                 current = current.getLeft();
              }else{
                 return;
            }

        }
        if(parent.getValue()<value){
            parent.setRight(new BinarySearchTreeNode(value));
        }else{
            parent.setLeft(new BinarySearchTreeNode(value));
        }
    }
    public boolean search (int value){
        BinarySearchTreeNode current = this.root;
        if(current.getValue()>value){
            current = current.getLeft();
        }else if(current.getValue()<value){
            current = current.getRight();
        }else{
            return true;
        }
        return false;
    }
    public boolean delete(int value){
        if(this.root==null){// iN case tree is empty
            return false;
        }
        BinarySearchTreeNode current = this.root;
        BinarySearchTreeNode parent = null;
        while(current.getValue()!=value) {
            parent = current;
            if (current.getValue() > value) {
                current = current.getLeft();
            } else if (current.getValue() < value) {
                current = current.getRight();
            }
            if (current == null) {
                return false;
            }
        }
     // Now we can have three possible cases in node that we want to delete
        //Case 1
        // Current is a leaf

        if(current.getLeft()==null&&current.getRight()==null){
            if(current == this.root){
                this.root = null;
            }else if(parent.getValue()<current.getValue()){
                parent.setRight(null);
            }else{
                parent.setLeft(null);
            }
            return true;
        }

        //Case2
        //Current have one child
        if(current.getLeft()==null){
            if(current ==this.root){
                this.root = current.getRight();
            }else if(parent.getValue()<current.getValue()){
                parent.setRight(current.getRight());
            }else{
                parent.setLeft(current.getRight());
            }
            return true;
        }else if(current.getRight()==null){
            if(current ==this.root){
                this.root = current.getLeft();
            }else if(parent.getValue()<current.getValue()){
                parent.setRight(current.getLeft());
            }else{
                parent.setLeft(current.getLeft());
            }
            return true;
        }

        //Case3
        // Current have left and right child
       if(current.getLeft()!=null &&current.getRight()!=null){
           BinarySearchTreeNode successor =  getBiggestNodeFromLeftSubtree(current);
           successor.setLeft(current.getLeft());
           successor.setRight(current.getRight());
           if(current ==this.root){
               this.root = successor;
           }else if(parent.getValue()<successor.getValue()){
               parent.setRight(successor);
           }else{
               parent.setLeft(successor);
           }
           return true;
       }
       return false;

    }
    private BinarySearchTreeNode getBiggestNodeFromLeftSubtree(BinarySearchTreeNode start){
        BinarySearchTreeNode parent = start.getLeft(); //In left substree
        BinarySearchTreeNode rightChild = parent.getRight(); // Represent most right node

        if(rightChild==null){ //In case it doesn't have right child
            start.setLeft(parent.getLeft());
            return parent;
        }
        while (rightChild.getRight()!=null){
            parent =     rightChild;
            rightChild = rightChild.getRight();
        }

        //in rightChild is most right (biggest) node
        //if biggest node have leftChild it will be set as right child of parent
        //if leftChild is null the right child of parent will be set null
        parent.setRight(rightChild.getLeft());
        return rightChild;

    }


}
