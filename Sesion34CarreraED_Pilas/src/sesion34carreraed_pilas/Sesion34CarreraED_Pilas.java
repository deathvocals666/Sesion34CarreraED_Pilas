
package sesion34carreraed_pilas;

import java.util.Stack;
import javax.swing.JOptionPane;


public class Sesion34CarreraED_Pilas {

    
    public static void main(String[] args) {
        //declaracion de pila 
        Stack<Integer> pilaCarrera = new Stack <>();
        
        pilaCarrera.push(100);
        pilaCarrera.push(150);
        pilaCarrera.push(230);
        pilaCarrera.push(10);
        pilaCarrera.push(160);
        
        JOptionPane.showMessageDialog(null  , "Datos de la pila ordenada es: \n"+pilaCarrera);
        
        JOptionPane.showConfirmDialog(null, "Autor ");
        
    }
    
}
