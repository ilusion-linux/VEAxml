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

package org.zacapalug.veaxml.gui.componentes;

import javax.swing.JTabbedPane;
import org.zacapalug.veaxml.gui.PanelInicio;
import org.zacapalug.veaxml.gui.PanelTrabajo;

/**
 *
 * @author ilusion-linux
 */
public class PnlAreaDeTrabajo extends JTabbedPane
{   
    /**
     *
     */
    public PnlAreaDeTrabajo()
    {
        PanelInicio inicio=new PanelInicio(this);
        this.addTab("Panel Inicio", inicio);
        inicio.personalizarTab();
    }
    
    public boolean abrirDocumento()
    {
        return false;
    }
    
    public boolean nuevaArea()
    {
        PanelTrabajo trabajo=new PanelTrabajo(this);
        this.addTab("Nuevo documento", trabajo);
        trabajo.personalizarTab();
        return false;
    }
}
