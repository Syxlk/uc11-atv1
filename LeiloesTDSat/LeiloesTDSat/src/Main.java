
import javax.swing.SwingUtilities;

public class Main {

    public static void main(String[] args) {
        
        // Inicializar a tela de cadastro como tela principal
        SwingUtilities.invokeLater(() -> {
            cadastroVIEW telaCadastro = new cadastroVIEW();
            telaCadastro.setVisible(true);
        });
        
    }
    
}
