package Questão2;

import java.time.LocalDate;

public class TesteSistemaMain {
    public static void main(String[] args) {


        //novo repositorio
        RepositorioPessoas pessoas = new RepositorioPessoas();

        //criando clientes 
        Pessoa p1 = new Cliente("José", LocalDate.of(2005, 01, 31), 1234);
        Pessoa p2 = new Cliente("Maria", LocalDate.of(2004, 12, 21), 6789);
        Pessoa p3 = new Cliente("João", LocalDate.of(1997, 07, 05), 7412);
        Pessoa p4 = new Cliente("Jacó", LocalDate.of(2002, 01, 21), 8588);
        Pessoa p5 = new Cliente("Júlia", LocalDate.of(2002, 05, 07), 7777);

        //criando cliente repetido
        Pessoa p6 = new Cliente("João", LocalDate.of(1997, 07, 05), 7412);

        //adicionando clientes
        pessoas.cadastrarPessoa(p1);
        pessoas.cadastrarPessoa(p2);
        pessoas.cadastrarPessoa(p3);
        pessoas.cadastrarPessoa(p4);
        pessoas.cadastrarPessoa(p5);
        pessoas.cadastrarPessoa(p6);

        System.out.println();

        //criando Funcionarios
        Pessoa f1 = new Funcionario("Marcos", LocalDate.of(2001, 03, 07), 800.00);
        Pessoa f2 = new Funcionario("Angela", LocalDate.of(1995, 8, 2), 1300.00);
        Pessoa f3 = new Funcionario("Ricardo", LocalDate.of(1999, 10, 14), 1000.00);
        Pessoa f4 = new Funcionario("Paulo", LocalDate.of(1998, 4, 21), 1200.00);
        Pessoa f5 = new Funcionario("José", LocalDate.of(2000, 2, 13), 2000.00);

        //Funcionario repetido 
        Pessoa f6 = new Funcionario("Angela", LocalDate.of(1995, 8, 2), 1300.00);

        //adicionando funcionarios 
        pessoas.cadastrarPessoa(f1);
        pessoas.cadastrarPessoa(f2);
        pessoas.cadastrarPessoa(f3);
        pessoas.cadastrarPessoa(f4);
        pessoas.cadastrarPessoa(f5);
        pessoas.cadastrarPessoa(f6);

        System.out.println();

        //Crindo gerentes
        Pessoa g1 = new Gerente("Rafaela", LocalDate.of(1990, 9, 25), 3000.00, "Psicologia");
        Pessoa g2 = new Gerente("Eduardo", LocalDate.of(2001, 11, 11), 2800.00, "Administração");
        Pessoa g3 = new Gerente("André", LocalDate.of(1998, 6, 28), 2900.00, "Ciência da Computação");
        Pessoa g4 = new Gerente("Camila", LocalDate.of(1999, 5, 4), 3200.00, "Psicologia");
        Pessoa g5 = new Gerente("Giovanna", LocalDate.of(1992, 7, 23), 4000.00, "Ciência da Computação");
        
        //gerente repetido 
        Pessoa g6 = new Gerente("Camila", LocalDate.of(1999, 5, 4), 3200.00, "Psicologia");

        //adicionando gerentes
        pessoas.cadastrarPessoa(g1);
        pessoas.cadastrarPessoa(g2);
        pessoas.cadastrarPessoa(g3);
        pessoas.cadastrarPessoa(g4);
        pessoas.cadastrarPessoa(g5);
        pessoas.cadastrarPessoa(g6);

        System.out.println();

        //listando pessoas maiores de idade
        System.out.println("Pessoas Maiores de Idade:");
       for (Pessoa n: pessoas.listarPessoasMaioresIdade()){
           System.out.println(n.toString());
       }

       System.out.println();

       //listando clientes maiores de idade
       System.out.println("Clientes Maiores de Idade:");
       for (Pessoa n: pessoas.listarClientesMaioresIdade()){
           System.out.println(n.toString());
       }

       System.out.println();
       
       //listando funcionários com salario maior que 
       System.out.println("Funcionários com salário maior que R$ 1000.00:");
       for (Pessoa n: pessoas.listarFuncionariosComSalarioMAiorQue(1000.00)){
           System.out.println(n.toString());
       }

       System.out.println();

       //listando gerentes da mesma area
       System.out.println("Gerentes da área de Ciência da Computação:");
       for (Pessoa n: pessoas.listarGerenteDaArea("Ciência da Computação")){
           System.out.println(n.toString());
       }



    }
    
}
