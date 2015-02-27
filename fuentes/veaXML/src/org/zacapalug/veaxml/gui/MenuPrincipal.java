/*
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
package veaxml.gui;

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

        javax.swing.JSplitPane pnlAreaTrabajo = new javax.swing.JSplitPane();
        javax.swing.JPanel pnlAreaDesplegable = new javax.swing.JPanel();
        javax.swing.JTabbedPane tabTrabajo = new javax.swing.JTabbedPane();
        javax.swing.JPanel pnlProyectos = new javax.swing.JPanel();
        javax.swing.JPanel pnlArchivos = new javax.swing.JPanel();
        javax.swing.JPanel pnlAreaRenderizadora = new javax.swing.JPanel();
        javax.swing.JTabbedPane tabAreas = new javax.swing.JTabbedPane();
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
        javax.swing.JMenuItem itmCambiarTema = new javax.swing.JMenuItem();
        javax.swing.JMenu mnuAyuda = new javax.swing.JMenu();
        javax.swing.JMenuItem itmAcercaDe = new javax.swing.JMenuItem();
        javax.swing.JMenuItem itmDonativo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("veaxml/gui/idiomas/MenuPrincipal"); // NOI18N
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
            .addGap(0, 492, Short.MAX_VALUE)
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
            .addGap(0, 492, Short.MAX_VALUE)
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
            .addComponent(tabAreas, javax.swing.GroupLayout.DEFAULT_SIZE, 685, Short.MAX_VALUE)
        );
        pnlAreaRenderizadoraLayout.setVerticalGroup(
            pnlAreaRenderizadoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabAreas, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
        );

        pnlAreaTrabajo.setRightComponent(pnlAreaRenderizadora);

        lblMsgCorto.setText(bundle.getString("MenuPrincipal.lblMsgCorto.text")); // NOI18N
        lblMsgCorto.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lblMsgInformtivo.setText(bundle.getString("MenuPrincipal.lblMsgInformtivo.text")); // NOI18N
        lblMsgInformtivo.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        mnuArchivo.setText(bundle.getString("MenuPrincipal.mnuArchivo.text")); // NOI18N

        itmAbrir.setText(bundle.getString("MenuPrincipal.itmAbrir.text")); // NOI18N
        mnuArchivo.add(itmAbrir);

        itmGuardar.setText(bundle.getString("MenuPrincipal.itmGuardar.text")); // NOI18N
        mnuArchivo.add(itmGuardar);

        itmGuardarCopia.setText(bundle.getString("MenuPrincipal.itmGuardarCopia.text")); // NOI18N
        mnuArchivo.add(itmGuardarCopia);

        itmSalir.setText(bundle.getString("MenuPrincipal.itmSalir.text")); // NOI18N
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

        itmCambiarTema.setText(bundle.getString("MenuPrincipal.itmCambiarTema.text")); // NOI18N
        mnuConfig.add(itmCambiarTema);

        barMenuPrincipal.add(mnuConfig);

        mnuAyuda.setText(bundle.getString("MenuPrincipal.mnuAyuda.text")); // NOI18N

        itmAcercaDe.setText(bundle.getString("MenuPrincipal.itmAcercaDe.text")); // NOI18N
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
                .addComponent(lblMsgInformtivo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblMsgCorto, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlAreaTrabajo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMsgCorto)
                    .addComponent(lblMsgInformtivo)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}