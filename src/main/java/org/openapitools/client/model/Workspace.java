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
import org.openapitools.client.model.LinkInner;

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
 * Workspaces allow application developers to create new work areas for the varying use cases of their application. For example they can be associated to the different business units of a company, so to silo the data of the different departments. In fact, the information, assets, contacts and actions performed in a workspace can’t be accessed from another one. This allows the applications to be independent and audited effectively with proper permissions and keys.  Each of these work areas provides different functionalities - such as creating messages, executing scenarios or viewing distribution lists - and can be governed by user permissions. Users can be assigned access to these workspaces to restrict the control of information as needed.  Every account on creation is given a default workspace called \&quot;My Company\&quot; but it is possible to create multiple workspaces suited for each application need. There is no limit on the number of workspaces.
 */
@ApiModel(description = "Workspaces allow application developers to create new work areas for the varying use cases of their application. For example they can be associated to the different business units of a company, so to silo the data of the different departments. In fact, the information, assets, contacts and actions performed in a workspace can’t be accessed from another one. This allows the applications to be independent and audited effectively with proper permissions and keys.  Each of these work areas provides different functionalities - such as creating messages, executing scenarios or viewing distribution lists - and can be governed by user permissions. Users can be assigned access to these workspaces to restrict the control of information as needed.  Every account on creation is given a default workspace called \"My Company\" but it is possible to create multiple workspaces suited for each application need. There is no limit on the number of workspaces.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-09-14T10:37:13.711751+10:00[Australia/Melbourne]")
public class Workspace {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private String id;

  public static final String SERIALIZED_NAME_PROJECT_NAME = "projectName";
  @SerializedName(SERIALIZED_NAME_PROJECT_NAME)
  private String projectName;

  public static final String SERIALIZED_NAME_PROJECT_NUMBER = "projectNumber";
  @SerializedName(SERIALIZED_NAME_PROJECT_NUMBER)
  private String projectNumber;

  public static final String SERIALIZED_NAME_STATUS = "status";
  @SerializedName(SERIALIZED_NAME_STATUS)
  private String status;

  public static final String SERIALIZED_NAME_BILLINGCOSTCENTRE = "billingcostcentre";
  @SerializedName(SERIALIZED_NAME_BILLINGCOSTCENTRE)
  private String billingcostcentre;

  public static final String SERIALIZED_NAME_LINK = "link";
  @SerializedName(SERIALIZED_NAME_LINK)
  private List<LinkInner> link = null;

  public Workspace() { 
  }

  
  public Workspace(
     String id, 
     List<LinkInner> link
  ) {
    this();
    this.id = id;
    this.link = link;
  }

   /**
   * Specifies the ID for the workspace that has been created
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "70F2492146292826", value = "Specifies the ID for the workspace that has been created")

  public String getId() {
    return id;
  }




  public Workspace projectName(String projectName) {
    
    this.projectName = projectName;
    return this;
  }

   /**
   * Specifies the name of the Workspace to be created.
   * @return projectName
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "A Space Odessey", required = true, value = "Specifies the name of the Workspace to be created.")

  public String getProjectName() {
    return projectName;
  }


  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }


  public Workspace projectNumber(String projectNumber) {
    
    this.projectNumber = projectNumber;
    return this;
  }

   /**
   * Specifies the reference ID for the workspace from the User Side. Generally not used. Note:This is not the actual workspace ID. It is just a custom reference ID given by you for your own purposes.
   * @return projectNumber
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2001", value = "Specifies the reference ID for the workspace from the User Side. Generally not used. Note:This is not the actual workspace ID. It is just a custom reference ID given by you for your own purposes.")

  public String getProjectNumber() {
    return projectNumber;
  }


  public void setProjectNumber(String projectNumber) {
    this.projectNumber = projectNumber;
  }


  public Workspace status(String status) {
    
    this.status = status;
    return this;
  }

   /**
   * Specifies the status of the Workspace being created. The status can be one of - 1) Active (A) 2)Disabled (D)
   * @return status
  **/
  @javax.annotation.Nonnull
  @ApiModelProperty(example = "A", required = true, value = "Specifies the status of the Workspace being created. The status can be one of - 1) Active (A) 2)Disabled (D)")

