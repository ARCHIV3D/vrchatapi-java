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

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import io.github.vrchatapi.JSON;

/**
 * Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.
 */
@ApiModel(description = "Only visible via the /groups/:groupId/members endpoint, **not** when fetching a specific user.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class GroupMemberLimitedUser {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_DISPLAY_NAME = "displayName";
  @SerializedName(SERIALIZED_NAME_DISPLAY_NAME)
  private String displayName;

  public static final String SERIALIZED_NAME_THUMBNAIL_URL = "thumbnailUrl";
  @SerializedName(SERIALIZED_NAME_THUMBNAIL_URL)
  private String thumbnailUrl;

  public static final String SERIALIZED_NAME_ICON_URL = "iconUrl";
  @SerializedName(SERIALIZED_NAME_ICON_URL)
  private String iconUrl;

  public GroupMemberLimitedUser() {
  }

  public GroupMemberLimitedUser id(String id) {
    
    this.id = id;
    return this;
  }

   /**
   * A users unique ID, usually in the form of &#x60;usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469&#x60;. Legacy players can have old IDs in the form of &#x60;8JoV9XEdpo&#x60;. The ID can never be changed.
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469", value = "A users unique ID, usually in the form of `usr_c1644b5b-3ca4-45b4-97c6-a2a0de70d469`. Legacy players can have old IDs in the form of `8JoV9XEdpo`. The ID can never be changed.")

  public String getId() {
    return id;
  }


  public void setId(String id) {
    this.id = id;
  }


  public GroupMemberLimitedUser displayName(String displayName) {
    
    this.displayName = displayName;
    return this;
  }

   /**
   * Get displayName
   * @return displayName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getDisplayName() {
    return displayName;
  }


  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }


  public GroupMemberLimitedUser thumbnailUrl(String thumbnailUrl) {
    
    this.thumbnailUrl = thumbnailUrl;
    return this;
  }

   /**
   * Get thumbnailUrl
   * @return thumbnailUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getThumbnailUrl() {
    return thumbnailUrl;
  }


  public void setThumbnailUrl(String thumbnailUrl) {
    this.thumbnailUrl = thumbnailUrl;
  }


  public GroupMemberLimitedUser iconUrl(String iconUrl) {
    
    this.iconUrl = iconUrl;
    return this;
  }

   /**
   * Get iconUrl
   * @return iconUrl
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getIconUrl() {
    return iconUrl;
  }


  public void setIconUrl(String iconUrl) {
    this.iconUrl = iconUrl;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GroupMemberLimitedUser groupMemberLimitedUser = (GroupMemberLimitedUser) o;
    return Objects.equals(this.id, groupMemberLimitedUser.id) &&
        Objects.equals(this.displayName, groupMemberLimitedUser.displayName) &&
        Objects.equals(this.thumbnailUrl, groupMemberLimitedUser.thumbnailUrl) &&
        Objects.equals(this.iconUrl, groupMemberLimitedUser.iconUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, thumbnailUrl, iconUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GroupMemberLimitedUser {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    thumbnailUrl: ").append(toIndentedString(thumbnailUrl)).append("\n");
    sb.append("    iconUrl: ").append(toIndentedString(iconUrl)).append("\n");
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


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("id");
    openapiFields.add("displayName");
    openapiFields.add("thumbnailUrl");
    openapiFields.add("iconUrl");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GroupMemberLimitedUser
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!GroupMemberLimitedUser.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in GroupMemberLimitedUser is not found in the empty JSON string", GroupMemberLimitedUser.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GroupMemberLimitedUser.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GroupMemberLimitedUser` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      if ((jsonObj.get("id") != null && !jsonObj.get("id").isJsonNull()) && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if ((jsonObj.get("displayName") != null && !jsonObj.get("displayName").isJsonNull()) && !jsonObj.get("displayName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `displayName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("displayName").toString()));
      }
      if ((jsonObj.get("thumbnailUrl") != null && !jsonObj.get("thumbnailUrl").isJsonNull()) && !jsonObj.get("thumbnailUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `thumbnailUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("thumbnailUrl").toString()));
      }
      if ((jsonObj.get("iconUrl") != null && !jsonObj.get("iconUrl").isJsonNull()) && !jsonObj.get("iconUrl").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `iconUrl` to be a primitive type in the JSON string but got `%s`", jsonObj.get("iconUrl").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GroupMemberLimitedUser.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GroupMemberLimitedUser' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GroupMemberLimitedUser> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GroupMemberLimitedUser.class));

       return (TypeAdapter<T>) new TypeAdapter<GroupMemberLimitedUser>() {
           @Override
           public void write(JsonWriter out, GroupMemberLimitedUser value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GroupMemberLimitedUser read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GroupMemberLimitedUser given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GroupMemberLimitedUser
  * @throws IOException if the JSON string is invalid with respect to GroupMemberLimitedUser
  */
  public static GroupMemberLimitedUser fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GroupMemberLimitedUser.class);
  }

 /**
  * Convert an instance of GroupMemberLimitedUser to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

