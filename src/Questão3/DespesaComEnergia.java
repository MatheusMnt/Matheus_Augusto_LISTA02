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
        if (this.kWh >= 100.00){
            total += (((int) (this.kWh / 100.00)) * 1.20);
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

    @Override
    public boolean equals(Object obj) {
        boolean despesasIguais = false;
        if ( obj instanceof DespesaComEnergia){
            DespesaComEnergia despesaParaComaprar = (DespesaComEnergia) obj;
          if (despesaParaComaprar.calcularTotal() == this.calcularTotal()
                && despesaParaComaprar.getData().equals(this.getData())
                    && despesaParaComaprar.getDescricao() == this.getDescricao()){
                        despesasIguais = true;
                    }
        }

        return despesasIguais;
    }
    
}
