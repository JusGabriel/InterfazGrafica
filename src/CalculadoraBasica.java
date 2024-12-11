import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraBasica {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculadora Básica");
        frame.setSize(350, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        JLabel titulo = new JLabel("Bienvenido", SwingConstants.CENTER);
        titulo.setBounds(0, 10, 350, 30);
        titulo.setFont(new java.awt.Font("Arial", java.awt.Font.BOLD, 20));

        JLabel etiquetaNumero1 = new JLabel("Número 1:");
        etiquetaNumero1.setBounds(30, 60, 80, 30);

        JTextField campo1 = new JTextField();
        campo1.setBounds(110, 60, 80, 30);

        JLabel etiquetaNumero2 = new JLabel("Número 2:");
        etiquetaNumero2.setBounds(30, 110, 80, 30);

        JTextField campo2 = new JTextField();
        campo2.setBounds(110, 110, 80, 30);

        JButton botonSuma = new JButton("+");
        botonSuma.setBounds(30, 160, 50, 30);

        JButton botonResta = new JButton("-");
        botonResta.setBounds(90, 160, 50, 30);

        JButton botonMultiplicacion = new JButton("*");
        botonMultiplicacion.setBounds(150, 160, 50, 30);

        JButton botonDivision = new JButton("/");
        botonDivision.setBounds(210, 160, 50, 30);

        JLabel etiquetaResultado = new JLabel("Resultado: ");
        etiquetaResultado.setBounds(30, 220, 250, 30);

        ActionListener calculo = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numero1 = Double.parseDouble(campo1.getText());
                    double numero2 = Double.parseDouble(campo2.getText());
                    double resultado = 0;

                    if (e.getSource() == botonSuma) {
                        resultado = numero1 + numero2;
                    } else if (e.getSource() == botonResta) {
                        resultado = numero1 - numero2;
                    } else if (e.getSource() == botonMultiplicacion) {
                        resultado = numero1 * numero2;
                    } else if (e.getSource() == botonDivision) {
                        if (numero2 != 0) {
                            resultado = numero1 / numero2;
                        } else {
                            etiquetaResultado.setText("Error: División por cero");
                            return;
                        }
                    }

                    etiquetaResultado.setText("Resultado: " + resultado);
                } catch (NumberFormatException ex) {
                    etiquetaResultado.setText("Error: Entrada inválida");
                }
            }
        };
        botonSuma.addActionListener(calculo);
        botonResta.addActionListener(calculo);
        botonMultiplicacion.addActionListener(calculo);
        botonDivision.addActionListener(calculo);

        frame.add(titulo);
        frame.add(etiquetaNumero1);
        frame.add(campo1);
        frame.add(etiquetaNumero2);
        frame.add(campo2);
        frame.add(botonSuma);
        frame.add(botonResta);
        frame.add(botonMultiplicacion);
        frame.add(botonDivision);
        frame.add(etiquetaResultado);

        frame.setVisible(true);
    }
}
