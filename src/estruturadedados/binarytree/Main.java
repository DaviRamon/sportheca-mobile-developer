package estruturadedados.binarytree;

import estruturadedados.binarytree.model.Obj;

public class Main {
    public static void main(String[] args) {

        BinaryTree<Obj> myTree = new BinaryTree<>();

        myTree.inserir(new Obj(13));
        myTree.inserir(new Obj(10));
        myTree.inserir(new Obj(25));
        myTree.inserir(new Obj(2));
        myTree.inserir(new Obj(12));
        myTree.inserir(new Obj(20));
        myTree.inserir(new Obj(31));
        myTree.inserir(new Obj(29));
        myTree.inserir(new Obj(32));
        myTree.inserir(new Obj(32));



        myTree.exibirInOrdem();
        myTree.exibirPreOrdem();
        myTree.exibirPosOrdem();
    }
}
