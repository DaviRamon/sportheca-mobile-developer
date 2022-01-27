package estruturadedados.node;

public class Node<T> { // o <T> indica que a classe aceita valores de qualquer tipo

   private T content; // o content pode ser genérico, qualquer TIPO.
   private Node<T> nextnode; // o conteudo de todos os nós são do mesmo tipo T (genérico)

   public Node(T content) {
      this.nextnode = null; // referencia o nodo seguinte como nulo. no caso o ultimo.
      this.content = content;
   }

   public T getContent() {
      return content;
   }

   public void setContent(T content) {
      this.content = content;
   }

   public Node getNextnode() {
      return nextnode;
   }

   public void setNextnode(Node nextnode) {
      this.nextnode = nextnode;
   }


   @Override
   public String toString() {
      return "Node{" +
              "content='" + content + '\'' +
              '}';
   }

}
