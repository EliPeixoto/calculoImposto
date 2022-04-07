package cap02;
import javax.swing.JOptionPane;
public class Exercicio03 {
    public static void main(String[] args) {
        String aux;
        float transacao, valorVenal, percentualImposto, maior = 0, valorFinal;

        aux = JOptionPane.showInputDialog("Entre com o valor da transação");
        transacao = Float.parseFloat(aux);
    
        aux = JOptionPane.showInputDialog("Entre com o valor venal (informado pela Prefeitura");
        valorVenal = Float.parseFloat(aux);
        
        aux = JOptionPane.showInputDialog("Entre com o Percentual do Imposto");
        percentualImposto = Float.parseFloat(aux);
    
        if(valorVenal>percentualImposto && valorVenal >transacao){
               maior = valorVenal;
            }
        if(percentualImposto>valorVenal && percentualImposto >transacao){
               maior = percentualImposto;
            }
        
        if(transacao>valorVenal && transacao >percentualImposto){
               maior = transacao;
            }
        
        valorFinal = maior * percentualImposto/100;
        
        System.out.println("o valor Final a ser pago é :" +valorFinal);
        }
        }
        
        
