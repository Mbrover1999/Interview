public class Main{
    public static void main(String[] args) {
        Tree tree = new Tree(new TreeNode(5));
        tree.addNode(12);
        tree.addNode(13);
        tree.addNode(7);
        tree.addNode(14);
        tree.addNode(2);
        tree.addNode(17);
        tree.addNode(23);
        tree.addNode(27);
        tree.addNode(3);
        tree.addNode(8);
        tree.addNode(11);
        tree.printTree();
        tree.bfs(tree.getRoot(), 0);
    }
}