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
import javax.swing.JOptionPane;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.zacapalug.veaxml.gui.MenuPrincipal;

/**
 *
 * @author ilusion-linux
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
        
        cambiarLookFeel();
        
        principal=new MenuPrincipal(Propiedades.getProgramaLookAndFeel());
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
    
    private static void cambiarLookFeel()
    {
        String look=Propiedades.getProgramaLookAndFeel();
        
        try
        {
            String lookAndFeel=GUIProperties.obtenerLookFeel(look);
            
            if(look!=null && !look.isEmpty())
            {
                UIManager.setLookAndFeel(lookAndFeel);
                cambiarTema();
            }
        }
        catch(ClassNotFoundException | InstantiationException |
            IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            
            JOptionPane.showMessageDialog(null, e.getMessage(), "Error",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private static void cambiarTema()
    {
        LookAndFeel look=UIManager.getLookAndFeel();
        String tema=Propiedades.getProgramaTema();
        
        if(look instanceof com.jtattoo.plaf.acryl.AcrylLookAndFeel)
        {
            com.jtattoo.plaf.acryl.AcrylLookAndFeel.setTheme(tema);
        }
    }
    
    /**
     *
     */
    public static void reinicarVentana()
    {
        Component [] componentes=principal.obtenerArea();
        
        Rectangle savedBounds=principal.getBounds();
        principal.dispose();
        
        cambiarLookFeel();
        
        principal=new MenuPrincipal(Propiedades.getProgramaLookAndFeel());
        //principal.limpiarArea();
        //principal.establecerArea(componentes);
        principal.setBounds(savedBounds);
        principal.setVisible(true);
    }
    
    private static void cierreNoEsperado() throws InterruptedException
    {
        System.out.println("**************");
    }
}