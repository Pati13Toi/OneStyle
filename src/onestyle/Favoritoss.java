
package onestyle;

import javax.swing.ImageIcon;

public class Favoritoss {

    public static String[] nombres = new String[6];
    public static ImageIcon[] imagenes = new ImageIcon[6];


    public static boolean agregar(String nombre, ImageIcon img) {

        for (int i = 0; i < 6; i++) {
            if (nombres[i] == null) {
                nombres[i] = nombre;
                imagenes[i] = img;
                return true;
            }
        }

        return false;
    }


    public static void limpiar() {
        for (int i = 0; i < 6; i++) {
            nombres[i] = null;
            imagenes[i] = null;
        }
    }
}