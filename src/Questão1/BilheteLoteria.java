package Questão1;

import java.util.Arrays;
import java.util.Random;

public class BilheteLoteria {

    //atributos
    private int[] bilhete;

    //construtores
    public BilheteLoteria(int qtdNumeros){
        // a qtd de numeros deve estar entre 6 e 15
        if (qtdNumeros >= 6 && qtdNumeros <= 15){
           this.bilhete = new int[qtdNumeros]; 
        } else {
            System.out.println("Número inválido");
        }

        // gerando numero aleatorio
        Random numero = new Random(); 

        //adicionando numeros ao array bilhete
        int i = 0;
        while (i < this.bilhete.length){
            this.bilhete[i] = numero.nextInt(60) + 1; 
            boolean numerosIguais = false;
            // o laço verifica se existem numeros iguais no array 
            for (int j = 0; j < i; j++){           
                if  (bilhete[j] == bilhete[i]){
                    numerosIguais = true;
                    break;       
                }
            }
            if (!numerosIguais){
                i++;
            }
        }
        // ordenando o array
        Arrays.sort(this.bilhete);    
    }

  // metodos 

  //reescrevendo o metodo toString
  @Override
  public String toString(){
      String bilheteFormatado = "[";
      for (int n = 0; n < this.bilhete.length; n++){
          if (n == this.bilhete.length - 1){
              bilheteFormatado += this.bilhete[n];
              bilheteFormatado += "]";
              break;
          } else {
           bilheteFormatado += this.bilhete[n];
           bilheteFormatado += ", ";
          }
      }
      return bilheteFormatado;
  }

  // verifica se existem numeros iguais e retorna a quantidade de numeros iguais 
  public int verificaNumeros(BilheteLoteria bilheteAvaliado){
    int qtdNumerosIguais = 0;
        for (int i = 0; i < this.bilhete.length; i++){
            for (int j = 0; j < bilheteAvaliado.bilhete.length; j++){
                if ( this.bilhete[i] == bilheteAvaliado.bilhete[j]){
                    qtdNumerosIguais++;
                }
            }
        }
    return qtdNumerosIguais;
  }


    
}
