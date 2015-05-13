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

import javax.swing.JPanel;

/**
 *
 * @author ghots
 */
public abstract class PnlPanelDeTrabajo extends JPanel
{
//<editor-fold defaultstate="collapsed" desc="Variables">
    private final PnlAreaDeTrabajo area;
    
    private boolean confirmar;
//</editor-fold>
    
    /**
     *
     * @param area
     */
    public PnlPanelDeTrabajo(PnlAreaDeTrabajo area)
    {
        this.area=area;
    }
//<editor-fold defaultstate="collapsed" desc="Funciones Publicas">

    /**
     *
     */
        public void cerrarPanel()
    {
        /*
        Opciones pertinentes al cierre de un documento,
        */
        confirmar=true;
    }
    
    /**
     *
     * @return
     */
    public boolean confirmarCierre()
    {
        return confirmar;
    }
    
    /**
     *
     */
    public void personalizarTab()
    {
        area.setTabComponentAt(area.indexOfComponent(this),
            new PnlPanelDeTrabajoTab(area, this));
    }
//</editor-fold>
}
