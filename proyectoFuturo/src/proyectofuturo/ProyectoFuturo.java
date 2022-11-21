/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectofuturo;

/**
 *
 * @author elena
 */
public class ProyectoFuturo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Estudiante " + args[0] + " " + args[1]);
        System.out.println(veredicto(args[3], args[2]));
        
    }
    private static String veredicto(String valor1, String valor2) {
        if (valor1.equals(valor2)) {
            return "Bien. Pero deberias estudiar más tiempo.";
        }
        if (Integer.valueOf(valor1) < Integer.valueOf(valor2)) {
            return "Dedicas poco tiempo a estudiar.";
        }
        return "Perfecto. Trabajas suficiente en casa.";        
    }
}