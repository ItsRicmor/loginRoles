/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginroles2.exceptions;

/**
 *
 * @author Ricardo Morataya
 */
public class UnauthorizedException extends Exception {
    
    @Override
    public String getMessage(){
        return "El correo o contraseña son incorrectos";
    }

}
