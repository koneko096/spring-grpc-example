package id.koneko096.grpc.api;

import id.koneko096.grpc.invoker.ApiClient;

import id.koneko096.grpc.data.model.Citizen;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.util.UriComponentsBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-20T21:21:26.411+07:00")
@Component("id.koneko096.grpc.api.CitizenApi")
public class CitizenApi {
    private ApiClient apiClient;

    public CitizenApi() {
        this(new ApiClient());
    }

    @Autowired
    public CitizenApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create citizen
     * Creates a new Citizen
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid input
     * @return Citizen
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Citizen createCitizen() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/citizen").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Citizen> returnType = new ParameterizedTypeReference<Citizen>() {};
        return apiClient.invokeAPI(path, HttpMethod.POST, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Delete citizen by ID
     * Deletes a single Citizen
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Citizen ID supplied
     * <p><b>404</b> - Citizen not found
     * @param citizenId ID of Citizen to delete
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public void deleteCitizen(Long citizenId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'citizenId' is set
        if (citizenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'citizenId' when calling deleteCitizen");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("citizenId", citizenId);
        String path = UriComponentsBuilder.fromPath("/citizen/{citizenId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Void> returnType = new ParameterizedTypeReference<Void>() {};
        apiClient.invokeAPI(path, HttpMethod.DELETE, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * List citizens
     * Returns list of Citizen
     * <p><b>200</b> - successful operation
     * @return List&lt;Citizen&gt;
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public List<Citizen> getAllCitizens() throws RestClientException {
        Object postBody = null;
        
        String path = UriComponentsBuilder.fromPath("/citizen").build().toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<List<Citizen>> returnType = new ParameterizedTypeReference<List<Citizen>>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Find citizen by ID
     * Returns a single Citizen
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid Citizen ID supplied
     * <p><b>404</b> - Citizen not found
     * @param citizenId ID of Citizen to return
     * @return Citizen
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Citizen getCitizenDetails(Long citizenId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'citizenId' is set
        if (citizenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'citizenId' when calling getCitizenDetails");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("citizenId", citizenId);
        String path = UriComponentsBuilder.fromPath("/citizen/{citizenId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Citizen> returnType = new ParameterizedTypeReference<Citizen>() {};
        return apiClient.invokeAPI(path, HttpMethod.GET, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
    /**
     * Update citizen
     * Updates an existing Citizen
     * <p><b>200</b> - successful operation
     * <p><b>400</b> - Invalid input
     * <p><b>404</b> - Citizen not found
     * @param citizenId ID of Citizen to update
     * @return Citizen
     * @throws RestClientException if an error occurs while attempting to invoke the API
     */
    public Citizen updateCitizen(Long citizenId) throws RestClientException {
        Object postBody = null;
        
        // verify the required parameter 'citizenId' is set
        if (citizenId == null) {
            throw new HttpClientErrorException(HttpStatus.BAD_REQUEST, "Missing the required parameter 'citizenId' when calling updateCitizen");
        }
        
        // create path and map variables
        final Map<String, Object> uriVariables = new HashMap<String, Object>();
        uriVariables.put("citizenId", citizenId);
        String path = UriComponentsBuilder.fromPath("/citizen/{citizenId}").buildAndExpand(uriVariables).toUriString();
        
        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] accepts = { 
            "application/json"
        };
        final List<MediaType> accept = apiClient.selectHeaderAccept(accepts);
        final String[] contentTypes = { 
            "application/json", "application/xml"
        };
        final MediaType contentType = apiClient.selectHeaderContentType(contentTypes);

        String[] authNames = new String[] {  };

        ParameterizedTypeReference<Citizen> returnType = new ParameterizedTypeReference<Citizen>() {};
        return apiClient.invokeAPI(path, HttpMethod.PUT, queryParams, postBody, headerParams, formParams, accept, contentType, authNames, returnType);
    }
}
