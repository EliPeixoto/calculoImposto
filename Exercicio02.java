package cap02;
import java.util.*;
public class Exercicio02 {
    public static void main(String[] args) {
        int pontosLider, pontosLanterna,vitoria, lideranca;
        Scanner sc;
        try{
            System.out.println("Entre com os pontos do Lider");
            sc = new Scanner (System.in);
            pontosLider = (int) sc.nextFloat();
            
            System.out.println("Entre com os pontos do Lanterna");
            sc = new Scanner (System.in);
            pontosLanterna = (int) sc.nextFloat();
            
            lideranca = (pontosLider - pontosLanterna)/3;
            
            System.out.println("O lanterna precisa de " + lideranca + " pontos para alcancar o Lider");
        }catch (NumberFormatException e){
            System.out.println("Houve um erro na conversão,"
                    + " digite apenas caracteres numéricos");
}
        
        
    }
}
