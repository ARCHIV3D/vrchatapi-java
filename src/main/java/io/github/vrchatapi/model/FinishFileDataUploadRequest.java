/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.6.7
 * Contact: me@ruby.js.org
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
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 * FinishFileDataUploadRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class FinishFileDataUploadRequest {
  public static final String SERIALIZED_NAME_ETAGS = "etags";
  @SerializedName(SERIALIZED_NAME_ETAGS)
  private Set<String> etags = null;

  public static final String SERIALIZED_NAME_NEXT_PART_NUMBER = "nextPartNumber";
  @SerializedName(SERIALIZED_NAME_NEXT_PART_NUMBER)
  private String nextPartNumber = "0";

  public static final String SERIALIZED_NAME_MAX_PARTS = "maxParts";
  @SerializedName(SERIALIZED_NAME_MAX_PARTS)
  private String maxParts = "0";


  public FinishFileDataUploadRequest etags(Set<String> etags) {
    
    this.etags = etags;
    return this;
  }

  public FinishFileDataUploadRequest addEtagsItem(String etagsItem) {
    if (this.etags == null) {
      this.etags = new LinkedHashSet<String>();
    }
    this.etags.add(etagsItem);
    return this;
  }

   /**
   * Array of ETags uploaded.
   * @return etags
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Array of ETags uploaded.")

  public Set<String> getEtags() {
    return etags;
  }


  public void setEtags(Set<String> etags) {
    this.etags = etags;
  }


  public FinishFileDataUploadRequest nextPartNumber(String nextPartNumber) {
    
    this.nextPartNumber = nextPartNumber;
    return this;
  }

   /**
   * Always a zero in string form, despite how many parts uploaded.
   * @return nextPartNumber
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Always a zero in string form, despite how many parts uploaded.")

  public String getNextPartNumber() {
    return nextPartNumber;
  }


  public void setNextPartNumber(String nextPartNumber) {
    this.nextPartNumber = nextPartNumber;
  }


  public FinishFileDataUploadRequest maxParts(String maxParts) {
    
    this.maxParts = maxParts;
    return this;
  }

   /**
   * Always a zero in string form, despite how many parts uploaded.
   * @return maxParts
   * @deprecated
  **/
  @Deprecated
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "0", required = true, value = "Always a zero in string form, despite how many parts uploaded.")

  public String getMaxParts() {
    return maxParts;
  }


  public void setMaxParts(String maxParts) {
    this.maxParts = maxParts;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    FinishFileDataUploadRequest finishFileDataUploadRequest = (FinishFileDataUploadRequest) o;
    return Objects.equals(this.etags, finishFileDataUploadRequest.etags) &&
        Objects.equals(this.nextPartNumber, finishFileDataUploadRequest.nextPartNumber) &&
        Objects.equals(this.maxParts, finishFileDataUploadRequest.maxParts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(etags, nextPartNumber, maxParts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class FinishFileDataUploadRequest {\n");
    sb.append("    etags: ").append(toIndentedString(etags)).append("\n");
    sb.append("    nextPartNumber: ").append(toIndentedString(nextPartNumber)).append("\n");
    sb.append("    maxParts: ").append(toIndentedString(maxParts)).append("\n");
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

