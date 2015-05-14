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
package org.zacapalug.veaxml;

import de.sciss.syntaxpane.DefaultSyntaxKit;
import java.awt.Component;
import java.awt.Rectangle;
import org.zacapalug.veaxml.gui.MenuPrincipal;

/**
 *
 * @author ghots
 */
public class VeaXML
{
    private static MenuPrincipal principal;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        DefaultSyntaxKit.initKit();
        
        Propiedades.cargarPropiedades();
        
        principal=new MenuPrincipal();
        principal.setVisible(true);
        
        Runtime.getRuntime().addShutdownHook(new Thread()
        {
            @Override
            public void run()
            {
                try
                {
                    cierreNoEsperado();
                }
                catch(InterruptedException e)
                {
                    System.out.println(e.getMessage());
                }
            }
        });
    }
    
    /**
     *
     */
    public static void reinicarVentana()
    {
        Component [] componentes=principal.obtenerArea();
        
        Rectangle savedBounds=principal.getBounds();
        principal.dispose();
        
        principal=new MenuPrincipal();
        principal.limpiarArea();
        principal.establecerArea(componentes);
        principal.setBounds(savedBounds);
        principal.setVisible(true);
    }
    
    private static void cierreNoEsperado() throws InterruptedException
    {
        System.out.println("**************");
    }
}