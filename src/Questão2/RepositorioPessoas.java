package Questão2;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;

public class RepositorioPessoas {

    //atributos
    private ArrayList <Pessoa> pessoas;

    //construtor
    public RepositorioPessoas(){
        pessoas = new ArrayList<>(10);
    }
    
    //metodos
    //a função não inc=voca esse metodo 
    public void cadastrarPessoa(Pessoa pessoaParaCadastrar) {
        boolean mesmaPessoa = false;
        for (Pessoa pessoaCadastrada : pessoas){
            if (pessoaParaCadastrar.equals(pessoaCadastrada)) {
                mesmaPessoa = true;;         
            }     
        }
        if (!mesmaPessoa){
                pessoas.add(pessoaParaCadastrar);
            } else{
                System.out.println(pessoaParaCadastrar.getNome() + " já cadastrado(a)");
            }   
    }

    public ArrayList <Pessoa> listarPessoasMaioresIdade(){
        ArrayList <Pessoa> pessoasMaiorIdade = new ArrayList<>();
        LocalDate hoje = LocalDate.now();
        for (Pessoa n: this.pessoas){
            int idade = (int) n.getDataNascimento().until(hoje, ChronoUnit.YEARS);
            if (idade >= 18){
                pessoasMaiorIdade.add(n);
            }
        }
        return pessoasMaiorIdade;
    }

    public ArrayList <Cliente> listarClientesMaioresIdade(){
        ArrayList <Cliente> clienteMaiorIdade = new ArrayList<>();
        LocalDate hoje = LocalDate.now();
        for (Pessoa n: this.pessoas){
            if ( n instanceof Cliente){
            int idade = (int) n.getDataNascimento().until(hoje, ChronoUnit.YEARS);
            if (idade >= 18){
                clienteMaiorIdade.add((Cliente) n);
            }
        }
        }
        return clienteMaiorIdade;
    }

    public ArrayList <Funcionario> listarFuncionariosComSalarioMAiorQue(double salarioLimite){
        ArrayList <Funcionario> funcionarioComSalarioMaior = new ArrayList<>();
        for (Pessoa n: this.pessoas){
            if (n instanceof Funcionario){
            if ( ((Funcionario) n).getSalario() > salarioLimite){
                funcionarioComSalarioMaior.add((Funcionario) n);
            }
            }
        }
        return funcionarioComSalarioMaior;
    }

    public ArrayList <Gerente> listarGerenteDaArea(String areaProcurada){
        ArrayList <Gerente> gerentesDaMesmaArea = new ArrayList<>();
        for (Pessoa n: this.pessoas){
            if ( n instanceof Gerente){
            if ( ((Gerente) n).getArea() == areaProcurada){
                gerentesDaMesmaArea.add((Gerente) n);
            }
            }
        }
        return gerentesDaMesmaArea;
    }
}
