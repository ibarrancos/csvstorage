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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Java class for unidad complex type.
 * 
 * <p>
 * The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="unidad">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="codigo" type="{http://impl.manager.directorio.map.es}codigo"/>
 *         &lt;element name="denominacion" type="{http://impl.manager.directorio.map.es}denominacion"/>
 *         &lt;element name="estado" type="{http://impl.manager.directorio.map.es}estado"/>
 *         &lt;element name="nifCif" type="{http://impl.manager.directorio.map.es}nifCif" minOccurs="0"/>
 *         &lt;element name="siglas" type="{http://impl.manager.directorio.map.es}siglas" minOccurs="0"/>
 *         &lt;element name="nivelAdministracion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="nivelJerarquico" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="codUnidadSuperior" type="{http://impl.manager.directorio.map.es}codigo"/>
 *         &lt;element name="denomUnidadSuperior" type="{http://impl.manager.directorio.map.es}denominacion"/>
 *         &lt;element name="codUnidadRaiz" type="{http://impl.manager.directorio.map.es}codigo"/>
 *         &lt;element name="denomUnidadRaiz" type="{http://impl.manager.directorio.map.es}denominacion"/>
 *         &lt;element name="esEDP" type="{http://impl.manager.directorio.map.es}indicador"/>
 *         &lt;element name="codEDPPrincipal" type="{http://impl.manager.directorio.map.es}codigo" minOccurs="0"/>
 *         &lt;element name="denomEDPPrincipal" type="{http://impl.manager.directorio.map.es}denominacion" minOccurs="0"/>
 *         &lt;element name="codTipoEntPublica" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codTipoUnidad" type="{http://impl.manager.directorio.map.es}maxTresCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbTerritorial" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbEntGeografica" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbPais" type="{http://impl.manager.directorio.map.es}tresCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbComunidad" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbProvincia" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbMunicipio" type="{http://impl.manager.directorio.map.es}cuatroCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbIsla" type="{http://impl.manager.directorio.map.es}dosCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbElm" type="{http://impl.manager.directorio.map.es}cuatroCaracteres" minOccurs="0"/>
 *         &lt;element name="codAmbLocExtranjera" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="competencias" type="{http://impl.manager.directorio.map.es}denominacion" minOccurs="0"/>
 *         &lt;element name="disposicionLegal" type="{http://impl.manager.directorio.map.es}denominacion" minOccurs="0"/>
 *         &lt;element name="fechaAltaOficial" type="{http://impl.manager.directorio.map.es}fecha" minOccurs="0"/>
 *         &lt;element name="fechaBajaOficial" type="{http://impl.manager.directorio.map.es}fecha" minOccurs="0"/>
 *         &lt;element name="fechaExtincion" type="{http://impl.manager.directorio.map.es}fecha" minOccurs="0"/>
 *         &lt;element name="fechaAnulacion" type="{http://impl.manager.directorio.map.es}fecha" minOccurs="0"/>
 *         &lt;element name="codExterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="observGenerales" type="{http://impl.manager.directorio.map.es}observaciones" minOccurs="0"/>
 *         &lt;element name="observBaja" type="{http://impl.manager.directorio.map.es}observaciones" minOccurs="0"/>
 *         &lt;element name="direccion" type="{http://impl.manager.directorio.map.es}direccion" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "unidad",
    propOrder = {"codigo", "denominacion", "estado", "nifCif", "siglas", "nivelAdministracion",
        "nivelJerarquico", "codUnidadSuperior", "denomUnidadSuperior", "codUnidadRaiz",
        "denomUnidadRaiz", "esEDP", "codEDPPrincipal", "denomEDPPrincipal", "codTipoEntPublica",
        "codTipoUnidad", "codAmbTerritorial", "codAmbEntGeografica", "codAmbPais",
        "codAmbComunidad", "codAmbProvincia", "codAmbMunicipio", "codAmbIsla", "codAmbElm",
        "codAmbLocExtranjera", "competencias", "disposicionLegal", "fechaAltaOficial",
        "fechaBajaOficial", "fechaExtincion", "fechaAnulacion", "codExterno", "observGenerales",
        "observBaja", "direccion"})
public class Unidad {

  @XmlElement(required = true)
  protected String codigo;
  @XmlElement(required = true)
  protected String denominacion;
  @XmlElement(required = true)
  protected Estado estado;
  protected String nifCif;
  protected String siglas;
  protected int nivelAdministracion;
  protected int nivelJerarquico;
  @XmlElement(required = true)
  protected String codUnidadSuperior;
  @XmlElement(required = true)
  protected String denomUnidadSuperior;
  @XmlElement(required = true)
  protected String codUnidadRaiz;
  @XmlElement(required = true)
  protected String denomUnidadRaiz;
  @XmlElement(required = true)
  protected Indicador esEDP;
  protected String codEDPPrincipal;
  protected String denomEDPPrincipal;
  protected String codTipoEntPublica;
  protected String codTipoUnidad;
  protected String codAmbTerritorial;
  protected String codAmbEntGeografica;
  protected String codAmbPais;
  protected String codAmbComunidad;
  protected String codAmbProvincia;
  protected String codAmbMunicipio;
  protected String codAmbIsla;
  protected String codAmbElm;
  protected String codAmbLocExtranjera;
  protected String competencias;
  protected String disposicionLegal;
  protected String fechaAltaOficial;
  protected String fechaBajaOficial;
  protected String fechaExtincion;
  protected String fechaAnulacion;
  protected String codExterno;
  protected String observGenerales;
  protected String observBaja;
  protected Direccion direccion;

  /**
   * Gets the value of the codigo property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodigo() {
    return codigo;
  }

  /**
   * Sets the value of the codigo property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodigo(String value) {
    this.codigo = value;
  }

  /**
   * Gets the value of the denominacion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDenominacion() {
    return denominacion;
  }

  /**
   * Sets the value of the denominacion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDenominacion(String value) {
    this.denominacion = value;
  }

  /**
   * Gets the value of the estado property.
   * 
   * @return possible object is {@link Estado }
   * 
   */
  public Estado getEstado() {
    return estado;
  }

  /**
   * Sets the value of the estado property.
   * 
   * @param value allowed object is {@link Estado }
   * 
   */
  public void setEstado(Estado value) {
    this.estado = value;
  }

  /**
   * Gets the value of the nifCif property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getNifCif() {
    return nifCif;
  }

  /**
   * Sets the value of the nifCif property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setNifCif(String value) {
    this.nifCif = value;
  }

  /**
   * Gets the value of the siglas property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getSiglas() {
    return siglas;
  }

  /**
   * Sets the value of the siglas property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setSiglas(String value) {
    this.siglas = value;
  }

  /**
   * Gets the value of the nivelAdministracion property.
   * 
   */
  public int getNivelAdministracion() {
    return nivelAdministracion;
  }

  /**
   * Sets the value of the nivelAdministracion property.
   * 
   */
  public void setNivelAdministracion(int value) {
    this.nivelAdministracion = value;
  }

  /**
   * Gets the value of the nivelJerarquico property.
   * 
   */
  public int getNivelJerarquico() {
    return nivelJerarquico;
  }

  /**
   * Sets the value of the nivelJerarquico property.
   * 
   */
  public void setNivelJerarquico(int value) {
    this.nivelJerarquico = value;
  }

  /**
   * Gets the value of the codUnidadSuperior property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodUnidadSuperior() {
    return codUnidadSuperior;
  }

  /**
   * Sets the value of the codUnidadSuperior property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodUnidadSuperior(String value) {
    this.codUnidadSuperior = value;
  }

  /**
   * Gets the value of the denomUnidadSuperior property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDenomUnidadSuperior() {
    return denomUnidadSuperior;
  }

  /**
   * Sets the value of the denomUnidadSuperior property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDenomUnidadSuperior(String value) {
    this.denomUnidadSuperior = value;
  }

  /**
   * Gets the value of the codUnidadRaiz property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodUnidadRaiz() {
    return codUnidadRaiz;
  }

  /**
   * Sets the value of the codUnidadRaiz property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodUnidadRaiz(String value) {
    this.codUnidadRaiz = value;
  }

  /**
   * Gets the value of the denomUnidadRaiz property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDenomUnidadRaiz() {
    return denomUnidadRaiz;
  }

  /**
   * Sets the value of the denomUnidadRaiz property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDenomUnidadRaiz(String value) {
    this.denomUnidadRaiz = value;
  }

  /**
   * Gets the value of the esEDP property.
   * 
   * @return possible object is {@link Indicador }
   * 
   */
  public Indicador getEsEDP() {
    return esEDP;
  }

  /**
   * Sets the value of the esEDP property.
   * 
   * @param value allowed object is {@link Indicador }
   * 
   */
  public void setEsEDP(Indicador value) {
    this.esEDP = value;
  }

  /**
   * Gets the value of the codEDPPrincipal property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodEDPPrincipal() {
    return codEDPPrincipal;
  }

  /**
   * Sets the value of the codEDPPrincipal property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodEDPPrincipal(String value) {
    this.codEDPPrincipal = value;
  }

  /**
   * Gets the value of the denomEDPPrincipal property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDenomEDPPrincipal() {
    return denomEDPPrincipal;
  }

  /**
   * Sets the value of the denomEDPPrincipal property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDenomEDPPrincipal(String value) {
    this.denomEDPPrincipal = value;
  }

  /**
   * Gets the value of the codTipoEntPublica property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodTipoEntPublica() {
    return codTipoEntPublica;
  }

  /**
   * Sets the value of the codTipoEntPublica property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodTipoEntPublica(String value) {
    this.codTipoEntPublica = value;
  }

  /**
   * Gets the value of the codTipoUnidad property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodTipoUnidad() {
    return codTipoUnidad;
  }

  /**
   * Sets the value of the codTipoUnidad property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodTipoUnidad(String value) {
    this.codTipoUnidad = value;
  }

  /**
   * Gets the value of the codAmbTerritorial property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbTerritorial() {
    return codAmbTerritorial;
  }

  /**
   * Sets the value of the codAmbTerritorial property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbTerritorial(String value) {
    this.codAmbTerritorial = value;
  }

  /**
   * Gets the value of the codAmbEntGeografica property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbEntGeografica() {
    return codAmbEntGeografica;
  }

  /**
   * Sets the value of the codAmbEntGeografica property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbEntGeografica(String value) {
    this.codAmbEntGeografica = value;
  }

  /**
   * Gets the value of the codAmbPais property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbPais() {
    return codAmbPais;
  }

  /**
   * Sets the value of the codAmbPais property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbPais(String value) {
    this.codAmbPais = value;
  }

  /**
   * Gets the value of the codAmbComunidad property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbComunidad() {
    return codAmbComunidad;
  }

  /**
   * Sets the value of the codAmbComunidad property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbComunidad(String value) {
    this.codAmbComunidad = value;
  }

  /**
   * Gets the value of the codAmbProvincia property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbProvincia() {
    return codAmbProvincia;
  }

  /**
   * Sets the value of the codAmbProvincia property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbProvincia(String value) {
    this.codAmbProvincia = value;
  }

  /**
   * Gets the value of the codAmbMunicipio property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbMunicipio() {
    return codAmbMunicipio;
  }

  /**
   * Sets the value of the codAmbMunicipio property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbMunicipio(String value) {
    this.codAmbMunicipio = value;
  }

  /**
   * Gets the value of the codAmbIsla property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbIsla() {
    return codAmbIsla;
  }

  /**
   * Sets the value of the codAmbIsla property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbIsla(String value) {
    this.codAmbIsla = value;
  }

  /**
   * Gets the value of the codAmbElm property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbElm() {
    return codAmbElm;
  }

  /**
   * Sets the value of the codAmbElm property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbElm(String value) {
    this.codAmbElm = value;
  }

  /**
   * Gets the value of the codAmbLocExtranjera property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodAmbLocExtranjera() {
    return codAmbLocExtranjera;
  }

  /**
   * Sets the value of the codAmbLocExtranjera property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodAmbLocExtranjera(String value) {
    this.codAmbLocExtranjera = value;
  }

  /**
   * Gets the value of the competencias property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCompetencias() {
    return competencias;
  }

  /**
   * Sets the value of the competencias property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCompetencias(String value) {
    this.competencias = value;
  }

  /**
   * Gets the value of the disposicionLegal property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getDisposicionLegal() {
    return disposicionLegal;
  }

  /**
   * Sets the value of the disposicionLegal property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setDisposicionLegal(String value) {
    this.disposicionLegal = value;
  }

  /**
   * Gets the value of the fechaAltaOficial property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaAltaOficial() {
    return fechaAltaOficial;
  }

  /**
   * Sets the value of the fechaAltaOficial property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaAltaOficial(String value) {
    this.fechaAltaOficial = value;
  }

  /**
   * Gets the value of the fechaBajaOficial property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaBajaOficial() {
    return fechaBajaOficial;
  }

  /**
   * Sets the value of the fechaBajaOficial property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaBajaOficial(String value) {
    this.fechaBajaOficial = value;
  }

  /**
   * Gets the value of the fechaExtincion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaExtincion() {
    return fechaExtincion;
  }

  /**
   * Sets the value of the fechaExtincion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaExtincion(String value) {
    this.fechaExtincion = value;
  }

  /**
   * Gets the value of the fechaAnulacion property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getFechaAnulacion() {
    return fechaAnulacion;
  }

  /**
   * Sets the value of the fechaAnulacion property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setFechaAnulacion(String value) {
    this.fechaAnulacion = value;
  }

  /**
   * Gets the value of the codExterno property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getCodExterno() {
    return codExterno;
  }

  /**
   * Sets the value of the codExterno property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setCodExterno(String value) {
    this.codExterno = value;
  }

  /**
   * Gets the value of the observGenerales property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getObservGenerales() {
    return observGenerales;
  }

  /**
   * Sets the value of the observGenerales property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setObservGenerales(String value) {
    this.observGenerales = value;
  }

  /**
   * Gets the value of the observBaja property.
   * 
   * @return possible object is {@link String }
   * 
   */
  public String getObservBaja() {
    return observBaja;
  }

  /**
   * Sets the value of the observBaja property.
   * 
   * @param value allowed object is {@link String }
   * 
   */
  public void setObservBaja(String value) {
    this.observBaja = value;
  }

  /**
   * Gets the value of the direccion property.
   * 
   * @return possible object is {@link Direccion }
   * 
   */
  public Direccion getDireccion() {
    return direccion;
  }

  /**
   * Sets the value of the direccion property.
   * 
   * @param value allowed object is {@link Direccion }
   * 
   */
  public void setDireccion(Direccion value) {
    this.direccion = value;
  }

}