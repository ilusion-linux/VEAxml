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
package org.zacapalug.veaxml;

import java.util.List;
import javax.swing.UIManager;

/**
 *
 * @author ghots
 */
public class GUIProperties
{

    /**
     *
     */
    public static final boolean IS_CUSTOM_ENABLED=false;

    /**
     *
     */
    public static final Integer TEXTURE_TYPE=1;
    private String lookAndFeel=PLAF_ACRYL;
    private String theme="Default";

//<editor-fold defaultstate="collapsed" desc="Look & Feel disponibles">

    /**
     *
     */
        public static final String PLAF_METAL="javax.swing.plaf.metal.MetalLookAndFeel";

    /**
     *
     */
    public static final String PLAF_NIMBUS="com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel";

    /**
     *
     */
    public static final String PLAF_MOTIF="com.sun.java.swing.plaf.motif.MotifLookAndFeel";

    /**
     *
     */
    public static final String PLAF_SYSTEM=UIManager.getSystemLookAndFeelClassName();

    /**
     *
     */
    public static final String PLAF_ACRYL="com.jtattoo.plaf.acryl.AcrylLookAndFeel";

    /**
     *
     */
    public static final String PLAF_AERO="com.jtattoo.plaf.aero.AeroLookAndFeel";

    /**
     *
     */
    public static final String PLAF_ALUMINIUM="com.jtattoo.plaf.aluminium.AluminiumLookAndFeel";

    /**
     *
     */
    public static final String PLAF_BERNSTEIN="com.jtattoo.plaf.bernstein.BernsteinLookAndFeel";

    /**
     *
     */
    public static final String PLAF_FAST="com.jtattoo.plaf.fast.FastLookAndFeel";

    /**
     *
     */
    public static final String PLAF_GRAPHITE="com.jtattoo.plaf.graphite.GraphiteLookAndFeel";

    /**
     *
     */
    public static final String PLAF_HIFI="com.jtattoo.plaf.hifi.HiFiLookAndFeel";

    /**
     *
     */
    public static final String PLAF_LUNA="com.jtattoo.plaf.luna.LunaLookAndFeel";

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
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Temas disponibles por tema">

    /**
     *
     */
        public static final List ACRYL_TEMA=com.jtattoo.plaf.acryl.AcrylLookAndFeel.getThemes();

    /**
     *
     */
    public static final List AERO_TEMA=com.jtattoo.plaf.aero.AeroLookAndFeel.getThemes();

    /**
     *
     */
    public static final List ALUMINIUM_TEMA=com.jtattoo.plaf.aluminium.AluminiumLookAndFeel.getThemes();

    /**
     *
     */
    public static final List BERNSTEIN_TEMA=com.jtattoo.plaf.bernstein.BernsteinLookAndFeel.getThemes();

    /**
     *
     */
    public static final List FAST_TEMA=com.jtattoo.plaf.fast.FastLookAndFeel.getThemes();

    /**
     *
     */
    public static final List GRAPHITE_TEMA=com.jtattoo.plaf.graphite.GraphiteLookAndFeel.getThemes();

    /**
     *
     */
    public static final List HIFI_TEMA=com.jtattoo.plaf.hifi.HiFiLookAndFeel.getThemes();

    /**
     *
     */
    public static final List LUNA_TEMA=com.jtattoo.plaf.luna.LunaLookAndFeel.getThemes();

    /**
     *
     */
    public static final List MCWIN_TEMA=com.jtattoo.plaf.mcwin.McWinLookAndFeel.getThemes();

    /**
     *
     */
    public static final List MINT_TEMA=com.jtattoo.plaf.mint.MintLookAndFeel.getThemes();

    /**
     *
     */
    public static final List NOIRE_TEMA=com.jtattoo.plaf.noire.NoireLookAndFeel.getThemes();

    /**
     *
     */
    public static final List SMART_TEMA=com.jtattoo.plaf.smart.SmartLookAndFeel.getThemes();

    /**
     *
     */
    public static final List TEXTURE_TEMA=com.jtattoo.plaf.texture.TextureLookAndFeel.getThemes();
//</editor-fold>
    
    /**
     *
     */
    public GUIProperties(){}

//<editor-fold defaultstate="collapsed" desc="Getters y Setters">

    /**
     *
     * @param aLookAndFeel
     */
        public void setLookAndFeel(String aLookAndFeel) {
        lookAndFeel = aLookAndFeel;
    }

    /**
     *
     * @return
     */
    public String getLookAndFeel() {
        return lookAndFeel;
    }

    /**
     *
     * @param aTheme
     */
    public void setTheme(String aTheme) {
        theme = aTheme;
    }

