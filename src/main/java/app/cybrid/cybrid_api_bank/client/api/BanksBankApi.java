package app.cybrid.cybrid_api_bank.client.api;

import app.cybrid.cybrid_api_bank.client.ApiClient;

import app.cybrid.cybrid_api_bank.client.model.BankBankModel;
import app.cybrid.cybrid_api_bank.client.model.BankListBankModel;
import app.cybrid.cybrid_api_bank.client.model.PostBankBankModel;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.web.reactive.function.client.WebClient.ResponseSpec;
import org.springframework.web.reactive.function.client.WebClientResponseException;
import org.springframework.core.io.FileSystemResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-24T14:05:29.478320Z[Etc/UTC]")
public class BanksBankApi {
    private ApiClient apiClient;

    public BanksBankApi() {
        this(new ApiClient());
    }

    @Autowired
    public BanksBankApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Bank
     * Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag. At present, backstopped funding sources is the supported method for funding trades on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**
     * <p><b>201</b> - Bank created
     * @param postBankBankModel The postBankBankModel parameter
     * @return BankBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createBankRequestCreation(PostBankBankModel postBankBankModel) throws WebClientResponseException {
        Object postBody = postBankBankModel;
        // verify the required parameter 'postBankBankModel' is set
        if (postBankBankModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postBankBankModel' when calling createBank", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { 
            "application/json"
        };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return apiClient.invokeAPI("/api/banks", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Bank
     * Creates a bank.  ## Bank Type  Bank&#39;s can be created in either &#x60;sandbox&#x60; or &#x60;production&#x60; mode. Sandbox Banks will not transact in real fiat dollars or cryptocurrencies.  Via the API, only &#x60;sandbox&#x60; banks can be created. In order to enable a &#x60;production&#x60; bank please contact [Support](mailto:support@cybrid.app).  ## Backstopped Funding Source  A Backstopped Funding Source is an agreement between the Organization and Cybrid on transaction settlement. A Backstopped Funding Source is an escrow bank account that the Organization tops up on a regular basis and is drawn down by the Cybrid Platform when trades are executed by the Bank for its customers.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;backstopped_funding_source&#x60; flag. At present, backstopped funding sources is the supported method for funding trades on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.  ## Attestation Identity Records  Attestation Identity Records is a method the Cybrid Platform uses to verify the identity of a Bank&#39;s customers. Please see the documentation under the create Identity Record API for more technical detail.  This feature must specifically be enabled in the Bank&#39;s &#x60;features&#x60; array by including the &#x60;attestation_identity_records&#x60; flag. At present, attestation identity records is the supported method for verifying a customer&#39;s identity on the platform.  Please contact [Support](mailto:support@cybrid.app) to inquire about enabling this option for your Organization.    Required scope: **banks:execute**
     * <p><b>201</b> - Bank created
     * @param postBankBankModel The postBankBankModel parameter
     * @return BankBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BankBankModel> createBank(PostBankBankModel postBankBankModel) throws WebClientResponseException {
        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return createBankRequestCreation(postBankBankModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<BankBankModel>> createBankWithHttpInfo(PostBankBankModel postBankBankModel) throws WebClientResponseException {
        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return createBankRequestCreation(postBankBankModel).toEntity(localVarReturnType);
    }
    /**
     * Get Bank
     * Retrieves a bank.  Required scope: **banks:read**
     * <p><b>200</b> - bank found
     * @param bankGuid Identifier for the bank.
     * @return BankBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getBankRequestCreation(String bankGuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'bankGuid' is set
        if (bankGuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'bankGuid' when calling getBank", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("bank_guid", bankGuid);

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return apiClient.invokeAPI("/api/banks/{bank_guid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Bank
     * Retrieves a bank.  Required scope: **banks:read**
     * <p><b>200</b> - bank found
     * @param bankGuid Identifier for the bank.
     * @return BankBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BankBankModel> getBank(String bankGuid) throws WebClientResponseException {
        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return getBankRequestCreation(bankGuid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<BankBankModel>> getBankWithHttpInfo(String bankGuid) throws WebClientResponseException {
        ParameterizedTypeReference<BankBankModel> localVarReturnType = new ParameterizedTypeReference<BankBankModel>() {};
        return getBankRequestCreation(bankGuid).toEntity(localVarReturnType);
    }
    /**
     * Get banks list
     * Retrieves a listing of bank.  Required scope: **banks:read**
     * <p><b>200</b> - get list of banks
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @return BankListBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listBanksRequestCreation(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<BankListBankModel> localVarReturnType = new ParameterizedTypeReference<BankListBankModel>() {};
        return apiClient.invokeAPI("/api/banks", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get banks list
     * Retrieves a listing of bank.  Required scope: **banks:read**
     * <p><b>200</b> - get list of banks
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @return BankListBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<BankListBankModel> listBanks(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        ParameterizedTypeReference<BankListBankModel> localVarReturnType = new ParameterizedTypeReference<BankListBankModel>() {};
        return listBanksRequestCreation(page, perPage).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<BankListBankModel>> listBanksWithHttpInfo(java.math.BigInteger page, java.math.BigInteger perPage) throws WebClientResponseException {
        ParameterizedTypeReference<BankListBankModel> localVarReturnType = new ParameterizedTypeReference<BankListBankModel>() {};
        return listBanksRequestCreation(page, perPage).toEntity(localVarReturnType);
    }
}
