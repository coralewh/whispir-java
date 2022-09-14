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
import org.openapitools.client.model.ResponseTemplatePattern;

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
 * Response Rules are useful when your Templates require the end-users to select among known responses [for example, Yes/No, Accept/Decline or ranking something from 1 to 5]  Using Response Rules in combination with Templates allows you to automatically categorise any response to these messages into different response groups for reporting purposes
 */
@ApiModel(description = "Response Rules are useful when your Templates require the end-users to select among known responses [for example, Yes/No, Accept/Decline or ranking something from 1 to 5]  Using Response Rules in combination with Templates allows you to automatically categorise any response to these messages into different response groups for reporting purposes")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class ResponseRule {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_DESCRIPTION = "description";
  @SerializedName(SERIALIZED_NAME_DESCRIPTION)
  private String description;

  public static final String SERIALIZED_NAME_RESPONSE_TEMPLATE_PATTERNS = "responseTemplatePatterns";
  @SerializedName(SERIALIZED_NAME_RESPONSE_TEMPLATE_PATTERNS)
  private ResponseTemplatePattern responseTemplatePatterns;

  public ResponseRule() { 
  }

  public ResponseRule name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Specifies the name of the response rule
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Response Rule 1", required = true, value = "Specifies the name of the response rule")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResponseRule description(String description) {
    
    this.description = description;
    return this;
  }

   /**
   * Specifies the description of the response rule for others to understand its purpose
   * @return description
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "My Response Rule", value = "Specifies the description of the response rule for others to understand its purpose")

  public String getDescription() {
    return description;
  }


  public void setDescription(String description) {
    this.description = description;
  }


  public ResponseRule responseTemplatePatterns(ResponseTemplatePattern responseTemplatePatterns) {
    
    this.responseTemplatePatterns = responseTemplatePatterns;
    return this;
  }

   /**
   * Get responseTemplatePatterns
   * @return responseTemplatePatterns
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "")

  public ResponseTemplatePattern getResponseTemplatePatterns() {
    return responseTemplatePatterns;
  }


  public void setResponseTemplatePatterns(ResponseTemplatePattern responseTemplatePatterns) {
    this.responseTemplatePatterns = responseTemplatePatterns;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseRule responseRule = (ResponseRule) o;
    return Objects.equals(this.name, responseRule.name) &&
        Objects.equals(this.description, responseRule.description) &&
        Objects.equals(this.responseTemplatePatterns, responseRule.responseTemplatePatterns);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, description, responseTemplatePatterns);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseRule {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    responseTemplatePatterns: ").append(toIndentedString(responseTemplatePatterns)).append("\n");
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
    openapiFields.add("name");
    openapiFields.add("description");
    openapiFields.add("responseTemplatePatterns");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("responseTemplatePatterns");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseRule
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseRule.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseRule is not found in the empty JSON string", ResponseRule.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseRule.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseRule` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseRule.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("description") != null && !jsonObj.get("description").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `description` to be a primitive type in the JSON string but got `%s`", jsonObj.get("description").toString()));
      }
      // validate the optional field `responseTemplatePatterns`
      if (jsonObj.getAsJsonObject("responseTemplatePatterns") != null) {
        ResponseTemplatePattern.validateJsonObject(jsonObj.getAsJsonObject("responseTemplatePatterns"));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseRule.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseRule' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseRule> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseRule.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseRule>() {
           @Override
           public void write(JsonWriter out, ResponseRule value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseRule read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseRule given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseRule
  * @throws IOException if the JSON string is invalid with respect to ResponseRule
  */
  public static ResponseRule fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseRule.class);
  }

 /**
  * Convert an instance of ResponseRule to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

