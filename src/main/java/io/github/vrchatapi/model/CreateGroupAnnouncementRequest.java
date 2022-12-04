/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.9.1
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
 * CreateGroupAnnouncementRequest
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CreateGroupAnnouncementRequest {
  public static final String SERIALIZED_NAME_TITLE = "title";
  @SerializedName(SERIALIZED_NAME_TITLE)
  private String title;

  public static final String SERIALIZED_NAME_TEXT = "text";
  @SerializedName(SERIALIZED_NAME_TEXT)
  private String text;

  public static final String SERIALIZED_NAME_IMAGE_ID = "imageId";
  @SerializedName(SERIALIZED_NAME_IMAGE_ID)
  private String imageId;

  public static final String SERIALIZED_NAME_SEND_NOTIFICATION = "sendNotification";
  @SerializedName(SERIALIZED_NAME_SEND_NOTIFICATION)
  private Boolean sendNotification = false;


  public CreateGroupAnnouncementRequest title(String title) {
    
    this.title = title;
    return this;
  }

   /**
   * Announcement title
   * @return title
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Event is starting soon!", required = true, value = "Announcement title")

  public String getTitle() {
    return title;
  }


  public void setTitle(String title) {
    this.title = title;
  }


  public CreateGroupAnnouncementRequest text(String text) {
    
    this.text = text;
    return this;
  }

   /**
   * Announcement text
   * @return text
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Come join us for the event!", value = "Announcement text")

  public String getText() {
    return text;
  }


  public void setText(String text) {
    this.text = text;
  }


  public CreateGroupAnnouncementRequest imageId(String imageId) {
    
    this.imageId = imageId;
    return this;
  }

   /**
   * Get imageId
   * @return imageId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "file_ce35d830-e20a-4df0-a6d4-5aaef4508044", value = "")

  public String getImageId() {
    return imageId;
  }


  public void setImageId(String imageId) {
    this.imageId = imageId;
  }


  public CreateGroupAnnouncementRequest sendNotification(Boolean sendNotification) {
    
    this.sendNotification = sendNotification;
    return this;
  }

   /**
   * Send notification to group members.
   * @return sendNotification
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "false", value = "Send notification to group members.")

  public Boolean getSendNotification() {
    return sendNotification;
  }


  public void setSendNotification(Boolean sendNotification) {
    this.sendNotification = sendNotification;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateGroupAnnouncementRequest createGroupAnnouncementRequest = (CreateGroupAnnouncementRequest) o;
    return Objects.equals(this.title, createGroupAnnouncementRequest.title) &&
        Objects.equals(this.text, createGroupAnnouncementRequest.text) &&
        Objects.equals(this.imageId, createGroupAnnouncementRequest.imageId) &&
        Objects.equals(this.sendNotification, createGroupAnnouncementRequest.sendNotification);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, text, imageId, sendNotification);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateGroupAnnouncementRequest {\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    imageId: ").append(toIndentedString(imageId)).append("\n");
    sb.append("    sendNotification: ").append(toIndentedString(sendNotification)).append("\n");
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
