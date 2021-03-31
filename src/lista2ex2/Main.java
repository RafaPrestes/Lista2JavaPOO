/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista2ex2;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Usuário
 */
public class Main {

   
    public static void main(String[] args) {
        
        int opc = 0;
        int numero, idade;
        String nome;
        char sexo;
        double valorAutomovel;
        Apolice apolice = null;
        ArrayList<Apolice> listApolice = new ArrayList<>();
        
        while(opc != 4){
            
            opc = Integer.parseInt(JOptionPane.showInputDialog("1 - Criar Apólice\n2 - Mostrar Todas Apólice"
                    + "\n3 - Mostrar Apólice por número\n 4 - Sair"));
            
            switch (opc){
                case 1: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));
                    nome = JOptionPane.showInputDialog("Nome: ");
                    idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
                    sexo = JOptionPane.showInputDialog("Sexo: ").toUpperCase().charAt(0);
                    valorAutomovel = Double.parseDouble(JOptionPane.showInputDialog("Valor Automóvel: "));
                    
                    apolice = new Apolice(numero, nome, idade, sexo, valorAutomovel);
                    listApolice.add(apolice);
                    break;
                case 2:
                    if (listApolice.size() > 0){
                        String msg ="";
                        for(Apolice ap : listApolice){
                        msg += ap.imprimir() + "\n ------------- \n ";
                        }
                        JOptionPane.showMessageDialog(null, msg);
                    }else{
                        JOptionPane.showMessageDialog(null, "Nenhuma Apólice cadastrada", "Atenção", JOptionPane.WARNING_MESSAGE);
                    }
                        break;
                case 3: 
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero: "));        
                            for(Apolice ap : listApolice){
                                if(ap.getNumero() == numero)
                                     JOptionPane.showMessageDialog(null, ap.imprimir());
                            }
                    break;
                case 4:
                    break;
                default: 
                    JOptionPane.showMessageDialog(null, "Opção inválida", "ERRO", JOptionPane.ERROR_MESSAGE);
                    break;
            }
        }
    }
    
}
