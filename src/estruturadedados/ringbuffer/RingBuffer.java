package estruturadedados.ringbuffer;



public class RingBuffer<T> {

    private Node<T> head;
    private Node<T> tail;
    private int sizeList;

    // remove um item da lista
    public void remove(int index){
        if(index >= this.sizeList){
            throw  new IndexOutOfBoundsException(" O indice é maior que o tamanho da lista.");
        }
        Node<T> assistantNode = this.tail; // instancia a o local da entrada.
        if(index == 0){
            this.tail = this.tail.getNextNode();
            this.head.setNextNode(this.tail); // aponta a referência da cauda antiga para a atual.

        }else if(index == 1){
            this.tail.setNextNode(this.tail.getNextNode().getNextNode()); // passa a referência que aponta para oo proximo nó,  para o seguinte nó.

        } else {
            for(int i = 0; i < index -1; i++){
                assistantNode.getNextNode();
            }
            assistantNode.setNextNode(assistantNode.getNextNode().getNextNode());
        }
        this.sizeList--; // subtrai um valor da lista
    }



    public T get(int index){
        return this.getNode(index).getContent();
    }

    // percorre a lista e retorna o indice passado por parâmetro.
    private Node<T> getNode(int index){
        if(this.isEmpty()){
            throw new IndexOutOfBoundsException(" A lista está vazia");
        }
        if( index == 0){
            return this.tail;
        }
        Node<T> assistandNode = this.tail; // no auxiliar recebe a calda.
        for (int i = 0; ( i < index) && (assistandNode !=null); i++ ){
            assistandNode = assistandNode.getNextNode();
        }
        return assistandNode;

    }

    // verifica se a lista está vazia
    public boolean isEmpty(){
        return this.sizeList == 0 ? true : false;

    }

    // retorna o tamanho da lista
    public int size(){
        return this.sizeList;
    }






}
