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

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;



/**
 * DocumentoInside generated by hbm2java
 */
@Entity
@Table(name = "CSVST_DOCUMENTO_ENI")
public class DocumentEniEntity implements java.io.Serializable {

  private static final long serialVersionUID = 1L;

  @Id
  @GeneratedValue(generator = "generator", strategy = GenerationType.SEQUENCE)
  @SequenceGenerator(name = "generator", sequenceName = "CSVST_DOCUMENTO_ENI_SEQ",
      allocationSize = 1)
  private Long id;
  /** Objeto con los datos del organismo. */
  @ManyToOne
  @JoinColumn(name = "ID_DOCUMENTO")
  private DocumentEntity documento;
  @NotEmpty
  @Column(nullable = false, name = "IDENTIFICADOR")
  private String identificador;
  @Column(nullable = true, name = "VERSION_NTI")
  private String versionNti;
  @Temporal(TemporalType.TIMESTAMP)
  @Column(nullable = true, name = "FECHA_CAPTURA", length = 19)
  private Date fechaCaptura;
  @Column(name = "ORIGEN", insertable = false, updatable = false)
  private Boolean origenCiudadanoAdministracion;
  @Column(nullable = true, name = "NOMBRE_FORMATO")
  private String nombreFormato;
  @Column(nullable = true, name = "TIPO_DOCUMENTAL")
  private String tipoDocumental;
  @Column(nullable = true, name = "ESTADO_ELABORACION")
  private String estadoElaboracion;
  @Column(nullable = true, name = "REFERENCIA")
  private String referencia;
  @NotNull(groups = DocumentEniEntity.class, message = "You must set created date")
  @Column(name = "CREATED_AT", insertable = false, updatable = false)
  private Date createdAt;
  @Column(name = "FECHA_BAJA", insertable = false, updatable = false)
  private Date fechaBaja;
  @OneToMany(fetch = FetchType.LAZY, mappedBy = "documentoEni")
  private Set<DocumentEniOrganoEntity> documentoOrganos = new HashSet<>(0);

  @Column(nullable = false, name = "VALOR_BINARIO")
  @Type(type = "org.hibernate.type.NumericBooleanType")
  private Boolean valorBinario;

  @Column(nullable = true, name = "IDENTIFICADOR_DOCUMENTO_ORIGEN")
  private String idDocumentoOrigen;

  @Column(nullable = true, name = "IDENTIFICADOR_EN_DOCUMENTO")
  private String idEnDocumento;

  public DocumentEniEntity() {}

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
   * @return the idDocumento
   */
  public DocumentEntity getDocumento() {
    return documento;
  }

  /**
   * @param idDocumento the idDocumento to set
   */
  public void setDocumento(DocumentEntity documento) {
    this.documento = documento;
  }

  /**
   * @return the identificador
   */
  public String getIdentificador() {
    return identificador;
  }

  /**
   * @param identificador the identificador to set
   */
  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  /**
   * @return the versionNti
   */
  public String getVersionNti() {
    return versionNti;
  }

  /**
   * @param versionNti the versionNti to set
   */
  public void setVersionNti(String versionNti) {
    this.versionNti = versionNti;
  }

  /**
   * @return the fechaCaptura
   */
  public Date getFechaCaptura() {
    return fechaCaptura;
  }

  /**
   * @param fechaCaptura the fechaCaptura to set
   */
  public void setFechaCaptura(Date fechaCaptura) {
    this.fechaCaptura = fechaCaptura;
  }

  /**
   * @return the origenCiudadanoAdministracion
   */
  public Boolean getOrigenCiudadanoAdministracion() {
    return origenCiudadanoAdministracion;
  }

  /**
   * @param origenCiudadanoAdministracion the origenCiudadanoAdministracion to set
   */
  public void setOrigenCiudadanoAdministracion(Boolean origenCiudadanoAdministracion) {
    this.origenCiudadanoAdministracion = origenCiudadanoAdministracion;
  }

