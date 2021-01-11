package Questão3;

import java.time.LocalDateTime;

public class TesteFluxoCaixaMain {
    public static void main(String[] args) {
        
        FluxoCaixa Alpha = new FluxoCaixa("Alpha", "123456789");

        Transacao primeiraCompra = new LicencaBasica("Licença adquirida por Matheus", LocalDateTime.of(2020, 9, 21, 16, 41, 54), 1);
        Alpha.adicionarTransacao(primeiraCompra);

        Transacao contaEnergia = new DespesaComAgua(LocalDateTime.of(2020, 9, 21, 21, 21, 21), "Conta da energia", 27);
        Alpha.adicionarTransacao(contaEnergia);

       for (Transacao n : Alpha.listarTransacoesNoMes(9, 2020)){
           System.out.println(n.toString());
       }
        
        

    }
    
}
