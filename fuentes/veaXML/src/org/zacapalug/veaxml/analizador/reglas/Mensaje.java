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

package org.zacapalug.veaxml.analizador.reglas;

/**
 *
 * @author ghots
 */
public class Mensaje
{
    private String mensaje;
    private String elemento;
    private int linea;
    private int columna;

    /**
     *
     * @param mensaje
     * @param elemento
     * @param linea
     * @param columna
     */
    public Mensaje(String mensaje, String elemento, int linea, int columna)
    {
        this.mensaje=mensaje;
        this.elemento=elemento;
        this.linea=linea;
        this.columna=columna;
    }
//<editor-fold defaultstate="collapsed" desc="Getters y Setters">  

    /**
     *
     * @return
     */
        public String getMensaje() {
        return mensaje;
    }

    /**
     *
     * @param mensaje
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     *
     * @return
     */
    public String getElemento() {
        return elemento;
    }

    /**
     *
     * @param elemento
     */
    public void setElemento(String elemento) {
        this.elemento = elemento;
    }

    /**
     *
     * @return
     */
    public int getLinea() {
        return linea;
    }

    /**
     *
     * @param linea
     */
    public void setLinea(int linea) {
        this.linea = linea;
    }

    /**
     *
     * @return
     */
    public int getColumna() {
        return columna;
    }

    /**
     *
     * @param columna
     */
    public void setColumna(int columna) {
        this.columna = columna;
    }
//</editor-fold>     
}
