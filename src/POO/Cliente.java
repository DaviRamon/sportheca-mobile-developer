package POO;

import java.util.List;
import java.util.ArrayList;

public class Cliente extends Pessoa {

    public String numCartao;
    private List<Endereco> enderecos;

    public void adicionaEndereco(Endereco endereco){
        if(endereco == null){
            throw new NullPointerException("Endereço não pode ser nulo");
        }

        if (endereco.cep == null){
            throw new NullPointerException("Cep não pode ser nulo");
        }

        getEnderecos().add(endereco);

    }

    private List<Endereco> getEnderecos() {
        if(enderecos == null){
            enderecos = new ArrayList<Endereco>();
        }
        return enderecos;
    }


}


