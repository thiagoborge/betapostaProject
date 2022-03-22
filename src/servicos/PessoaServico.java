package servicos;

import repositorios.PessoaRepositorio;
import entidades.pessoa;

import java.util.ArrayList;

public class PessoaServico {
    private PessoaRepositorio cliRepo;

    public PessoaServico(ArrayList<pessoa> pessoas) {
        this.cliRepo = new PessoaRepositorio(pessoas);

    }

    public void novaConta(int codigo, String nome, String cpf) {
        boolean cpfRepetido = false;
        pessoa buscaCLiente = this.cliRepo.cpfPessoa(cpf);

        if (buscaCLiente != null)
            cpfRepetido = true;

        if (!cpfRepetido) {
            if (nome != null && nome.length() > 3 && cpf != null && cpf.length() > 5) {
                pessoa pessoaA = new pessoa(codigo, nome, cpf);
                this.cliRepo.salvar(pessoaA);
                System.out.println("pessoaA Salva");
            } else
                System.out.println("pessoaA NAO Salva");

        }


    }
}
