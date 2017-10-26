
package calculadorat;

import calculadorat.visao.TelaCalculadora;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;


public class Main {

    public static void main(String[] args) {
        try {
        UIManager.setLookAndFeel(
            UIManager.getSystemLookAndFeelClassName());
    } 
    catch (UnsupportedLookAndFeelException | ClassNotFoundException | InstantiationException | IllegalAccessException e) {
    }
        
        new TelaCalculadora().setVisible(true);
    }
    
}
