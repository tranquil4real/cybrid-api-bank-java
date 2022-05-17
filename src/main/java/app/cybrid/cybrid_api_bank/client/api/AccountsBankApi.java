package app.cybrid.cybrid_api_bank.client.api;

import app.cybrid.cybrid_api_bank.client.ApiClient;

import app.cybrid.cybrid_api_bank.client.model.AccountBankModel;
import app.cybrid.cybrid_api_bank.client.model.AccountListBankModel;
import app.cybrid.cybrid_api_bank.client.model.PostAccountBankModel;

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

@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-05-17T16:39:55.520888Z[Etc/UTC]")
public class AccountsBankApi {
    private ApiClient apiClient;

    public AccountsBankApi() {
        this(new ApiClient());
    }

    @Autowired
    public AccountsBankApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Create Account
     * Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency and is comprised of transactions and a current balance.  An account is required to allow a Customer to hold cryptocurrency on the Cybrid Platform.  At present, account&#39;s can be created as &#x60;trading&#x60; accounts and are required before a Customer can generate a quote and execute a trade.  ## Asset  The asset is the specific cryptocurrency that the account holds, e.g., &#39;BTC&#39; for Bitcoin. See the Symbols API for a complete list of cryptocurrencies supported.     Required scope: **accounts:execute**
     * <p><b>201</b> - account created
     * @param postAccountBankModel The postAccountBankModel parameter
     * @return AccountBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec createAccountRequestCreation(PostAccountBankModel postAccountBankModel) throws WebClientResponseException {
        Object postBody = postAccountBankModel;
        // verify the required parameter 'postAccountBankModel' is set
        if (postAccountBankModel == null) {
            throw new WebClientResponseException("Missing the required parameter 'postAccountBankModel' when calling createAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
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

        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return apiClient.invokeAPI("/api/accounts", HttpMethod.POST, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Create Account
     * Creates an account.  ## Account Type  An Account is tied to a specific cryptocurrency and is comprised of transactions and a current balance.  An account is required to allow a Customer to hold cryptocurrency on the Cybrid Platform.  At present, account&#39;s can be created as &#x60;trading&#x60; accounts and are required before a Customer can generate a quote and execute a trade.  ## Asset  The asset is the specific cryptocurrency that the account holds, e.g., &#39;BTC&#39; for Bitcoin. See the Symbols API for a complete list of cryptocurrencies supported.     Required scope: **accounts:execute**
     * <p><b>201</b> - account created
     * @param postAccountBankModel The postAccountBankModel parameter
     * @return AccountBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccountBankModel> createAccount(PostAccountBankModel postAccountBankModel) throws WebClientResponseException {
        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return createAccountRequestCreation(postAccountBankModel).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AccountBankModel>> createAccountWithHttpInfo(PostAccountBankModel postAccountBankModel) throws WebClientResponseException {
        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return createAccountRequestCreation(postAccountBankModel).toEntity(localVarReturnType);
    }
    /**
     * Get Account
     * Retrieves an account.  Required scope: **accounts:read**
     * <p><b>200</b> - account found
     * @param accountGuid Identifier for the account.
     * @return AccountBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec getAccountRequestCreation(String accountGuid) throws WebClientResponseException {
        Object postBody = null;
        // verify the required parameter 'accountGuid' is set
        if (accountGuid == null) {
            throw new WebClientResponseException("Missing the required parameter 'accountGuid' when calling getAccount", HttpStatus.BAD_REQUEST.value(), HttpStatus.BAD_REQUEST.getReasonPhrase(), null, null, null);
        }
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        pathParams.put("account_guid", accountGuid);

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

        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return apiClient.invokeAPI("/api/accounts/{account_guid}", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * Get Account
     * Retrieves an account.  Required scope: **accounts:read**
     * <p><b>200</b> - account found
     * @param accountGuid Identifier for the account.
     * @return AccountBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccountBankModel> getAccount(String accountGuid) throws WebClientResponseException {
        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return getAccountRequestCreation(accountGuid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AccountBankModel>> getAccountWithHttpInfo(String accountGuid) throws WebClientResponseException {
        ParameterizedTypeReference<AccountBankModel> localVarReturnType = new ParameterizedTypeReference<AccountBankModel>() {};
        return getAccountRequestCreation(accountGuid).toEntity(localVarReturnType);
    }
    /**
     * List Accounts
     * Retrieves a list of accounts.  Required scope: **accounts:read**
     * <p><b>200</b> - get list of accounts
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param guid Comma separated account_guids to list accounts for.
     * @param customerGuid Comma separated customer_guids to list accounts for.
     * @return AccountListBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    private ResponseSpec listAccountsRequestCreation(java.math.BigInteger page, java.math.BigInteger perPage, String guid, String customerGuid) throws WebClientResponseException {
        Object postBody = null;
        // create path and map variables
        final Map<String, Object> pathParams = new HashMap<String, Object>();

        final MultiValueMap<String, String> queryParams = new LinkedMultiValueMap<String, String>();
        final HttpHeaders headerParams = new HttpHeaders();
        final MultiValueMap<String, String> cookieParams = new LinkedMultiValueMap<String, String>();
        final MultiValueMap<String, Object> formParams = new LinkedMultiValueMap<String, Object>();

        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "page", page));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "per_page", perPage));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "guid", guid));
        queryParams.putAll(apiClient.parameterToMultiValueMap(null, "customer_guid", customerGuid));

        final String[] localVarAccepts = { 
            "application/json"
        };
        final List<MediaType> localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String[] localVarContentTypes = { };
        final MediaType localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);

        String[] localVarAuthNames = new String[] { "BearerAuth", "oauth2" };

        ParameterizedTypeReference<AccountListBankModel> localVarReturnType = new ParameterizedTypeReference<AccountListBankModel>() {};
        return apiClient.invokeAPI("/api/accounts", HttpMethod.GET, pathParams, queryParams, postBody, headerParams, cookieParams, formParams, localVarAccept, localVarContentType, localVarAuthNames, localVarReturnType);
    }

    /**
     * List Accounts
     * Retrieves a list of accounts.  Required scope: **accounts:read**
     * <p><b>200</b> - get list of accounts
     * @param page The page index to retrieve.
     * @param perPage The number of entities per page to return.
     * @param guid Comma separated account_guids to list accounts for.
     * @param customerGuid Comma separated customer_guids to list accounts for.
     * @return AccountListBankModel
     * @throws WebClientResponseException if an error occurs while attempting to invoke the API
     */
    public Mono<AccountListBankModel> listAccounts(java.math.BigInteger page, java.math.BigInteger perPage, String guid, String customerGuid) throws WebClientResponseException {
        ParameterizedTypeReference<AccountListBankModel> localVarReturnType = new ParameterizedTypeReference<AccountListBankModel>() {};
        return listAccountsRequestCreation(page, perPage, guid, customerGuid).bodyToMono(localVarReturnType);
    }

    public Mono<ResponseEntity<AccountListBankModel>> listAccountsWithHttpInfo(java.math.BigInteger page, java.math.BigInteger perPage, String guid, String customerGuid) throws WebClientResponseException {
        ParameterizedTypeReference<AccountListBankModel> localVarReturnType = new ParameterizedTypeReference<AccountListBankModel>() {};
        return listAccountsRequestCreation(page, perPage, guid, customerGuid).toEntity(localVarReturnType);
    }
}
