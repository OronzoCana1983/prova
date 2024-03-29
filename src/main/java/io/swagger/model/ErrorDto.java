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
 * ErrorDto
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class ErrorDto   {
  @JsonProperty("codiceErrore")
  private String codiceErrore = null;

  public ErrorDto codiceErrore(String codiceErrore) {
    this.codiceErrore = codiceErrore;
    return this;
  }

  /**
   * Get codiceErrore
   * @return codiceErrore
  **/
  @ApiModelProperty(value = "")


  public String getCodiceErrore() {
    return codiceErrore;
  }

  public void setCodiceErrore(String codiceErrore) {
    this.codiceErrore = codiceErrore;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorDto errorDto = (ErrorDto) o;
    return Objects.equals(this.codiceErrore, errorDto.codiceErrore);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codiceErrore);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorDto {\n");
    
    sb.append("    codiceErrore: ").append(toIndentedString(codiceErrore)).append("\n");
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

