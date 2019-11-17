
package viborita_serial;

import Interfaz.*;
import java.util.ArrayList;

import logica.*;
/**
 *
 * @author cris
 */
public class Viborita_Serial {
    //lista que maneja las solicitudes de que le llegan al admin
    public static ArrayList<Usuario> listaSolicitudes = new ArrayList<Usuario>();

    //lista que maneja los usuarios ya aceptados por el administrador
    public static ArrayList<Usuario> ListaAceptados = new ArrayList<Usuario>();

    public static void main(String[] args) {

        
        new Login().setVisible(true);
        
    }
    
}
