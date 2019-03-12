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


package es.gob.aapp.csvstorage.webservices.document.model.reference;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para TipoRestringido complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoRestringido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RestringidoPorIdentificacion" type="{}TipoIdentificaciones"/>
 *         &lt;element name="RestringidoNif" type="{}TipoNifs"/>
 *         &lt;element name="EmpleadoPublico" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="RestringidoAplicaciones" type="{}TipoAplicaciones"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoRestringido",
    propOrder = {"restringidoPorIdentificacion", "restringidoNif", "empleadoPublico",
        "restringidoAplicaciones"},
    namespace = "urn:es:gob:aapp:csvstorage:webservices:document:model:v1.0")
public class TipoRestringido {

  @XmlElement(name = "RestringidoPorIdentificacion", required = true)
  protected TipoIdentificaciones restringidoPorIdentificacion;
  @XmlElement(name = "RestringidoNif", required = true)
  protected TipoNifs restringidoNif;
  @XmlElement(name = "EmpleadoPublico")
  protected boolean empleadoPublico;
  @XmlElement(name = "RestringidoAplicaciones", required = true)
  protected TipoAplicaciones restringidoAplicaciones;

  /**
   * Obtiene el valor de la propiedad restringidoPorIdentificacion.
   * 
   * @return possible object is {@link TipoIdentificaciones }
   * 
   */
  public TipoIdentificaciones getRestringidoPorIdentificacion() {
    return restringidoPorIdentificacion;
  }

  /**
   * Define el valor de la propiedad restringidoPorIdentificacion.
   * 
   * @param value allowed object is {@link TipoIdentificaciones }
   * 
   */
  public void setRestringidoPorIdentificacion(TipoIdentificaciones value) {
    this.restringidoPorIdentificacion = value;
  }

  /**
   * Obtiene el valor de la propiedad restringidoNif.
   * 
   * @return possible object is {@link TipoNifs }
   * 
   */
  public TipoNifs getRestringidoNif() {
    return restringidoNif;
  }

  /**
   * Define el valor de la propiedad restringidoNif.
   * 
   * @param value allowed object is {@link TipoNifs }
   * 
   */
  public void setRestringidoNif(TipoNifs value) {
    this.restringidoNif = value;
  }

  /**
   * Obtiene el valor de la propiedad empleadoPublico.
   * 
   */
  public boolean isEmpleadoPublico() {
    return empleadoPublico;
  }

  /**
   * Define el valor de la propiedad empleadoPublico.
   * 
   */
  public void setEmpleadoPublico(boolean value) {
    this.empleadoPublico = value;
  }

  /**
   * Obtiene el valor de la propiedad restringidoAplicaciones.
   * 
   * @return possible object is {@link TipoAplicaciones }
   * 
   */
  public TipoAplicaciones getRestringidoAplicaciones() {
    return restringidoAplicaciones;
  }

  /**
   * Define el valor de la propiedad restringidoAplicaciones.
   * 
   * @param value allowed object is {@link TipoAplicaciones }
   * 
   */
  public void setRestringidoAplicaciones(TipoAplicaciones value) {
    this.restringidoAplicaciones = value;
  }

}
