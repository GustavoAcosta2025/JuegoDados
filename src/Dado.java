import java.util.Random;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class Dado {

    private int numero;

    public void lanzar(Random r){
        //agregar numero aleatorio del 1 al 6
        numero = r.nextInt(6) + 1;
    }

    public int getNumeto (){
        return numero;
    }

    public void mostrar (JLabel lbl) {
        String nombreImagen="/imagenes/"+ String.valueOf(numero) +".jpg";
        ImageIcon imagen = new ImageIcon(getClass().getResource(nombreImagen));
        lbl.setIcon(imagen);
    }
}
