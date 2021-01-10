package Questão2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public abstract class Pessoa {

    //atributos 
    private String nome;
    private LocalDate dataNascimento;
	


    //contrutor
    public Pessoa (String nome, LocalDate dataNascimento){
        this.nome = nome;
        this.dataNascimento = dataNascimento;
    }

    //metodos
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }

    public void setDataNascimento(String dataNaoFormatada) {
        DateTimeFormatter parserData = DateTimeFormatter.ofPattern("dd/MM/uuuu");
        this.dataNascimento = LocalDate.parse(dataNaoFormatada, parserData);
    }

    public LocalDate getDataNascimento() {
        return this.dataNascimento;
    }

    //testar
    @Override
    public String toString() {
        String pessoa;
            pessoa = this.nome +",";
            DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            pessoa += formatador.format(dataNascimento);

        return pessoa;
    }
     

    @Override
    public boolean equals(Object obj) {
        boolean pessoasIguais = false;
        if (obj instanceof Pessoa){
        Pessoa pessoa2 = (Pessoa) obj;
	    if (this.getNome() == pessoa2.getNome() && 
	                this.getDataNascimento() == pessoa2.getDataNascimento()){
	        pessoasIguais = true;
        }
        }
	    return pessoasIguais;
	}
}
