/*
 * Blizzard API
 * An OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.2.0
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
import com.blizzardapi.openapi.model.RoleIndexDTO;
import com.blizzardapi.openapi.model.TalentIndexDTO;
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
 * PlayableSpecializationDetailsDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class PlayableSpecializationDetailsDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_PLAYABLE_CLASS = "playable_class";
  @SerializedName(SERIALIZED_NAME_PLAYABLE_CLASS)
  private IndexDataDTO playableClass;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private NameDataDTO name;

  public static final String SERIALIZED_NAME_GENDER_DESCRIPTION = "gender_description";
  @SerializedName(SERIALIZED_NAME_GENDER_DESCRIPTION)
  private GenderDTO genderDescription;

  public static final String SERIALIZED_NAME_ROLE = "role";
  @SerializedName(SERIALIZED_NAME_ROLE)
  private RoleIndexDTO role;

  public static final String SERIALIZED_NAME_PVP_TALENTS = "pvp_talents";
  @SerializedName(SERIALIZED_NAME_PVP_TALENTS)
  private List<TalentIndexDTO> pvpTalents = new ArrayList<>();

  public static final String SERIALIZED_NAME_SPEC_TALENT_TREE = "spec_talent_tree";
  @SerializedName(SERIALIZED_NAME_SPEC_TALENT_TREE)
  private IndexDataDTO specTalentTree;

  public static final String SERIALIZED_NAME_POWER_TYPE = "power_type";
  @SerializedName(SERIALIZED_NAME_POWER_TYPE)
  private IndexDataDTO powerType;

  public static final String SERIALIZED_NAME_PRIMARY_STAT_TYPE = "primary_stat_type";
  @SerializedName(SERIALIZED_NAME_PRIMARY_STAT_TYPE)
  private RoleIndexDTO primaryStatType;

  public PlayableSpecializationDetailsDTO() {
  }

  public PlayableSpecializationDetailsDTO id(Integer id) {
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


  public PlayableSpecializationDetailsDTO playableClass(IndexDataDTO playableClass) {
    this.playableClass = playableClass;
    return this;
  }

   /**
   * Get playableClass
   * @return playableClass
  **/
  @javax.annotation.Nonnull
  public IndexDataDTO getPlayableClass() {
    return playableClass;
  }

  public void setPlayableClass(IndexDataDTO playableClass) {
    this.playableClass = playableClass;
  }


  public PlayableSpecializationDetailsDTO name(NameDataDTO name) {
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


  public PlayableSpecializationDetailsDTO genderDescription(GenderDTO genderDescription) {
    this.genderDescription = genderDescription;
    return this;
  }

   /**
   * Get genderDescription
   * @return genderDescription
  **/
  @javax.annotation.Nonnull
  public GenderDTO getGenderDescription() {
    return genderDescription;
  }

  public void setGenderDescription(GenderDTO genderDescription) {
    this.genderDescription = genderDescription;
  }


  public PlayableSpecializationDetailsDTO role(RoleIndexDTO role) {
    this.role = role;
    return this;
  }

   /**
   * Get role
   * @return role
  **/
  @javax.annotation.Nonnull
  public RoleIndexDTO getRole() {
    return role;
  }

  public void setRole(RoleIndexDTO role) {
    this.role = role;
  }


  public PlayableSpecializationDetailsDTO pvpTalents(List<TalentIndexDTO> pvpTalents) {
    this.pvpTalents = pvpTalents;
    return this;
  }

  public PlayableSpecializationDetailsDTO addPvpTalentsItem(TalentIndexDTO pvpTalentsItem) {
    if (this.pvpTalents == null) {
      this.pvpTalents = new ArrayList<>();
    }
    this.pvpTalents.add(pvpTalentsItem);
    return this;
  }

   /**
   * Get pvpTalents
   * @return pvpTalents
  **/
  @javax.annotation.Nonnull
  public List<TalentIndexDTO> getPvpTalents() {
    return pvpTalents;
  }

  public void setPvpTalents(List<TalentIndexDTO> pvpTalents) {
    this.pvpTalents = pvpTalents;
  }


  public PlayableSpecializationDetailsDTO specTalentTree(IndexDataDTO specTalentTree) {
    this.specTalentTree = specTalentTree;
    return this;
  }

   /**
   * Get specTalentTree
   * @return specTalentTree
  **/
  @javax.annotation.Nullable
  public IndexDataDTO getSpecTalentTree() {
    return specTalentTree;
  }

  public void setSpecTalentTree(IndexDataDTO specTalentTree) {
    this.specTalentTree = specTalentTree;
  }


  public PlayableSpecializationDetailsDTO powerType(IndexDataDTO powerType) {
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


  public PlayableSpecializationDetailsDTO primaryStatType(RoleIndexDTO primaryStatType) {
    this.primaryStatType = primaryStatType;
    return this;
  }

   /**
   * Get primaryStatType
   * @return primaryStatType
  **/
  @javax.annotation.Nonnull
  public RoleIndexDTO getPrimaryStatType() {
    return primaryStatType;
  }

  public void setPrimaryStatType(RoleIndexDTO primaryStatType) {
    this.primaryStatType = primaryStatType;
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
   * @return the PlayableSpecializationDetailsDTO instance itself
   */
  public PlayableSpecializationDetailsDTO putAdditionalProperty(String key, Object value) {
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
    PlayableSpecializationDetailsDTO playableSpecializationDetailsDTO = (PlayableSpecializationDetailsDTO) o;
    return Objects.equals(this.id, playableSpecializationDetailsDTO.id) &&
        Objects.equals(this.playableClass, playableSpecializationDetailsDTO.playableClass) &&
        Objects.equals(this.name, playableSpecializationDetailsDTO.name) &&
        Objects.equals(this.genderDescription, playableSpecializationDetailsDTO.genderDescription) &&
        Objects.equals(this.role, playableSpecializationDetailsDTO.role) &&
        Objects.equals(this.pvpTalents, playableSpecializationDetailsDTO.pvpTalents) &&
        Objects.equals(this.specTalentTree, playableSpecializationDetailsDTO.specTalentTree) &&
        Objects.equals(this.powerType, playableSpecializationDetailsDTO.powerType) &&
        Objects.equals(this.primaryStatType, playableSpecializationDetailsDTO.primaryStatType)&&
        Objects.equals(this.additionalProperties, playableSpecializationDetailsDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, playableClass, name, genderDescription, role, pvpTalents, specTalentTree, powerType, primaryStatType, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PlayableSpecializationDetailsDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    playableClass: ").append(toIndentedString(playableClass)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    genderDescription: ").append(toIndentedString(genderDescription)).append("\n");
    sb.append("    role: ").append(toIndentedString(role)).append("\n");
    sb.append("    pvpTalents: ").append(toIndentedString(pvpTalents)).append("\n");
    sb.append("    specTalentTree: ").append(toIndentedString(specTalentTree)).append("\n");
    sb.append("    powerType: ").append(toIndentedString(powerType)).append("\n");
    sb.append("    primaryStatType: ").append(toIndentedString(primaryStatType)).append("\n");
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
    openapiFields.add("playable_class");
    openapiFields.add("name");
    openapiFields.add("gender_description");
    openapiFields.add("role");
    openapiFields.add("pvp_talents");
    openapiFields.add("spec_talent_tree");
    openapiFields.add("power_type");
    openapiFields.add("primary_stat_type");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("playable_class");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("gender_description");
    openapiRequiredFields.add("role");
    openapiRequiredFields.add("pvp_talents");
    openapiRequiredFields.add("power_type");
    openapiRequiredFields.add("primary_stat_type");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to PlayableSpecializationDetailsDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!PlayableSpecializationDetailsDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in PlayableSpecializationDetailsDTO is not found in the empty JSON string", PlayableSpecializationDetailsDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : PlayableSpecializationDetailsDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      // validate the required field `playable_class`
      IndexDataDTO.validateJsonElement(jsonObj.get("playable_class"));
      // validate the required field `name`
      NameDataDTO.validateJsonElement(jsonObj.get("name"));
      // validate the required field `gender_description`
      GenderDTO.validateJsonElement(jsonObj.get("gender_description"));
      // validate the required field `role`
      RoleIndexDTO.validateJsonElement(jsonObj.get("role"));
      // ensure the json data is an array
      if (!jsonObj.get("pvp_talents").isJsonArray()) {
        throw new IllegalArgumentException(String.format("Expected the field `pvp_talents` to be an array in the JSON string but got `%s`", jsonObj.get("pvp_talents").toString()));
      }

      JsonArray jsonArraypvpTalents = jsonObj.getAsJsonArray("pvp_talents");
      // validate the required field `pvp_talents` (array)
      for (int i = 0; i < jsonArraypvpTalents.size(); i++) {
        TalentIndexDTO.validateJsonElement(jsonArraypvpTalents.get(i));
      };
      // validate the optional field `spec_talent_tree`
      if (jsonObj.get("spec_talent_tree") != null && !jsonObj.get("spec_talent_tree").isJsonNull()) {
        IndexDataDTO.validateJsonElement(jsonObj.get("spec_talent_tree"));
      }
      // validate the required field `power_type`
      IndexDataDTO.validateJsonElement(jsonObj.get("power_type"));
      // validate the required field `primary_stat_type`
      RoleIndexDTO.validateJsonElement(jsonObj.get("primary_stat_type"));
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!PlayableSpecializationDetailsDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'PlayableSpecializationDetailsDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<PlayableSpecializationDetailsDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(PlayableSpecializationDetailsDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<PlayableSpecializationDetailsDTO>() {
           @Override
           public void write(JsonWriter out, PlayableSpecializationDetailsDTO value) throws IOException {
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
           public PlayableSpecializationDetailsDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             PlayableSpecializationDetailsDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of PlayableSpecializationDetailsDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of PlayableSpecializationDetailsDTO
  * @throws IOException if the JSON string is invalid with respect to PlayableSpecializationDetailsDTO
  */
  public static PlayableSpecializationDetailsDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, PlayableSpecializationDetailsDTO.class);
  }

 /**
  * Convert an instance of PlayableSpecializationDetailsDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