  public String getStatus() {
    return status;
  }


  public void setStatus(String status) {
    this.status = status;
  }


  public Workspace billingcostcentre(String billingcostcentre) {
    
    this.billingcostcentre = billingcostcentre;
    return this;
  }

   /**
   * Only applicable to customers with the Billing Cost Centre Module enabled. Allows the user to set a billing cost centre for the Workspace.
   * @return billingcostcentre
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "Hollywood", value = "Only applicable to customers with the Billing Cost Centre Module enabled. Allows the user to set a billing cost centre for the Workspace.")

  public String getBillingcostcentre() {
    return billingcostcentre;
  }


  public void setBillingcostcentre(String billingcostcentre) {
    this.billingcostcentre = billingcostcentre;
  }


   /**
   * A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.
   * @return link
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A [HATEOAS](https://en.wikipedia.org/wiki/HATEOAS) link object, describing all discoverable resources in relation to the original request.")

  public List<LinkInner> getLink() {
    return link;
  }





  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Workspace workspace = (Workspace) o;
    return Objects.equals(this.id, workspace.id) &&
        Objects.equals(this.projectName, workspace.projectName) &&
        Objects.equals(this.projectNumber, workspace.projectNumber) &&
        Objects.equals(this.status, workspace.status) &&
        Objects.equals(this.billingcostcentre, workspace.billingcostcentre) &&
        Objects.equals(this.link, workspace.link);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, projectName, projectNumber, status, billingcostcentre, link);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Workspace {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    projectNumber: ").append(toIndentedString(projectNumber)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    billingcostcentre: ").append(toIndentedString(billingcostcentre)).append("\n");
    sb.append("    link: ").append(toIndentedString(link)).append("\n");
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
    openapiFields.add("projectName");
    openapiFields.add("projectNumber");
    openapiFields.add("status");
    openapiFields.add("billingcostcentre");
    openapiFields.add("link");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("projectName");
    openapiRequiredFields.add("status");
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to Workspace
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (Workspace.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in Workspace is not found in the empty JSON string", Workspace.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!Workspace.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `Workspace` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : Workspace.openapiRequiredFields) {
        if (jsonObj.get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonObj.toString()));
        }
      }
      if (jsonObj.get("id") != null && !jsonObj.get("id").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `id` to be a primitive type in the JSON string but got `%s`", jsonObj.get("id").toString()));
      }
      if (jsonObj.get("projectName") != null && !jsonObj.get("projectName").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectName` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectName").toString()));
      }
      if (jsonObj.get("projectNumber") != null && !jsonObj.get("projectNumber").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `projectNumber` to be a primitive type in the JSON string but got `%s`", jsonObj.get("projectNumber").toString()));
      }
      if (jsonObj.get("status") != null && !jsonObj.get("status").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `status` to be a primitive type in the JSON string but got `%s`", jsonObj.get("status").toString()));
      }
      if (jsonObj.get("billingcostcentre") != null && !jsonObj.get("billingcostcentre").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `billingcostcentre` to be a primitive type in the JSON string but got `%s`", jsonObj.get("billingcostcentre").toString()));
      }
      JsonArray jsonArraylink = jsonObj.getAsJsonArray("link");
      if (jsonArraylink != null) {
        // ensure the json data is an array
        if (!jsonObj.get("link").isJsonArray()) {
          throw new IllegalArgumentException(String.format("Expected the field `link` to be an array in the JSON string but got `%s`", jsonObj.get("link").toString()));
        }

        // validate the optional field `link` (array)
        for (int i = 0; i < jsonArraylink.size(); i++) {
          LinkInner.validateJsonObject(jsonArraylink.get(i).getAsJsonObject());
        };
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!Workspace.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'Workspace' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<Workspace> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(Workspace.class));

       return (TypeAdapter<T>) new TypeAdapter<Workspace>() {
           @Override
           public void write(JsonWriter out, Workspace value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public Workspace read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of Workspace given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of Workspace
  * @throws IOException if the JSON string is invalid with respect to Workspace
  */
  public static Workspace fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, Workspace.class);
  }

 /**
  * Convert an instance of Workspace to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

