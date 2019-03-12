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


package es.gob.aapp.csvstorage.client.ws.ginside.model.expedientee.conversion;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;
import es.gob.aapp.csvstorage.client.ws.eni.expedientee.metadatos.EnumeracionEstados;


/**
 * <p>
 * Clase Java para TipoExpedienteConversionInsideWSMtom complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoExpedienteConversionInsideWSMtom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="metadatosEni">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VersionNTI" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Organo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                   &lt;element name="FechaAperturaExpediente" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Clasificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="Estado">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/metadatos>enumeracionEstados">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Interesado" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Indice" type="{https://ssweb.seap.minhap.es/Inside/XSD/v1.0/expediente-e/conversion}TipoIndiceConversionWSMtom"/>
 *         &lt;element name="OpcionesVisualizacion" type="{https://ssweb.seap.minhap.es/Inside/XSD/v1.0/expediente-e/conversion}TipoOpcionesVisualizacionIndiceWS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoExpedienteConversionInsideWSMtom",
    propOrder = {"metadatosEni", "indice", "opcionesVisualizacion"})
public class TipoExpedienteConversionInsideWSMtom {

  @XmlElement(required = true)
  protected TipoExpedienteConversionInsideWSMtom.MetadatosEni metadatosEni;
  @XmlElement(name = "Indice", required = true)
  protected TipoIndiceConversionWSMtom indice;
  @XmlElement(name = "OpcionesVisualizacion")
  protected TipoOpcionesVisualizacionIndiceWS opcionesVisualizacion;

  /**
   * Obtiene el valor de la propiedad metadatosEni.
   * 
   * @return possible object is {@link TipoExpedienteConversionInsideWSMtom.MetadatosEni }
   * 
   */
  public TipoExpedienteConversionInsideWSMtom.MetadatosEni getMetadatosEni() {
    return metadatosEni;
  }

  /**
   * Define el valor de la propiedad metadatosEni.
   * 
   * @param value allowed object is {@link TipoExpedienteConversionInsideWSMtom.MetadatosEni }
   * 
   */
  public void setMetadatosEni(TipoExpedienteConversionInsideWSMtom.MetadatosEni value) {
    this.metadatosEni = value;
  }

  /**
   * Obtiene el valor de la propiedad indice.
   * 
   * @return possible object is {@link TipoIndiceConversionWSMtom }
   * 
   */
  public TipoIndiceConversionWSMtom getIndice() {
    return indice;
  }

  /**
   * Define el valor de la propiedad indice.
   * 
   * @param value allowed object is {@link TipoIndiceConversionWSMtom }
   * 
   */
  public void setIndice(TipoIndiceConversionWSMtom value) {
    this.indice = value;
  }

  /**
   * Obtiene el valor de la propiedad opcionesVisualizacion.
   * 
   * @return possible object is {@link TipoOpcionesVisualizacionIndiceWS }
   * 
   */
  public TipoOpcionesVisualizacionIndiceWS getOpcionesVisualizacion() {
    return opcionesVisualizacion;
  }

  /**
   * Define el valor de la propiedad opcionesVisualizacion.
   * 
   * @param value allowed object is {@link TipoOpcionesVisualizacionIndiceWS }
   * 
   */
  public void setOpcionesVisualizacion(TipoOpcionesVisualizacionIndiceWS value) {
    this.opcionesVisualizacion = value;
  }


  /**
   * <p>
   * Clase Java para anonymous complex type.
   * 
   * <p>
   * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
   * 
   * <pre>
   * &lt;complexType>
   *   &lt;complexContent>
   *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
   *       &lt;sequence>
   *         &lt;element name="VersionNTI" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="Identificador" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="Organo" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
   *         &lt;element name="FechaAperturaExpediente" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
   *         &lt;element name="Clasificacion" type="{http://www.w3.org/2001/XMLSchema}string"/>
   *         &lt;element name="Estado">
   *           &lt;complexType>
   *             &lt;simpleContent>
   *               &lt;extension base="&lt;http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/metadatos>enumeracionEstados">
   *               &lt;/extension>
   *             &lt;/simpleContent>
   *           &lt;/complexType>
   *         &lt;/element>
   *         &lt;element name="Interesado" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
   *       &lt;/sequence>
   *     &lt;/restriction>
   *   &lt;/complexContent>
   * &lt;/complexType>
   * </pre>
   * 
   * 
   */
  @XmlAccessorType(XmlAccessType.FIELD)
  @XmlType(name = "", propOrder = {"versionNTI", "identificador", "organo",
      "fechaAperturaExpediente", "clasificacion", "estado", "interesado"})
  public static class MetadatosEni {

    @XmlElement(name = "VersionNTI", required = true)
    protected String versionNTI;
    @XmlElement(name = "Identificador", required = true)
    protected String identificador;
    @XmlElement(name = "Organo", required = true)
    protected List<String> organo;
    @XmlElement(name = "FechaAperturaExpediente", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaAperturaExpediente;
    @XmlElement(name = "Clasificacion", required = true)
    protected String clasificacion;
    @XmlElement(name = "Estado", required = true)
    protected TipoExpedienteConversionInsideWSMtom.MetadatosEni.Estado estado;
    @XmlElement(name = "Interesado")
    protected List<String> interesado;

    /**
     * Obtiene el valor de la propiedad versionNTI.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getVersionNTI() {
      return versionNTI;
    }

    /**
     * Define el valor de la propiedad versionNTI.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setVersionNTI(String value) {
      this.versionNTI = value;
    }

    /**
     * Obtiene el valor de la propiedad identificador.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getIdentificador() {
      return identificador;
    }

    /**
     * Define el valor de la propiedad identificador.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setIdentificador(String value) {
      this.identificador = value;
    }

    /**
     * Gets the value of the organo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the organo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getOrgano().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getOrgano() {
      if (organo == null) {
        organo = new ArrayList<String>();
      }
      return this.organo;
    }

    /**
     * Obtiene el valor de la propiedad fechaAperturaExpediente.
     * 
     * @return possible object is {@link XMLGregorianCalendar }
     * 
     */
    public XMLGregorianCalendar getFechaAperturaExpediente() {
      return fechaAperturaExpediente;
    }

    /**
     * Define el valor de la propiedad fechaAperturaExpediente.
     * 
     * @param value allowed object is {@link XMLGregorianCalendar }
     * 
     */
    public void setFechaAperturaExpediente(XMLGregorianCalendar value) {
      this.fechaAperturaExpediente = value;
    }

    /**
     * Obtiene el valor de la propiedad clasificacion.
     * 
     * @return possible object is {@link String }
     * 
     */
    public String getClasificacion() {
      return clasificacion;
    }

    /**
     * Define el valor de la propiedad clasificacion.
     * 
     * @param value allowed object is {@link String }
     * 
     */
    public void setClasificacion(String value) {
      this.clasificacion = value;
    }

    /**
     * Obtiene el valor de la propiedad estado.
     * 
     * @return possible object is {@link TipoExpedienteConversionInsideWSMtom.MetadatosEni.Estado }
     * 
     */
    public TipoExpedienteConversionInsideWSMtom.MetadatosEni.Estado getEstado() {
      return estado;
    }

    /**
     * Define el valor de la propiedad estado.
     * 
     * @param value allowed object is
     *        {@link TipoExpedienteConversionInsideWSMtom.MetadatosEni.Estado }
     * 
     */
    public void setEstado(TipoExpedienteConversionInsideWSMtom.MetadatosEni.Estado value) {
      this.estado = value;
    }

    /**
     * Gets the value of the interesado property.
     * 
     * <p>
     * This accessor method returns a reference to the live list, not a snapshot. Therefore any
     * modification you make to the returned list will be present inside the JAXB object. This is
     * why there is not a <CODE>set</CODE> method for the interesado property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * 
     * <pre>
     * getInteresado().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list {@link String }
     * 
     * 
     */
    public List<String> getInteresado() {
      if (interesado == null) {
        interesado = new ArrayList<String>();
      }
      return this.interesado;
    }


    /**
     * <p>
     * Clase Java para anonymous complex type.
     * 
     * <p>
     * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta
     * clase.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://administracionelectronica.gob.es/ENI/XSD/v1.0/expediente-e/metadatos>enumeracionEstados">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {"value"})
    public static class Estado {

      @XmlValue
      protected EnumeracionEstados value;

      /**
       * Obtiene el valor de la propiedad value.
       * 
       * @return possible object is {@link EnumeracionEstados }
       * 
       */
      public EnumeracionEstados getValue() {
        return value;
      }

      /**
       * Define el valor de la propiedad value.
       * 
       * @param value allowed object is {@link EnumeracionEstados }
       * 
       */
      public void setValue(EnumeracionEstados value) {
        this.value = value;
      }

    }

  }

}
