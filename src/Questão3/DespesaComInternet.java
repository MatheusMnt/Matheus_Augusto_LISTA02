package Questão3;

import java.time.LocalDateTime;

public class DespesaComInternet extends Despesa {
    //atributos
    private double dadosTrafegados;

    //construtor
    public DespesaComInternet(LocalDateTime data, String descricao, double dadosTrafegados){
        super(data, descricao);
        this.dadosTrafegados = dadosTrafegados;
    }

    public double getdadosTrafegados() {
        return dadosTrafegados;
    }

    public void setdadosTrafegados(double dadosTrafegados) {
        this.dadosTrafegados = dadosTrafegados;
    }

    @Override
    public double calcularTotal() {
        double total = 0.00;

        if (this.dadosTrafegados < 100.00){
            total = 90.90 + ((this.dadosTrafegados - 20) * 3.90);
        }

        if (this.dadosTrafegados >= 100.00 && this.dadosTrafegados < 500.00){
            total = 240.90 + ((this.dadosTrafegados - 100) * 4.40);
        }

        if (this.dadosTrafegados >= 500.00){
                total = 590.90 + ((this.dadosTrafegados - 500) * 5.10);
        }
        
     return total;
    }
    
}
