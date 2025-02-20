import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class FrmJuego extends JFrame {

    private Dado dado1, dado2;
    private Random r = new Random();
    private JLabel lblDado1, lblDado2, lblLanzamientos, lblCenas;
    private int lanzamientos, cenas;

    public FrmJuego() {
        setSize(500,300);
        setTitle("Jueguemos a los Dados");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setLayout(null);

        lblDado1 = new JLabel();
        String nombreImagen="/imagenes/1.jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        lblDado1.setIcon(imagen);

        lblDado1.setBounds(10,10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado1);

        lblDado2 = new JLabel();
        lblDado2.setIcon(imagen);
        lblDado2.setBounds(10+imagen.getIconWidth(),10, imagen.getIconWidth(), imagen.getIconHeight());
        getContentPane().add(lblDado2);

        JLabel lblTitulo1 = new JLabel("Lanzamientos");
        lblTitulo1.setBounds(50+2*imagen.getIconWidth(), 10, 100, 25);
        lblTitulo1.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo1);

        JLabel lblTitulo2 = new JLabel("Cenas");
        lblTitulo2.setBounds(160+2*imagen.getIconWidth(), 10, 100, 25);
        lblTitulo2.setHorizontalAlignment(SwingConstants.CENTER);
        getContentPane().add(lblTitulo2);

        lblLanzamientos = new JLabel();
        lblLanzamientos.setBounds(50 + 2*imagen.getIconWidth(), 40, 100, 100);
        lblLanzamientos.setBackground(new Color (0,0,0));
        lblLanzamientos.setForeground(new Color (51, 255, 0));
        lblLanzamientos.setFont(new Font("Tahoma",1,72));
        lblLanzamientos.setText("0");
        lblLanzamientos.setOpaque(true);
        lblLanzamientos.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblLanzamientos);

        lblCenas = new JLabel();
        lblCenas.setBounds(160 + 2*imagen.getIconWidth(), 40, 100, 100);
        lblCenas.setBackground(new Color (0,0,0));
        lblCenas.setForeground(new Color (51, 255, 0));
        lblCenas.setFont(new Font("Tahoma",1,72));
        lblCenas.setText("0");
        lblCenas.setOpaque(true);
        lblCenas.setHorizontalAlignment(SwingConstants.RIGHT);
        getContentPane().add(lblCenas);

        JButton btonIniciar = new JButton("Iniciar");
        btonIniciar.setBounds(10, 15 + imagen.getIconHeight(), 100, 25);
        getContentPane().add(btonIniciar);

        JButton btonLanzar = new JButton("Lanzar");
        btonLanzar.setBounds(10, 45 + imagen.getIconHeight(), 100, 25);
        getContentPane().add(btonLanzar);

        btonIniciar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                iniciar();
            }
            
        });

        btonLanzar.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                lanzar();
            }
            
        });

        dado1 = new Dado();
        dado2 = new Dado();
        lanzamientos = 0;
        cenas = 0;
    }

    private void iniciar(){
        lanzamientos = 0;
        cenas = 0;
        lblLanzamientos.setText("0");
        lblCenas.setText("0");
    }

    private void lanzar(){
        dado1.lanzar(r);
        dado2.lanzar(r);

        dado1.mostrar(lblDado1);
        dado2.mostrar(lblDado2);

        lanzamientos++;
        lblLanzamientos.setText(String.valueOf(lanzamientos));

        if (dado1.getNumeto() + dado2.getNumeto() >= 11) {
        cenas++;
        lblCenas.setText(String.valueOf(cenas));
        }
    }
}
