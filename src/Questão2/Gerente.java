package Questão2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Gerente extends Funcionario {

    //atributos
    private String area;

    //construtor

    public Gerente (String nome, LocalDate dataNascimento, double salario, String area){
        super(nome, dataNascimento, salario);
        this.area = area;
    }

    //metodos
    public void setArea(String area) {
        this.area = area;
    }

    public String getArea() {
        return area;
    }

    @Override
    public String toString() {
        String gerente;
            gerente = this.getNome() +",";
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            gerente += formatador.format(super.getDataNascimento()) + ",";
            gerente += this.getSalario() + ",";
            gerente += this.area;
        return gerente;
    }

    public boolean equals(Object obj) {
        boolean gerenteIgual = false;
        if (obj instanceof Gerente){
            Gerente gerente2 = (Gerente) obj;
        if (gerente2.getNome() == this.getNome() && 
            gerente2.getDataNascimento().equals(this.getDataNascimento())
                && gerente2.getSalario() == this.getSalario()
                     && gerente2.getArea() == this.area){
                        gerenteIgual = true;
                    }
        }
        return gerenteIgual;
    }
    
}
