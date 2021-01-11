package Questão3;

import java.time.LocalDateTime;

public class LicencaEnterprise extends Receita{

    //atributos
    private int totalContas;

    //construtor
    public LicencaEnterprise(String descricao, LocalDateTime dataDeCompra, int quantidadeDeContas){
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
        return 150.00 * this.totalContas;
    }

    @Override
    public boolean equals(Object obj) {
        boolean receitasIguais = false;
        if ( obj instanceof LicencaEnterprise){
            LicencaEnterprise licencaParaComaprar = (LicencaEnterprise) obj;
          if (licencaParaComaprar.calcularTotal() == this.calcularTotal()
                && licencaParaComaprar.getData().equals(this.getData())
                    && licencaParaComaprar.getDescricao() == this.getDescricao()){
                        receitasIguais = true;
                    }
        }

        return receitasIguais;
    }
    
}
