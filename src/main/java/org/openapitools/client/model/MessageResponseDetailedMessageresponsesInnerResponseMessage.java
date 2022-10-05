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
 * The message response object.
 */
@ApiModel(description = "The message response object.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class MessageResponseDetailedMessageresponsesInnerResponseMessage {
  public static final String SERIALIZED_NAME_CONTENT = "content";
  @SerializedName(SERIALIZED_NAME_CONTENT)
  private String content;

  public static final String SERIALIZED_NAME_ACKNOWLEDGED = "acknowledged";
  @SerializedName(SERIALIZED_NAME_ACKNOWLEDGED)
  private String acknowledged;

  /**
   * The message response channel.
   */
  @JsonAdapter(ChannelEnum.Adapter.class)
  public enum ChannelEnum {
    N_A("N/A"),
    
    SMS("sms"),
    
    EMAIL("email"),
    
    VOICE("voice");

    private String value;

    ChannelEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static ChannelEnum fromValue(String value) {
      for (ChannelEnum b : ChannelEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }

    public static class Adapter extends TypeAdapter<ChannelEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ChannelEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ChannelEnum read(final JsonReader jsonReader) throws IOException {
        String value =  jsonReader.nextString();
        return ChannelEnum.fromValue(value);
      }
    }
  }

  public static final String SERIALIZED_NAME_CHANNEL = "channel";
  @SerializedName(SERIALIZED_NAME_CHANNEL)
  private ChannelEnum channel;

  public MessageResponseDetailedMessageresponsesInnerResponseMessage() { 
  }

  public MessageResponseDetailedMessageresponsesInnerResponseMessage content(String content) {
    
    this.content = content;
    return this;
  }

   /**
   * The message response content.
   * @return content
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "A test response from the recipient.", required = true, value = "The message response content.")

  public String getContent() {
    return content;
  }


  public void setContent(String content) {
    this.content = content;
  }


  public MessageResponseDetailedMessageresponsesInnerResponseMessage acknowledged(String acknowledged) {
    
    this.acknowledged = acknowledged;
    return this;
  }

   /**
   * The message response acknowledgement status.
   * @return acknowledged
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "true", required = true, value = "The message response acknowledgement status.")

  public String getAcknowledged() {
    return acknowledged;
  }


  public void setAcknowledged(String acknowledged) {
    this.acknowledged = acknowledged;
  }


  public MessageResponseDetailedMessageresponsesInnerResponseMessage channel(ChannelEnum channel) {
    
    this.channel = channel;
    return this;
  }

   /**
   * The message response channel.
   * @return channel
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(required = true, value = "The message response channel.")

  public ChannelEnum getChannel() {
    return channel;
  }


  public void setChannel(ChannelEnum channel) {
    this.channel = channel;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MessageResponseDetailedMessageresponsesInnerResponseMessage messageResponseDetailedMessageresponsesInnerResponseMessage = (MessageResponseDetailedMessageresponsesInnerResponseMessage) o;
    return Objects.equals(this.content, messageResponseDetailedMessageresponsesInnerResponseMessage.content) &&
        Objects.equals(this.acknowledged, messageResponseDetailedMessageresponsesInnerResponseMessage.acknowledged) &&
        Objects.equals(this.channel, messageResponseDetailedMessageresponsesInnerResponseMessage.channel);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, acknowledged, channel);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MessageResponseDetailedMessageresponsesInnerResponseMessage {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    acknowledged: ").append(toIndentedString(acknowledged)).append("\n");
    sb.append("    channel: ").append(toIndentedString(channel)).append("\n");
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
    openapiFields.add("content");
    openapiFields.add("acknowledged");
    openapiFields.add("channel");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("content");
    openapiRequiredFields.add("acknowledged");
    openapiRequiredFields.add("channel");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to MessageResponseDetailedMessageresponsesInnerResponseMessage
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (MessageResponseDetailedMessageresponsesInnerResponseMessage.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in MessageResponseDetailedMessageresponsesInnerResponseMessage is not found in the empty JSON string", MessageResponseDetailedMessageresponsesInnerResponseMessage.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!MessageResponseDetailedMessageresponsesInnerResponseMessage.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `MessageResponseDetailedMessageresponsesInnerResponseMessage` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : MessageResponseDetailedMessageresponsesInnerResponseMessage.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("content") != null && !jsonObj.get("content").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `content` to be a primitive type in the JSON string but got `%s`", jsonObj.get("content").toString()));
      }
      if (jsonObj.get("acknowledged") != null && !jsonObj.get("acknowledged").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `acknowledged` to be a primitive type in the JSON string but got `%s`", jsonObj.get("acknowledged").toString()));
      }
      if (jsonObj.get("channel") != null && !jsonObj.get("channel").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `channel` to be a primitive type in the JSON string but got `%s`", jsonObj.get("channel").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!MessageResponseDetailedMessageresponsesInnerResponseMessage.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'MessageResponseDetailedMessageresponsesInnerResponseMessage' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<MessageResponseDetailedMessageresponsesInnerResponseMessage> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(MessageResponseDetailedMessageresponsesInnerResponseMessage.class));

       return (TypeAdapter<T>) new TypeAdapter<MessageResponseDetailedMessageresponsesInnerResponseMessage>() {
           @Override
           public void write(JsonWriter out, MessageResponseDetailedMessageresponsesInnerResponseMessage value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public MessageResponseDetailedMessageresponsesInnerResponseMessage read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of MessageResponseDetailedMessageresponsesInnerResponseMessage given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of MessageResponseDetailedMessageresponsesInnerResponseMessage
  * @throws IOException if the JSON string is invalid with respect to MessageResponseDetailedMessageresponsesInnerResponseMessage
  */
  public static MessageResponseDetailedMessageresponsesInnerResponseMessage fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, MessageResponseDetailedMessageresponsesInnerResponseMessage.class);
  }

 /**
  * Convert an instance of MessageResponseDetailedMessageresponsesInnerResponseMessage to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

