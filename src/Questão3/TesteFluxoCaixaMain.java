package Questão3;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TesteFluxoCaixaMain {
    public static void main(String[] args) {
        
        FluxoCaixa Alpha = new FluxoCaixa("Alpha", "123456789");

        //receitas set/2020
        Transacao venda1 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente José Maria", LocalDateTime.of(2020, 9, 21, 16, 41, 54), 3);
        Alpha.adicionarTransacao(venda1);

        Transacao venda2 = new LicencaEnterprise("Licença(s) vendida(s) para empresa Beta tech ltda.", LocalDateTime.of(2020, 9, 15, 9, 37, 56), 2);
        Alpha.adicionarTransacao(venda2);

        Transacao venda3 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente Amelia Pond", LocalDateTime.of(2020, 9, 21, 16, 41, 54), 3);
        Alpha.adicionarTransacao(venda3);


        //despesas set/2020
        Transacao contaAguaAgo = new DespesaComAgua(LocalDateTime.of(2020, 9, 21, 21, 21, 21), "Conta da água do mês ago/2020", 27);
        Alpha.adicionarTransacao(contaAguaAgo);

        Transacao contaEnergiaAgo = new DespesaComEnergia(LocalDateTime.of(2020, 9, 7, 8, 41, 23), "Conta de energia do mês ago/2020", 150.00);
        Alpha.adicionarTransacao(contaEnergiaAgo);

        Transacao contaInternetAgo = new DespesaComInternet(LocalDateTime.of(2020, 9, 10, 11, 51, 21), "Conta de Internet do mês ago/2020", 55);
        Alpha.adicionarTransacao(contaInternetAgo);


        //receitas out/2020
        Transacao venda4 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente Davi Lima", LocalDateTime.of(2020, 10, 7, 10, 17, 34), 1);
        Alpha.adicionarTransacao(venda4);

        Transacao venda5 = new LicencaEnterprise("Licença(s) vendida(s) para empresa Gama S.A.", LocalDateTime.of(2020, 10, 25, 13, 45, 26), 4);
        Alpha.adicionarTransacao(venda5);

        Transacao venda6 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente Giovanna Matos", LocalDateTime.of(2020, 10, 21, 4, 17, 24), 7);
        Alpha.adicionarTransacao(venda6);


        //despesas out/2020
        Transacao contaAguaSet = new DespesaComAgua(LocalDateTime.of(2020, 10, 8, 22, 40, 21), "Conta da água do mês set/2020", 25);
        Alpha.adicionarTransacao(contaAguaSet);

        Transacao contaEnergiaSet = new DespesaComEnergia(LocalDateTime.of(2020, 10, 7, 8, 41, 23), "Conta de energia do mês set/2020", 170.00);
        Alpha.adicionarTransacao(contaEnergiaSet);

        Transacao contaInternetSet = new DespesaComInternet(LocalDateTime.of(2020, 10, 10, 11, 51, 21), "Conta de Internet do mês set/2020", 40);
        Alpha.adicionarTransacao(contaInternetSet);

        //receitas nov/2020
        Transacao venda7 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente Claude Shannon", LocalDateTime.of(2020, 11, 17, 15, 46, 54), 1);
        Alpha.adicionarTransacao(venda7);

        Transacao venda8 = new LicencaEnterprise("Licença(s) vendida(s) para empresa Omega Co.", LocalDateTime.of(2020, 11, 13, 7, 37, 32), 9);
        Alpha.adicionarTransacao(venda8);

        Transacao venda9 = new LicencaBasica("Licença(s) vendida(s) para o(a) cliente Stephen Hawking", LocalDateTime.of(2020, 11, 21, 16, 41, 54), 6);
        Alpha.adicionarTransacao(venda9);


        //despesas nov/2020
        Transacao contaAguaOut = new DespesaComAgua(LocalDateTime.of(2020, 11, 21, 15, 22, 01), "Conta da água do mês out/2020", 27);
        Alpha.adicionarTransacao(contaAguaOut);

        Transacao contaEnergiaOut = new DespesaComEnergia(LocalDateTime.of(2020, 11, 9, 14, 41, 23), "Conta de energia do mês out/2020", 150.00);
        Alpha.adicionarTransacao(contaEnergiaOut);

        Transacao contaInternetOut = new DespesaComInternet(LocalDateTime.of(2020, 11, 13, 15, 51, 21), "Conta de Internet do mês out/2020", 5);
        Alpha.adicionarTransacao(contaInternetOut);

        //despesa repetida 
        Transacao contaAguaRepetida = new DespesaComAgua(LocalDateTime.of(2020, 10, 8, 22, 40, 21), "Conta da água do mês set/2020", 25);
        Alpha.adicionarTransacao(contaAguaRepetida);


        //calculando despesas entre 01/09 e 31/10
        System.out.println("Despesas entre 01/09/2020 e 31/10/2020: " + Alpha.CalcularDespesas(LocalDate.of(2020, 9, 1), LocalDate.of(2020, 10, 31)) + "\n");

        //calculando receita ente 01/10 e 30/11
        System.out.println("Receita entre 01/10/2020 e 30/11/2020: " + Alpha.CalcularReceitas(LocalDate.of(2020, 10, 1), LocalDate.of(2020, 11, 30)) + "\n");

        //listando todas as transações do mes 09/2020
       for (Transacao n : Alpha.listarTransacoesNoMes(9, 2020)){
           System.out.println("Transações em 09/2020: " + n.toString());
       }

       //calculando a percentagem de despesa
       System.out.printf("\nA Despesa de 10/2020 representa %.2f%% da Despesa Total\n", Alpha.percentualDespesasNoMes(10, 2020));

       //calculando a percentagem de receita 
       System.out.printf("\nA Receita de 11/2020 representa %.2f%% da Receita Total\n\n", Alpha.percentualReceitasNoMes(11, 2020));
       
       //escrevendo o saldo atual 
       System.out.printf("Saldo Atual:R$ %.2f", Alpha.saldoAtual());
        

    }
    
}
