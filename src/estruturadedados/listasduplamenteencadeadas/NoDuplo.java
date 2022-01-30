package estruturadedados.listasduplamenteencadeadas;



public class NoDuplo<T> {

    private T content;
    private NoDuplo<T> nextNode;
    private NoDuplo<T> previousNode;


    // construtor
    public NoDuplo(T content){
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }

    public NoDuplo<T> getNextNode() {
        return nextNode;
    }

    public void setNextNode(NoDuplo<T> nextNode) {
        this.nextNode = nextNode;
    }

    public NoDuplo<T> getPreviousNode() {
        return previousNode;
    }

    public void setPreviousNode(NoDuplo<T> previousNode) {
        this.previousNode = previousNode;
    }

    @Override
    public String toString() {
        return "NoDuplo{" +
                "content=" + content +
                '}';
    }



}
