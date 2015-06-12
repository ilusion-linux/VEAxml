/*
 * Copyright (C) 2015 ilusion-linux
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

import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ilusion-linux
 */
public class PnlPanelDeTrabajoTab extends JPanel
{

    /**
     *
     * @param area
     * @param panel
     */
    public PnlPanelDeTrabajoTab(PnlAreaDeTrabajo area, PnlPanelDeTrabajo panel)
    {   
        this.setOpaque(false);
        this.add(new JLabel(area.getTitleAt(area.indexOfComponent(panel))));
        this.add(new BtnCerrarPanel(area, panel));
    }
}
