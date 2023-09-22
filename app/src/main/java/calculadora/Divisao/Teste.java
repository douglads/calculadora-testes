/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Divisao;

/**
 *
 * @author aluno
 */
/*TODO divisão por 0 gera erro, divisão que o resto não é 0 por se tratar números inteiros o resto é ignorado
Há limite nos parâmetros também para números por se tratar de inteiro, e números divididos por 0 devem ter tratamento em de try catch*/
public class Teste {
    Divisao d = new Divisao();
    public void teste(){
        System.out.println("Divisão");
        System.out.println(d.divisao(1, -1));
        System.out.println(d.divisao(2, 2));
        System.out.println(d.divisao(2, 3));
        System.out.println(d.divisao(2147483647, 2147483647));
//        System.out.println(d.divisao(2147483647, 0));
    }
}
