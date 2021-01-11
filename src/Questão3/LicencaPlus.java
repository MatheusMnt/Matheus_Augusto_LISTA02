package Questão3;

import java.time.LocalDateTime;

public class LicencaPlus extends Receita {

    //atributos
    private int totalContas;

    //construtor
    public LicencaPlus(String descricao, LocalDateTime dataDeCompra, int quantidadeDeContas){
        super(descricao, dataDeCompra);
        this.totalContas = quantidadeDeContas;
    }

    //metodos 
    public int getTotalContas() {
        return this.totalContas;
    }

    public void setTotalContas(int totalContas) {
        this.totalContas = totalContas;
    }

    @Override
    public double calcularTotal() {
        return 35.00 * this.totalContas;
    }
    
}
