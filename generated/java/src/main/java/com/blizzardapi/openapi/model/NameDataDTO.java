/*
 * Blizzard API
 * OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.4.4
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blizzardapi.openapi.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.Arrays;

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
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import com.blizzardapi.JSON;

/**
 * NameDataDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class NameDataDTO {
  public static final String SERIALIZED_NAME_EN_U_S = "en_US";
  @SerializedName(SERIALIZED_NAME_EN_U_S)
  private String enUS;

  public static final String SERIALIZED_NAME_ES_M_X = "es_MX";
  @SerializedName(SERIALIZED_NAME_ES_M_X)
  private String esMX;

  public static final String SERIALIZED_NAME_PT_B_R = "pt_BR";
  @SerializedName(SERIALIZED_NAME_PT_B_R)
  private String ptBR;

  public static final String SERIALIZED_NAME_DE_D_E = "de_DE";
  @SerializedName(SERIALIZED_NAME_DE_D_E)
  private String deDE;

  public static final String SERIALIZED_NAME_EN_G_B = "en_GB";
  @SerializedName(SERIALIZED_NAME_EN_G_B)
  private String enGB;

  public static final String SERIALIZED_NAME_ES_E_S = "es_ES";
  @SerializedName(SERIALIZED_NAME_ES_E_S)
  private String esES;

  public static final String SERIALIZED_NAME_FR_F_R = "fr_FR";
  @SerializedName(SERIALIZED_NAME_FR_F_R)
  private String frFR;

  public static final String SERIALIZED_NAME_IT_I_T = "it_IT";
  @SerializedName(SERIALIZED_NAME_IT_I_T)
  private String itIT;

  public static final String SERIALIZED_NAME_RU_R_U = "ru_RU";
  @SerializedName(SERIALIZED_NAME_RU_R_U)
  private String ruRU;

  public static final String SERIALIZED_NAME_KO_K_R = "ko_KR";
  @SerializedName(SERIALIZED_NAME_KO_K_R)
  private String koKR;

  public static final String SERIALIZED_NAME_ZH_T_W = "zh_TW";
  @SerializedName(SERIALIZED_NAME_ZH_T_W)
  private String zhTW;

  public static final String SERIALIZED_NAME_ZH_C_N = "zh_CN";
  @SerializedName(SERIALIZED_NAME_ZH_C_N)
  private String zhCN;

  public NameDataDTO() {
  }

  public NameDataDTO enUS(String enUS) {
    this.enUS = enUS;
    return this;
  }

   /**
   * Get enUS
   * @return enUS
  **/
  @javax.annotation.Nonnull
  public String getEnUS() {
    return enUS;
  }

  public void setEnUS(String enUS) {
    this.enUS = enUS;
  }


  public NameDataDTO esMX(String esMX) {
    this.esMX = esMX;
    return this;
  }

   /**
   * Get esMX
   * @return esMX
  **/
  @javax.annotation.Nonnull
  public String getEsMX() {
    return esMX;
  }

  public void setEsMX(String esMX) {
    this.esMX = esMX;
  }


  public NameDataDTO ptBR(String ptBR) {
    this.ptBR = ptBR;
    return this;
  }

   /**
   * Get ptBR
   * @return ptBR
  **/
  @javax.annotation.Nonnull
  public String getPtBR() {
    return ptBR;
  }

  public void setPtBR(String ptBR) {
    this.ptBR = ptBR;
  }


  public NameDataDTO deDE(String deDE) {
    this.deDE = deDE;
    return this;
  }

   /**
   * Get deDE
   * @return deDE
  **/
  @javax.annotation.Nonnull
  public String getDeDE() {
    return deDE;
  }

  public void setDeDE(String deDE) {
    this.deDE = deDE;
  }


  public NameDataDTO enGB(String enGB) {
    this.enGB = enGB;
    return this;
  }

   /**
   * Get enGB
   * @return enGB
  **/
  @javax.annotation.Nonnull
  public String getEnGB() {
    return enGB;
  }

  public void setEnGB(String enGB) {
    this.enGB = enGB;
  }


  public NameDataDTO esES(String esES) {
    this.esES = esES;
    return this;
  }

   /**
   * Get esES
   * @return esES
  **/
  @javax.annotation.Nonnull
  public String getEsES() {
    return esES;
  }

  public void setEsES(String esES) {
    this.esES = esES;
  }


  public NameDataDTO frFR(String frFR) {
    this.frFR = frFR;
    return this;
  }

   /**
   * Get frFR
   * @return frFR
  **/
  @javax.annotation.Nonnull
  public String getFrFR() {
    return frFR;
  }

  public void setFrFR(String frFR) {
    this.frFR = frFR;
  }


  public NameDataDTO itIT(String itIT) {
    this.itIT = itIT;
    return this;
  }

   /**
   * Get itIT
   * @return itIT
  **/
  @javax.annotation.Nonnull
  public String getItIT() {
    return itIT;
  }

  public void setItIT(String itIT) {
    this.itIT = itIT;
  }


  public NameDataDTO ruRU(String ruRU) {
    this.ruRU = ruRU;
    return this;
  }

   /**
   * Get ruRU
   * @return ruRU
  **/
  @javax.annotation.Nonnull
  public String getRuRU() {
    return ruRU;
  }

  public void setRuRU(String ruRU) {
    this.ruRU = ruRU;
  }


  public NameDataDTO koKR(String koKR) {
    this.koKR = koKR;
    return this;
  }

   /**
   * Get koKR
   * @return koKR
  **/
  @javax.annotation.Nonnull
  public String getKoKR() {
    return koKR;
  }

  public void setKoKR(String koKR) {
    this.koKR = koKR;
  }


  public NameDataDTO zhTW(String zhTW) {
    this.zhTW = zhTW;
    return this;
  }

   /**
   * Get zhTW
   * @return zhTW
  **/
  @javax.annotation.Nonnull
  public String getZhTW() {
    return zhTW;
  }

  public void setZhTW(String zhTW) {
    this.zhTW = zhTW;
  }


  public NameDataDTO zhCN(String zhCN) {
    this.zhCN = zhCN;
    return this;
  }

   /**
   * Get zhCN
   * @return zhCN
  **/
  @javax.annotation.Nonnull
  public String getZhCN() {
    return zhCN;
  }

  public void setZhCN(String zhCN) {
    this.zhCN = zhCN;
  }

  /**
   * A container for additional, undeclared properties.
   * This is a holder for any undeclared properties as specified with
   * the 'additionalProperties' keyword in the OAS document.
   */
  private Map<String, Object> additionalProperties;

  /**
   * Set the additional (undeclared) property with the specified name and value.
   * If the property does not already exist, create it otherwise replace it.
   *
   * @param key name of the property
   * @param value value of the property
   * @return the NameDataDTO instance itself
   */
  public NameDataDTO putAdditionalProperty(String key, Object value) {
    if (this.additionalProperties == null) {
        this.additionalProperties = new HashMap<String, Object>();
    }
    this.additionalProperties.put(key, value);
    return this;
  }

  /**
   * Return the additional (undeclared) property.
   *
   * @return a map of objects
   */
  public Map<String, Object> getAdditionalProperties() {
    return additionalProperties;
  }

  /**
   * Return the additional (undeclared) property with the specified name.
   *
   * @param key name of the property
   * @return an object
   */
  public Object getAdditionalProperty(String key) {
    if (this.additionalProperties == null) {
        return null;
    }
    return this.additionalProperties.get(key);
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NameDataDTO nameDataDTO = (NameDataDTO) o;
    return Objects.equals(this.enUS, nameDataDTO.enUS) &&
        Objects.equals(this.esMX, nameDataDTO.esMX) &&
        Objects.equals(this.ptBR, nameDataDTO.ptBR) &&
        Objects.equals(this.deDE, nameDataDTO.deDE) &&
        Objects.equals(this.enGB, nameDataDTO.enGB) &&
        Objects.equals(this.esES, nameDataDTO.esES) &&
        Objects.equals(this.frFR, nameDataDTO.frFR) &&
        Objects.equals(this.itIT, nameDataDTO.itIT) &&
        Objects.equals(this.ruRU, nameDataDTO.ruRU) &&
        Objects.equals(this.koKR, nameDataDTO.koKR) &&
        Objects.equals(this.zhTW, nameDataDTO.zhTW) &&
        Objects.equals(this.zhCN, nameDataDTO.zhCN)&&
        Objects.equals(this.additionalProperties, nameDataDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enUS, esMX, ptBR, deDE, enGB, esES, frFR, itIT, ruRU, koKR, zhTW, zhCN, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NameDataDTO {\n");
    sb.append("    enUS: ").append(toIndentedString(enUS)).append("\n");
    sb.append("    esMX: ").append(toIndentedString(esMX)).append("\n");
    sb.append("    ptBR: ").append(toIndentedString(ptBR)).append("\n");
    sb.append("    deDE: ").append(toIndentedString(deDE)).append("\n");
    sb.append("    enGB: ").append(toIndentedString(enGB)).append("\n");
    sb.append("    esES: ").append(toIndentedString(esES)).append("\n");
    sb.append("    frFR: ").append(toIndentedString(frFR)).append("\n");
    sb.append("    itIT: ").append(toIndentedString(itIT)).append("\n");
    sb.append("    ruRU: ").append(toIndentedString(ruRU)).append("\n");
    sb.append("    koKR: ").append(toIndentedString(koKR)).append("\n");
    sb.append("    zhTW: ").append(toIndentedString(zhTW)).append("\n");
    sb.append("    zhCN: ").append(toIndentedString(zhCN)).append("\n");
    sb.append("    additionalProperties: ").append(toIndentedString(additionalProperties)).append("\n");
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
    openapiFields.add("en_US");
    openapiFields.add("es_MX");
    openapiFields.add("pt_BR");
    openapiFields.add("de_DE");
    openapiFields.add("en_GB");
    openapiFields.add("es_ES");
    openapiFields.add("fr_FR");
    openapiFields.add("it_IT");
    openapiFields.add("ru_RU");
    openapiFields.add("ko_KR");
    openapiFields.add("zh_TW");
    openapiFields.add("zh_CN");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("en_US");
    openapiRequiredFields.add("es_MX");
    openapiRequiredFields.add("pt_BR");
    openapiRequiredFields.add("de_DE");
    openapiRequiredFields.add("en_GB");
    openapiRequiredFields.add("es_ES");
    openapiRequiredFields.add("fr_FR");
    openapiRequiredFields.add("it_IT");
    openapiRequiredFields.add("ru_RU");
    openapiRequiredFields.add("ko_KR");
    openapiRequiredFields.add("zh_TW");
    openapiRequiredFields.add("zh_CN");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to NameDataDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!NameDataDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in NameDataDTO is not found in the empty JSON string", NameDataDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : NameDataDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("en_US").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `en_US` to be a primitive type in the JSON string but got `%s`", jsonObj.get("en_US").toString()));
      }
      if (!jsonObj.get("es_MX").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `es_MX` to be a primitive type in the JSON string but got `%s`", jsonObj.get("es_MX").toString()));
      }
      if (!jsonObj.get("pt_BR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `pt_BR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("pt_BR").toString()));
      }
      if (!jsonObj.get("de_DE").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `de_DE` to be a primitive type in the JSON string but got `%s`", jsonObj.get("de_DE").toString()));
      }
      if (!jsonObj.get("en_GB").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `en_GB` to be a primitive type in the JSON string but got `%s`", jsonObj.get("en_GB").toString()));
      }
      if (!jsonObj.get("es_ES").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `es_ES` to be a primitive type in the JSON string but got `%s`", jsonObj.get("es_ES").toString()));
      }
      if (!jsonObj.get("fr_FR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `fr_FR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("fr_FR").toString()));
      }
      if (!jsonObj.get("it_IT").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `it_IT` to be a primitive type in the JSON string but got `%s`", jsonObj.get("it_IT").toString()));
      }
      if (!jsonObj.get("ru_RU").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ru_RU` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ru_RU").toString()));
      }
      if (!jsonObj.get("ko_KR").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `ko_KR` to be a primitive type in the JSON string but got `%s`", jsonObj.get("ko_KR").toString()));
      }
      if (!jsonObj.get("zh_TW").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zh_TW` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zh_TW").toString()));
      }
      if (!jsonObj.get("zh_CN").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `zh_CN` to be a primitive type in the JSON string but got `%s`", jsonObj.get("zh_CN").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!NameDataDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'NameDataDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<NameDataDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(NameDataDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<NameDataDTO>() {
           @Override
           public void write(JsonWriter out, NameDataDTO value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             obj.remove("additionalProperties");
             // serialize additional properties
             if (value.getAdditionalProperties() != null) {
               for (Map.Entry<String, Object> entry : value.getAdditionalProperties().entrySet()) {
                 if (entry.getValue() instanceof String)
                   obj.addProperty(entry.getKey(), (String) entry.getValue());
                 else if (entry.getValue() instanceof Number)
                   obj.addProperty(entry.getKey(), (Number) entry.getValue());
                 else if (entry.getValue() instanceof Boolean)
                   obj.addProperty(entry.getKey(), (Boolean) entry.getValue());
                 else if (entry.getValue() instanceof Character)
                   obj.addProperty(entry.getKey(), (Character) entry.getValue());
                 else {
                   obj.add(entry.getKey(), gson.toJsonTree(entry.getValue()).getAsJsonObject());
                 }
               }
             }
             elementAdapter.write(out, obj);
           }

           @Override
           public NameDataDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             NameDataDTO instance = thisAdapter.fromJsonTree(jsonObj);
             for (Map.Entry<String, JsonElement> entry : jsonObj.entrySet()) {
               if (!openapiFields.contains(entry.getKey())) {
                 if (entry.getValue().isJsonPrimitive()) { // primitive type
                   if (entry.getValue().getAsJsonPrimitive().isString())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsString());
                   else if (entry.getValue().getAsJsonPrimitive().isNumber())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsNumber());
                   else if (entry.getValue().getAsJsonPrimitive().isBoolean())
                     instance.putAdditionalProperty(entry.getKey(), entry.getValue().getAsBoolean());
                   else
                     throw new IllegalArgumentException(String.format("The field `%s` has unknown primitive type. Value: %s", entry.getKey(), entry.getValue().toString()));
                 } else if (entry.getValue().isJsonArray()) {
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), List.class));
                 } else { // JSON object
                     instance.putAdditionalProperty(entry.getKey(), gson.fromJson(entry.getValue(), HashMap.class));
                 }
               }
             }
             return instance;
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of NameDataDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of NameDataDTO
  * @throws IOException if the JSON string is invalid with respect to NameDataDTO
  */
  public static NameDataDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, NameDataDTO.class);
  }

 /**
  * Convert an instance of NameDataDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

