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
package org.zacapalug.veaxml.gui;

import java.awt.Component;
import javax.swing.JOptionPane;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import org.zacapalug.veaxml.GUIProperties;
import org.zacapalug.veaxml.VeaXML;

/**
 *
 * @author ghots
 */
public class MenuPrincipal extends javax.swing.JFrame
{

    /**
     * Creates new form MenuPrincipal
     */
    public MenuPrincipal()
    {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.ButtonGroup look_feel = new javax.swing.ButtonGroup();
        javax.swing.JSplitPane pnlAreaTrabajo = new javax.swing.JSplitPane();
        javax.swing.JPanel pnlAreaDesplegable = new javax.swing.JPanel();
        javax.swing.JTabbedPane tabTrabajo = new javax.swing.JTabbedPane();
        javax.swing.JPanel pnlProyectos = new javax.swing.JPanel();
        javax.swing.JPanel pnlArchivos = new javax.swing.JPanel();
        javax.swing.JPanel pnlAreaRenderizadora = new javax.swing.JPanel();
        tabAreas = new org.zacapalug.veaxml.gui.componentes.PnlAreaDeTrabajo();
        javax.swing.JLabel lblMsgCorto = new javax.swing.JLabel();
        javax.swing.JLabel lblMsgInformtivo = new javax.swing.JLabel();
        javax.swing.JMenuBar barMenuPrincipal = new javax.swing.JMenuBar();
        javax.swing.JMenu mnuArchivo = new javax.swing.JMenu();
        javax.swing.JMenuItem itmAbrir = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmGuardar = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmGuardarCopia = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmSalir = new javax.swing.JMenuItem();
        javax.swing.JMenu mnuEditar = new javax.swing.JMenu();
        javax.swing.JMenuItem itmBuscar = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmReemplazar = new javax.swing.JMenuItem();
        javax.swing.JMenu mnuConfig = new javax.swing.JMenu();
        javax.swing.JMenuItem itmOpcionesGenerales = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmCambiarIdioma = new javax.swing.JMenuItem();
        javax.swing.JMenu mnuCambiarTema = new javax.swing.JMenu();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem3 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem4 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator1 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem18 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JPopupMenu.Separator jSeparator2 = new javax.swing.JPopupMenu.Separator();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem5 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem6 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem7 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem8 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem9 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem10 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem11 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem12 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem13 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem14 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem15 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem16 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem17 = new javax.swing.JRadioButtonMenuItem();
        javax.swing.JMenu mnuCabiarApariencia = new javax.swing.JMenu();
        javax.swing.JMenu mnuAyuda = new javax.swing.JMenu();
        javax.swing.JMenuItem itmAcercaDe = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmDonativo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/zacapalug/veaxml/gui/idiomas/MenuPrincipal"); // NOI18N
        setTitle(bundle.getString("MenuPrincipal.title")); // NOI18N

        pnlAreaTrabajo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlAreaTrabajo.setOneTouchExpandable(true);

        pnlAreaDesplegable.setPreferredSize(new java.awt.Dimension(150, 380));

        javax.swing.GroupLayout pnlProyectosLayout = new javax.swing.GroupLayout(pnlProyectos);
        pnlProyectos.setLayout(pnlProyectosLayout);
        pnlProyectosLayout.setHorizontalGroup(
            pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        pnlProyectosLayout.setVerticalGroup(
            pnlProyectosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        tabTrabajo.addTab(bundle.getString("MenuPrincipal.pnlProyectos.TabConstraints.tabTitle"), pnlProyectos); // NOI18N

        javax.swing.GroupLayout pnlArchivosLayout = new javax.swing.GroupLayout(pnlArchivos);
        pnlArchivos.setLayout(pnlArchivosLayout);
        pnlArchivosLayout.setHorizontalGroup(
            pnlArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 145, Short.MAX_VALUE)
        );
        pnlArchivosLayout.setVerticalGroup(
            pnlArchivosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 434, Short.MAX_VALUE)
        );

        tabTrabajo.addTab(bundle.getString("MenuPrincipal.pnlArchivos.TabConstraints.tabTitle"), pnlArchivos); // NOI18N

        javax.swing.GroupLayout pnlAreaDesplegableLayout = new javax.swing.GroupLayout(pnlAreaDesplegable);
        pnlAreaDesplegable.setLayout(pnlAreaDesplegableLayout);
        pnlAreaDesplegableLayout.setHorizontalGroup(
            pnlAreaDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTrabajo)
        );
        pnlAreaDesplegableLayout.setVerticalGroup(
            pnlAreaDesplegableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabTrabajo)
        );

        pnlAreaTrabajo.setLeftComponent(pnlAreaDesplegable);

        javax.swing.GroupLayout pnlAreaRenderizadoraLayout = new javax.swing.GroupLayout(pnlAreaRenderizadora);
        pnlAreaRenderizadora.setLayout(pnlAreaRenderizadoraLayout);
        pnlAreaRenderizadoraLayout.setHorizontalGroup(
            pnlAreaRenderizadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAreas)
        );
        pnlAreaRenderizadoraLayout.setVerticalGroup(
            pnlAreaRenderizadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAreas)
        );

        pnlAreaTrabajo.setRightComponent(pnlAreaRenderizadora);

        lblMsgCorto.setText(bundle.getString("MenuPrincipal.lblMsgCorto.text")); // NOI18N
        lblMsgCorto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMsgInformtivo.setText(bundle.getString("MenuPrincipal.lblMsgInformtivo.text")); // NOI18N
        lblMsgInformtivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mnuArchivo.setText(bundle.getString("MenuPrincipal.mnuArchivo.text")); // NOI18N

        itmAbrir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        itmAbrir.setText(bundle.getString("MenuPrincipal.itmAbrir.text")); // NOI18N
        mnuArchivo.add(itmAbrir);

        itmGuardar.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_G, java.awt.event.InputEvent.CTRL_MASK));
        itmGuardar.setText(bundle.getString("MenuPrincipal.itmGuardar.text")); // NOI18N
        mnuArchivo.add(itmGuardar);

        itmGuardarCopia.setText(bundle.getString("MenuPrincipal.itmGuardarCopia.text")); // NOI18N
        mnuArchivo.add(itmGuardarCopia);

        itmSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
        itmSalir.setText(bundle.getString("MenuPrincipal.itmSalir.text")); // NOI18N
        itmSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmSalirActionPerformed(evt);
            }
        });
        mnuArchivo.add(itmSalir);

        barMenuPrincipal.add(mnuArchivo);

        mnuEditar.setText(bundle.getString("MenuPrincipal.mnuEditar.text")); // NOI18N

        itmBuscar.setText(bundle.getString("MenuPrincipal.itmBuscar.text")); // NOI18N
        mnuEditar.add(itmBuscar);

        itmReemplazar.setText(bundle.getString("MenuPrincipal.itmReemplazar.text")); // NOI18N
        mnuEditar.add(itmReemplazar);

        barMenuPrincipal.add(mnuEditar);

        mnuConfig.setText(bundle.getString("MenuPrincipal.mnuConfig.text")); // NOI18N

        itmOpcionesGenerales.setText(bundle.getString("MenuPrincipal.itmOpcionesGenerales.text")); // NOI18N
        mnuConfig.add(itmOpcionesGenerales);

        itmCambiarIdioma.setText(bundle.getString("MenuPrincipal.itmCambiarIdioma.text")); // NOI18N
        mnuConfig.add(itmCambiarIdioma);

        mnuCambiarTema.setText(bundle.getString("MenuPrincipal.mnuCambiarTema.text")); // NOI18N

        look_feel.add(jRadioButtonMenuItem1);
        jRadioButtonMenuItem1.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem1.text")); // NOI18N
        jRadioButtonMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem1);

        look_feel.add(jRadioButtonMenuItem2);
        jRadioButtonMenuItem2.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem2.text")); // NOI18N
        jRadioButtonMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem2);

        look_feel.add(jRadioButtonMenuItem3);
        jRadioButtonMenuItem3.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem3.text")); // NOI18N
        jRadioButtonMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem3);

        look_feel.add(jRadioButtonMenuItem4);
        jRadioButtonMenuItem4.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem4.text")); // NOI18N
        jRadioButtonMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem4);
        mnuCambiarTema.add(jSeparator1);

        jRadioButtonMenuItem18.setSelected(true);
        jRadioButtonMenuItem18.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem18.text")); // NOI18N
        jRadioButtonMenuItem18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem18);
        mnuCambiarTema.add(jSeparator2);

        look_feel.add(jRadioButtonMenuItem5);
        jRadioButtonMenuItem5.setSelected(true);
        jRadioButtonMenuItem5.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem5.text")); // NOI18N
        jRadioButtonMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem5);

        look_feel.add(jRadioButtonMenuItem6);
        jRadioButtonMenuItem6.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem6.text")); // NOI18N
        jRadioButtonMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem6);

        look_feel.add(jRadioButtonMenuItem7);
        jRadioButtonMenuItem7.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem7.text")); // NOI18N
        jRadioButtonMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem7);

        look_feel.add(jRadioButtonMenuItem8);
        jRadioButtonMenuItem8.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem8.text")); // NOI18N
        jRadioButtonMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem8);

        look_feel.add(jRadioButtonMenuItem9);
        jRadioButtonMenuItem9.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem9.text")); // NOI18N
        jRadioButtonMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem9);

        look_feel.add(jRadioButtonMenuItem10);
        jRadioButtonMenuItem10.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem10.text")); // NOI18N
        jRadioButtonMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem10);

        look_feel.add(jRadioButtonMenuItem11);
        jRadioButtonMenuItem11.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem11.text")); // NOI18N
        jRadioButtonMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem11);

        look_feel.add(jRadioButtonMenuItem12);
        jRadioButtonMenuItem12.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem12.text")); // NOI18N
        jRadioButtonMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem12);

        look_feel.add(jRadioButtonMenuItem13);
        jRadioButtonMenuItem13.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem13.text")); // NOI18N
        jRadioButtonMenuItem13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem13);

        look_feel.add(jRadioButtonMenuItem14);
        jRadioButtonMenuItem14.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem14.text")); // NOI18N
        jRadioButtonMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem14);

        look_feel.add(jRadioButtonMenuItem15);
        jRadioButtonMenuItem15.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem15.text")); // NOI18N
        jRadioButtonMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem15);

        look_feel.add(jRadioButtonMenuItem16);
        jRadioButtonMenuItem16.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem16.text")); // NOI18N
        jRadioButtonMenuItem16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem16);

        look_feel.add(jRadioButtonMenuItem17);
        jRadioButtonMenuItem17.setText(bundle.getString("MenuPrincipal.jRadioButtonMenuItem17.text")); // NOI18N
        jRadioButtonMenuItem17.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cambiarTema(evt);
            }
        });
        mnuCambiarTema.add(jRadioButtonMenuItem17);

        mnuConfig.add(mnuCambiarTema);

        mnuCabiarApariencia.setText(bundle.getString("MenuPrincipal.mnuCabiarApariencia.text")); // NOI18N
        mnuConfig.add(mnuCabiarApariencia);

        barMenuPrincipal.add(mnuConfig);

        mnuAyuda.setText(bundle.getString("MenuPrincipal.mnuAyuda.text")); // NOI18N

        itmAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        itmAcercaDe.setText(bundle.getString("MenuPrincipal.itmAcercaDe.text")); // NOI18N
        itmAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                itmAcercaDeActionPerformed(evt);
            }
        });
        mnuAyuda.add(itmAcercaDe);

        itmDonativo.setText(bundle.getString("MenuPrincipal.itmDonativo.text")); // NOI18N
        mnuAyuda.add(itmDonativo);

        barMenuPrincipal.add(mnuAyuda);

        setJMenuBar(barMenuPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAreaTrabajo)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblMsgInformtivo, javax.swing.GroupLayout.DEFAULT_SIZE, 719, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsgCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAreaTrabajo, javax.swing.GroupLayout.DEFAULT_SIZE, 464, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgCorto)
                    .addComponent(lblMsgInformtivo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//<editor-fold defaultstate="collapsed" desc="Funciones Privadas">

    /**
     *
     */
        public void cerrandoPrograma()
    {
        //Verficando tabs sin guardar y los pasos correspondientes para cerrar,
        //guardando estados importantes
        System.exit(0);
    }
//</editor-fold>
    private void itmSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmSalirActionPerformed
        cerrandoPrograma();
    }//GEN-LAST:event_itmSalirActionPerformed

    private void itmAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_itmAcercaDeActionPerformed
        new AcercaDe(this, true).setVisible(true);
    }//GEN-LAST:event_itmAcercaDeActionPerformed

    private void cambiarTema(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cambiarTema
        try
        {
            JRadioButtonMenuItem look=(JRadioButtonMenuItem) evt.getSource();
            cambiarLookFeel(GUIProperties.obtenerLookFeel(look.getText().toLowerCase()));
        }
        catch(Exception e)
        {
            
        }
    }//GEN-LAST:event_cambiarTema

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane tabAreas;
    // End of variables declaration//GEN-END:variables
    public Component[] obtenerArea()
    {
        return this.tabAreas.getComponents();
    }
    
    public void establecerArea(Component[] componentes)
    {
        for(Component componente : componentes)
        {
            this.tabAreas.add(componente);
        }
    }
            
    public void limpiarArea()
    {
        this.tabAreas.removeAll();
    }
    
    private void cambiarLookFeel(String look)
    {
        try
        {
            if(look!=null && !look.isEmpty())
            {
                UIManager.setLookAndFeel(look);
                VeaXML.reinicarVentana();
            }
        }
        catch(ClassNotFoundException | InstantiationException |
            IllegalAccessException | UnsupportedLookAndFeelException e)
        {
            
            JOptionPane.showMessageDialog(this, e.getMessage(), "",
                JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void cambiarTema(String tema)
    {
        try
        {
            
        }
        catch(Exception e)
        {
            
        }
    }
}