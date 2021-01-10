package Questão2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;


public class Funcionario extends Pessoa {

    //atributos
    // DESCOBRIR O VALOR DA CONSTANTE
    static public final double SALARIO_TETO_IMPOSTO = 1000.00;
    private double salario;

    //construtor
    public Funcionario(String nome, LocalDate dataNascimento, double salario){
        super(nome, dataNascimento);
        this.salario = salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public double calcularImpostoDevido(){
        double imposto;
        if (this.salario <= SALARIO_TETO_IMPOSTO){
            imposto = 0.05 * this.salario;
        } else {
            imposto = 0.075 * this.salario;
        }
      return imposto;  
    }

    @Override
    public String toString() {
        String funcionario;
            funcionario = this.getNome() +", ";
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MMM/yyyy");
            funcionario += formatador.format(super.getDataNascimento()) + ", ";
            funcionario += this.salario;
        return funcionario;
    }

    @Override
    public boolean equals(Object obj) {
        boolean funcionarioIgual = false;
        if (obj instanceof Funcionario){
        Funcionario funcionario2 = (Funcionario) obj;
        if (funcionario2.getNome() == this.getNome()
             && funcionario2.getDataNascimento().equals(this.getDataNascimento())
                 && funcionario2.getSalario() == this.getSalario()){
                        funcionarioIgual = true;
                    }
        }
        return funcionarioIgual;
    }

}
