/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercicios;

import javax.swing.JOptionPane;

/**
 *
 * @author operador
 */
public class Exercicios {

    public static void main(String[] args) {

        int soma1;
        int soma2;
        int soma3;
        int soma4;
        int maior;
        int menor;
        String soma;

        JOptionPane.showMessageDialog(null, "olá ! vamos calcular !");
        soma1 = Integer.parseInt(JOptionPane.showInputDialog("digite um numero"));
        soma2 = Integer.parseInt(JOptionPane.showInputDialog("digite o numero da adição! "));

        soma3 = soma1 + soma2;
        JOptionPane.showMessageDialog(null, " resultado " + soma3);

        JOptionPane.showMessageDialog(null, " vamos verificar o < e o >! ");
        soma4 = Integer.parseInt(JOptionPane.showInputDialog("digite o terceiro numero"));

        if (soma1 > soma2) {
            JOptionPane.showMessageDialog(null, "  " + soma1);
            maior = soma1;
            menor = soma2;

        } else {
            JOptionPane.showMessageDialog(null, " esse é o numero intermediario " + soma2);
            maior = soma2;
            menor = soma1;
        }
        if (maior > soma4) {
            JOptionPane.showMessageDialog(null, " este é o numero maior! " + maior);
            
        } else {
            JOptionPane.showMessageDialog(null, " este é o numero maior! " + soma4);
        }
        
        if (menor<soma4) 
        {JOptionPane.showMessageDialog(null, " este é o numero menor! " + menor);
            
        }else   {
        maior = soma4;
        }

    }

}
