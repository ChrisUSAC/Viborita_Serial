 
package logica;

/**
 *
 * @author cris
 */
public class Usuario {
    
       //metodo constructor el cual 
    public Usuario(String usuario,String contraseña,String tiempoActual,String puntosActuales,String nivelActual){
        
        this.usuario = usuario;
        this.contraseña = contraseña;
        this.tiempoActual = tiempoActual;
        this.puntosActuales = puntosActuales;
        this.nivelActual = nivelActual;
        
    }
    
    //usuario,contraseña, tiempoActual, puntosActuales, nivelActual
    public String usuario="",contraseña="",tiempoActual="",puntosActuales="",nivelActual="";

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getTiempoActual() {
        return tiempoActual;
    }

    public void setTiempoActual(String tiempoActual) {
        this.tiempoActual = tiempoActual;
    }

    public String getPuntosActuales() {
        return puntosActuales;
    }

    public void setPuntosActuales(String puntosActuales) {
        this.puntosActuales = puntosActuales;
    }

    public String getNivelActual() {
        return nivelActual;
    }

    public void setNivelActual(String nivelActual) {
        this.nivelActual = nivelActual;
    }
    
    
 
    
}
