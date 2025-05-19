package net.salesianos;

import javax.swing.JOptionPane;

public class Utilidades {
    public static String pedirTexto(String mensaje) {
        return JOptionPane.showInputDialog(mensaje);
    }

    public static int pedirEntero(String mensaje) {
        try {
            return Integer.parseInt(JOptionPane.showInputDialog(mensaje));
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Número inválido");
            return pedirEntero(mensaje); // repetir
        }
    }


public static int pedirPuntuacion(String mensaje) {
    int puntuacion = pedirEntero(mensaje);
    while (puntuacion < 1 || puntuacion > 5) {
        JOptionPane.showMessageDialog(null, "Debe ser un número del 1 al 5");
        puntuacion = pedirEntero(mensaje);
    }
    return puntuacion;
}
}