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
import es.gob.aapp.csvstorage.util.constants.Constants;

// TODO: Auto-generated Javadoc
/**
 * The Class GuardarDocumentoRequest.
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "guardarDocumentoRequest", propOrder = {"contenido"},
    namespace = "urn:es:gob:aapp:csvstorage:webservices:document:model:v1.0")
public class GuardarDocumentoRequest extends DocumentoRequest {

  /** The Constant serialVersionUID. */
  private static final long serialVersionUID = 1L;

  /**
   * Contenido del documento de firma.
   */
  @XmlElement(required = true)
  protected ContenidoInfo contenido;

  /**
   * Gets the contenido.
   *
   * @return the contenido
   */
  public ContenidoInfo getContenido() {
    if (contenido == null) {
      contenido = new ContenidoInfo();
    }
    return contenido;
  }

  /**
   * Sets the contenido.
   *
   * @param contenido the contenido to set
   */
  public void setContenido(ContenidoInfo contenido) {
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

  @Override
  public String parametrosAuditoria() {
    StringBuilder audit = new StringBuilder();
    audit.append(super.parametrosAuditoria()).append(Constants.AUDIT_SEPARATOR_ROW)
        .append("tipoMIME").append(Constants.AUDIT_SEPARATOR_VALUE)
        .append(this.contenido.getTipoMIME());

    return audit.toString();
  }
}
