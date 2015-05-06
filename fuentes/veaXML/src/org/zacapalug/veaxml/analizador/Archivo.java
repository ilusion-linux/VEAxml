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

package org.zacapalug.veaxml.analizador;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/**
 *
 * @author ghots
 */
public class Archivo
{

    /**
     *Mensaje de exito
     */
    public final String OK="OK";

    /**
     *Mensaje de error cuando no se encuentra un archivo
     */
    public final String NO_EXISTE="El archivo cargado no existe.";

    /**
     *Mensaje de error cuando el archivo no puede ser leido
     */
    public final String NO_LEE="El archivo cargado no se puede leer.";

    /**
     *Mensaje de error cuando el archivo no puede actualizarse
     */
    public final String NO_ESCRIBE="El archivo cargado no se puede actualizar.";
    
    private File cargar;
    
    /**
     *
     * @param archivo es el archivo que debe analizarse
     * @return
     */
    public String archivoCorrecto(String archivo)
    {
        return verificar(archivo);
    }

    /**
     *
     * @return
     */
    public InputStream obtenerContenido()
    {
        if(cargar==null)
        {
            return null;
        }
        
        return new InputStream(){
            @Override
            public int read() throws IOException {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        };
    }

    /**
     *
     * @param contenido
     * @return
     */
    public boolean escribirContenido(InputStream contenido)
    {
        return true;
    }
    
    private String verificar(String archivo)
    {
        try
        {
            cargar=new File(archivo);
            
            if(!cargar.exists())
            {
                return NO_EXISTE;
            }
            else if(!cargar.canRead())
            {
                return NO_LEE;
            }
            else if(!cargar.canWrite())
            {
                return NO_ESCRIBE;
            }
        }
        catch(Exception e)
        {
            return e.getMessage();
        }
        
        return OK;
    }
}