  /**
   * @return the nombreFormato
   */
  public String getNombreFormato() {
    return nombreFormato;
  }

  /**
   * @param nombreFormato the nombreFormato to set
   */
  public void setNombreFormato(String nombreFormato) {
    this.nombreFormato = nombreFormato;
  }

  /**
   * @return the tipoDocumental
   */
  public String getTipoDocumental() {
    return tipoDocumental;
  }

  /**
   * @param tipoDocumental the tipoDocumental to set
   */
  public void setTipoDocumental(String tipoDocumental) {
    this.tipoDocumental = tipoDocumental;
  }

  /**
   * @return the estadoElaboracion
   */
  public String getEstadoElaboracion() {
    return estadoElaboracion;
  }

  /**
   * @param estadoElaboracion the estadoElaboracion to set
   */
  public void setEstadoElaboracion(String estadoElaboracion) {
    this.estadoElaboracion = estadoElaboracion;
  }

  /**
   * @return the referencia
   */
  public String getReferencia() {
    return referencia;
  }

  /**
   * @param referencia the referencia to set
   */
  public void setReferencia(String referencia) {
    this.referencia = referencia;
  }

  /**
   * @return the createdAt
   */
  public Date getCreatedAt() {
    return createdAt;
  }

  /**
   * @param createdAt the createdAt to set
   */
  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  /**
   * @return the fechaBaja
   */
  public Date getFechaBaja() {
    return fechaBaja;
  }

  /**
   * @param fechaBaja the fechaBaja to set
   */
  public void setFechaBaja(Date fechaBaja) {
    this.fechaBaja = fechaBaja;
  }

  /**
   * @return the documentoOrganos
   */
  public Set<DocumentEniOrganoEntity> getDocumentoOrganos() {
    return documentoOrganos;
  }

  /**
   * @param documentoOrganos the documentoOrganos to set
   */
  public void setDocumentoOrganos(Set<DocumentEniOrganoEntity> documentoOrganos) {
    this.documentoOrganos = documentoOrganos;
  }

  /**
   * @return the valorBinario
   */
  public Boolean getValorBinario() {
    return valorBinario;
  }

  /**
   * @param valorBinario the valorBinario to set
   */
  public void setValorBinario(Boolean valorBinario) {
    this.valorBinario = valorBinario;
  }

  /**
   * @return the idDocumentoOrigen
   */
  public String getIdDocumentoOrigen() {
    return idDocumentoOrigen;
  }

  /**
   * @param idDocumentoOrigen the idDocumentoOrigen to set
   */
  public void setIdDocumentoOrigen(String idDocumentoOrigen) {
    this.idDocumentoOrigen = idDocumentoOrigen;
  }

  /**
   * @return the idEnDocumento
   */
  public String getIdEnDocumento() {
    return idEnDocumento;
  }

  /**
   * @param idEnDocumento the idEnDocumento to set
   */
  public void setIdEnDocumento(String idEnDocumento) {
    this.idEnDocumento = idEnDocumento;
  }


  @Override
  public String toString() {
    return "DocumentEniEntity{" + "id=" + id + ", documento=" + (documento) + ", identificador='"
        + identificador + '\'' + ", versionNti='" + versionNti + '\'' + ", fechaCaptura="
        + fechaCaptura + ", origenCiudadanoAdministracion=" + origenCiudadanoAdministracion
        + ", nombreFormato='" + nombreFormato + '\'' + ", tipoDocumental='" + tipoDocumental + '\''
        + ", estadoElaboracion='" + estadoElaboracion + '\'' + ", referencia='" + referencia + '\''
        + ", createdAt=" + createdAt + ", fechaBaja=" + fechaBaja + ", valorBinario=" + valorBinario
        + ", idDocumentoOrigen='" + idDocumentoOrigen + '\'' + ", idEnDocumento='" + idEnDocumento
        + '\'' + '}';
  }
}