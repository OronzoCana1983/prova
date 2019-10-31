package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.threeten.bp.OffsetDateTime;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Documento
 */
@ApiModel(description = "Documento")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class DocumentoApi   {
  @JsonProperty("codMatricola")
  private String codMatricola = null;

  @JsonProperty("codMimeType")
  private String codMimeType = null;

  @JsonProperty("codSistemaDocumentale")
  private String codSistemaDocumentale = null;

  @JsonProperty("codTipoDocumento")
  private String codTipoDocumento = null;

  @JsonProperty("cognomeUtente")
  private String cognomeUtente = null;

  @JsonProperty("content")
  private byte[] content = null;

  @JsonProperty("datAcquisizione")
  private OffsetDateTime datAcquisizione = null;

  @JsonProperty("idDocumentale")
  private String idDocumentale = null;

  @JsonProperty("nomeFile")
  private String nomeFile = null;

  @JsonProperty("nomeUtente")
  private String nomeUtente = null;

  public DocumentoApi codMatricola(String codMatricola) {
    this.codMatricola = codMatricola;
    return this;
  }

  /**
   * Get codMatricola
   * @return codMatricola
  **/
  @ApiModelProperty(value = "")


  public String getCodMatricola() {
    return codMatricola;
  }

  public void setCodMatricola(String codMatricola) {
    this.codMatricola = codMatricola;
  }

  public DocumentoApi codMimeType(String codMimeType) {
    this.codMimeType = codMimeType;
    return this;
  }

  /**
   * Get codMimeType
   * @return codMimeType
  **/
  @ApiModelProperty(value = "")


  public String getCodMimeType() {
    return codMimeType;
  }

  public void setCodMimeType(String codMimeType) {
    this.codMimeType = codMimeType;
  }

  public DocumentoApi codSistemaDocumentale(String codSistemaDocumentale) {
    this.codSistemaDocumentale = codSistemaDocumentale;
    return this;
  }

  /**
   * Get codSistemaDocumentale
   * @return codSistemaDocumentale
  **/
  @ApiModelProperty(value = "")


  public String getCodSistemaDocumentale() {
    return codSistemaDocumentale;
  }

  public void setCodSistemaDocumentale(String codSistemaDocumentale) {
    this.codSistemaDocumentale = codSistemaDocumentale;
  }

  public DocumentoApi codTipoDocumento(String codTipoDocumento) {
    this.codTipoDocumento = codTipoDocumento;
    return this;
  }

  /**
   * Get codTipoDocumento
   * @return codTipoDocumento
  **/
  @ApiModelProperty(value = "")


  public String getCodTipoDocumento() {
    return codTipoDocumento;
  }

  public void setCodTipoDocumento(String codTipoDocumento) {
    this.codTipoDocumento = codTipoDocumento;
  }

  public DocumentoApi cognomeUtente(String cognomeUtente) {
    this.cognomeUtente = cognomeUtente;
    return this;
  }

  /**
   * Get cognomeUtente
   * @return cognomeUtente
  **/
  @ApiModelProperty(value = "")


  public String getCognomeUtente() {
    return cognomeUtente;
  }

  public void setCognomeUtente(String cognomeUtente) {
    this.cognomeUtente = cognomeUtente;
  }

  public DocumentoApi content(byte[] content) {
    this.content = content;
    return this;
  }

  /**
   * Get content
   * @return content
  **/
  @ApiModelProperty(value = "")

@Pattern(regexp="^(?:[A-Za-z0-9+/]{4})*(?:[A-Za-z0-9+/]{2}==|[A-Za-z0-9+/]{3}=)?$") 
  public byte[] getContent() {
    return content;
  }

  public void setContent(byte[] content) {
    this.content = content;
  }

  public DocumentoApi datAcquisizione(OffsetDateTime datAcquisizione) {
    this.datAcquisizione = datAcquisizione;
    return this;
  }

  /**
   * Get datAcquisizione
   * @return datAcquisizione
  **/
  @ApiModelProperty(value = "")

  @Valid

  public OffsetDateTime getDatAcquisizione() {
    return datAcquisizione;
  }

  public void setDatAcquisizione(OffsetDateTime datAcquisizione) {
    this.datAcquisizione = datAcquisizione;
  }

  public DocumentoApi idDocumentale(String idDocumentale) {
    this.idDocumentale = idDocumentale;
    return this;
  }

  /**
   * Get idDocumentale
   * @return idDocumentale
  **/
  @ApiModelProperty(value = "")


  public String getIdDocumentale() {
    return idDocumentale;
  }

  public void setIdDocumentale(String idDocumentale) {
    this.idDocumentale = idDocumentale;
  }

  public DocumentoApi nomeFile(String nomeFile) {
    this.nomeFile = nomeFile;
    return this;
  }

  /**
   * Get nomeFile
   * @return nomeFile
  **/
  @ApiModelProperty(value = "")


  public String getNomeFile() {
    return nomeFile;
  }

  public void setNomeFile(String nomeFile) {
    this.nomeFile = nomeFile;
  }

  public DocumentoApi nomeUtente(String nomeUtente) {
    this.nomeUtente = nomeUtente;
    return this;
  }

  /**
   * Get nomeUtente
   * @return nomeUtente
  **/
  @ApiModelProperty(value = "")


  public String getNomeUtente() {
    return nomeUtente;
  }

  public void setNomeUtente(String nomeUtente) {
    this.nomeUtente = nomeUtente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoApi documentoApi = (DocumentoApi) o;
    return Objects.equals(this.codMatricola, documentoApi.codMatricola) &&
        Objects.equals(this.codMimeType, documentoApi.codMimeType) &&
        Objects.equals(this.codSistemaDocumentale, documentoApi.codSistemaDocumentale) &&
        Objects.equals(this.codTipoDocumento, documentoApi.codTipoDocumento) &&
        Objects.equals(this.cognomeUtente, documentoApi.cognomeUtente) &&
        Objects.equals(this.content, documentoApi.content) &&
        Objects.equals(this.datAcquisizione, documentoApi.datAcquisizione) &&
        Objects.equals(this.idDocumentale, documentoApi.idDocumentale) &&
        Objects.equals(this.nomeFile, documentoApi.nomeFile) &&
        Objects.equals(this.nomeUtente, documentoApi.nomeUtente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codMatricola, codMimeType, codSistemaDocumentale, codTipoDocumento, cognomeUtente, content, datAcquisizione, idDocumentale, nomeFile, nomeUtente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoApi {\n");
    
    sb.append("    codMatricola: ").append(toIndentedString(codMatricola)).append("\n");
    sb.append("    codMimeType: ").append(toIndentedString(codMimeType)).append("\n");
    sb.append("    codSistemaDocumentale: ").append(toIndentedString(codSistemaDocumentale)).append("\n");
    sb.append("    codTipoDocumento: ").append(toIndentedString(codTipoDocumento)).append("\n");
    sb.append("    cognomeUtente: ").append(toIndentedString(cognomeUtente)).append("\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    datAcquisizione: ").append(toIndentedString(datAcquisizione)).append("\n");
    sb.append("    idDocumentale: ").append(toIndentedString(idDocumentale)).append("\n");
    sb.append("    nomeFile: ").append(toIndentedString(nomeFile)).append("\n");
    sb.append("    nomeUtente: ").append(toIndentedString(nomeUtente)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

