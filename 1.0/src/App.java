import java.util.ArrayList;

import javax.swing.JOptionPane;

import net.salesianos.Barberia;
import net.salesianos.Util;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Barberia> listaBarberia = new ArrayList<>();
        
        String opcion = "";
        do {
            opcion = Util.pedirTexto(
                "Menú:\n1. Añadir\n2. Editar\n3. Mostrar\n4. Mostrar todas las barberías\n5. Eliminar barbería\nQ. Salir");

            switch (opcion) {
                case "1":
                    String nombreNuevo = Util.pedirTexto("Nombre:");
                    String ubicacionNueva = Util.pedirTexto("Ubicación:");
                    String barberosNuevo = Util.pedirTexto("Barberos:");
                    int puntuacionNueva = Util.pedirPuntuacion("Puntuación (1-5):");

                    Barberia nueva = new Barberia();
                    nueva.setNombre(nombreNuevo);
                    nueva.setUbicacion(ubicacionNueva);
                    nueva.setBarberos(barberosNuevo);
                    nueva.setPuntuacion(puntuacionNueva);

                    listaBarberia.add(nueva);
                    break;

                case "2":
                    String nombreEditar = Util.pedirTexto("Nombre de la barbería a editar:");
                    boolean encontradoEditar = false;
                    for (Barberia b : listaBarberia) {
                        if (b.getNombre().equalsIgnoreCase(nombreEditar)) {
                            b.setUbicacion(Util.pedirTexto("Nueva ubicación:"));
                            b.setBarberos(Util.pedirTexto("Nuevos barberos:"));
                            b.setPuntuacion(Util.pedirPuntuacion("Nueva puntuación:"));
                            JOptionPane.showMessageDialog(null, "Editado correctamente");
                            encontradoEditar = true;
                            break;
                        }
                    }
                    if (!encontradoEditar) {
                        JOptionPane.showMessageDialog(null, "Barbería no encontrada");
                    }
                    break;

                case "3":
                    StringBuilder sb = new StringBuilder();
                    for (Barberia b : listaBarberia) {
                        sb.append(b.toString()).append("\n");
                    }
                    JOptionPane.showMessageDialog(null, sb.length() > 0 ? sb.toString() : "No hay barberías para mostrar");
                    break;

                case "4": 
                    if (listaBarberia.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay barberías guardadas");
                    } else {
                        StringBuilder sbMostrar = new StringBuilder();
                        for (Barberia b : listaBarberia) {
                            sbMostrar.append(b.toString()).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, sbMostrar.toString());
                    }
                    break;

                case "5": 
                    if (listaBarberia.isEmpty()) {
                        JOptionPane.showMessageDialog(null, "No hay barberías para eliminar");
                    } else {
                        String nombreEliminar = Util.pedirTexto("Nombre de la barbería a eliminar:");
                        boolean eliminado = false;
                        for (int i = 0; i < listaBarberia.size(); i++) {
                            if (listaBarberia.get(i).getNombre().equalsIgnoreCase(nombreEliminar)) {
                                listaBarberia.remove(i);
                                JOptionPane.showMessageDialog(null, "Eliminado correctamente");
                                eliminado = true;
                                break;
                            }
                        }
                        if (!eliminado) {
                            JOptionPane.showMessageDialog(null, "Barbería no encontrada");
                        }
                    }
                    break;

                case "Q": case "q":
                    JOptionPane.showMessageDialog(null, "Saliendo del programa...");
                    break;

                default:
                    JOptionPane.showMessageDialog(null, "Opción no válida");
            }
        } while (!opcion.equalsIgnoreCase("Q"));
    }
}
