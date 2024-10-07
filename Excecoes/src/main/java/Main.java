/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristhian
 */
public static void main(String[] args) {

Primeiraexcecao divisao = new Primeiraexcecao();
Segundaexcecao multiplicacao = new Segundaexcecao();

        try {
            // Tenta dividir por zero, o que deve lançar a exceção
            double resultado = divisao.dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }

         
        
        try {
            // Tenta multiplicar dois números que resultam em um valor acima do limite
            int resultado = multiplicacao.multiplicar(50, 30);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Exceção capturada: " + e.getMessage());
        }
    }
    
