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
import com.blizzardapi.openapi.model.GenderDTO;
import com.blizzardapi.openapi.model.IndexDataDTO;
import com.blizzardapi.openapi.model.NameDataDTO;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
 * PlayableClassDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayableClassDetailsDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameDataDTO name;

  public static final String SERIALIZED_NAME_GENDER_NAME = "gender_name";
  @SerializedName(SERIALIZED_NAME_GENDER_NAME)
  private GenderDTO genderName;

  public static final String SERIALIZED_NAME_POWER_TYPE = "power_type";
  @SerializedName(SERIALIZED_NAME_POWER_TYPE)
  private IndexDataDTO powerType;

  public static final String SERIALIZED_NAME_SPECIALIZATIONS = "specializations";
  @SerializedName(SERIALIZED_NAME_SPECIALIZATIONS)
  private List<IndexDataDTO> specializations = new ArrayList<>();

  public static final String SERIALIZED_NAME_PLAYABLE_RACES = "playable_races";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_RACES)
  private List<IndexDataDTO> playableRaces = new ArrayList<>();

  public PlayableClassDetailsDTO() {
  }

  public PlayableClassDetailsDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nonnull
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }


  public PlayableClassDetailsDTO name(NameDataDTO name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public NameDataDTO getName() {
    return name;
  }

  public void setName(NameDataDTO name) {
    this.name = name;
  }


  public PlayableClassDetailsDTO genderName(GenderDTO genderName) {
    this.genderName = genderName;
    return this;
  }

   /**
   * Get genderName
   * @return genderName
  **/
  @javax.annotation.Nonnull
  public GenderDTO getGenderName() {
    return genderName;
  }

  public void setGenderName(GenderDTO genderName) {
    this.genderName = genderName;
  }


  public PlayableClassDetailsDTO powerType(IndexDataDTO powerType) {
    this.powerType = powerType;
    return this;
  }

   /**
   * Get powerType
   * @return powerType
  **/
  @javax.annotation.Nonnull
  public IndexDataDTO getPowerType() {
    return powerType;
  }

  public void setPowerType(IndexDataDTO powerType) {
    this.powerType = powerType;
  }


  public PlayableClassDetailsDTO specializations(List<IndexDataDTO> specializations) {
    this.specializations = specializations;
    return this;
  }

  public PlayableClassDetailsDTO addSpecializationsItem(IndexDataDTO specializationsItem) {
    if (this.specializations == null) {
      this.specializations = new ArrayList<>();
    }
    this.specializations.add(specializationsItem);
    return this;
  }

   /**
   * Get specializations
   * @return specializations
  **/
  @javax.annotation.Nonnull
  public List<IndexDataDTO> getSpecializations() {
    return specializations;
  }

  public void setSpecializations(List<IndexDataDTO> specializations) {
    this.specializations = specializations;
  }


  public PlayableClassDetailsDTO playableRaces(List<IndexDataDTO> playableRaces) {
    this.playableRaces = playableRaces;
    return this;
  }

  public PlayableClassDetailsDTO addPlayableRacesItem(IndexDataDTO playableRacesItem) {
    if (this.playableRaces == null) {
      this.playableRaces = new ArrayList<>();
    }
    this.playableRaces.add(playableRacesItem);
    return this;
  }

   /**
   * Get playableRaces
   * @return playableRaces
  **/
  @javax.annotation.Nonnull
  public List<IndexDataDTO> getPlayableRaces() {
    return playableRaces;
  }

  public void setPlayableRaces(List<IndexDataDTO> playableRaces) {
    this.playableRaces = playableRaces;
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
   * @return the PlayableClassDetailsDTO instance itself
   */
  public PlayableClassDetailsDTO putAdditionalProperty(String key, Object value) {
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
    PlayableClassDetailsDTO playableClassDetailsDTO = (PlayableClassDetailsDTO) o;
    return Objects.equals(this.id, playableClassDetailsDTO.id) &&
        Objects.equals(this.name, playableClassDetailsDTO.name) &&
        Objects.equals(this.genderName, playableClassDetailsDTO.genderName) &&
        Objects.equals(this.powerType, playableClassDetailsDTO.powerType) &&
        Objects.equals(this.specializations, playableClassDetailsDTO.specializations) &&
        Objects.equals(this.playableRaces, playableClassDetailsDTO.playableRaces)&&
        Objects.equals(this.additionalProperties, playableClassDetailsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, genderName, powerType, specializations, playableRaces, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableClassDetailsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderName: ").append(toIndentedString(genderName)).append("\n");
    sb.append("    powerType: ").append(toIndentedString(powerType)).append("\n");
    sb.append("    specializations: ").append(toIndentedString(specializations)).append("\n");
    sb.append("    playableRaces: ").append(toIndentedString(playableRaces)).append("\n");
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
    openapiFields.add("id");
    openapiFields.add("name");
    openapiFields.add("gender_name");
    openapiFields.add("power_type");
    openapiFields.add("specializations");
    openapiFields.add("playable_races");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("gender_name");
    openapiRequiredFields.add("power_type");
    openapiRequiredFields.add("specializations");
    openapiRequiredFields.add("playable_races");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayableClassDetailsDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayableClassDetailsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayableClassDetailsDTO is not found in the empty JSON string", PlayableClassDetailsDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayableClassDetailsDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      NameDataDTO.validateJsonElement(jsonObj.get("name"));
      // validate the required field `gender_name`
      GenderDTO.validateJsonElement(jsonObj.get("gender_name"));
      // validate the required field `power_type`
      IndexDataDTO.validateJsonElement(jsonObj.get("power_type"));
      // ensure the json data is an array
      if (!jsonObj.get("specializations").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `specializations` to be an array in the JSON string but got `%s`", jsonObj.get("specializations").toString()));
      }

      JsonArray jsonArrayspecializations = jsonObj.getAsJsonArray("specializations");
      // validate the required field `specializations` (array)
      for (int i = 0; i < jsonArrayspecializations.size(); i++) {
        IndexDataDTO.validateJsonElement(jsonArrayspecializations.get(i));
      };
      // ensure the json data is an array
      if (!jsonObj.get("playable_races").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `playable_races` to be an array in the JSON string but got `%s`", jsonObj.get("playable_races").toString()));
      }

      JsonArray jsonArrayplayableRaces = jsonObj.getAsJsonArray("playable_races");
      // validate the required field `playable_races` (array)
      for (int i = 0; i < jsonArrayplayableRaces.size(); i++) {
        IndexDataDTO.validateJsonElement(jsonArrayplayableRaces.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayableClassDetailsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayableClassDetailsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayableClassDetailsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayableClassDetailsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayableClassDetailsDTO>() {
           @Override
           public void write(JsonWriter out, PlayableClassDetailsDTO value) throws IOException {
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
           public PlayableClassDetailsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PlayableClassDetailsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayableClassDetailsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayableClassDetailsDTO
  * @throws IOException if the JSON string is invalid with respect to PlayableClassDetailsDTO
  */
  public static PlayableClassDetailsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayableClassDetailsDTO.class);
  }

 /**
  * Convert an instance of PlayableClassDetailsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

