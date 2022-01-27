package estruturadedados.node;

public class NodeMain {
    public static void main(String[] args) {

        Node<String> node1 = new Node<>("Content Node 1");

        Node<String> node2 = new Node<>("Content Node 2");

        node1.setNextnode(node2); // o no 1 aponta para o 2...

        Node<String> node3 = new Node<>("Content Node 3");
        node2.setNextnode(node3); // o no 2 aponta para o 3..

        Node<String> node4 = new Node<>("Content Node 4");
        node3.setNextnode(node4); // o no3 aponta para o 4

        //   node1 -> node2 -> node3 -> node4 -> null

        System.out.println(node1);
        System.out.println(node1.getNextnode()); // node 2

        System.out.println(("________________________________"));

        System.out.println(node1);
        System.out.println(node1.getNextnode()); // node2
        System.out.println(node1.getNextnode().getNextnode()); //node 3
        System.out.println(node1.getNextnode().getNextnode().getNextnode()); // node 4
        System.out.println(node1.getNextnode().getNextnode().getNextnode().getNextnode()); // null
        System.out.println(node4.getNextnode()); // null










    }
}
