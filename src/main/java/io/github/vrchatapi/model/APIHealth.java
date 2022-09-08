/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.7.4
 * Contact: me@ariesclark.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * APIHealth
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class APIHealth {
  public static final String SERIALIZED_NAME_OK = "ok";
  @SerializedName(SERIALIZED_NAME_OK)
  private Boolean ok;

  public static final String SERIALIZED_NAME_SERVER_NAME = "serverName";
  @SerializedName(SERIALIZED_NAME_SERVER_NAME)
  private String serverName;

  public static final String SERIALIZED_NAME_BUILD_VERSION_TAG = "buildVersionTag";
  @SerializedName(SERIALIZED_NAME_BUILD_VERSION_TAG)
  private String buildVersionTag;


  public APIHealth ok(Boolean ok) {
    
    this.ok = ok;
    return this;
  }

   /**
   * Get ok
   * @return ok
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getOk() {
    return ok;
  }


  public void setOk(Boolean ok) {
    this.ok = ok;
  }


  public APIHealth serverName(String serverName) {
    
    this.serverName = serverName;
    return this;
  }

   /**
   * Get serverName
   * @return serverName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getServerName() {
    return serverName;
  }


  public void setServerName(String serverName) {
    this.serverName = serverName;
  }


  public APIHealth buildVersionTag(String buildVersionTag) {
    
    this.buildVersionTag = buildVersionTag;
    return this;
  }

   /**
   * Get buildVersionTag
   * @return buildVersionTag
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getBuildVersionTag() {
    return buildVersionTag;
  }


  public void setBuildVersionTag(String buildVersionTag) {
    this.buildVersionTag = buildVersionTag;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    APIHealth apIHealth = (APIHealth) o;
    return Objects.equals(this.ok, apIHealth.ok) &&
        Objects.equals(this.serverName, apIHealth.serverName) &&
        Objects.equals(this.buildVersionTag, apIHealth.buildVersionTag);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ok, serverName, buildVersionTag);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class APIHealth {\n");
    sb.append("    ok: ").append(toIndentedString(ok)).append("\n");
    sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
    sb.append("    buildVersionTag: ").append(toIndentedString(buildVersionTag)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

