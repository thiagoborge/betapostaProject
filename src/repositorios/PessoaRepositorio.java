package repositorios;
import entidades.pessoa;

import java.util.ArrayList;
import java.util.List;

public class PessoaRepositorio {

    private ArrayList<pessoa> repositoriopessoa;

    public PessoaRepositorio(ArrayList<pessoa> clientes) {
        this.repositoriopessoa=clientes;
    }


    public pessoa cpfPessoa(String cpf) {
        for (pessoa pessoa : repositoriopessoa) {
            if(pessoa.getCpf().equals(cpf)) {
                return pessoa;
            }
        }
        return null;
    }

    public void inputsa (pessoa pessoa) {
        this.repositoriopessoa.add(pessoa);
    }

    public void salvar(pessoa clienteA) {
    }
}
