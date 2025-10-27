
package Programa;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Ventana extends JFrame{
    public Ventana() {
        setSize(500, 500); //Establecemos tamaño de ventana
        
        //setLocation(100, 200); //Estableecemos la posicion inicial de la ventana
        setTitle("El mejor titulo"); //Establecemos el titulo
        //setBounds(100, 200, 500, 500); //Establecemos la posicion inicial y el tamaño
        setLocationRelativeTo(null); //Establecemos la ventana en el centro de la pantalla
        //setResizable(false); //Evita que se le pueda cambiar el tamaño a la ventana
        setMinimumSize(new Dimension(200, 200));  //Establece el tamaño minimo para la ventana
        iniciarComponentes();
         
        setDefaultCloseOperation(EXIT_ON_CLOSE); //Al cerrar la ventana, el programa se terminara de ejecutar
    }
    
    private void iniciarComponentes() {
        JPanel panel = new JPanel(); //Creacion de un panel
        //panel.setBackground(Color.green); //Cambiamos el color del panel
        panel.setLayout(null); //Desactivamos el Diseño
        this.getContentPane().add(panel); //Agregamos el panel a la ventana
        JLabel etiqueta = new JLabel(); //Creamos una etiqueta 
        etiqueta.setText("Hola"); //Establecemos el texto de la etiqueta
        etiqueta.setBounds(100, 100, 50, 30);
        panel.add(etiqueta); //Agregamos la etiqueta al panel
    }
}
