import py.edu.uaa.FerreteriaApplication.view.agrupacion.MenuAgrupaciones;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuPrincipal extends JFrame {

    public MenuPrincipal() {
        // Configuración del frame principal
        setTitle("Menú Principal");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Crear la barra de menú
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Crear el menú "Archivo"
        JMenu menuArchivo = new JMenu("Archivo");
        menuBar.add(menuArchivo);

        // Crear las opciones del menú "Archivo"
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        JMenuItem opcion2 = new JMenuItem("Opción 2");

        // Agregar un ActionListener para manejar eventos de clic en las opciones
        opcion1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Has seleccionado la Opción 1");
            }
        });

        opcion2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(MenuPrincipal.this, "Has seleccionado la Opción 2");
            }
        });

        // Agregar las opciones al menú "Archivo"
        menuArchivo.add(opcion1);
        menuArchivo.add(opcion2);

        // Crear el menú "Agrupaciones"
        JMenu menuAgrupaciones = new JMenu("Agrupaciones");
        menuBar.add(menuAgrupaciones);

        // Crear una opción para abrir el submenú "MenuAgrupaciones"
        JMenuItem opcionAgrupaciones = new JMenuItem("Abrir MenuAgrupaciones");

        // Agregar un ActionListener para manejar eventos de clic en la opción
        opcionAgrupaciones.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Al hacer clic, crear y mostrar el submenú "MenuAgrupaciones"
                new MenuAgrupaciones().setVisible(true);
            }
        });

        // Agregar la opción al menú "Agrupaciones"
        menuAgrupaciones.add(opcionAgrupaciones);
    }

    public static void main(String[] args) {
        // Crear y mostrar el frame principal
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }
}