package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Parametri standard per l&#39;identificazione del chiamante.
 */
@ApiModel(description = "Parametri standard per l'identificazione del chiamante.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class DatiChiamata   {
  @JsonProperty("codAbi")
  private String codAbi = null;

  @JsonProperty("codApplicativoChiamante")
  private String codApplicativoChiamante = null;

  @JsonProperty("codCanale")
  private String codCanale = null;

  @JsonProperty("codClone")
  private String codClone = null;

  @JsonProperty("codFiliale")
  private String codFiliale = null;

  @JsonProperty("codMatricola")
  private String codMatricola = null;

  @JsonProperty("idOperazione")
  private String idOperazione = null;

  public DatiChiamata codAbi(String codAbi) {
    this.codAbi = codAbi;
    return this;
  }

  /**
   * Codice ABI di login del chiamante.
   * @return codAbi
  **/
  @ApiModelProperty(example = "01025", value = "Codice ABI di login del chiamante.")


  public String getCodAbi() {
    return codAbi;
  }

  public void setCodAbi(String codAbi) {
    this.codAbi = codAbi;
  }

  public DatiChiamata codApplicativoChiamante(String codApplicativoChiamante) {
    this.codApplicativoChiamante = codApplicativoChiamante;
    return this;
  }

  /**
   * Codice identificativo dell'applicativo chiamante.
   * @return codApplicativoChiamante
  **/
  @ApiModelProperty(example = "LMBP0", value = "Codice identificativo dell'applicativo chiamante.")


  public String getCodApplicativoChiamante() {
    return codApplicativoChiamante;
  }

  public void setCodApplicativoChiamante(String codApplicativoChiamante) {
    this.codApplicativoChiamante = codApplicativoChiamante;
  }

  public DatiChiamata codCanale(String codCanale) {
    this.codCanale = codCanale;
    return this;
  }

  /**
   * Codice identificativo del canale chiamante.
   * @return codCanale
  **/
  @ApiModelProperty(example = "EP", value = "Codice identificativo del canale chiamante.")


  public String getCodCanale() {
    return codCanale;
  }

  public void setCodCanale(String codCanale) {
    this.codCanale = codCanale;
  }

  public DatiChiamata codClone(String codClone) {
    this.codClone = codClone;
    return this;
  }

  /**
   * Codice Clone corrispondente all'ABI del chiamante.
   * @return codClone
  **/
  @ApiModelProperty(example = "01", value = "Codice Clone corrispondente all'ABI del chiamante.")


  public String getCodClone() {
    return codClone;
  }

  public void setCodClone(String codClone) {
    this.codClone = codClone;
  }

  public DatiChiamata codFiliale(String codFiliale) {
    this.codFiliale = codFiliale;
    return this;
  }

  /**
   * Codice Filiale di login del chiamante.
   * @return codFiliale
  **/
  @ApiModelProperty(example = "20144", value = "Codice Filiale di login del chiamante.")


  public String getCodFiliale() {
    return codFiliale;
  }

  public void setCodFiliale(String codFiliale) {
    this.codFiliale = codFiliale;
  }

  public DatiChiamata codMatricola(String codMatricola) {
    this.codMatricola = codMatricola;
    return this;
  }

  /**
   * Codice matricola del chiamante. Valorizzare con utenza tecnica in assenza di utente.
   * @return codMatricola
  **/
  @ApiModelProperty(example = "U012345", value = "Codice matricola del chiamante. Valorizzare con utenza tecnica in assenza di utente.")


  public String getCodMatricola() {
    return codMatricola;
  }

  public void setCodMatricola(String codMatricola) {
    this.codMatricola = codMatricola;
  }

  public DatiChiamata idOperazione(String idOperazione) {
    this.idOperazione = idOperazione;
    return this;
  }

  /**
   * Identificativo univoco della richiesta.
   * @return idOperazione
  **/
  @ApiModelProperty(example = "123e4567-e89b-12d3-a456-426655440000", value = "Identificativo univoco della richiesta.")


  public String getIdOperazione() {
    return idOperazione;
  }

  public void setIdOperazione(String idOperazione) {
    this.idOperazione = idOperazione;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DatiChiamata datiChiamata = (DatiChiamata) o;
    return Objects.equals(this.codAbi, datiChiamata.codAbi) &&
        Objects.equals(this.codApplicativoChiamante, datiChiamata.codApplicativoChiamante) &&
        Objects.equals(this.codCanale, datiChiamata.codCanale) &&
        Objects.equals(this.codClone, datiChiamata.codClone) &&
        Objects.equals(this.codFiliale, datiChiamata.codFiliale) &&
        Objects.equals(this.codMatricola, datiChiamata.codMatricola) &&
        Objects.equals(this.idOperazione, datiChiamata.idOperazione);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codAbi, codApplicativoChiamante, codCanale, codClone, codFiliale, codMatricola, idOperazione);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DatiChiamata {\n");
    
    sb.append("    codAbi: ").append(toIndentedString(codAbi)).append("\n");
    sb.append("    codApplicativoChiamante: ").append(toIndentedString(codApplicativoChiamante)).append("\n");
    sb.append("    codCanale: ").append(toIndentedString(codCanale)).append("\n");
    sb.append("    codClone: ").append(toIndentedString(codClone)).append("\n");
    sb.append("    codFiliale: ").append(toIndentedString(codFiliale)).append("\n");
    sb.append("    codMatricola: ").append(toIndentedString(codMatricola)).append("\n");
    sb.append("    idOperazione: ").append(toIndentedString(idOperazione)).append("\n");
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

