/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package calculadora.Subtracao;

/**
 *
 * @author aluno
 */
public class Teste {
    Subtracao s = new Subtracao();
    public void teste(){
            System.out.println("Subtração");
        
        System.out.println(s.subtracao(1, -1));
        System.out.println(s.subtracao(2, 2));
        System.out.println(s.subtracao(2, 3));
        System.out.println(s.subtracao(999999999, 999999999));
       // System.out.println(s.subtracao(-999999999, 999999999)); aqui podemos ter um problema pois o número negativo é muito maior que o inteiro
    }
}
