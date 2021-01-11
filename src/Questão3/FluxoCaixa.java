package Questão3;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class FluxoCaixa {

    //atributos
    private String nomeEmpresa;
    private String cnpj;
    private ArrayList <Transacao> transacoes = new ArrayList<>();


    //construtor 
    public FluxoCaixa(String nomeEmpresa, String cnpj){
        this.nomeEmpresa = nomeEmpresa;
        this.cnpj = cnpj;
    }

    //metodos
    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public void adicionarTransacao(Transacao transacao){
        boolean transacoesIguais = false;
        for (Transacao n: transacoes){
            if (n.equals(transacao)){
                transacoesIguais = true;
            }    
        } 
        if (!transacoesIguais){
                transacoes.add(transacao);
            }else {
                System.out.println("\n" + "Transação já cadastrada!" + "\n");
            }
    }

    public  double CalcularDespesas(LocalDate inicio, LocalDate fim){
        double totalDespesas = 0.00;
        for (Transacao n : transacoes){
            if (n instanceof Despesa){
                // transforma o LocalDate em LocalDateTime para fazer a comparação
                LocalDateTime dataInicio = inicio.atTime(00, 01);
                LocalDateTime dataFinal = fim.atTime(23, 59);
                if (n.getData().isAfter(dataInicio) && n.getData().isBefore(dataFinal)){
                   totalDespesas += n.calcularTotal();
                }
            }
        }

        return totalDespesas;
    }
    
    public  double CalcularReceitas(LocalDate inicio, LocalDate fim){
        double totalReceitas = 0.00;
        for (Transacao n : transacoes){
            if (n instanceof Receita){
                // transforma o LocalDate em LocalDateTime para fazer a comparação
                LocalDateTime dataInicio = inicio.atTime(00, 01);
                LocalDateTime dataFinal = fim.atTime(23, 59);
                if (n.getData().isAfter(dataInicio) && n.getData().isBefore(dataFinal)){
                   totalReceitas += n.calcularTotal();
                }
            }
        }
        return totalReceitas;
    }

    public double percentualReceitasNoMes(int mes, int ano){
        double percentualReceitas = 0.00;
         for (Transacao n: transacoes){
             if(n instanceof Receita){
                int anoComparar = n.getData().getYear();
                int mesComparar = n.getData().getMonth().getValue();
                    if (mesComparar == mes && anoComparar == ano){
                        percentualReceitas += n.calcularTotal();
                    }
                }
         }
        return percentualReceitas;
    }

    public double percentualDespesasNoMes(int mes, int ano){
        double percentualDespesas = 0.00;
         for (Transacao n: transacoes){
             if(n instanceof Despesa){
                int anoComparar = n.getData().getYear();
                int mesComparar = n.getData().getMonth().getValue();
                    if (mesComparar == mes && anoComparar == ano){
                        percentualDespesas += n.calcularTotal();
                    }
                }
         }
        return percentualDespesas;
    }

    public double saldoAtual(){
        double totalReceitas = 0.0;
        double totalDespesas = 0.0;

        for (Transacao n: transacoes){

            if (n instanceof Receita){
                totalReceitas += n.calcularTotal();
            }

            if (n instanceof Despesa){
                totalDespesas += n.calcularTotal();
            }
        }
    
        return totalReceitas - totalDespesas;
    }

    public ArrayList <Transacao> listarTransacoesNoMes(int mes, int ano){
        ArrayList <Transacao> listarTransacoes = new ArrayList<>(10);
         for (Transacao n: this.transacoes){
                int anoComparar = n.getData().getYear();
                int mesComparar = n.getData().getMonth().getValue();
                    if (mesComparar == mes && anoComparar == ano){
                        listarTransacoes.add(n);
                    }
                
         }
        return listarTransacoes;
    }




    
}
