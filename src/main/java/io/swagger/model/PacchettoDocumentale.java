package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DatiChiamata;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DTO per la comunicazione di un pacchetto documentale.
 */
@ApiModel(description = "DTO per la comunicazione di un pacchetto documentale.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class PacchettoDocumentale   {
  /**
   * Sistema esterno da interfacciare per il recupero del pacchetto documentale.
   */
  public enum CodSistemaEsternoEnum {
    POSTEL("POSTEL");

    private String value;

    CodSistemaEsternoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static CodSistemaEsternoEnum fromValue(String text) {
      for (CodSistemaEsternoEnum b : CodSistemaEsternoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("codSistemaEsterno")
  private CodSistemaEsternoEnum codSistemaEsterno = null;

  @JsonProperty("datiChiamata")
  private DatiChiamata datiChiamata = null;

  @JsonProperty("idPacchetto")
  private String idPacchetto = null;

  public PacchettoDocumentale codSistemaEsterno(CodSistemaEsternoEnum codSistemaEsterno) {
    this.codSistemaEsterno = codSistemaEsterno;
    return this;
  }

  /**
   * Sistema esterno da interfacciare per il recupero del pacchetto documentale.
   * @return codSistemaEsterno
  **/
  @ApiModelProperty(value = "Sistema esterno da interfacciare per il recupero del pacchetto documentale.")


  public CodSistemaEsternoEnum getCodSistemaEsterno() {
    return codSistemaEsterno;
  }

  public void setCodSistemaEsterno(CodSistemaEsternoEnum codSistemaEsterno) {
    this.codSistemaEsterno = codSistemaEsterno;
  }

  public PacchettoDocumentale datiChiamata(DatiChiamata datiChiamata) {
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

  public PacchettoDocumentale idPacchetto(String idPacchetto) {
    this.idPacchetto = idPacchetto;
    return this;
  }

  /**
   * Identificativo del pacchetto documentale Postel da utilizzare per il recupero dei documenti della pratica
   * @return idPacchetto
  **/
  @ApiModelProperty(value = "Identificativo del pacchetto documentale Postel da utilizzare per il recupero dei documenti della pratica")


  public String getIdPacchetto() {
    return idPacchetto;
  }

  public void setIdPacchetto(String idPacchetto) {
    this.idPacchetto = idPacchetto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PacchettoDocumentale pacchettoDocumentale = (PacchettoDocumentale) o;
    return Objects.equals(this.codSistemaEsterno, pacchettoDocumentale.codSistemaEsterno) &&
        Objects.equals(this.datiChiamata, pacchettoDocumentale.datiChiamata) &&
        Objects.equals(this.idPacchetto, pacchettoDocumentale.idPacchetto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codSistemaEsterno, datiChiamata, idPacchetto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PacchettoDocumentale {\n");
    
    sb.append("    codSistemaEsterno: ").append(toIndentedString(codSistemaEsterno)).append("\n");
    sb.append("    datiChiamata: ").append(toIndentedString(datiChiamata)).append("\n");
    sb.append("    idPacchetto: ").append(toIndentedString(idPacchetto)).append("\n");
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

