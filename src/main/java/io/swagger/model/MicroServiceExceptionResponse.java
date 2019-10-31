package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.BearError;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * MicroServiceExceptionResponse
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class MicroServiceExceptionResponse   {
  @JsonProperty("errors")
  @Valid
  private List<BearError> errors = null;

  @JsonProperty("mainError")
  private BearError mainError = null;

  public MicroServiceExceptionResponse errors(List<BearError> errors) {
    this.errors = errors;
    return this;
  }

  public MicroServiceExceptionResponse addErrorsItem(BearError errorsItem) {
    if (this.errors == null) {
      this.errors = new ArrayList<BearError>();
    }
    this.errors.add(errorsItem);
    return this;
  }

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<BearError> getErrors() {
    return errors;
  }

  public void setErrors(List<BearError> errors) {
    this.errors = errors;
  }

  public MicroServiceExceptionResponse mainError(BearError mainError) {
    this.mainError = mainError;
    return this;
  }

  /**
   * Get mainError
   * @return mainError
  **/
  @ApiModelProperty(value = "")

  @Valid

  public BearError getMainError() {
    return mainError;
  }

  public void setMainError(BearError mainError) {
    this.mainError = mainError;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MicroServiceExceptionResponse microServiceExceptionResponse = (MicroServiceExceptionResponse) o;
    return Objects.equals(this.errors, microServiceExceptionResponse.errors) &&
        Objects.equals(this.mainError, microServiceExceptionResponse.mainError);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors, mainError);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MicroServiceExceptionResponse {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
    sb.append("    mainError: ").append(toIndentedString(mainError)).append("\n");
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

