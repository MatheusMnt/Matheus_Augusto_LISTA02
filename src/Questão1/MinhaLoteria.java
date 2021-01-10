package Questão1;

//import java.util.ArrayList;

// import java.util.ArrayList;

public class MinhaLoteria {
    public static void main(String[] args) {

     BilheteLoteria bilhetePremiado = new BilheteLoteria(6);

    for ( int i = 6; i <= 15; i++ ) {

        // a solução com ArrayList mostrou-se muito pesada para a máquina
        // ArrayList<E> <BilheteLoteria> bilhetes = new ArrayList<>();

        //contadores simples 
            int numQuadras = 0;
            int numQuinas = 0;
            int numSenas = 0;
            int numJogos = 0;

    
        //laço infinito, ele quebra quando encontra uma mega-sena
        for ( ; ; ){

            //gera um novo objeto do tipo BilheteLoteria a cada interação do laço
            BilheteLoteria bilheteSorteado = new BilheteLoteria(i);

            //bilhetes.add(bilheteSorteado);

            //incrementa o numero de jogos
            numJogos++;
            
            //verifica numeros iguais
            int numerosIguais = bilheteSorteado.verificaNumeros(bilhetePremiado);

            // verifica se são achadas quadras, quinas ou senas
            if ( numerosIguais == 4){
                numQuadras++;
            } else if( numerosIguais == 5){
                numQuinas++;
            } else if (numerosIguais == 6){
                numSenas++;
            }

           // System.out.printf("Sorteio de número %d realizado O bilhete sorteado %s NÃO CONTÉM todos os números do bilhete premiado %s\n", numJogos, bilheteSorteado.toString(), bilhetePremiado.toString());

            // quebra o laço se achar uma sena 
            if (numSenas == 1){
                //limpa o array, mesmo assim, ainda existia o erro de memória
                //bilhetes.clear();

                //imprime o número de jogos, numero de quadras e de quinas dde cada mdalidade de jogo 
                System.out.printf("Jogos de %d números​: você apostou %d vezes para ganhar na mega-sena. Dentre esses jogos, você acertou %d quadras e %d quinas.\n", i, numJogos, numQuadras, numQuinas);
                break;
            }

        }

    }


    }
}

