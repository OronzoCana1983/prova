package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BearError
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class BearError   {
  @JsonProperty("additionalInfo")
  private Object additionalInfo = null;

  @JsonProperty("code")
  private String code = null;

  /**
   * Gets or Sets errorType
   */
  public enum ErrorTypeEnum {
    TECHNICAL("TECHNICAL"),
    
    BUSINESS("BUSINESS");

    private String value;

    ErrorTypeEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ErrorTypeEnum fromValue(String text) {
      for (ErrorTypeEnum b : ErrorTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("errorType")
  private ErrorTypeEnum errorType = null;

  @JsonProperty("extendedMessage")
  private String extendedMessage = null;

  @JsonProperty("localizedMessage")
  private String localizedMessage = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("rawRemoteError")
  private String rawRemoteError = null;

  @JsonProperty("remoteSource")
  private String remoteSource = null;

  /**
   * Gets or Sets severity
   */
  public enum SeverityEnum {
    FATAL("FATAL"),
    
    ERROR("ERROR"),
    
    WARNING("WARNING"),
    
    INFO("INFO");

    private String value;

    SeverityEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SeverityEnum fromValue(String text) {
      for (SeverityEnum b : SeverityEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("severity")
  private SeverityEnum severity = null;

  @JsonProperty("technicalInfo")
  private Object technicalInfo = null;

  public BearError additionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
    return this;
  }

  /**
   * Get additionalInfo
   * @return additionalInfo
  **/
  @ApiModelProperty(value = "")


  public Object getAdditionalInfo() {
    return additionalInfo;
  }

  public void setAdditionalInfo(Object additionalInfo) {
    this.additionalInfo = additionalInfo;
  }

  public BearError code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(value = "")


  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public BearError errorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * Get errorType
   * @return errorType
  **/
  @ApiModelProperty(value = "")


  public ErrorTypeEnum getErrorType() {
    return errorType;
  }

  public void setErrorType(ErrorTypeEnum errorType) {
    this.errorType = errorType;
  }

  public BearError extendedMessage(String extendedMessage) {
    this.extendedMessage = extendedMessage;
    return this;
  }

  /**
   * Get extendedMessage
   * @return extendedMessage
  **/
  @ApiModelProperty(value = "")


  public String getExtendedMessage() {
    return extendedMessage;
  }

  public void setExtendedMessage(String extendedMessage) {
    this.extendedMessage = extendedMessage;
  }

  public BearError localizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
    return this;
  }

  /**
   * Get localizedMessage
   * @return localizedMessage
  **/
  @ApiModelProperty(value = "")


  public String getLocalizedMessage() {
    return localizedMessage;
  }

  public void setLocalizedMessage(String localizedMessage) {
    this.localizedMessage = localizedMessage;
  }

  public BearError message(String message) {
    this.message = message;
    return this;
  }

  /**
   * Get message
   * @return message
  **/
  @ApiModelProperty(value = "")


  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public BearError rawRemoteError(String rawRemoteError) {
    this.rawRemoteError = rawRemoteError;
    return this;
  }

  /**
   * Get rawRemoteError
   * @return rawRemoteError
  **/
  @ApiModelProperty(value = "")


  public String getRawRemoteError() {
    return rawRemoteError;
  }

  public void setRawRemoteError(String rawRemoteError) {
    this.rawRemoteError = rawRemoteError;
  }

  public BearError remoteSource(String remoteSource) {
    this.remoteSource = remoteSource;
    return this;
  }

  /**
   * Get remoteSource
   * @return remoteSource
  **/
  @ApiModelProperty(value = "")


  public String getRemoteSource() {
    return remoteSource;
  }

  public void setRemoteSource(String remoteSource) {
    this.remoteSource = remoteSource;
  }

  public BearError severity(SeverityEnum severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")


  public SeverityEnum getSeverity() {
    return severity;
  }

  public void setSeverity(SeverityEnum severity) {
    this.severity = severity;
  }

  public BearError technicalInfo(Object technicalInfo) {
    this.technicalInfo = technicalInfo;
    return this;
  }

  /**
   * Get technicalInfo
   * @return technicalInfo
  **/
  @ApiModelProperty(value = "")


  public Object getTechnicalInfo() {
    return technicalInfo;
  }

  public void setTechnicalInfo(Object technicalInfo) {
    this.technicalInfo = technicalInfo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BearError bearError = (BearError) o;
    return Objects.equals(this.additionalInfo, bearError.additionalInfo) &&
        Objects.equals(this.code, bearError.code) &&
        Objects.equals(this.errorType, bearError.errorType) &&
        Objects.equals(this.extendedMessage, bearError.extendedMessage) &&
        Objects.equals(this.localizedMessage, bearError.localizedMessage) &&
        Objects.equals(this.message, bearError.message) &&
        Objects.equals(this.rawRemoteError, bearError.rawRemoteError) &&
        Objects.equals(this.remoteSource, bearError.remoteSource) &&
        Objects.equals(this.severity, bearError.severity) &&
        Objects.equals(this.technicalInfo, bearError.technicalInfo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(additionalInfo, code, errorType, extendedMessage, localizedMessage, message, rawRemoteError, remoteSource, severity, technicalInfo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BearError {\n");
    
    sb.append("    additionalInfo: ").append(toIndentedString(additionalInfo)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    errorType: ").append(toIndentedString(errorType)).append("\n");
    sb.append("    extendedMessage: ").append(toIndentedString(extendedMessage)).append("\n");
    sb.append("    localizedMessage: ").append(toIndentedString(localizedMessage)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    rawRemoteError: ").append(toIndentedString(rawRemoteError)).append("\n");
    sb.append("    remoteSource: ").append(toIndentedString(remoteSource)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
    sb.append("    technicalInfo: ").append(toIndentedString(technicalInfo)).append("\n");
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

