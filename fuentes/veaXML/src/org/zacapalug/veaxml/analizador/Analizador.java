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

import org.zacapalug.veaxml.analizador.reglas.ReglasXSD;
import org.zacapalug.veaxml.analizador.reglas.ReglasXML;

/**
 *
 * @author ilusion-linux
 */
public class Analizador
{
    private final String [] TIPOS_ARCHIVO={"XSD", "XML", "DTD"};
    
    private String tipoArchivo;
    
    private ReglasXML xml;
    private ReglasXSD xsd;
    private Archivo archivo;
    
    /**
     *
     */
    public Analizador()
    {
        inicializar();
    }
    
    /**
     *
     * @param tipoArchivo
     */
    public Analizador(String tipoArchivo)
    {
        this.tipoArchivo=tipoArchivo;
        inicializar();
    }
    
    /**
     *
     * @param direcotiro
     * @return
     */
    public boolean analizar(String direcotiro)
    {
        
        return true;
    }
    
    private void inicializar()
    {
        xml=new ReglasXML();
        xsd=new ReglasXSD();
        archivo=new Archivo();
    }
    
    private String identificarArchivo()
    {
        return "";
    }
    
    private boolean analizarXSD()
    {
        return true;
    }
}
