
package Aplicacao;
import Tad.Stack;

public class GameHanoi {
    
    int quantidadeDisco;
    int quantidadeJogadasRealizadas;
    
    Stack torrePrincipal;
    Stack torreDois;
    Stack torreTres;
   
    
   public GameHanoi(int quantidadeDisco ){;
    torrePrincipal= new Stack(quantidadeDisco);
    torreDois= new Stack(quantidadeDisco);
    torreTres= new Stack(quantidadeDisco);
    this.quantidadeDisco=quantidadeDisco;
   }
     
    public int numeroJogadas(){
        return (int) Math.pow(2, this.quantidadeDisco)-1;
    }         
    
    public boolean fazerJogada(Stack torreOrigem, Stack torreDestino){
           if(torreOrigem.size()>=0){
               
               if(torreDestino.size()==0){
                   torreDestino.push(torreOrigem.peek());
                   torreOrigem.pop();
                   this.quantidadeJogadasRealizadas++;
                   return true;   
                   
               } else if(torreOrigem.peek()> torreDestino.peek()){
                       torreDestino.push(torreOrigem.peek());
                       torreOrigem.pop();
                       this.quantidadeJogadasRealizadas++;
                       return true;   
           }
    }
        return false;   
    }
    
    
    public boolean isTerminado(){
        if(torrePrincipal.isEmpty()){
            if(torreDois.isEmpty()){
                if(torreTres.isFull()){
                    System.out.println("VOCÊ GANHOU");
                    return true;
                }
            }
    }if(torreDois.isFull()){
        if(torreTres.isEmpty()){
            System.out.println("VOCÊ GANHOU");
            return true;
        }
    }
        return false;
    
}
    
    public int getNumeroJogadas(){
        return this.quantidadeJogadasRealizadas;
    }
    
    @Override
    public String toString(){
        return "Pilha Principal: \n"+torrePrincipal.toString()+"Torre Dois:\n "+ torreDois.toString()+
                "Torre Três:\n"+torreTres.toString()+"\n"+"Quantidade de Jogadas realizadas:"+getNumeroJogadas()+ "\n"+
                "\nQuantidade de discos:"+this.quantidadeDisco+"\n"+
                "\nO minimo de Jogadas que devem ser realizadas:"+numeroJogadas()+ "\n"+
                "\nTorre foi resolvida:"+isTerminado();
    }
}

