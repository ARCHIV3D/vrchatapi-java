/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.11.0
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
 * Status object representing if a queried user by username or userId exists or not. This model is primarily used by the &#x60;/auth/exists&#x60; endpoint, which in turn is used during registration. Please see the documentation on that endpoint for more information on usage.
 */
@ApiModel(description = "Status object representing if a queried user by username or userId exists or not. This model is primarily used by the `/auth/exists` endpoint, which in turn is used during registration. Please see the documentation on that endpoint for more information on usage.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class UserExists {
  public static final String SERIALIZED_NAME_USER_EXISTS = "userExists";
  @SerializedName(SERIALIZED_NAME_USER_EXISTS)
  private Boolean userExists = false;

  public UserExists() {
  }

  public UserExists userExists(Boolean userExists) {
    
    this.userExists = userExists;
    return this;
  }

   /**
   * Status if a user exist with that username or userId.
   * @return userExists
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "Status if a user exist with that username or userId.")

  public Boolean getUserExists() {
    return userExists;
  }


  public void setUserExists(Boolean userExists) {
    this.userExists = userExists;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserExists userExists = (UserExists) o;
    return Objects.equals(this.userExists, userExists.userExists);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userExists);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserExists {\n");
    sb.append("    userExists: ").append(toIndentedString(userExists)).append("\n");
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
    openapiFields.add("userExists");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("userExists");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to UserExists
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (!UserExists.openapiRequiredFields.isEmpty()) { // has required fields but JSON object is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in UserExists is not found in the empty JSON string", UserExists.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!UserExists.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `UserExists` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : UserExists.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!UserExists.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'UserExists' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<UserExists> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(UserExists.class));

       return (TypeAdapter<T>) new TypeAdapter<UserExists>() {
           @Override
           public void write(JsonWriter out, UserExists value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public UserExists read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of UserExists given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of UserExists
  * @throws IOException if the JSON string is invalid with respect to UserExists
  */
  public static UserExists fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, UserExists.class);
  }

 /**
  * Convert an instance of UserExists to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

