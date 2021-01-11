package Questão3;

import java.time.LocalDateTime;

public class DespesaComEnergia extends Despesa {

    //atributos
    private double kWh;

    //construtor
    public DespesaComEnergia(LocalDateTime data, String descricao, double kWh){
        super(data, descricao);
        this.kWh = kWh;
    }

    public double getkWh() {
        return kWh;
    }

    public void setkWh(double kWh) {
        this.kWh = kWh;
    }

    @Override
    public double calcularTotal() {
        double total = 0.00;

        //cobrança padrão
        total = this.kWh * 0.5;

        //taxa a cada 100kWh
        if (this.kWh >= 100.00 && this.kWh % 100.00 != 0){
            total += ((this.kWh % 100.00) * 1.20);
        }

        // taxa iluminação publica
        if( 0 <= this.kWh && this.kWh <= 50.00){
            total += 2.00;
        } else if(51.00 <= this.kWh && this.kWh <= 200.00){
            total += 15.00;
        } else if(this.kWh > 201.00){
            total += 35.00;
        }

     return total;
    }
    
}
