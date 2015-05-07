/*
 * Copyright (C) 2015 ghots
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
package org.zacapalug.veaxml.gui.componentes;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.net.URL;
import java.util.ResourceBundle;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import org.zacapalug.veaxml.gui.PanelInicio;

/**
 *
 * @author ghots
 */
public class BtnCerrarPanel extends JButton implements ActionListener, MouseListener
{
//<editor-fold defaultstate="collapsed" desc="Variables">
    private final URL URL_ICONO=PanelInicio.class.getResource(
        "iconos/cerrar.png");
    private final URL URL_ICONO_OVER=PanelInicio.class.getResource(
        "iconos/cerrar_over.png");
    private final Icon ICONO=new ImageIcon(URL_ICONO);
    private final Icon ICONO_OVER=new ImageIcon(URL_ICONO_OVER);
    
    private final String KEY_TITLE="BtnCerrarPanel.mensaje";
    private final ResourceBundle IDOMA=ResourceBundle.getBundle(
        "org/zacapalug/veaxml/gui/idiomas/MenuPrincipal");
    
    private final PnlAreaDeTrabajo area;
    private final PnlPanelDeTrabajo panel;
    //</editor-fold>

    public BtnCerrarPanel(PnlAreaDeTrabajo area, PnlPanelDeTrabajo panel)
    {   
        this.area=area;
        this.panel=panel;
        
        this.setBorder(null);
        this.setToolTipText(IDOMA.getString(KEY_TITLE));
        this.setFocusable(false);
        this.setIcon(ICONO);
        
        this.addActionListener(this);
        this.addMouseListener(this);
    }
//<editor-fold defaultstate="collapsed" desc="Eventos">
    @Override
    public void actionPerformed(ActionEvent e)
    {
        int indice=area.indexOfComponent(panel);
        
        if(indice!=-1)
        {
            panel.cerrarPanel();
            if(panel.confirmarCierre()==true)
            {
                area.remove(indice);
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e){}
    @Override
    public void mousePressed(MouseEvent e){}
    @Override
    public void mouseReleased(MouseEvent e){}
    @Override
    public void mouseEntered(MouseEvent e)
    {
        this.setIcon(ICONO_OVER);
    }
    @Override
    public void mouseExited(MouseEvent e)
    {
        this.setIcon(ICONO);
    }
//</editor-fold>
}
