import javax.swing.*;
public class ContadordeVocalesyConsonantes {
    public static void main(String[] args) {
        String texto = JOptionPane.showInputDialog("Ingrese un texto");
        int vocales = 0;
        int consonantes = 0;
        for (int i = 0; i < texto.length(); i++) {
            char letra = texto.charAt(i);
            if (letra == 'a'|| letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u' || letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
                vocales++;
            } else if (letra >= 'a' && letra <= 'z' || letra >= 'A' && letra <= 'Z') {
                consonantes++;
            }
        }
        JOptionPane.showMessageDialog(null, "Vocales: " + vocales + "\nConsonantes: " + consonantes);
    }
    
}