    /**
     *
     * @return
     */
    public String getTheme() {
        return theme;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Variables que determinan el look and feel utilizado">

    /**
     *
     * @param nombre
     * @return
     */
        public static String obtenerLookFeel(String nombre)
    {
        if(PLAF_METAL.contains(nombre))
        {
            return PLAF_METAL;
        }
        else if(PLAF_NIMBUS.contains(nombre))
        {
            return PLAF_NIMBUS;
        }
        else if(PLAF_MOTIF.contains(nombre))
        {
            return PLAF_MOTIF;
        }
        else if(PLAF_SYSTEM.contains(nombre))
        {
            return PLAF_SYSTEM;
        }
        else if(PLAF_ACRYL.contains(nombre))
        {
            return PLAF_ACRYL;
        }
        else if(PLAF_AERO.contains(nombre))
        {
            return PLAF_AERO;
        }
        else if(PLAF_ALUMINIUM.contains(nombre))
        {
            return PLAF_ALUMINIUM;
        }
        else if(PLAF_BERNSTEIN.contains(nombre))
        {
            return PLAF_BERNSTEIN;
        }
        else if(PLAF_FAST.contains(nombre))
        {
            return PLAF_FAST;
        }
        else if(PLAF_GRAPHITE.contains(nombre))
        {
            return PLAF_GRAPHITE;
        }
        else if(PLAF_HIFI.contains(nombre))
        {
            return PLAF_HIFI;
        }
        else if(PLAF_LUNA.contains(nombre))
        {
            return PLAF_LUNA;
        }
        else if(PLAF_MCWIN.contains(nombre))
        {
            return PLAF_MCWIN;
        }
        else if(PLAF_MINT.contains(nombre))
        {
            return PLAF_MINT;
        }
        else if(PLAF_NOIRE.contains(nombre))
        {
            return PLAF_NOIRE;
        }
        else if(PLAF_SMART.contains(nombre))
        {
            return PLAF_SMART;
        }
        else if(PLAF_TEXTURE.contains(nombre))
        {
            return PLAF_TEXTURE;
        }
        else
        {
            return "";
        }
    }

    /**
     *
     * @return
     */
    public boolean isMetalLook() {
        return lookAndFeel.equals(PLAF_METAL);
    }

    /**
     *
     * @return
     */
    public boolean isNimbusLook() {
        return lookAndFeel.equals(PLAF_NIMBUS);
    }

    /**
     *
     * @return
     */
    public boolean isMotifLook() {
        return lookAndFeel.equals(PLAF_MOTIF);
    }

    /**
     *
     * @return
     */
    public boolean isSystemLook() {
        return lookAndFeel.equals(PLAF_SYSTEM);
    }

    /**
     *
     * @return
     */
    public boolean isAcrylLook() {
        return lookAndFeel.equals(PLAF_ACRYL);
    }

    /**
     *
     * @return
     */
    public boolean isAeroLook() {
        return lookAndFeel.equals(PLAF_AERO);
    }

    /**
     *
     * @return
     */
    public boolean isAluminiumLook() {
        return lookAndFeel.equals(PLAF_ALUMINIUM);
    }

    /**
     *
     * @return
     */
    public boolean isBernsteinLook() {
        return lookAndFeel.equals(PLAF_BERNSTEIN);
    }

    /**
     *
     * @return
     */
    public boolean isFastLook() {
        return lookAndFeel.equals(PLAF_FAST);
    }

    /**
     *
     * @return
     */
    public boolean isGraphiteLook() {
        return lookAndFeel.equals(PLAF_GRAPHITE);
    }

    /**
     *
     * @return
     */
    public boolean isHiFiLook() {
        return lookAndFeel.equals(PLAF_HIFI);
    }

    /**
     *
     * @return
     */
    public boolean isLunaLook() {
        return lookAndFeel.equals(PLAF_LUNA);
    }

    /**
     *
     * @return
     */
    public boolean isMcWinLook() {
        return lookAndFeel.equals(PLAF_MCWIN);
    }

    /**
     *
     * @return
     */
    public boolean isMintLook() {
        return lookAndFeel.equals(PLAF_MINT);
    }

    /**
     *
     * @return
     */
    public boolean isNoireLook() {
        return lookAndFeel.equals(PLAF_NOIRE);
    }

    /**
     *
     * @return
     */
    public boolean isSmartLook() {
        return lookAndFeel.equals(PLAF_SMART);
    }

    /**
     *
     * @return
     */
    public boolean isTextureLook() {
        return lookAndFeel.equals(PLAF_TEXTURE);
    }

    /**
     *
     * @return
     */
    public static boolean isCustomEnabled() {
        return IS_CUSTOM_ENABLED;
    }
//</editor-fold>
}
