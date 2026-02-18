import javax.swing.*;
public class Calculadora {
public static void main(String[] args) {

    double num1 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el primer numero"));
    double num2 = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el segundo numero"));
    String operacion = JOptionPane.showInputDialog("Ingrese la operacion a realizar (+, -, *, /)");
    double resultado = 0;
    switch (operacion) {
        case "+":
            resultado = num1 + num2;
            JOptionPane.showMessageDialog(null, "El resultado de la suma es: "+resultado);
            break;
        case "-":
            resultado = num1 - num2;
            JOptionPane.showMessageDialog(null, "El resultado de la resta es: "+resultado);
            break;
        case "*":
            resultado = num1 * num2;
            JOptionPane.showMessageDialog(null, "El resultado de la multiplicacion es: "+resultado);
            break;
        case "/":
            resultado = num1 / num2;
            JOptionPane.showMessageDialog(null, "El resultado de la division es: "+resultado);
            break;
        default:
            JOptionPane.showMessageDialog(null, "Operacion no valida");
    }
    }}

