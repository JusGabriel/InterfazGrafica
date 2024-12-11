import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Pantalla de Login");
        frame.setSize(300, 250);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel etiquetaUsuario = new JLabel("Usuario:");
        etiquetaUsuario.setBounds(30, 30, 80, 30);

        JTextField campoUsuario = new JTextField();
        campoUsuario.setBounds(110, 30, 150, 30);

        JLabel etiquetaContraseña = new JLabel("Contraseña:");
        etiquetaContraseña.setBounds(30, 80, 80, 30);

        JPasswordField campoContraseña = new JPasswordField();
        campoContraseña.setBounds(110, 80, 150, 30);

        JButton botonLogin = new JButton("Iniciar Sesión");
        botonLogin.setBounds(90, 130, 120, 30);

        JLabel mensaje = new JLabel("");
        mensaje.setBounds(30, 180, 250, 30);

        botonLogin.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String usuario = campoUsuario.getText();
                String contraseña = new String(campoContraseña.getPassword());

                if (usuario.equals("APELLIDO") && contraseña.equals("APELLIDO123")) {
                    mensaje.setText("Acceso Correcto");
                } else {
                    mensaje.setText("Usuario o contraseña incorrectos");
                }
            }
        });

        frame.add(etiquetaUsuario);
        frame.add(campoUsuario);
        frame.add(etiquetaContraseña);
        frame.add(campoContraseña);
        frame.add(botonLogin);
        frame.add(mensaje);

        frame.setVisible(true);
    }
}
