/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Soma;
/**
 *
 * @author aluno
 */

/*TODO como o número inteiro tende a ter um limite de -+2147483647 ao realizar adição gera-se calculo errado 
em casos de esse número superar o inteiro
Há limite nos parâmetros também para números por se tratar de inteiro*/

public class Teste {
    Soma s = new Soma();
    public void teste(){        
        System.out.println("Soma");
        System.out.println(s.soma(0, 0));
        System.out.println(s.soma(1, -1));
        System.out.println(s.soma(2, 2));
        System.out.println(s.soma(999999999, 999999999));
    }
}
