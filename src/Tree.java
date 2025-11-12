/*import java.util.Stack;

public class Tree {
    private final TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }
    public TreeNode getRoot(){
        return root;
    }

    public void addNode(TreeNode node){
        TreeNode currentNode = root;
        while(true) {
            if (currentNode.value < node.value) {
                if(currentNode.rightChild == null){
                    currentNode.rightChild = node;
                    System.out.println("Added");
                    break;
                }else{
                    currentNode = currentNode.rightChild;
                    System.out.println("Added");

                }
            }
            else{
                if(currentNode.leftChild == null){
                    currentNode.leftChild = node;
                    System.out.println("Added");
                    break;
                }else{
                    currentNode = currentNode.leftChild;
                    System.out.println("Added");

                }
            }
        }
    }

    public void printTree(){
        printTree(root);
    }

    public void printTree(TreeNode node){
        node.displayNode();
            if(node.leftChild != null){
                printTree(node.leftChild);
            }
            if(node.rightChild != null){
                printTree(node.rightChild);
            }
        }
        public void bfs (){

        }
        public void bfs(Stack<TreeNode> nodes, ){

        }
    }

*/
