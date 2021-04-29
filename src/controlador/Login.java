package controlador;

import java.util.HashMap;

import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;

import controlador.crud.Consultar;
import modelo.Usuario;

public class Login {
	
	private static Logger logger = LogManager.getLogger(Login.class);
	Consultar consultar;
	
	public boolean validarCredenciales(String nombreUsuario, String contrasenha) {
        Usuario usuario = null;
        consultar = new Consultar();
        //Clave-valor del usuario introducido...
        HashMap<String, String> usuarioIntroducido = new HashMap<String, String>();
        usuarioIntroducido.put(nombreUsuario, contrasenha);

        try {
            //Creaci�n de un nuevo usuario a partir del nombre introducido
            usuario = consultar.obtenerUsuarioSegunNombre(nombreUsuario);
            
            //Clave valor del usuario original
            //El usuario original se obtiene a partir del nombre de usuario introducido
            HashMap<String, String> usuarioOriginal = new HashMap<String, String>();
            usuarioOriginal.put(usuario.getNombre(), usuario.getClave());

            //Si los credenciales introducidos son iguales a los almacenados
            if (usuarioIntroducido.equals(usuarioOriginal)) {
            	logger.info("Inicio de sesi�n correcto");
                return true;
            }
            else {
            	logger.error("Credenciales err�neos");
            }
            //Si el usuario no existe, se trata la excepci�n lanzada en este caso
        } catch (NullPointerException npe) {
            System.err.println("Usuario no existente");
            logger.error("El usuario introducido no existe");
        }
        return false;
    }
}
