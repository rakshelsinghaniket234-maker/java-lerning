public class Tree1 {

    Tree left;
    int data;
    Tree right;
    static Tree root;

    public Tree() {

    }

    public Tree(int data) {
        left = null;
        this.data = data;
        right = null;
    }
    // //=======================================Insert

    void insert(int data) {
        root = insertRec(root, data);
    }

    public Tree insertRec(Tree root, int value) {

        if (root == null) {
            System.out.println("Node Created");
            return new Tree(value);
        }
        if (value < root.data) {
            System.out.println("Left");
            root.left = insertRec(root.left, value);
        } else if (value > root.data) {
            System.out.println("Right");
            root.right = insertRec(root.right, value);
        }
        return root;
    }

    //=======================================Delete
    void delete(int data) {
        root = deleteRec(root, data);
    }

    public Tree deleteRec(Tree root, int value) {

        if (root == null) {

            return root;
        }
        if (value < root.data) {
            System.out.println("Left");
            root.left = deleteRec(root.left, value);
        } else if (value > root.data) {
            System.out.println("Right");
            root.right = deleteRec(root.right, value);
        } else {
            // Node Found to be deleted
            //case `1: No Child
            if (root.left == null && root.right == null) {
                System.out.println("Node deleted with no child");
                return null;
            }
            //case 2:  One Child
            if(root.left==null){
                return root.right;
            }
            if(root.right==null){
                return root.left;
                       
            }
            //case : Two Child
            root.data=minValue(root.right);
            root.right=deleteRec(root.right, root.data);
        }                       //70 address ,60
        return root;
    }

    public void inOrder(Tree root) {
        inOrderRec(root);
        System.out.println("");
    }
void inOrderRec(Tree root){
    if(root!=null){
         inOrderRec(root.left);
        System.out.print("===>"+root.data);
         inOrderRec(root.right);
    }
}
public boolean search(int value){
 return searchRec(root,value);
 }
public boolean searchRec(Tree root ,int value){
  if(root==null){
   return false;
   }
if(root.data==value){
  return true;
}
if(value<root.data){
 return searchRec(root.left,value);
}
if(value>root.data){
 return searchRec(root.right,value);
}
return searchRec(root.right,value);

 }



    public static void main(String[] args) {
        Tree bst = new Tree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        System.out.println("=============");
        bst.insert(40);
        System.out.println("=============");
        bst.insert(60);
        System.out.println("=============");
        bst.insert(80);
        bst.insert(25);
        bst.insert(35);
       
        System.out.println("=============");
        System.out.println("Print ");
        bst.inOrder(root);
     //  bst.delete(80);
       bst.inOrder(root);
     //  bst.delete(70);
        System.out.println("Print ");
        bst.inOrder(root);
       
    }

    private int minValue(Tree root) {
        int min=root.data;
        while(root.left!=null){
            min=root.left.data;
            root=root.left;
        }
        return min;
    }
}