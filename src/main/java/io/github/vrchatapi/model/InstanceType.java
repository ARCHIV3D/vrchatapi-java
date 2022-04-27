/*
 * VRChat API Documentation
 *
 * The version of the OpenAPI document: 1.7.1
 * Contact: me@ariesclark.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.github.vrchatapi.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Gets or Sets InstanceType
 */
@JsonAdapter(InstanceType.Adapter.class)
public enum InstanceType {
  
  PUBLIC("public"),
  
  HIDDEN("hidden"),
  
  FRIENDS("friends"),
  
  PRIVATE("private");

  private String value;

  InstanceType(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static InstanceType fromValue(String value) {
    for (InstanceType b : InstanceType.values()) {
      if (b.value.equals(value)) {
        return b;
      }
    }
    throw new IllegalArgumentException("Unexpected value '" + value + "'");
  }

  public static class Adapter extends TypeAdapter<InstanceType> {
    @Override
    public void write(final JsonWriter jsonWriter, final InstanceType enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public InstanceType read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return InstanceType.fromValue(value);
    }
  }
}

