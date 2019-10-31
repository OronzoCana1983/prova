package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.MessageForm;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorMessage
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class ErrorMessage   {
  @JsonProperty("errorCode")
  private String errorCode = null;

  @JsonProperty("language")
  private String language = null;

  @JsonProperty("message")
  private String message = null;

  @JsonProperty("messageKey")
  private String messageKey = null;

  @JsonProperty("messageTitle")
  private String messageTitle = null;

  @JsonProperty("messagesForm")
  @Valid
  private List<MessageForm> messagesForm = null;

  @JsonProperty("retry")
  private Boolean retry = null;

  @JsonProperty("severity")
  private String severity = null;

  public ErrorMessage errorCode(String errorCode) {
    this.errorCode = errorCode;
    return this;
  }

  /**
   * Get errorCode
   * @return errorCode
  **/
  @ApiModelProperty(value = "")


  public String getErrorCode() {
    return errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public ErrorMessage language(String language) {
    this.language = language;
    return this;
  }

  /**
   * Get language
   * @return language
  **/
  @ApiModelProperty(value = "")


  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public ErrorMessage message(String message) {
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

  public ErrorMessage messageKey(String messageKey) {
    this.messageKey = messageKey;
    return this;
  }

  /**
   * Get messageKey
   * @return messageKey
  **/
  @ApiModelProperty(value = "")


  public String getMessageKey() {
    return messageKey;
  }

  public void setMessageKey(String messageKey) {
    this.messageKey = messageKey;
  }

  public ErrorMessage messageTitle(String messageTitle) {
    this.messageTitle = messageTitle;
    return this;
  }

  /**
   * Get messageTitle
   * @return messageTitle
  **/
  @ApiModelProperty(value = "")


  public String getMessageTitle() {
    return messageTitle;
  }

  public void setMessageTitle(String messageTitle) {
    this.messageTitle = messageTitle;
  }

  public ErrorMessage messagesForm(List<MessageForm> messagesForm) {
    this.messagesForm = messagesForm;
    return this;
  }

  public ErrorMessage addMessagesFormItem(MessageForm messagesFormItem) {
    if (this.messagesForm == null) {
      this.messagesForm = new ArrayList<MessageForm>();
    }
    this.messagesForm.add(messagesFormItem);
    return this;
  }

  /**
   * Get messagesForm
   * @return messagesForm
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<MessageForm> getMessagesForm() {
    return messagesForm;
  }

  public void setMessagesForm(List<MessageForm> messagesForm) {
    this.messagesForm = messagesForm;
  }

  public ErrorMessage retry(Boolean retry) {
    this.retry = retry;
    return this;
  }

  /**
   * Get retry
   * @return retry
  **/
  @ApiModelProperty(value = "")


  public Boolean isRetry() {
    return retry;
  }

  public void setRetry(Boolean retry) {
    this.retry = retry;
  }

  public ErrorMessage severity(String severity) {
    this.severity = severity;
    return this;
  }

  /**
   * Get severity
   * @return severity
  **/
  @ApiModelProperty(value = "")


  public String getSeverity() {
    return severity;
  }

  public void setSeverity(String severity) {
    this.severity = severity;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMessage errorMessage = (ErrorMessage) o;
    return Objects.equals(this.errorCode, errorMessage.errorCode) &&
        Objects.equals(this.language, errorMessage.language) &&
        Objects.equals(this.message, errorMessage.message) &&
        Objects.equals(this.messageKey, errorMessage.messageKey) &&
        Objects.equals(this.messageTitle, errorMessage.messageTitle) &&
        Objects.equals(this.messagesForm, errorMessage.messagesForm) &&
        Objects.equals(this.retry, errorMessage.retry) &&
        Objects.equals(this.severity, errorMessage.severity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errorCode, language, message, messageKey, messageTitle, messagesForm, retry, severity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMessage {\n");
    
    sb.append("    errorCode: ").append(toIndentedString(errorCode)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageKey: ").append(toIndentedString(messageKey)).append("\n");
    sb.append("    messageTitle: ").append(toIndentedString(messageTitle)).append("\n");
    sb.append("    messagesForm: ").append(toIndentedString(messagesForm)).append("\n");
    sb.append("    retry: ").append(toIndentedString(retry)).append("\n");
    sb.append("    severity: ").append(toIndentedString(severity)).append("\n");
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

