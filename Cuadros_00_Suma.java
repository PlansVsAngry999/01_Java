package cuadros_00_suma;
import javax.swing.JOptionPane;
/**
 * Programa que suma dos numeros a traves de cuadros de dialogo.
 * 05 programa -- Jueves 14/09/2023
 * @author Ricardo Daniel Hernandez Sosa G301
 */
public class Cuadros_00_Suma {
    public static void main(String[] args) {
        double ope1,ope2,r;
        String ops1,ops2;
        JOptionPane.showMessageDialog(null,"Suma"); //Imprime un cuadro con un solo boton.
        
        ops1=JOptionPane.showInputDialog("Ingresa el primer numero: ");
        ope1=Double.parseDouble(ops1); //Conversion de tipos (String -> Double)
        //-------------------------
        ops2=JOptionPane.showInputDialog("Ingresa el segundo numero: ");
        ope2=Double.parseDouble(ops2); //Conversion de tipos (String -> Double)
        r = ope1+ope2;
        
        JOptionPane.showMessageDialog(null,"Suma ="+r); //Imprime un cuadro con el resultado de la suma.
    }
    
}
