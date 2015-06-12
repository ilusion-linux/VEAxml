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
package org.zacapalug.veaxml;

import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author ilusion-linux
 */
public class GUIProperties
{
    private static String lookAndFeel;

//<editor-fold defaultstate="collapsed" desc="Look & Feel disponibles">

    /**
     *
     */
    private static final String PLAF_METAL="javax.swing.plaf.metal.MetalLookAndFeel";

    /**
     *
     */
    private static final String PLAF_NIMBUS="com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

    /**
     *
     */
    private static final String PLAF_MOTIF="com.sun.java.swing.plaf.motif.MotifLookAndFeel";

    /**
     *
     */
    private static final String PLAF_SYSTEM=UIManager.getSystemLookAndFeelClassName();

    /**
     *
     */
    private static final String PLAF_ACRYL="com.jtattoo.plaf.acryl.AcrylLookAndFeel";

    /**
     *
     */
    private static final String PLAF_AERO="com.jtattoo.plaf.aero.AeroLookAndFeel";

    /**
     *
     */
    private static final String PLAF_ALUMINIUM="com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";

    /**
     *
     */
    private static final String PLAF_BERNSTEIN="com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";

    /**
     *
     */
    private static final String PLAF_FAST="com.jtattoo.plaf.fast.FastLookAndFeel";

    /**
     *
     */
    private static final String PLAF_GRAPHITE="com.jtattoo.plaf.graphite.GraphiteLookAndFeel";

    /**
     *
     */
    private static final String PLAF_HIFI="com.jtattoo.plaf.hifi.HiFiLookAndFeel";

    /**
     *
     */
    private static final String PLAF_LUNA="com.jtattoo.plaf.luna.LunaLookAndFeel";

    /**
     *
     */
    public static final String PLAF_MCWIN="com.jtattoo.plaf.mcwin.McWinLookAndFeel";

    /**
     *
     */
    public static final String PLAF_MINT="com.jtattoo.plaf.mint.MintLookAndFeel";

    /**
     *
     */
    public static final String PLAF_NOIRE="com.jtattoo.plaf.noire.NoireLookAndFeel";

    /**
     *
     */
    public static final String PLAF_SMART="com.jtattoo.plaf.smart.SmartLookAndFeel";

    /**
     *
     */
    public static final String PLAF_TEXTURE="com.jtattoo.plaf.texture.TextureLookAndFeel";
    public static final String PLAF_QUAQUA="ch.randelshofer.quaqua.QuaquaLookAndFeel";
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Temas disponibles por tema">

    /**
     *
     */
    private static final List ACRYL_TEMA=com.jtattoo.plaf.acryl.AcrylLookAndFeel.getThemes();

    /**
     *
     */
    private static final List AERO_TEMA=com.jtattoo.plaf.aero.AeroLookAndFeel.getThemes();

    /**
     *
     */
    private static final List ALUMINIUM_TEMA=com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.getThemes();

    /**
     *
     */
    private static final List BERNSTEIN_TEMA=com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.getThemes();

    /**
     *
     */
    private static final List FAST_TEMA=com.jtattoo.plaf.fast.FastLookAndFeel.getThemes();

    /**
     *
     */
    private static final List GRAPHITE_TEMA=com.jtattoo.plaf.graphite.GraphiteLookAndFeel.getThemes();

    /**
     *
     */
    private static final List HIFI_TEMA=com.jtattoo.plaf.hifi.HiFiLookAndFeel.getThemes();

    /**
     *
     */
    private static final List LUNA_TEMA=com.jtattoo.plaf.luna.LunaLookAndFeel.getThemes();

    /**
     *
     */
    private static final List MCWIN_TEMA=com.jtattoo.plaf.mcwin.McWinLookAndFeel.getThemes();

    /**
     *
     */
    private static final List MINT_TEMA=com.jtattoo.plaf.mint.MintLookAndFeel.getThemes();

    /**
     *
     */
    private static final List NOIRE_TEMA=com.jtattoo.plaf.noire.NoireLookAndFeel.getThemes();

    /**
     *
     */
    private static final List SMART_TEMA=com.jtattoo.plaf.smart.SmartLookAndFeel.getThemes();

    /**
     *
     */
    private static final List TEXTURE_TEMA=com.jtattoo.plaf.texture.TextureLookAndFeel.getThemes();
//</editor-fold>
    
