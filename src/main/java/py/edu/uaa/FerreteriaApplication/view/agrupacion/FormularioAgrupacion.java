package py.edu.uaa.FerreteriaApplication.view.agrupacion;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;
import py.edu.uaa.FerreteriaApplication.model.Agrupacion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FormularioAgrupacion extends JFrame {

    private JTextField nombreTextField;
    private JTextArea descripcionTextArea;

    public FormularioAgrupacion() {
        setTitle("Formulario de Carga de Agrupación");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(3, 2, 10, 10));
        getContentPane().add(panel);

        placeComponents(panel);

        JButton guardarButton = new JButton("Guardar");
        guardarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guardarAgrupacion();
            }
        });
        panel.add(guardarButton);

    }

    private void placeComponents(JPanel panel) {
        JLabel nombreLabel = new JLabel("Nombre:");
        panel.add(nombreLabel);

        nombreTextField = new JTextField(20);
        panel.add(nombreTextField);

        JLabel descripcionLabel = new JLabel("Descripción:");
        panel.add(descripcionLabel);

        descripcionTextArea = new JTextArea(5, 20);
        panel.add(descripcionTextArea);
    }

    private void guardarAgrupacion() {
        String nombre = nombreTextField.getText();
        String descripcion = descripcionTextArea.getText();

        Agrupacion nuevaAgrupacion = new Agrupacion();
        nuevaAgrupacion.setNombre(nombre);

        RestTemplate restTemplate = new RestTemplate();
        ResponseEntity<Agrupacion> response = restTemplate.exchange("http://localhost:8080/api/agrupaciones",
                HttpMethod.POST, new HttpEntity<>(nuevaAgrupacion), Agrupacion.class);

        JOptionPane.showMessageDialog(this, "Creado con ID: " + response.getBody().getId());



        JOptionPane.showMessageDialog(this, "Agrupación guardada correctamente");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FormularioAgrupacion().setVisible(true);
            }
        });
    }
}
