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
import java.util.ArrayList;
import java.util.List;
import org.openapitools.client.model.Scenario;

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
 * List of retrieved scenarios
 */
@ApiModel(description = "List of retrieved scenarios")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class GetScenarios200Response {
  public static final String SERIALIZED_NAME_SCENARIOS = "scenarios";
  @SerializedName(SERIALIZED_NAME_SCENARIOS)
  private List<Scenario> scenarios = null;

  public GetScenarios200Response() { 
  }

  public GetScenarios200Response scenarios(List<Scenario> scenarios) {
    
    this.scenarios = scenarios;
    return this;
  }

  public GetScenarios200Response addScenariosItem(Scenario scenariosItem) {
    if (this.scenarios == null) {
      this.scenarios = new ArrayList<>();
    }
    this.scenarios.add(scenariosItem);
    return this;
  }

   /**
   * Scenario object
   * @return scenarios
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Scenario object")

  public List<Scenario> getScenarios() {
    return scenarios;
  }


  public void setScenarios(List<Scenario> scenarios) {
    this.scenarios = scenarios;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetScenarios200Response getScenarios200Response = (GetScenarios200Response) o;
    return Objects.equals(this.scenarios, getScenarios200Response.scenarios);
  }

  @Override
  public int hashCode() {
    return Objects.hash(scenarios);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetScenarios200Response {\n");
    sb.append("    scenarios: ").append(toIndentedString(scenarios)).append("\n");
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
    openapiFields.add("scenarios");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to GetScenarios200Response
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (GetScenarios200Response.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in GetScenarios200Response is not found in the empty JSON string", GetScenarios200Response.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!GetScenarios200Response.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `GetScenarios200Response` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
      JsonArray jsonArrayscenarios = jsonObj.getAsJsonArray("scenarios");
      if (jsonArrayscenarios != null) {
        // ensure the json data is an array
        if (!jsonObj.get("scenarios").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `scenarios` to be an array in the JSON string but got `%s`", jsonObj.get("scenarios").toString()));
        }

        // validate the optional field `scenarios` (array)
        for (int i = 0; i < jsonArrayscenarios.size(); i++) {
          Scenario.validateJsonObject(jsonArrayscenarios.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!GetScenarios200Response.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'GetScenarios200Response' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<GetScenarios200Response> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(GetScenarios200Response.class));

       return (TypeAdapter<T>) new TypeAdapter<GetScenarios200Response>() {
           @Override
           public void write(JsonWriter out, GetScenarios200Response value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public GetScenarios200Response read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of GetScenarios200Response given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of GetScenarios200Response
  * @throws IOException if the JSON string is invalid with respect to GetScenarios200Response
  */
  public static GetScenarios200Response fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, GetScenarios200Response.class);
  }

 /**
  * Convert an instance of GetScenarios200Response to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

