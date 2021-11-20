/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.5.3
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
import io.github.vrchatapi.model.DynamicContentRow;
import io.github.vrchatapi.model.InfoPushDataArticle;
import io.github.vrchatapi.model.InfoPushDataClickable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * InfoPushData
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InfoPushData {
  public static final String SERIALIZED_NAME_CONTENT_LIST = "contentList";
  @SerializedName(SERIALIZED_NAME_CONTENT_LIST)
  private DynamicContentRow contentList;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_IMAGE_URL = "imageUrl";
  @SerializedName(SERIALIZED_NAME_IMAGE_URL)
  private String imageUrl;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_ON_PRESSED = "onPressed";
  @SerializedName(SERIALIZED_NAME_ON_PRESSED)
  private InfoPushDataClickable onPressed;

  public static final String SERIALIZED_NAME_TEMPLATE = "template";
  @SerializedName(SERIALIZED_NAME_TEMPLATE)
  private String template;

  public static final String SERIALIZED_NAME_VERSION = "version";
  @SerializedName(SERIALIZED_NAME_VERSION)
  private String version;

  public static final String SERIALIZED_NAME_ARTICLE = "article";
  @SerializedName(SERIALIZED_NAME_ARTICLE)
  private InfoPushDataArticle article;


  public InfoPushData contentList(DynamicContentRow contentList) {
    
    this.contentList = contentList;
    return this;
  }

   /**
   * Get contentList
   * @return contentList
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public DynamicContentRow getContentList() {
    return contentList;
  }


  public void setContentList(DynamicContentRow contentList) {
    this.contentList = contentList;
  }


  public InfoPushData description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public InfoPushData imageUrl(String imageUrl) {
    
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * Get imageUrl
   * @return imageUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getImageUrl() {
    return imageUrl;
  }


  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }


  public InfoPushData name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public InfoPushData onPressed(InfoPushDataClickable onPressed) {
    
    this.onPressed = onPressed;
    return this;
  }

   /**
   * Get onPressed
   * @return onPressed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InfoPushDataClickable getOnPressed() {
    return onPressed;
  }


  public void setOnPressed(InfoPushDataClickable onPressed) {
    this.onPressed = onPressed;
  }


  public InfoPushData template(String template) {
    
    this.template = template;
    return this;
  }

   /**
   * Get template
   * @return template
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getTemplate() {
    return template;
  }


  public void setTemplate(String template) {
    this.template = template;
  }


  public InfoPushData version(String version) {
    
    this.version = version;
    return this;
  }

   /**
   * Get version
   * @return version
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2021.3.4", value = "")

  public String getVersion() {
    return version;
  }


  public void setVersion(String version) {
    this.version = version;
  }


  public InfoPushData article(InfoPushDataArticle article) {
    
    this.article = article;
    return this;
  }

   /**
   * Get article
   * @return article
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public InfoPushDataArticle getArticle() {
    return article;
  }


  public void setArticle(InfoPushDataArticle article) {
    this.article = article;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfoPushData infoPushData = (InfoPushData) o;
    return Objects.equals(this.contentList, infoPushData.contentList) &&
        Objects.equals(this.description, infoPushData.description) &&
        Objects.equals(this.imageUrl, infoPushData.imageUrl) &&
        Objects.equals(this.name, infoPushData.name) &&
        Objects.equals(this.onPressed, infoPushData.onPressed) &&
        Objects.equals(this.template, infoPushData.template) &&
        Objects.equals(this.version, infoPushData.version) &&
        Objects.equals(this.article, infoPushData.article);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contentList, description, imageUrl, name, onPressed, template, version, article);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfoPushData {\n");
    sb.append("    contentList: ").append(toIndentedString(contentList)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    onPressed: ").append(toIndentedString(onPressed)).append("\n");
    sb.append("    template: ").append(toIndentedString(template)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    article: ").append(toIndentedString(article)).append("\n");
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

