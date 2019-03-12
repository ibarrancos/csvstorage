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

package es.gob.aapp.csvstorage.webservices.document.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;

// TODO: Auto-generated Javadoc
/**
 * The Class GuardarDocumentoRequest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarDocumentoBigDataRequest", propOrder = {"contenido"},
    namespace = "urn:es:gob:aapp:csvstorage:webservices:document:model:v1.0")
public class GuardarDocumentoBigDataRequest extends DocumentoRequest {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Contenido del documento de firma.
   */
  @XmlElement(required = true)
  protected ContenidoInfoBigData contenido;

  /**
   * Gets the contenido.
   *
   * @return the contenido
   */
  public ContenidoInfoBigData getContenido() {
    return contenido;
  }

  /**
   * Sets the contenido.
   *
   * @param contenido the contenido to set
   */
  public void setContenido(ContenidoInfoBigData contenido) {
    this.contenido = contenido;
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "GuardarDocumentoRequest [dir3=" + dir3 + ", csv=" + csv + ", idEni=" + idEni
        + ", contenido=" + contenido + "]";
  }

}
