/*
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.zacapalug.veaxml.analizador.reglas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ilusion-linux
 */
public class Reglas
{
    private final String INICIO_COMENTARIO="<!--";
    private final String FIN_COMENTARIO="-->";
    
    private final String SIMBOLO_MAYOR=">";
    private final String SIMBOLO_MENOR="<";
    private final String SIMBOLO_NEGACION="!";
    private final String SIMBOLO_MENOS="-";
    
    private final List<Mensaje> mensajes;
    
    private String buffer;
    private String lectura;
    
    /**
     *
     */
    public Reglas()
    {
        buffer="";
        lectura="";
        mensajes=new ArrayList<Mensaje>();
    }
    
    /**
     *
     * @return
     */
    protected boolean lecturaValida()
    {
        return true;
    }
    
    private boolean esSimboloValido()
    {
        return true;
    }
    private boolean esCaracterValido()
    {
        return true;
    }
//<editor-fold defaultstate="collapsed" desc="Getters y Setters">  

    /**
     *
     * @return
     */
        public List<Mensaje> getMensajes()
    {
        return mensajes;
    }
//</editor-fold> 
}
