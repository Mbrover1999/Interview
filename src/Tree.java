public class Tree {
    private final TreeNode root;

    public Tree(TreeNode root) {
        this.root = root;
    }
    public TreeNode getRoot(){
        return root;
    }

    public void addNode(int num){
        TreeNode currentNode = root;
        while(true) {
            if(currentNode.value >= num){
                if(currentNode.leftChild == null){
                    currentNode.leftChild = new TreeNode(num);
                    System.out.println("Added");
                    break;
                }else {
                    currentNode = currentNode.leftChild;
                }
            }
            else{
                if(currentNode.rightChild == null){
                    currentNode.rightChild = new TreeNode(num);
                    System.out.println("Added");
                    break;
                }else{
                    currentNode = currentNode.rightChild;

                }
            }
        }
    }

    public void printTree(){
        printTree(root);
    }
    private void printTree(TreeNode node){
        node.displayNode();
            if(node.leftChild != null){
                printTree(node.leftChild);
            }
            if(node.rightChild != null){
                printTree(node.rightChild);
            }
        }
        public void bfs (TreeNode node , int counter) {
            if (node == null) {
                return;
            }else {
                System.out.println("Entered: " + counter + ", value: " + node.value);
                bfs(node.leftChild, counter++);
                bfs(node.rightChild, counter++);
            }

        }

    }


