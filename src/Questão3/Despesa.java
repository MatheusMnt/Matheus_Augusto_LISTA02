package Questão3;

import java.time.LocalDateTime;

public abstract class Despesa implements Transacao {

    //atributos 
    protected LocalDateTime data;
    protected String descricao;

    //construtor 
    public Despesa(LocalDateTime data, String descricao){
        this.data = data;
        this.descricao = descricao;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    @Override
    public LocalDateTime getData() {
        return this.data;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String getTipo() {
        return "DESPESA";
    }

    @Override
    public String toString() {
        return getTipo() + ": R$ " + calcularTotal() + ", " + getDescricao();
    }

    
}
