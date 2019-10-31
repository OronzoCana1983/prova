package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.DatiChiamata;
import io.swagger.model.PacchettoDocumentale;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EventWrapperPacchettoDocumentale
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class EventWrapperPacchettoDocumentale   {
  @JsonProperty("customHeaders")
  @Valid
  private Map<String, String> customHeaders = null;

  @JsonProperty("datiChiamata")
  private DatiChiamata datiChiamata = null;

  @JsonProperty("payload")
  private PacchettoDocumentale payload = null;

  public EventWrapperPacchettoDocumentale customHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
    return this;
  }

  public EventWrapperPacchettoDocumentale putCustomHeadersItem(String key, String customHeadersItem) {
    if (this.customHeaders == null) {
      this.customHeaders = new HashMap<String, String>();
    }
    this.customHeaders.put(key, customHeadersItem);
    return this;
  }

  /**
   * Get customHeaders
   * @return customHeaders
  **/
  @ApiModelProperty(value = "")


  public Map<String, String> getCustomHeaders() {
    return customHeaders;
  }

  public void setCustomHeaders(Map<String, String> customHeaders) {
    this.customHeaders = customHeaders;
  }

  public EventWrapperPacchettoDocumentale datiChiamata(DatiChiamata datiChiamata) {
    this.datiChiamata = datiChiamata;
    return this;
  }

  /**
   * Get datiChiamata
   * @return datiChiamata
  **/
  @ApiModelProperty(value = "")

  @Valid

  public DatiChiamata getDatiChiamata() {
    return datiChiamata;
  }

  public void setDatiChiamata(DatiChiamata datiChiamata) {
    this.datiChiamata = datiChiamata;
  }

  public EventWrapperPacchettoDocumentale payload(PacchettoDocumentale payload) {
    this.payload = payload;
    return this;
  }

  /**
   * Get payload
   * @return payload
  **/
  @ApiModelProperty(value = "")

  @Valid

  public PacchettoDocumentale getPayload() {
    return payload;
  }

  public void setPayload(PacchettoDocumentale payload) {
    this.payload = payload;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EventWrapperPacchettoDocumentale eventWrapperPacchettoDocumentale = (EventWrapperPacchettoDocumentale) o;
    return Objects.equals(this.customHeaders, eventWrapperPacchettoDocumentale.customHeaders) &&
        Objects.equals(this.datiChiamata, eventWrapperPacchettoDocumentale.datiChiamata) &&
        Objects.equals(this.payload, eventWrapperPacchettoDocumentale.payload);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customHeaders, datiChiamata, payload);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EventWrapperPacchettoDocumentale {\n");
    
    sb.append("    customHeaders: ").append(toIndentedString(customHeaders)).append("\n");
    sb.append("    datiChiamata: ").append(toIndentedString(datiChiamata)).append("\n");
    sb.append("    payload: ").append(toIndentedString(payload)).append("\n");
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

