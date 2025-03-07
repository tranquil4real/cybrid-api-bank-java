/*
 * Cybrid Bank API
 * # Welcome  Welcome to the Cybrid platform; enabling turnkey crypto banking services!  In these documents, you will find information on the operations provided by our platform, as well as details on how our REST API operates more generally.  Our complete set of APIs allows you to manage all your resources: your Organization, your banks and your identities. The complete set of APIs can be found on the following pages:  | API                                                            | Description                  | |----------------------------------------------------------------|------------------------------| | [Organization API](https://organization.demo.cybrid.app/api/schema/swagger-ui) | APIs to manage organizations | | [Bank API](https://bank.demo.cybrid.app/api/schema/swagger-ui)                 | APIs to manage banks         | | [Identities API](https://id.demo.cybrid.app/api/schema/swagger-ui)                     | APIs to manage identities    |  When you're ready, [request access](https://www.cybrid.xyz/access) to your Dashboard to view and administer your Organization. Once you've logged in, you can begin creating Banks, either for sandbox or production usage, and start enabling your customers to leverage DeFi and web3 with confidence.  If you have any questions, please contact [Support](mailto:support@cybrid.app) at any time so that we can help.  ## Authentication  The Cybrid Platform uses OAuth 2.0 Bearer Tokens to authenticate requests to the platform. Credentials to create Organization and Bank tokens can be generated via your Dashboard ([request access](https://www.cybrid.xyz/access)).  An Organization Token applies broadly to the whole Organization and all of its Banks, whereas, a Bank Token is specific to an individual Bank.  Both Organization and Bank tokens can be created using the OAuth Client Credential Grant flow. Each Organization and Bank has its own unique Client ID and Secret that allows for machine-to-machine authentication.  **Never share your Client ID or Secret publicly or in your source code repository**  Your Client ID and Secret can be exchanged for a time-limited Bearer Token by interacting with the Cybrid Identity Provider or through interacting with the **Authorize** button in this document:  ``` curl -X POST https://id.demo.cybrid.app/oauth/token -d '{     \"grant_type\": \"client_credentials\",     \"client_id\": \"<Your Client ID>\",     \"client_secret\": \"<Your Secret>\",     \"scope\": \"<Your requested scopes -- space separated>\"   }' -H \"Content-Type: application/json\" ```  ## Scopes  The Cybrid platform supports the use of scopes to control the level of access a token is limited to. Scopes do not grant access to resources; instead, they provide limits, in support of the least privilege principal.  The following scopes are available on the platform and can be requested when generating either an Organization or a Bank token. Generally speaking, the _Read_ scope is required to read and list resources, the _Write_ scope is required to update a resource and the _Execute_ scope is required to create a resource.  | Resource      | Read scope         | Write scope          | Execute scope     | Token Type         | |---------------|--------------------|----------------------|-------------------|--------------------| | Organizations | organizations:read | organizations:write  |                   | Organization/ Bank | | Banks         | banks:read         | banks:write          | banks:execute     | Organization/ Bank | | Customers     | customers:read     | customers:write      | customers:execute | Bank               | | Assets        | prices:read        |                      |                   | Bank               | | Accounts      | accounts:read      |                      | accounts:execute  | Bank               | | Prices        | prices:read        |                      |                   | Bank               | | Symbols       | prices:read        |                      |                   | Bank               | | Quotes        | quotes:read        |                      | quotes:execute    | Bank               | | Trades        | trades:read        |                      | trades:execute    | Bank               |  ## Organizations  An Organization is meant to model the organization partnering with Cybrid to use our platform.  An Organization does not directly interact with customers. Instead, an Organization has one or more banks, which encompass the financial service offerings of the platform.  ## Banks  A Bank is owned by an Organization and can be thought of as an environment or container for Customers and product offerings. An example of a Bank would be your customer facing banking website, or an internal staging environment for testing and integration.  An Organization can have multiple banks, in sandbox or production environments. A sandbox Bank will be backed by stubbed data and process flows. For instance, identity record and funding source processes will be simulated rather than performed.  ## Customers  Customers represent your banking users on the platform. At present, we offer support for Individuals as Customers.  Customers must be verified in our system before they can play any part on the platform. See the Identity Records section for more details on how a customer can be verified.  Customers must also have an account to be able to transact. See the Accounts APIs for more details on setting up accounts for the customer. 
 *
 * The version of the OpenAPI document: v0.24.1
 * Contact: support@cybrid.app
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package app.cybrid.cybrid_api_bank.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.time.OffsetDateTime;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * AccountBankModel
 */
