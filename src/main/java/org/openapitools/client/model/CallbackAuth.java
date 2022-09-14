/*
 * Whispir Platform API
 * Whispir Platform API for cross channel and multi channel communications. Documentation on each endpoint is available at https://developers.whispir.com.
 *
 * The version of the OpenAPI document: 1.0.0
 * Contact: support@whispir.com
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.model;

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
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import whispir_sdk_java.JSON;

/**
 * The authentication model details. You will receive -   For &#x60;queryparam&#x60; - &#x60;?Auth&#x3D;{{KeyValue}}&#x60;  For &#x60;httpheader&#x60; - &#x60;X-Whispir-Callback-Key: {{KeyValue}}&#x60;  For &#x60;basicauth&#x60; - &#x60;Authorization: Basic {{KeyValue}}&#x60;  For &#x60;bearertoken&#x60; - &#x60;Authorization: Bearer {{KeyValue}}&#x60;
 */
@ApiModel(description = "The authentication model details. You will receive -   For `queryparam` - `?Auth={{KeyValue}}`  For `httpheader` - `X-Whispir-Callback-Key: {{KeyValue}}`  For `basicauth` - `Authorization: Basic {{KeyValue}}`  For `bearertoken` - `Authorization: Bearer {{KeyValue}}`")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class CallbackAuth {
  /**
   * The type of authentication allowed by Whispir at the Destination URL
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    QUERYPARAM("queryparam"),
    
    HTTPHEADER("httpheader"),
    
    BASICAUTH("basicauth"),
    
    BEARERTOKEN("bearertoken");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return TypeEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_TYPE = "type";
  @SerializedName(SERIALIZED_NAME_TYPE)
  private TypeEnum type = TypeEnum.QUERYPARAM;

  public static final String SERIALIZED_NAME_KEY = "key";
  @SerializedName(SERIALIZED_NAME_KEY)
  private String key;

  public CallbackAuth() { 
  }

  public CallbackAuth type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The type of authentication allowed by Whispir at the Destination URL
   * @return type
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "basicauth", required = true, value = "The type of authentication allowed by Whispir at the Destination URL")

  public TypeEnum getType() {
    return type;
  }


  public void setType(TypeEnum type) {
    this.type = type;
  }


  public CallbackAuth key(String key) {
    
    this.key = key;
    return this;
  }

   /**
   * The value that will be passed with the authentication key
   * @return key
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "test34", required = true, value = "The value that will be passed with the authentication key")

  public String getKey() {
    return key;
  }


  public void setKey(String key) {
    this.key = key;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CallbackAuth callbackAuth = (CallbackAuth) o;
    return Objects.equals(this.type, callbackAuth.type) &&
        Objects.equals(this.key, callbackAuth.key);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, key);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CallbackAuth {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
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
    openapiFields.add("type");
    openapiFields.add("key");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("type");
    openapiRequiredFields.add("key");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to CallbackAuth
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (CallbackAuth.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in CallbackAuth is not found in the empty JSON string", CallbackAuth.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!CallbackAuth.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `CallbackAuth` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CallbackAuth.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("type") != null && !jsonObj.get("type").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `type` to be a primitive type in the JSON string but got `%s`", jsonObj.get("type").toString()));
      }
      if (jsonObj.get("key") != null && !jsonObj.get("key").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `key` to be a primitive type in the JSON string but got `%s`", jsonObj.get("key").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CallbackAuth.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CallbackAuth' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CallbackAuth> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CallbackAuth.class));

       return (TypeAdapter<T>) new TypeAdapter<CallbackAuth>() {
           @Override
           public void write(JsonWriter out, CallbackAuth value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public CallbackAuth read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of CallbackAuth given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CallbackAuth
  * @throws IOException if the JSON string is invalid with respect to CallbackAuth
  */
  public static CallbackAuth fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CallbackAuth.class);
  }

 /**
  * Convert an instance of CallbackAuth to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

