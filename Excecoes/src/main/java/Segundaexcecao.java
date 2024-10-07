/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Cristhian
 */
public class Segundaexcecao {
    
    // Método que lança ArithmeticException se o resultado da multiplicação ultrapassar o limite
    public int multiplicar(int a, int b) {
        int resultado = a * b;
        
        // Verifica se o resultado excede o limite de 1000
        if (resultado > 1000) {
            throw new ArithmeticException("Resultado da multiplicação excede o limite de 1000!");
        }
        
        return resultado;
    }
    
}
