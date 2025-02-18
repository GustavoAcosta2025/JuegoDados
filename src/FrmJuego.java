import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    public FrmJuego() {
        setSize(500,300);
        setTitle("Jueguemos a los Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        JLabel lblDado1 = new JLabel();
        String nombreImagen="/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        lblDado1.setIcon(imagen);

        lblDado1.setBounds(10,10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado1);

        JLabel lblDado2 = new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10+imagen.getIconWidth(),10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        lblTitulo1.setBounds(50+2*imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160+2*imagen.getIconWidth(), 10, 100, 25);
        getContentPane().add(lblTitulo2);
    }

}
