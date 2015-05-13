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

import java.util.Map;

/**
 *
 * @author ghots
 */
public class Propiedades
{
    public static final String TIPO_XML="txt/xml";
//<editor-fold defaultstate="collapsed" desc="Variables para nombre de parametros">
    public static final String PROGRAMA_EJECUCION_PRIMERA="programa.ejecucion_primera";
    public static final String PROGRAMA_ESTADO="programa.estado";
    public static final String PROGRAMA_ACTUALIZACION="programa.actualizacion";
    public static final String PROGRAMA_IDIOMA="programa.idioma";
    public static final String PROGRAMA_TEMA="programa.tema";
    public static final String PROGRAMA_LOOK_AND_FEEL="programa.look_and_feel";
    public static final String VENTANA_MAXIMIZADA="ventana.maximizada";
    public static final String VENTANA_ANCHO="ventana.ancho";
    public static final String VENTANA_ALTO="ventana.alto";
    public static final String VENTANA_POSICION_X="ventana.posicion.x";
    public static final String VENTANA_POSICION_Y="ventana.posicion.y";
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Variables para valores de parametros">
    private static String programaEjecucionPrimera;
    private static String programaEstado;
    private static String programaActualizacion;
    private static String programaIdioma;
    private static String programaTema;
    private static String programaLookAndFeel;
    private static String ventanaMaximizada;
    private static Integer ventanaAncho;
    private static Integer ventanaAlto;
    private static Integer ventanaPosicionX;
    private static Integer ventanaPosicionY;
//</editor-fold>
    private static final BaseDeDatos DB=new BaseDeDatos();

//<editor-fold defaultstate="collapsed" desc="Funciones para Propiedades">
    public static void cargarPropiedades()
    {
        if(DB.conectar()==true)
        {
            Map<String, String> parametros=DB.obtenerParametros();

            if(parametros!=null)
            {
                parametros.entrySet().stream().forEach((elemento) ->
                {
                    cargarElemento(elemento.getKey(), elemento.getValue());
                });
            }

            DB.cerrar();
        }
    }

    public static String getProgramaEjecucionPrimera() {
        return programaEjecucionPrimera;
    }

    public static String getProgramaEstado() {
        return programaEstado;
    }

    public static String getProgramaActualizacion() {
        return programaActualizacion;
    }

    public static String getProgramaIdioma() {
        return programaIdioma;
    }

    public static String getProgramaTema() {
        return programaTema;
    }

    public static String getProgramaLookAndFeel() {
        return programaLookAndFeel;
    }

    public static String getVentanaMaximizada() {
        return ventanaMaximizada;
    }

    public static Integer getVentanaAncho() {
        return ventanaAncho;
    }

    public static Integer getVentanaAlto() {
        return ventanaAlto;
    }

    public static Integer getVentanaPosicionX() {
        return ventanaPosicionX;
    }

    public static Integer getVentanaPosicionY() {
        return ventanaPosicionY;
    }
//</editor-fold>
//<editor-fold defaultstate="collapsed" desc="Funciones Privadas">
    private static void cargarElemento(String clave, String valor)
    {
        switch(clave)
        {
            case PROGRAMA_EJECUCION_PRIMERA:
                programaEjecucionPrimera=valor;
                break;
            case PROGRAMA_ESTADO:
                programaEstado=valor;
                break;
            case PROGRAMA_ACTUALIZACION:
                programaActualizacion=valor;
                break;
            case PROGRAMA_IDIOMA:
                programaIdioma=valor;
                break;
            case PROGRAMA_TEMA:
                programaTema=valor;
                break;
            case PROGRAMA_LOOK_AND_FEEL:
                break;
            case VENTANA_MAXIMIZADA:
                ventanaMaximizada=valor;
                break;
            case VENTANA_ANCHO:
                ventanaAncho=Integer.parseInt(valor);
                break;
            case VENTANA_ALTO:
                ventanaAlto=Integer.parseInt(valor);
                break;
            case VENTANA_POSICION_X:
                ventanaPosicionX=Integer.parseInt(valor);
                break;
            case VENTANA_POSICION_Y:
                ventanaPosicionY=Integer.parseInt(valor);
                break;
        }
    }
//</editor-fold>
}
