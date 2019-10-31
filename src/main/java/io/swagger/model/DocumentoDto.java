package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DatiChiamata;
import io.swagger.model.DocumentoApi;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Dati del documento che si intende caricare RUD.
 */
@ApiModel(description = "Dati del documento che si intende caricare RUD.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class DocumentoDto   {
  @JsonProperty("datiChiamata")
  private DatiChiamata datiChiamata = null;

  @JsonProperty("documento")
  private DocumentoApi documento = null;

  public DocumentoDto datiChiamata(DatiChiamata datiChiamata) {
    this.datiChiamata = datiChiamata;
    return this;
  }

  /**
   * Dati per l'identificazione del chiamante.
   * @return datiChiamata
  **/
  @ApiModelProperty(value = "Dati per l'identificazione del chiamante.")

  @Valid

  public DatiChiamata getDatiChiamata() {
    return datiChiamata;
  }

  public void setDatiChiamata(DatiChiamata datiChiamata) {
    this.datiChiamata = datiChiamata;
  }

  public DocumentoDto documento(DocumentoApi documento) {
    this.documento = documento;
    return this;
  }

  /**
   * Get documento
   * @return documento
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DocumentoApi getDocumento() {
    return documento;
  }

  public void setDocumento(DocumentoApi documento) {
    this.documento = documento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoDto documentoDto = (DocumentoDto) o;
    return Objects.equals(this.datiChiamata, documentoDto.datiChiamata) &&
        Objects.equals(this.documento, documentoDto.documento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(datiChiamata, documento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoDto {\n");
    
    sb.append("    datiChiamata: ").append(toIndentedString(datiChiamata)).append("\n");
    sb.append("    documento: ").append(toIndentedString(documento)).append("\n");
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

