package estruturadedados.binarytree;

public class BinNode<T extends Comparable<T>> {

    private T content;
    private BinNode<T> leftNode;
    private BinNode<T> rightNode;

    public BinNode(T content) {
        this.content = content;
        leftNode = rightNode = null;
    }

    public BinNode() {
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public BinNode<T> getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(BinNode<T> leftNode) {
        this.leftNode = leftNode;
    }

    public BinNode<T> getRightNode() {
        return rightNode;
    }

    public void setRightNode(BinNode<T> rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public String toString() {
        return "BinNo{" +
                "conteudo=" + content +
                '}';
    }
}