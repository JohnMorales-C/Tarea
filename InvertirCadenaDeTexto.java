import javax.swing.*;
public class InvertirCadenaDeTexto {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese una cadena de texto");
        StringBuilder textoInvertido = new StringBuilder(texto);
        textoInvertido.reverse();
        JOptionPane.showMessageDialog(null, "Texto invertido: " + textoInvertido.toString());
    }
}
