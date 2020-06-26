/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aplicacao;

import java.util.Scanner;

/**
 *
 * @author Emerson Silveira
 */
public class AppGameHanoi {
    public static void main(String[] args) {
       Scanner entrada = new Scanner(System.in);
       Scanner entrada2 = new Scanner(System.in);
       
       int quantidadeDiscos;
       int valorDisco;
       String torreOrigem="";
       String torreDestino="";
       int torre;
       
       
       System.out.println("=======GAME TORRE DE HANOI=======");
       
        System.out.println("Digite a Quantidade de Discos");
        quantidadeDiscos= entrada.nextInt();
        GameHanoi jogo = new GameHanoi(quantidadeDiscos);
        System.out.println("Comece a digitar os valores de cada disco.");
        System.out.println("LEMBRANDO que não pode passar a quantidade de:"+quantidadeDiscos+" discos, Escolhida por você");
        
        do{
            System.out.println("Digite os atributos de cada disco");
            System.out.println("Falta: "+(quantidadeDiscos-jogo.torrePrincipal.size())+" discos para serem colocado o valor");
            valorDisco= entrada.nextInt();
            jogo.torrePrincipal.push(valorDisco);
            
        }while(jogo.torrePrincipal.size()<quantidadeDiscos);
        
        do{
           System.out.println("");
        System.out.println("=======VAMOS INICIAR O JOGO=======");
        System.out.println("");
        System.out.println("ESCOLHA A TORRE DE ORIGEM E A TORRE DE DESTINO");
        System.out.println("LEMBRANDO: Digite o numero correspondente a sequência que você quer");
        System.out.println("DIGITO: 1 - Da torre 1 (A QUE VOCÊ EMPILHOU OS SEUS DISCOS NO INICIO) Para a torre 2");
        System.out.println("DIGITO: 2 - Da torre 1 (A QUE VOCÊ EMPILHOU OS SEUS DISCOS NO INICIO) Para a torre 3");
        System.out.println("DIGITO: 3 - Da torre 2 Para a torre 1 (A QUE VOCÊ EMPILHOU OS SEUS DISCOS NO INICIO)");
        System.out.println("DIGITO: 4 - Da torre 2 Para a torre 3");
        System.out.println("DIGITO: 5 - Da torre 3 Para a torre 1 (A QUE VOCÊ EMPILHOU OS SEUS DISCOS NO INICIO)");
        System.out.println("DIGITO: 6 - Da torre 3 Para a torre 2");
        System.out.println("Se quiser sair do jogo, digite 11");
        
        
        torre= entrada.nextInt();
        switch(torre){
            
            case 1:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torrePrincipal, jogo.torreDois)+"\n");
                System.out.println(jogo.toString());
                break;
                
            case 2:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torrePrincipal, jogo.torreTres)+"\n");                ;
                System.out.println(jogo.toString());
                 break;
                
            case 3:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torreDois, jogo.torrePrincipal)+"\n");
                System.out.println(jogo.toString());
                break;
                
            case 4:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torreDois, jogo.torreTres)+"\n");
                System.out.println(jogo.toString());
                break;                
                
            case 5:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torreTres, jogo.torrePrincipal)+"\n");
                System.out.println(jogo.toString());
                break;
                
            case 6:
                System.out.println("Jogada foi realizada:"+jogo.fazerJogada(jogo.torreTres, jogo.torreDois)+"\n");
                System.out.println(jogo.toString());
                break;   
        }
        
        }while(torre<=10);
        
}
}

