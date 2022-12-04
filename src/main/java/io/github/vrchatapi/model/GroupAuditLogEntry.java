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
import org.threeten.bp.OffsetDateTime;

/**
 * GroupAuditLogEntry
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupAuditLogEntry {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_CREATED_AT = "created_at";
  @SerializedName(SERIALIZED_NAME_CREATED_AT)
  private OffsetDateTime createdAt;

  public static final String SERIALIZED_NAME_GROUP_ID = "groupId";
  @SerializedName(SERIALIZED_NAME_GROUP_ID)
  private String groupId;

  public static final String SERIALIZED_NAME_ACTOR_ID = "actorId";
  @SerializedName(SERIALIZED_NAME_ACTOR_ID)
  private String actorId;

  public static final String SERIALIZED_NAME_ACTOR_DISPLAYNAME = "actorDisplayname";
  @SerializedName(SERIALIZED_NAME_ACTOR_DISPLAYNAME)
  private String actorDisplayname;

  public static final String SERIALIZED_NAME_TARGET_ID = "targetId";
  @SerializedName(SERIALIZED_NAME_TARGET_ID)
  private String targetId;

  public static final String SERIALIZED_NAME_EVENT_TYPE = "eventType";
  @SerializedName(SERIALIZED_NAME_EVENT_TYPE)
  private String eventType = "group.update";

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_DATA = "data";
  @SerializedName(SERIALIZED_NAME_DATA)
  private Object data;


  public GroupAuditLogEntry id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "gaud_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupAuditLogEntry createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * Get createdAt
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public GroupAuditLogEntry groupId(String groupId) {
    
    this.groupId = groupId;
    return this;
  }

   /**
   * Get groupId
   * @return groupId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "grp_71a7ff59-112c-4e78-a990-c7cc650776e5", value = "")

  public String getGroupId() {
    return groupId;
  }


  public void setGroupId(String groupId) {
    this.groupId = groupId;
  }


  public GroupAuditLogEntry actorId(String actorId) {
    
    this.actorId = actorId;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return actorId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getActorId() {
    return actorId;
  }


  public void setActorId(String actorId) {
    this.actorId = actorId;
  }


  public GroupAuditLogEntry actorDisplayname(String actorDisplayname) {
    
    this.actorDisplayname = actorDisplayname;
    return this;
  }

   /**
   * Get actorDisplayname
   * @return actorDisplayname
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getActorDisplayname() {
    return actorDisplayname;
  }


  public void setActorDisplayname(String actorDisplayname) {
    this.actorDisplayname = actorDisplayname;
  }


  public GroupAuditLogEntry targetId(String targetId) {
    
    this.targetId = targetId;
    return this;
  }

   /**
   * Typically GroupID or GroupRoleID, but could be other types of IDs.
   * @return targetId
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Typically GroupID or GroupRoleID, but could be other types of IDs.")

  public String getTargetId() {
    return targetId;
  }


  public void setTargetId(String targetId) {
    this.targetId = targetId;
  }


  public GroupAuditLogEntry eventType(String eventType) {
    
    this.eventType = eventType;
    return this;
  }

   /**
   * The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with &#x60;group.role&#x60;.
   * @return eventType
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "group.role.update", value = "The type of event that occurred. This is a string that is prefixed with the type of object that the event occurred on. For example, a group role update event would be prefixed with `group.role`.")

  public String getEventType() {
    return eventType;
  }


  public void setEventType(String eventType) {
    this.eventType = eventType;
  }


  public GroupAuditLogEntry description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * A human-readable description of the event.
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Group role updated", value = "A human-readable description of the event.")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public GroupAuditLogEntry data(Object data) {
    
    this.data = data;
    return this;
  }

   /**
   * The data associated with the event. The format of this data is dependent on the event type.
   * @return data
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "{\"description\":{\"old\":\"My exciting new group.  It's pretty nifty!\",\"new\":\"My exciting new group. It's pretty nifty!\"},\"joinState\":{\"old\":\"closed\",\"new\":\"request\"}}", value = "The data associated with the event. The format of this data is dependent on the event type.")

  public Object getData() {
    return data;
  }


  public void setData(Object data) {
    this.data = data;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupAuditLogEntry groupAuditLogEntry = (GroupAuditLogEntry) o;
    return Objects.equals(this.id, groupAuditLogEntry.id) &&
        Objects.equals(this.createdAt, groupAuditLogEntry.createdAt) &&
        Objects.equals(this.groupId, groupAuditLogEntry.groupId) &&
        Objects.equals(this.actorId, groupAuditLogEntry.actorId) &&
        Objects.equals(this.actorDisplayname, groupAuditLogEntry.actorDisplayname) &&
        Objects.equals(this.targetId, groupAuditLogEntry.targetId) &&
        Objects.equals(this.eventType, groupAuditLogEntry.eventType) &&
        Objects.equals(this.description, groupAuditLogEntry.description) &&
        Objects.equals(this.data, groupAuditLogEntry.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, createdAt, groupId, actorId, actorDisplayname, targetId, eventType, description, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupAuditLogEntry {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
    sb.append("    actorId: ").append(toIndentedString(actorId)).append("\n");
    sb.append("    actorDisplayname: ").append(toIndentedString(actorDisplayname)).append("\n");
    sb.append("    targetId: ").append(toIndentedString(targetId)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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