@JsonPropertyOrder({
  AccountBankModel.JSON_PROPERTY_TYPE,
  AccountBankModel.JSON_PROPERTY_GUID,
  AccountBankModel.JSON_PROPERTY_CREATED_AT,
  AccountBankModel.JSON_PROPERTY_ASSET,
  AccountBankModel.JSON_PROPERTY_NAME,
  AccountBankModel.JSON_PROPERTY_BANK_GUID,
  AccountBankModel.JSON_PROPERTY_CUSTOMER_GUID,
  AccountBankModel.JSON_PROPERTY_PLATFORM_BALANCE,
  AccountBankModel.JSON_PROPERTY_PLATFORM_AVAILABLE
})
@JsonTypeName("Account")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2022-06-09T04:55:57.607614Z[Etc/UTC]")
public class AccountBankModel {
  /**
   * The account type.
   */
  public enum TypeEnum {
    BACKSTOPPED("backstopped"),
    
    TRADING("trading"),
    
    FEE("fee");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TypeEnum fromValue(String value) {
      for (TypeEnum b : TypeEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  public static final String JSON_PROPERTY_TYPE = "type";
  private TypeEnum type;

  public static final String JSON_PROPERTY_GUID = "guid";
  private String guid;

  public static final String JSON_PROPERTY_CREATED_AT = "created_at";
  private OffsetDateTime createdAt;

  public static final String JSON_PROPERTY_ASSET = "asset";
  private String asset;

  public static final String JSON_PROPERTY_NAME = "name";
  private String name;

  public static final String JSON_PROPERTY_BANK_GUID = "bank_guid";
  private String bankGuid;

  public static final String JSON_PROPERTY_CUSTOMER_GUID = "customer_guid";
  private String customerGuid;

  public static final String JSON_PROPERTY_PLATFORM_BALANCE = "platform_balance";
  private java.math.BigInteger platformBalance;

  public static final String JSON_PROPERTY_PLATFORM_AVAILABLE = "platform_available";
  private java.math.BigInteger platformAvailable;

  public AccountBankModel() { 
  }

  public AccountBankModel type(TypeEnum type) {
    
    this.type = type;
    return this;
  }

   /**
   * The account type.
   * @return type
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The account type.")
  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public TypeEnum getType() {
    return type;
  }


  @JsonProperty(JSON_PROPERTY_TYPE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setType(TypeEnum type) {
    this.type = type;
  }


  public AccountBankModel guid(String guid) {
    
    this.guid = guid;
    return this;
  }

   /**
   * Auto-generated unique identifier for the account.
   * @return guid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Auto-generated unique identifier for the account.")
  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getGuid() {
    return guid;
  }


  @JsonProperty(JSON_PROPERTY_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setGuid(String guid) {
    this.guid = guid;
  }


  public AccountBankModel createdAt(OffsetDateTime createdAt) {
    
    this.createdAt = createdAt;
    return this;
  }

   /**
   * ISO8601 datetime the account was created at.
   * @return createdAt
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "ISO8601 datetime the account was created at.")
  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public OffsetDateTime getCreatedAt() {
    return createdAt;
  }


  @JsonProperty(JSON_PROPERTY_CREATED_AT)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCreatedAt(OffsetDateTime createdAt) {
    this.createdAt = createdAt;
  }


  public AccountBankModel asset(String asset) {
    
    this.asset = asset;
    return this;
  }

   /**
   * The asset code.
   * @return asset
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The asset code.")
  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getAsset() {
    return asset;
  }


  @JsonProperty(JSON_PROPERTY_ASSET)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setAsset(String asset) {
    this.asset = asset;
  }


  public AccountBankModel name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * The name of the account.
   * @return name
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The name of the account.")
  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getName() {
    return name;
  }


  @JsonProperty(JSON_PROPERTY_NAME)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setName(String name) {
    this.name = name;
  }


  public AccountBankModel bankGuid(String bankGuid) {
    
    this.bankGuid = bankGuid;
    return this;
  }

   /**
   * The bank identifier associated with the account.
   * @return bankGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The bank identifier associated with the account.")
  @JsonProperty(JSON_PROPERTY_BANK_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getBankGuid() {
    return bankGuid;
  }


  @JsonProperty(JSON_PROPERTY_BANK_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setBankGuid(String bankGuid) {
    this.bankGuid = bankGuid;
  }


  public AccountBankModel customerGuid(String customerGuid) {
    
    this.customerGuid = customerGuid;
    return this;
  }

   /**
   * The customer identifier associated with the account.
   * @return customerGuid
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The customer identifier associated with the account.")
  @JsonProperty(JSON_PROPERTY_CUSTOMER_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public String getCustomerGuid() {
    return customerGuid;
  }


  @JsonProperty(JSON_PROPERTY_CUSTOMER_GUID)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setCustomerGuid(String customerGuid) {
    this.customerGuid = customerGuid;
  }


  public AccountBankModel platformBalance(java.math.BigInteger platformBalance) {
    
    this.platformBalance = platformBalance;
    return this;
  }

   /**
   * The amount of funds that are in the account, in base units of the asset.
   * @return platformBalance
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of funds that are in the account, in base units of the asset.")
  @JsonProperty(JSON_PROPERTY_PLATFORM_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.math.BigInteger getPlatformBalance() {
    return platformBalance;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_BALANCE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformBalance(java.math.BigInteger platformBalance) {
    this.platformBalance = platformBalance;
  }


  public AccountBankModel platformAvailable(java.math.BigInteger platformAvailable) {
    
    this.platformAvailable = platformAvailable;
    return this;
  }

   /**
   * The amount of funds that are in the account, in base units of the asset, that are available for use on the platform.
   * @return platformAvailable
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "The amount of funds that are in the account, in base units of the asset, that are available for use on the platform.")
  @JsonProperty(JSON_PROPERTY_PLATFORM_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)

  public java.math.BigInteger getPlatformAvailable() {
    return platformAvailable;
  }


  @JsonProperty(JSON_PROPERTY_PLATFORM_AVAILABLE)
  @JsonInclude(value = JsonInclude.Include.USE_DEFAULTS)
  public void setPlatformAvailable(java.math.BigInteger platformAvailable) {
    this.platformAvailable = platformAvailable;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AccountBankModel account = (AccountBankModel) o;
    return Objects.equals(this.type, account.type) &&
        Objects.equals(this.guid, account.guid) &&
        Objects.equals(this.createdAt, account.createdAt) &&
        Objects.equals(this.asset, account.asset) &&
        Objects.equals(this.name, account.name) &&
        Objects.equals(this.bankGuid, account.bankGuid) &&
        Objects.equals(this.customerGuid, account.customerGuid) &&
        Objects.equals(this.platformBalance, account.platformBalance) &&
        Objects.equals(this.platformAvailable, account.platformAvailable);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, guid, createdAt, asset, name, bankGuid, customerGuid, platformBalance, platformAvailable);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AccountBankModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    guid: ").append(toIndentedString(guid)).append("\n");
    sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
    sb.append("    asset: ").append(toIndentedString(asset)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    bankGuid: ").append(toIndentedString(bankGuid)).append("\n");
    sb.append("    customerGuid: ").append(toIndentedString(customerGuid)).append("\n");
    sb.append("    platformBalance: ").append(toIndentedString(platformBalance)).append("\n");
    sb.append("    platformAvailable: ").append(toIndentedString(platformAvailable)).append("\n");
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

}

