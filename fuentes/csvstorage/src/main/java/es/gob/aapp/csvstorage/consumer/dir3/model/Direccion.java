/*
 * Copyright (C) 2012-13 MINHAP, Gobierno de España This program is licensed and may be used,
 * modified and redistributed under the terms of the European Public License (EUPL), either version
 * 1.1 or (at your option) any later version as soon as they are approved by the European
 * Commission. Unless required by applicable law or agreed to in writing, software distributed under
 * the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and
 * more details. You should have received a copy of the EUPL1.1 license along with this program; if
 * not, you may find it at http://joinup.ec.europa.eu/software/page/eupl/licence-eupl
 */

//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference
// Implementation, v2.2.4-2
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2015.03.23 at 04:34:03 PM CET
//


package es.gob.aapp.csvstorage.consumer.dir3.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for direccion complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="direccion">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tipoVia" type="{http://impl.manager.directorio.map.es}maxDosCaracteres" minOccurs="0"/>
 *         &lt;element name="nombreVia" type="{http://impl.manager.directorio.map.es}denominacion" minOccurs="0"/>
 *         &lt;element name="numVia" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="complemento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPostal" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="codPais" type="{http://impl.manager.directorio.map.es}tresCaracteres" minOccurs="0"/>
 *         &lt;element name="codComunidad" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codProvincia" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codLocalidad" type="{http://impl.manager.directorio.map.es}cuatroCaracteres" minOccurs="0"/>
 *         &lt;element name="codEntGeografica" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="dirExtranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="locExtranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observaciones" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "direccion",
    propOrder = {"tipoVia", "nombreVia", "numVia", "complemento", "codPostal", "codPais",
        "codComunidad", "codProvincia", "codLocalidad", "codEntGeografica", "dirExtranjera",
        "locExtranjera", "observaciones"})
public class Direccion {

  protected String tipoVia;
  protected String nombreVia;
  protected String numVia;
  protected String complemento;
  protected String codPostal;
  protected String codPais;
  protected String codComunidad;
  protected String codProvincia;
  protected String codLocalidad;
  protected String codEntGeografica;
  protected String dirExtranjera;
  protected String locExtranjera;
  protected String observaciones;

  /**
   * Gets the value of the tipoVia property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getTipoVia() {
    return tipoVia;
  }

  /**
   * Sets the value of the tipoVia property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setTipoVia(String value) {
    this.tipoVia = value;
  }

  /**
   * Gets the value of the nombreVia property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getNombreVia() {
    return nombreVia;
  }

  /**
   * Sets the value of the nombreVia property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setNombreVia(String value) {
    this.nombreVia = value;
  }

  /**
   * Gets the value of the numVia property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getNumVia() {
    return numVia;
  }

  /**
   * Sets the value of the numVia property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setNumVia(String value) {
    this.numVia = value;
  }

  /**
   * Gets the value of the complemento property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getComplemento() {
    return complemento;
  }

  /**
   * Sets the value of the complemento property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setComplemento(String value) {
    this.complemento = value;
  }

  /**
   * Gets the value of the codPostal property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodPostal() {
    return codPostal;
  }

  /**
   * Sets the value of the codPostal property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodPostal(String value) {
    this.codPostal = value;
  }

  /**
   * Gets the value of the codPais property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodPais() {
    return codPais;
  }

  /**
   * Sets the value of the codPais property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodPais(String value) {
    this.codPais = value;
  }

  /**
   * Gets the value of the codComunidad property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodComunidad() {
    return codComunidad;
  }

  /**
   * Sets the value of the codComunidad property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodComunidad(String value) {
    this.codComunidad = value;
  }

  /**
   * Gets the value of the codProvincia property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodProvincia() {
    return codProvincia;
  }

  /**
   * Sets the value of the codProvincia property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodProvincia(String value) {
    this.codProvincia = value;
  }

  /**
   * Gets the value of the codLocalidad property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodLocalidad() {
    return codLocalidad;
  }

  /**
   * Sets the value of the codLocalidad property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodLocalidad(String value) {
    this.codLocalidad = value;
  }

  /**
   * Gets the value of the codEntGeografica property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodEntGeografica() {
    return codEntGeografica;
  }

  /**
   * Sets the value of the codEntGeografica property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodEntGeografica(String value) {
    this.codEntGeografica = value;
  }

  /**
   * Gets the value of the dirExtranjera property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDirExtranjera() {
    return dirExtranjera;
  }

  /**
   * Sets the value of the dirExtranjera property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDirExtranjera(String value) {
    this.dirExtranjera = value;
  }

  /**
   * Gets the value of the locExtranjera property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getLocExtranjera() {
    return locExtranjera;
  }

  /**
   * Sets the value of the locExtranjera property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setLocExtranjera(String value) {
    this.locExtranjera = value;
  }

  /**
   * Gets the value of the observaciones property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getObservaciones() {
    return observaciones;
  }

  /**
   * Sets the value of the observaciones property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setObservaciones(String value) {
    this.observaciones = value;
  }

}