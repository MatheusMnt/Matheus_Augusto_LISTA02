package Questão3;

import java.time.LocalDateTime;

public class DespesaComAgua extends Despesa {

    //atributos
    private double totalM3;

    //construtor
    public DespesaComAgua(LocalDateTime data, String descricao, double totalDeM3){
        super(data, descricao);
        this.totalM3 = totalDeM3;
    }

    public double getTotalM3() {
        return totalM3;
    }

    public void setTotalM3(double totalM3) {
        this.totalM3 = totalM3;
    }

    @Override
    public double calcularTotal() {
        double total = 0.00;
        if( 0 <= this.totalM3 && this.totalM3 <= 10.00){
            total = 45.00;
        } else if(11.00 <= this.totalM3 && this.totalM3 <= 20.00){
            total = 45.00 + ((this.totalM3 - 10.00) * 5.00);
        } else if(this.totalM3 > 20.00){
            total = 45.00 + ((this.totalM3 - 10.00) * 5.00) + ((this.totalM3 - 20.00) * 6.00);
        }
     return total;
    }
    
}
