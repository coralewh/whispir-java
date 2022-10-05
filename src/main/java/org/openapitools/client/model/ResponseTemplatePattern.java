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
 * This object contains the responseTemplatePattern array, which contains each of the response rule elements. More details on the configuration of this object can be found below
 */
@ApiModel(description = "This object contains the responseTemplatePattern array, which contains each of the response rule elements. More details on the configuration of this object can be found below")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class ResponseTemplatePattern {
  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_PATTERN = "pattern";
  @SerializedName(SERIALIZED_NAME_PATTERN)
  private String pattern;

  public static final String SERIALIZED_NAME_TEXT_PROMPT = "textPrompt";
  @SerializedName(SERIALIZED_NAME_TEXT_PROMPT)
  private String textPrompt;

  public static final String SERIALIZED_NAME_VOICE_PROMPT = "voicePrompt";
  @SerializedName(SERIALIZED_NAME_VOICE_PROMPT)
  private String voicePrompt;

  public static final String SERIALIZED_NAME_SPOKEN_VOICE_PROMPT = "spokenVoicePrompt";
  @SerializedName(SERIALIZED_NAME_SPOKEN_VOICE_PROMPT)
  private String spokenVoicePrompt;

  public static final String SERIALIZED_NAME_COLOUR = "colour";
  @SerializedName(SERIALIZED_NAME_COLOUR)
  private String colour;

  public ResponseTemplatePattern() { 
  }

  public ResponseTemplatePattern name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the response category. The same key is called &#x60;matchedCategory&#x60; when placed inside the &#x60;customParameters&#x60; of Callbacks payload
   * @return name
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "Yes Rule", required = true, value = "The name of the response category. The same key is called `matchedCategory` when placed inside the `customParameters` of Callbacks payload")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public ResponseTemplatePattern pattern(String pattern) {
    
    this.pattern = pattern;
    return this;
  }

   /**
   * Specifies the mechanism for matching the textPrompt  The following options are available: - startsWith - contains - exactmatch  NOTE: none of them is case sensitive, so in the example above replying \&quot;YES\&quot; or \&quot;yes\&quot; or \&quot;Yes\&quot; makes no difference
   * @return pattern
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "startswith", required = true, value = "Specifies the mechanism for matching the textPrompt  The following options are available: - startsWith - contains - exactmatch  NOTE: none of them is case sensitive, so in the example above replying \"YES\" or \"yes\" or \"Yes\" makes no difference")

  public String getPattern() {
    return pattern;
  }


  public void setPattern(String pattern) {
    this.pattern = pattern;
  }


  public ResponseTemplatePattern textPrompt(String textPrompt) {
    
    this.textPrompt = textPrompt;
    return this;
  }

   /**
   * Specifies the textual string that should be matched using the pattern (specified above) within the email, SMS or web response
   * @return textPrompt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "YES", required = true, value = "Specifies the textual string that should be matched using the pattern (specified above) within the email, SMS or web response")

  public String getTextPrompt() {
    return textPrompt;
  }


  public void setTextPrompt(String textPrompt) {
    this.textPrompt = textPrompt;
  }


  public ResponseTemplatePattern voicePrompt(String voicePrompt) {
    
    this.voicePrompt = voicePrompt;
    return this;
  }

   /**
   * The character (2–9, * or #) that the recipient of the voice call should enter to select a response option  **IMPORTANT**: please do NOT use the key \&quot;1\&quot; because this is already reserved to repeat the message
   * @return voicePrompt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "1", required = true, value = "The character (2–9, * or #) that the recipient of the voice call should enter to select a response option  **IMPORTANT**: please do NOT use the key \"1\" because this is already reserved to repeat the message")

  public String getVoicePrompt() {
    return voicePrompt;
  }


  public void setVoicePrompt(String voicePrompt) {
    this.voicePrompt = voicePrompt;
  }


  public ResponseTemplatePattern spokenVoicePrompt(String spokenVoicePrompt) {
    
    this.spokenVoicePrompt = spokenVoicePrompt;
    return this;
  }

   /**
   * The text-to-speech content that is dynamically read out when describing to the user what a particular response option is
   * @return spokenVoicePrompt
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "to select YES", required = true, value = "The text-to-speech content that is dynamically read out when describing to the user what a particular response option is")

  public String getSpokenVoicePrompt() {
    return spokenVoicePrompt;
  }


  public void setSpokenVoicePrompt(String spokenVoicePrompt) {
    this.spokenVoicePrompt = spokenVoicePrompt;
  }


  public ResponseTemplatePattern colour(String colour) {
    
    this.colour = colour;
    return this;
  }

   /**
   * The hexadecimal colour code that is used in the Message Response Report to differentiate the groups of responses
   * @return colour
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "#00947d", required = true, value = "The hexadecimal colour code that is used in the Message Response Report to differentiate the groups of responses")

  public String getColour() {
    return colour;
  }


  public void setColour(String colour) {
    this.colour = colour;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseTemplatePattern responseTemplatePattern = (ResponseTemplatePattern) o;
    return Objects.equals(this.name, responseTemplatePattern.name) &&
        Objects.equals(this.pattern, responseTemplatePattern.pattern) &&
        Objects.equals(this.textPrompt, responseTemplatePattern.textPrompt) &&
        Objects.equals(this.voicePrompt, responseTemplatePattern.voicePrompt) &&
        Objects.equals(this.spokenVoicePrompt, responseTemplatePattern.spokenVoicePrompt) &&
        Objects.equals(this.colour, responseTemplatePattern.colour);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, pattern, textPrompt, voicePrompt, spokenVoicePrompt, colour);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseTemplatePattern {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    pattern: ").append(toIndentedString(pattern)).append("\n");
    sb.append("    textPrompt: ").append(toIndentedString(textPrompt)).append("\n");
    sb.append("    voicePrompt: ").append(toIndentedString(voicePrompt)).append("\n");
    sb.append("    spokenVoicePrompt: ").append(toIndentedString(spokenVoicePrompt)).append("\n");
    sb.append("    colour: ").append(toIndentedString(colour)).append("\n");
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
    openapiFields.add("pattern");
    openapiFields.add("textPrompt");
    openapiFields.add("voicePrompt");
    openapiFields.add("spokenVoicePrompt");
    openapiFields.add("colour");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("pattern");
    openapiRequiredFields.add("textPrompt");
    openapiRequiredFields.add("voicePrompt");
    openapiRequiredFields.add("spokenVoicePrompt");
    openapiRequiredFields.add("colour");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to ResponseTemplatePattern
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (ResponseTemplatePattern.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in ResponseTemplatePattern is not found in the empty JSON string", ResponseTemplatePattern.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!ResponseTemplatePattern.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `ResponseTemplatePattern` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : ResponseTemplatePattern.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("name") != null && !jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      if (jsonObj.get("pattern") != null && !jsonObj.get("pattern").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pattern` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pattern").toString()));
      }
      if (jsonObj.get("textPrompt") != null && !jsonObj.get("textPrompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `textPrompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("textPrompt").toString()));
      }
      if (jsonObj.get("voicePrompt") != null && !jsonObj.get("voicePrompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `voicePrompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("voicePrompt").toString()));
      }
      if (jsonObj.get("spokenVoicePrompt") != null && !jsonObj.get("spokenVoicePrompt").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `spokenVoicePrompt` to be a primitive type in the JSON string but got `%s`", jsonObj.get("spokenVoicePrompt").toString()));
      }
      if (jsonObj.get("colour") != null && !jsonObj.get("colour").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `colour` to be a primitive type in the JSON string but got `%s`", jsonObj.get("colour").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!ResponseTemplatePattern.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'ResponseTemplatePattern' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<ResponseTemplatePattern> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(ResponseTemplatePattern.class));

       return (TypeAdapter<T>) new TypeAdapter<ResponseTemplatePattern>() {
           @Override
           public void write(JsonWriter out, ResponseTemplatePattern value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public ResponseTemplatePattern read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of ResponseTemplatePattern given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of ResponseTemplatePattern
  * @throws IOException if the JSON string is invalid with respect to ResponseTemplatePattern
  */
  public static ResponseTemplatePattern fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, ResponseTemplatePattern.class);
  }

 /**
  * Convert an instance of ResponseTemplatePattern to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

