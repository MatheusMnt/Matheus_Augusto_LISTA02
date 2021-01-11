package Questão3;

import java.time.LocalDateTime;

public abstract class Receita implements Transacao {
    
    //atributos 
    protected LocalDateTime data;
    protected String descricao;

    //construtor
    public Receita (String descricao, LocalDateTime dataReceita){
        this.data = dataReceita;
        this.descricao = descricao;
    }

    //metodos 
    @Override
    public LocalDateTime getData() {
        return this.data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public String getDescricao() {
        return this.descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String getTipo() {
        return "RECEITA";
    }

    //transforma em uma String formatada
    @Override
    public String toString() {
        return getTipo() + ": R$ " + calcularTotal() + ", " + getDescricao();
    }

}
