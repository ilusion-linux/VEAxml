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

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

/**
 *
 * @author ghots
 */
public class Panel extends JPanel implements ActionListener, MouseListener
{
    private final PanelTabs panelTabs;
    
    public Panel(PanelTabs panelTabs)
    {
        this.panelTabs=panelTabs;
    }
    
    
    @Override
    public void paint(Graphics g)
    {
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
    }
    
    @Override
    public void mouseClicked(MouseEvent e)
    {
        System.out.println("Presionando en X="+e.getX()+" y en Y="+e.getY());
    }
    @Override
    public void mousePressed(MouseEvent e) {}
    @Override
    public void mouseReleased(MouseEvent e) {}
    @Override
    public void mouseEntered(MouseEvent e) {}
    @Override
    public void mouseExited(MouseEvent e) {}
}
