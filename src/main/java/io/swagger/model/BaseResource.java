package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.ErrorMessage;
import io.swagger.model.Link;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * BaseResource
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-10-31T14:28:58.734Z")

public class BaseResource   {
  @JsonProperty("_links")
  @Valid
  private List<Link> links = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("returnMessages")
  @Valid
  private Map<String, List<ErrorMessage>> returnMessages = null;

  public BaseResource links(List<Link> links) {
    this.links = links;
    return this;
  }

  public BaseResource addLinksItem(Link linksItem) {
    if (this.links == null) {
      this.links = new ArrayList<Link>();
    }
    this.links.add(linksItem);
    return this;
  }

  /**
   * Get links
   * @return links
  **/
  @ApiModelProperty(value = "")

  @Valid

  public List<Link> getLinks() {
    return links;
  }

  public void setLinks(List<Link> links) {
    this.links = links;
  }

  public BaseResource id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(value = "")


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public BaseResource returnMessages(Map<String, List<ErrorMessage>> returnMessages) {
    this.returnMessages = returnMessages;
    return this;
  }

  public BaseResource putReturnMessagesItem(String key, List<ErrorMessage> returnMessagesItem) {
    if (this.returnMessages == null) {
      this.returnMessages = new HashMap<String, List<ErrorMessage>>();
    }
    this.returnMessages.put(key, returnMessagesItem);
    return this;
  }

  /**
   * Get returnMessages
   * @return returnMessages
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Map<String, List<ErrorMessage>> getReturnMessages() {
    return returnMessages;
  }

  public void setReturnMessages(Map<String, List<ErrorMessage>> returnMessages) {
    this.returnMessages = returnMessages;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BaseResource baseResource = (BaseResource) o;
    return Objects.equals(this.links, baseResource.links) &&
        Objects.equals(this.id, baseResource.id) &&
        Objects.equals(this.returnMessages, baseResource.returnMessages);
  }

  @Override
  public int hashCode() {
    return Objects.hash(links, id, returnMessages);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BaseResource {\n");
    
    sb.append("    links: ").append(toIndentedString(links)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    returnMessages: ").append(toIndentedString(returnMessages)).append("\n");
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

