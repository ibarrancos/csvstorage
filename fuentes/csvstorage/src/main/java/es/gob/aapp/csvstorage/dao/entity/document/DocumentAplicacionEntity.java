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

package es.gob.aapp.csvstorage.dao.entity.document;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
import es.gob.aapp.csvstorage.dao.entity.application.ApplicationEntity;

/**
 * DocumentRestriccionEntity generated by hbm2java
 */
@Entity
@Table(name = "CSVST_DOCUMENTO_APLICACION")
public class DocumentAplicacionEntity implements java.io.Serializable {

  /**
   * serialVersionUID
   */
  private static final long serialVersionUID = 1L;
  @Id
  @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "generator", sequenceName = "CSVST_DOCUMENTO_APLIC_SEQ",
      allocationSize = 1)
  private Long id;

  /** Objeto con los datos del documento. */
  @ManyToOne
  @JoinColumn(name = "ID_DOCUMENTO")
  private DocumentEntity documento;

  @ManyToOne
  @JoinColumn(name = "ID_APLICACION")
  private ApplicationEntity aplicacion;

  public DocumentAplicacionEntity(Long id, DocumentEntity documento, ApplicationEntity aplicacion) {
    super();
    this.id = id;
    this.documento = documento;
    this.aplicacion = aplicacion;
  }

  public DocumentAplicacionEntity() {
    super();
  }

  /*
   * (non-Javadoc)
   * 
   * @see java.lang.Object#toString()
   */
  @Override
  public String toString() {
    return "DocumentAplicacionEntity [id=" + id + ", documento=" + documento + ", aplicacion="
        + aplicacion + "]";
  }

  /**
   * @return the id
   */
  public Long getId() {
    return id;
  }

  /**
   * @param id the id to set
   */
  public void setId(Long id) {
    this.id = id;
  }

  /**
   * 
   * @return the aplicacion
   */
  public ApplicationEntity getAplicacion() {
    return aplicacion;
  }

  /**
   * 
   * @param aplicacion
   */
  public void setAplicacion(ApplicationEntity aplicacion) {
    this.aplicacion = aplicacion;
  }

  /**
   * @return the documentoEni
   */
  public DocumentEntity getDocumento() {
    return documento;
  }

  /**
   * @param documento the documento to set
   */
  public void setDocumento(DocumentEntity documento) {
    this.documento = documento;
  }

}
