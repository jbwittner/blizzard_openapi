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
import com.blizzardapi.openapi.model.FactionPlayableRaceDTO;
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
 * PlayableRaceDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayableRaceDetailsDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameDataDTO name;

  public static final String SERIALIZED_NAME_GENDER_NAME = "gender_name";
  @SerializedName(SERIALIZED_NAME_GENDER_NAME)
  private GenderDTO genderName;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private FactionPlayableRaceDTO faction;

  public static final String SERIALIZED_NAME_IS_SELECTABLE = "is_selectable";
  @SerializedName(SERIALIZED_NAME_IS_SELECTABLE)
  private Boolean isSelectable;

  public static final String SERIALIZED_NAME_IS_ALLIED_RACE = "is_allied_race";
  @SerializedName(SERIALIZED_NAME_IS_ALLIED_RACE)
  private Boolean isAlliedRace;

  public static final String SERIALIZED_NAME_PLAYABLE_CLASSES = "playable_classes";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_CLASSES)
  private List<IndexDataDTO> playableClasses = new ArrayList<>();

  public PlayableRaceDetailsDTO() {
  }

  public PlayableRaceDetailsDTO id(Integer id) {
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


  public PlayableRaceDetailsDTO name(NameDataDTO name) {
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


  public PlayableRaceDetailsDTO genderName(GenderDTO genderName) {
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


  public PlayableRaceDetailsDTO faction(FactionPlayableRaceDTO faction) {
    this.faction = faction;
    return this;
  }

   /**
   * Get faction
   * @return faction
  **/
  @javax.annotation.Nonnull
  public FactionPlayableRaceDTO getFaction() {
    return faction;
  }

  public void setFaction(FactionPlayableRaceDTO faction) {
    this.faction = faction;
  }


  public PlayableRaceDetailsDTO isSelectable(Boolean isSelectable) {
    this.isSelectable = isSelectable;
    return this;
  }

   /**
   * Get isSelectable
   * @return isSelectable
  **/
  @javax.annotation.Nonnull
  public Boolean getIsSelectable() {
    return isSelectable;
  }

  public void setIsSelectable(Boolean isSelectable) {
    this.isSelectable = isSelectable;
  }


  public PlayableRaceDetailsDTO isAlliedRace(Boolean isAlliedRace) {
    this.isAlliedRace = isAlliedRace;
    return this;
  }

   /**
   * Get isAlliedRace
   * @return isAlliedRace
  **/
  @javax.annotation.Nonnull
  public Boolean getIsAlliedRace() {
    return isAlliedRace;
  }

  public void setIsAlliedRace(Boolean isAlliedRace) {
    this.isAlliedRace = isAlliedRace;
  }


  public PlayableRaceDetailsDTO playableClasses(List<IndexDataDTO> playableClasses) {
    this.playableClasses = playableClasses;
    return this;
  }

  public PlayableRaceDetailsDTO addPlayableClassesItem(IndexDataDTO playableClassesItem) {
    if (this.playableClasses == null) {
      this.playableClasses = new ArrayList<>();
    }
    this.playableClasses.add(playableClassesItem);
    return this;
  }

   /**
   * Get playableClasses
   * @return playableClasses
  **/
  @javax.annotation.Nonnull
  public List<IndexDataDTO> getPlayableClasses() {
    return playableClasses;
  }

  public void setPlayableClasses(List<IndexDataDTO> playableClasses) {
    this.playableClasses = playableClasses;
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
   * @return the PlayableRaceDetailsDTO instance itself
   */
  public PlayableRaceDetailsDTO putAdditionalProperty(String key, Object value) {
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
    PlayableRaceDetailsDTO playableRaceDetailsDTO = (PlayableRaceDetailsDTO) o;
    return Objects.equals(this.id, playableRaceDetailsDTO.id) &&
        Objects.equals(this.name, playableRaceDetailsDTO.name) &&
        Objects.equals(this.genderName, playableRaceDetailsDTO.genderName) &&
        Objects.equals(this.faction, playableRaceDetailsDTO.faction) &&
        Objects.equals(this.isSelectable, playableRaceDetailsDTO.isSelectable) &&
        Objects.equals(this.isAlliedRace, playableRaceDetailsDTO.isAlliedRace) &&
        Objects.equals(this.playableClasses, playableRaceDetailsDTO.playableClasses)&&
        Objects.equals(this.additionalProperties, playableRaceDetailsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, genderName, faction, isSelectable, isAlliedRace, playableClasses, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableRaceDetailsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderName: ").append(toIndentedString(genderName)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    isSelectable: ").append(toIndentedString(isSelectable)).append("\n");
    sb.append("    isAlliedRace: ").append(toIndentedString(isAlliedRace)).append("\n");
    sb.append("    playableClasses: ").append(toIndentedString(playableClasses)).append("\n");
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
    openapiFields.add("faction");
    openapiFields.add("is_selectable");
    openapiFields.add("is_allied_race");
    openapiFields.add("playable_classes");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("gender_name");
    openapiRequiredFields.add("faction");
    openapiRequiredFields.add("is_selectable");
    openapiRequiredFields.add("is_allied_race");
    openapiRequiredFields.add("playable_classes");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayableRaceDetailsDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayableRaceDetailsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayableRaceDetailsDTO is not found in the empty JSON string", PlayableRaceDetailsDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayableRaceDetailsDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `name`
      NameDataDTO.validateJsonElement(jsonObj.get("name"));
      // validate the required field `gender_name`
      GenderDTO.validateJsonElement(jsonObj.get("gender_name"));
      // validate the required field `faction`
      FactionPlayableRaceDTO.validateJsonElement(jsonObj.get("faction"));
      // ensure the json data is an array
      if (!jsonObj.get("playable_classes").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `playable_classes` to be an array in the JSON string but got `%s`", jsonObj.get("playable_classes").toString()));
      }

      JsonArray jsonArrayplayableClasses = jsonObj.getAsJsonArray("playable_classes");
      // validate the required field `playable_classes` (array)
      for (int i = 0; i < jsonArrayplayableClasses.size(); i++) {
        IndexDataDTO.validateJsonElement(jsonArrayplayableClasses.get(i));
      };
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayableRaceDetailsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayableRaceDetailsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayableRaceDetailsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayableRaceDetailsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayableRaceDetailsDTO>() {
           @Override
           public void write(JsonWriter out, PlayableRaceDetailsDTO value) throws IOException {
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
           public PlayableRaceDetailsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PlayableRaceDetailsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayableRaceDetailsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayableRaceDetailsDTO
  * @throws IOException if the JSON string is invalid with respect to PlayableRaceDetailsDTO
  */
  public static PlayableRaceDetailsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayableRaceDetailsDTO.class);
  }

 /**
  * Convert an instance of PlayableRaceDetailsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