    /**
     *
     */
    public GUIProperties(){}

//<editor-fold defaultstate="collapsed" desc="Getters y Setters">

    public static List obtenerTemas(){
        if(lookAndFeel.equalsIgnoreCase(PLAF_ACRYL)==true)
        {
            return ACRYL_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_AERO)==true)
        {
            return AERO_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_ALUMINIUM)==true)
        {
            return ALUMINIUM_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_BERNSTEIN)==true)
        {
            return BERNSTEIN_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_FAST)==true)
        {
            return FAST_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_GRAPHITE)==true)
        {
            return GRAPHITE_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_HIFI)==true)
        {
            return HIFI_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_LUNA)==true)
        {
            return LUNA_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_MCWIN)==true)
        {
            return MCWIN_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_MINT)==true)
        {
            return MINT_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_NOIRE)==true)
        {
            return NOIRE_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_SMART)==true)
        {
            return SMART_TEMA;
        }
        else if(lookAndFeel.equalsIgnoreCase(PLAF_TEXTURE)==true)
        {
            return TEXTURE_TEMA;
        }
        else
        {
            return null;
        }
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Funciones que determinan el look and feel utilizado">

    /**
     *
     * @param nombre
     * @return
     */
    public static String obtenerLookFeel(String nombre)
    {   
        if(PLAF_METAL.contains(nombre))
        {
            lookAndFeel=PLAF_METAL;
            return PLAF_METAL;
        }
        else if(PLAF_NIMBUS.contains(nombre))
        {
            lookAndFeel=PLAF_NIMBUS;
            return PLAF_NIMBUS;
        }
        else if(PLAF_MOTIF.contains(nombre))
        {
            lookAndFeel=PLAF_MOTIF;
            return PLAF_MOTIF;
        }
        else if(nombre.equals("system"))
        {
            lookAndFeel=PLAF_SYSTEM;
            return PLAF_SYSTEM;
        }
        else if(PLAF_ACRYL.contains(nombre))
        {
            lookAndFeel=PLAF_ACRYL;
            return PLAF_ACRYL;
        }
        else if(PLAF_AERO.contains(nombre))
        {
            lookAndFeel=PLAF_AERO;
            return PLAF_AERO;
        }
        else if(PLAF_ALUMINIUM.contains(nombre))
        {
            lookAndFeel=PLAF_ALUMINIUM;
            return PLAF_ALUMINIUM;
        }
        else if(PLAF_BERNSTEIN.contains(nombre))
        {
            lookAndFeel=PLAF_BERNSTEIN;
            return PLAF_BERNSTEIN;
        }
        else if(PLAF_FAST.contains(nombre))
        {
            lookAndFeel=PLAF_FAST;
            return PLAF_FAST;
        }
        else if(PLAF_GRAPHITE.contains(nombre))
        {
            lookAndFeel=PLAF_GRAPHITE;
            return PLAF_GRAPHITE;
        }
        else if(PLAF_HIFI.contains(nombre))
        {
            lookAndFeel=PLAF_HIFI;
            return PLAF_HIFI;
        }
        else if(PLAF_LUNA.contains(nombre))
        {
            lookAndFeel=PLAF_LUNA;
            return PLAF_LUNA;
        }
        else if(PLAF_MCWIN.contains(nombre))
        {
            lookAndFeel=PLAF_MCWIN;
            return PLAF_MCWIN;
        }
        else if(PLAF_MINT.contains(nombre))
        {
            lookAndFeel=PLAF_MINT;
            return PLAF_MINT;
        }
        else if(PLAF_NOIRE.contains(nombre))
        {
            lookAndFeel=PLAF_NOIRE;
            return PLAF_NOIRE;
        }
        else if(PLAF_SMART.contains(nombre))
        {
            lookAndFeel=PLAF_SMART;
            return PLAF_SMART;
        }
        else if(PLAF_TEXTURE.contains(nombre))
        {
            lookAndFeel=PLAF_TEXTURE;
            return PLAF_TEXTURE;
        }
        else if(PLAF_QUAQUA.contains(nombre))
        {
            lookAndFeel=PLAF_QUAQUA;
            return PLAF_QUAQUA;
        }
        else
        {
            lookAndFeel="";
            return "";
        }
    }
//</editor-fold>
}
