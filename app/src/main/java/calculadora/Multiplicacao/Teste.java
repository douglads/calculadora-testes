/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Multiplicacao;

/**
 *
 * @author aluno
 */

/*TODO como o número inteiro tende a ter um limite de -+2147483647 ao realizar mulltiplicação gera-se calculo errado
Há limite nos parâmetros também para números por se tratar de inteiro*/
public class Teste {
    Multiplicacao m = new Multiplicacao();
    public void teste(){
        System.out.println("Multiplicação");
        System.out.println(m.multiplicacao(5, 0));
        System.out.println(m.multiplicacao(1, -1));
        System.out.println(m.multiplicacao(2, 2));
        System.out.println(m.multiplicacao(999999999, 999999999));
    }
}
