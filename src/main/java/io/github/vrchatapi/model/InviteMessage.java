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
import io.github.vrchatapi.model.InviteMessageType;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.threeten.bp.OffsetDateTime;

/**
 * InviteMessage
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class InviteMessage {
  public static final String SERIALIZED_NAME_CAN_BE_UPDATED = "canBeUpdated";
  @SerializedName(SERIALIZED_NAME_CAN_BE_UPDATED)
  private Boolean canBeUpdated = true;

  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_MESSAGE_TYPE = "messageType";
  @SerializedName(SERIALIZED_NAME_MESSAGE_TYPE)
  private InviteMessageType messageType = InviteMessageType.MESSAGE;

  public static final String SERIALIZED_NAME_REMAINING_COOLDOWN_MINUTES = "remainingCooldownMinutes";
  @SerializedName(SERIALIZED_NAME_REMAINING_COOLDOWN_MINUTES)
  private Integer remainingCooldownMinutes = 0;

  public static final String SERIALIZED_NAME_SLOT = "slot";
  @SerializedName(SERIALIZED_NAME_SLOT)
  private Integer slot;

  public static final String SERIALIZED_NAME_UPDATED_AT = "updatedAt";
  @SerializedName(SERIALIZED_NAME_UPDATED_AT)
  private OffsetDateTime updatedAt;


  public InviteMessage canBeUpdated(Boolean canBeUpdated) {
    
    this.canBeUpdated = canBeUpdated;
    return this;
  }

   /**
   * Get canBeUpdated
   * @return canBeUpdated
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Boolean getCanBeUpdated() {
    return canBeUpdated;
  }


  public void setCanBeUpdated(Boolean canBeUpdated) {
    this.canBeUpdated = canBeUpdated;
  }


  public InviteMessage id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "invm_24a1c14d-5e24-48e5-90e3-c3f712420ffa", required = true, value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public InviteMessage message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * Get message
   * @return message
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public InviteMessage messageType(InviteMessageType messageType) {
    
    this.messageType = messageType;
    return this;
  }

   /**
   * Get messageType
   * @return messageType
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public InviteMessageType getMessageType() {
    return messageType;
  }


  public void setMessageType(InviteMessageType messageType) {
    this.messageType = messageType;
  }


  public InviteMessage remainingCooldownMinutes(Integer remainingCooldownMinutes) {
    
    this.remainingCooldownMinutes = remainingCooldownMinutes;
    return this;
  }

   /**
   * Changes to 60 when updated, although probably server-side configurable.
   * minimum: 0
   * @return remainingCooldownMinutes
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Changes to 60 when updated, although probably server-side configurable.")

  public Integer getRemainingCooldownMinutes() {
    return remainingCooldownMinutes;
  }


  public void setRemainingCooldownMinutes(Integer remainingCooldownMinutes) {
    this.remainingCooldownMinutes = remainingCooldownMinutes;
  }


  public InviteMessage slot(Integer slot) {
    
    this.slot = slot;
    return this;
  }

   /**
   * Get slot
   * minimum: 0
   * maximum: 11
   * @return slot
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public Integer getSlot() {
    return slot;
  }


  public void setSlot(Integer slot) {
    this.slot = slot;
  }


  public InviteMessage updatedAt(OffsetDateTime updatedAt) {
    
    this.updatedAt = updatedAt;
    return this;
  }

   /**
   * Get updatedAt
   * @return updatedAt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getUpdatedAt() {
    return updatedAt;
  }


  public void setUpdatedAt(OffsetDateTime updatedAt) {
    this.updatedAt = updatedAt;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InviteMessage inviteMessage = (InviteMessage) o;
    return Objects.equals(this.canBeUpdated, inviteMessage.canBeUpdated) &&
        Objects.equals(this.id, inviteMessage.id) &&
        Objects.equals(this.message, inviteMessage.message) &&
        Objects.equals(this.messageType, inviteMessage.messageType) &&
        Objects.equals(this.remainingCooldownMinutes, inviteMessage.remainingCooldownMinutes) &&
        Objects.equals(this.slot, inviteMessage.slot) &&
        Objects.equals(this.updatedAt, inviteMessage.updatedAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(canBeUpdated, id, message, messageType, remainingCooldownMinutes, slot, updatedAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InviteMessage {\n");
    sb.append("    canBeUpdated: ").append(toIndentedString(canBeUpdated)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    messageType: ").append(toIndentedString(messageType)).append("\n");
    sb.append("    remainingCooldownMinutes: ").append(toIndentedString(remainingCooldownMinutes)).append("\n");
    sb.append("    slot: ").append(toIndentedString(slot)).append("\n");
    sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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

