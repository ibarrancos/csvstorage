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


package es.gob.aapp.csvstorage.client.ws.ginside.model.validacion.expedientee.mtom;

import javax.activation.DataHandler;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>
 * Clase Java para TipoExpedienteValidacionInsideMtom complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="TipoExpedienteValidacionInsideMtom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="contenido" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *         &lt;element name="opcionesValidacionExpediente" type="{https://ssweb.seap.minhap.es/Inside/XSD/v1.0/validacion/expediente-e/mtom}TipoOpcionesValidacionExpedienteInsideMtom"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TipoExpedienteValidacionInsideMtom",
    propOrder = {"contenido", "opcionesValidacionExpediente"})
public class TipoExpedienteValidacionInsideMtom {

  @XmlElement(required = true)
  @XmlMimeType("application/octet-stream")
  protected DataHandler contenido;
  @XmlElement(required = true)
  protected TipoOpcionesValidacionExpedienteInsideMtom opcionesValidacionExpediente;

  /**
   * Obtiene el valor de la propiedad contenido.
   * 
   * @return possible object is {@link DataHandler }
   * 
   */
  public DataHandler getContenido() {
    return contenido;
  }

  /**
   * Define el valor de la propiedad contenido.
   * 
   * @param value allowed object is {@link DataHandler }
   * 
   */
  public void setContenido(DataHandler value) {
    this.contenido = value;
  }

  /**
   * Obtiene el valor de la propiedad opcionesValidacionExpediente.
   * 
   * @return possible object is {@link TipoOpcionesValidacionExpedienteInsideMtom }
   * 
   */
  public TipoOpcionesValidacionExpedienteInsideMtom getOpcionesValidacionExpediente() {
    return opcionesValidacionExpediente;
  }

  /**
   * Define el valor de la propiedad opcionesValidacionExpediente.
   * 
   * @param value allowed object is {@link TipoOpcionesValidacionExpedienteInsideMtom }
   * 
   */
  public void setOpcionesValidacionExpediente(TipoOpcionesValidacionExpedienteInsideMtom value) {
    this.opcionesValidacionExpediente = value;
  }

}
