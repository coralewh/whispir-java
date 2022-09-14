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


package org.whispir.api;

import whispir_sdk_java.ApiException;
import java.math.BigDecimal;
import org.openapitools.client.model.GetMessages400Response;
import org.openapitools.client.model.GetMessages401Response;
import org.openapitools.client.model.GetMessages403Response;
import org.openapitools.client.model.GetMessages404Response;
import org.openapitools.client.model.GetMessages405Response;
import org.openapitools.client.model.GetMessages415Response;
import org.openapitools.client.model.GetMessages422Response;
import org.openapitools.client.model.GetMessages500Response;
import org.openapitools.client.model.GetMessages501Response;
import org.openapitools.client.model.ModelImport;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ImportsApi
 */
@Disabled
public class ImportsApiTest {

    private final ImportsApi api = new ImportsApi();

    /**
     * Create an import
     *
     * ## Bulk contact import The Whispir API will expose this functionality as a two stage process: 1. Submit contact data within a CSV, JSON, XML payload using the /resource endpoint – which will return a resource ID 2. Create a new import resource by submitting a POST to the /imports endpoint referencing the resource ID created in step 1.  These two stages are further explained below.  Create a resource specifying the contact information  Applications can upload a valid CSV, XML or JSON resource containing the contact information that will be imported into the Whispir Platform. Whispir will return the resource ID which can be used to import or update contacts within a workspace through the imports endpoint as described below.  ### Request Structure Firstly, the application needs to upload a resource using the Creating Resources.  The resource that needs to be provided for contact importing should be in one the following format: *   XML *   JSON *   CSV  Once this resource has been imported with the appropriate mime type, the application can reference this resource within the import request.  Import a resource using the imports endpoint    After receiving a valid resource ID, applications can make a request to the imports endpoint within a workspace and reference the appropriate resource ID. Whispir will then create an import process that will import the specified data into the workspace.    Once the application has an appropriate resource ID to use within the import endpoint, the following request can be used to begin the import process.    **Note:** Import processes take place asynchronously. Any contacts will be created once the import process starts, and users will be able to utilise imported contacts as soon as each is completed. 
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void postImportsTest() throws ApiException {
        String workspaceId = null;
        String xApiKey = null;
        String contentType = null;
        String accept = null;
        ModelImport modelImport = null;
        api.postImports(workspaceId, xApiKey, contentType, accept, modelImport);
        // TODO: test validations
    }

}
