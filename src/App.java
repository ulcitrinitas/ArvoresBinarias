import trees.*;;

public class App {
    public static void main(String[] args) throws Exception {

        var tree = new Tree();

        var treeNode = tree.insertRoot(500);

        System.out.println("Raíz da árvore: " + treeNode);
        System.out.println("Valor da raíz: " + treeNode.getItem());

    }
}
