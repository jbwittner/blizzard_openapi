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
import com.blizzardapi.openapi.model.ActiveTitleDTO;
import com.blizzardapi.openapi.model.GuildIndexDTO;
import com.blizzardapi.openapi.model.IndexDataDTO;
import com.blizzardapi.openapi.model.IndexRealmDataDTO;
import com.blizzardapi.openapi.model.TypeDTO;
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
 * CharacterProfileSummaryDTO
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen")
public class CharacterProfileSummaryDTO {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private Integer id;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_GENDER = "gender";
  @SerializedName(SERIALIZED_NAME_GENDER)
  private TypeDTO gender;

  public static final String SERIALIZED_NAME_FACTION = "faction";
  @SerializedName(SERIALIZED_NAME_FACTION)
  private TypeDTO faction;

  public static final String SERIALIZED_NAME_RACE = "race";
  @SerializedName(SERIALIZED_NAME_RACE)
  private IndexDataDTO race;

  public static final String SERIALIZED_NAME_CHARACTER_CLASS = "character_class";
  @SerializedName(SERIALIZED_NAME_CHARACTER_CLASS)
  private IndexDataDTO characterClass;

  public static final String SERIALIZED_NAME_ACTIVE_SPEC = "active_spec";
  @SerializedName(SERIALIZED_NAME_ACTIVE_SPEC)
  private IndexDataDTO activeSpec;

  public static final String SERIALIZED_NAME_REALM = "realm";
  @SerializedName(SERIALIZED_NAME_REALM)
  private IndexRealmDataDTO realm;

  public static final String SERIALIZED_NAME_GUILD = "guild";
  @SerializedName(SERIALIZED_NAME_GUILD)
  private GuildIndexDTO guild;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_EXPERIENCE = "experience";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE)
  private Integer experience;

  public static final String SERIALIZED_NAME_ACHIEVEMENT_POINTS = "achievement_points";
  @SerializedName(SERIALIZED_NAME_ACHIEVEMENT_POINTS)
  private Integer achievementPoints;

  public static final String SERIALIZED_NAME_LAST_LOGIN_TIMESTAMP = "last_login_timestamp";
  @SerializedName(SERIALIZED_NAME_LAST_LOGIN_TIMESTAMP)
  private Integer lastLoginTimestamp;

  public static final String SERIALIZED_NAME_AVERAGE_ITEM_LEVEL = "average_item_level";
  @SerializedName(SERIALIZED_NAME_AVERAGE_ITEM_LEVEL)
  private Integer averageItemLevel;

  public static final String SERIALIZED_NAME_EQUIPPED_ITEM_LEVEL = "equipped_item_level";
  @SerializedName(SERIALIZED_NAME_EQUIPPED_ITEM_LEVEL)
  private Long equippedItemLevel;

  public static final String SERIALIZED_NAME_ACTIVE_TITLE = "active_title";
  @SerializedName(SERIALIZED_NAME_ACTIVE_TITLE)
  private ActiveTitleDTO activeTitle;

  public static final String SERIALIZED_NAME_NAME_SEARCH = "name_search";
  @SerializedName(SERIALIZED_NAME_NAME_SEARCH)
  private String nameSearch;

  public CharacterProfileSummaryDTO() {
  }

  public CharacterProfileSummaryDTO id(Integer id) {
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


  public CharacterProfileSummaryDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @javax.annotation.Nonnull
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public CharacterProfileSummaryDTO gender(TypeDTO gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  @javax.annotation.Nonnull
  public TypeDTO getGender() {
    return gender;
  }

  public void setGender(TypeDTO gender) {
    this.gender = gender;
  }


  public CharacterProfileSummaryDTO faction(TypeDTO faction) {
    this.faction = faction;
    return this;
  }

   /**
   * Get faction
   * @return faction
  **/
  @javax.annotation.Nonnull
  public TypeDTO getFaction() {
    return faction;
  }

  public void setFaction(TypeDTO faction) {
    this.faction = faction;
  }


  public CharacterProfileSummaryDTO race(IndexDataDTO race) {
    this.race = race;
    return this;
  }

   /**
   * Get race
   * @return race
  **/
  @javax.annotation.Nonnull
  public IndexDataDTO getRace() {
    return race;
  }

  public void setRace(IndexDataDTO race) {
    this.race = race;
  }


  public CharacterProfileSummaryDTO characterClass(IndexDataDTO characterClass) {
    this.characterClass = characterClass;
    return this;
  }

   /**
   * Get characterClass
   * @return characterClass
  **/
  @javax.annotation.Nonnull
  public IndexDataDTO getCharacterClass() {
    return characterClass;
  }

  public void setCharacterClass(IndexDataDTO characterClass) {
    this.characterClass = characterClass;
  }


  public CharacterProfileSummaryDTO activeSpec(IndexDataDTO activeSpec) {
    this.activeSpec = activeSpec;
    return this;
  }

   /**
   * Get activeSpec
   * @return activeSpec
  **/
  @javax.annotation.Nonnull
  public IndexDataDTO getActiveSpec() {
    return activeSpec;
  }

  public void setActiveSpec(IndexDataDTO activeSpec) {
    this.activeSpec = activeSpec;
  }


  public CharacterProfileSummaryDTO realm(IndexRealmDataDTO realm) {
    this.realm = realm;
    return this;
  }

   /**
   * Get realm
   * @return realm
  **/
  @javax.annotation.Nonnull
  public IndexRealmDataDTO getRealm() {
    return realm;
  }

  public void setRealm(IndexRealmDataDTO realm) {
    this.realm = realm;
  }


  public CharacterProfileSummaryDTO guild(GuildIndexDTO guild) {
    this.guild = guild;
    return this;
  }

   /**
   * Get guild
   * @return guild
  **/
  @javax.annotation.Nullable
  public GuildIndexDTO getGuild() {
    return guild;
  }

  public void setGuild(GuildIndexDTO guild) {
    this.guild = guild;
  }


  public CharacterProfileSummaryDTO level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @javax.annotation.Nonnull
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public CharacterProfileSummaryDTO experience(Integer experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @javax.annotation.Nonnull
  public Integer getExperience() {
    return experience;
  }

  public void setExperience(Integer experience) {
    this.experience = experience;
  }


  public CharacterProfileSummaryDTO achievementPoints(Integer achievementPoints) {
    this.achievementPoints = achievementPoints;
    return this;
  }

   /**
   * Get achievementPoints
   * @return achievementPoints
  **/
  @javax.annotation.Nonnull
  public Integer getAchievementPoints() {
    return achievementPoints;
  }

  public void setAchievementPoints(Integer achievementPoints) {
    this.achievementPoints = achievementPoints;
  }


  public CharacterProfileSummaryDTO lastLoginTimestamp(Integer lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
    return this;
  }

   /**
   * Get lastLoginTimestamp
   * @return lastLoginTimestamp
  **/
  @javax.annotation.Nonnull
  public Integer getLastLoginTimestamp() {
    return lastLoginTimestamp;
  }

  public void setLastLoginTimestamp(Integer lastLoginTimestamp) {
    this.lastLoginTimestamp = lastLoginTimestamp;
  }


  public CharacterProfileSummaryDTO averageItemLevel(Integer averageItemLevel) {
    this.averageItemLevel = averageItemLevel;
    return this;
  }

   /**
   * Get averageItemLevel
   * @return averageItemLevel
  **/
  @javax.annotation.Nonnull
  public Integer getAverageItemLevel() {
    return averageItemLevel;
  }

  public void setAverageItemLevel(Integer averageItemLevel) {
    this.averageItemLevel = averageItemLevel;
  }


  public CharacterProfileSummaryDTO equippedItemLevel(Long equippedItemLevel) {
    this.equippedItemLevel = equippedItemLevel;
    return this;
  }

   /**
   * Get equippedItemLevel
   * @return equippedItemLevel
  **/
  @javax.annotation.Nonnull
  public Long getEquippedItemLevel() {
    return equippedItemLevel;
  }

  public void setEquippedItemLevel(Long equippedItemLevel) {
    this.equippedItemLevel = equippedItemLevel;
  }


  public CharacterProfileSummaryDTO activeTitle(ActiveTitleDTO activeTitle) {
    this.activeTitle = activeTitle;
    return this;
  }

   /**
   * Get activeTitle
   * @return activeTitle
  **/
  @javax.annotation.Nullable
  public ActiveTitleDTO getActiveTitle() {
    return activeTitle;
  }

  public void setActiveTitle(ActiveTitleDTO activeTitle) {
    this.activeTitle = activeTitle;
  }


  public CharacterProfileSummaryDTO nameSearch(String nameSearch) {
    this.nameSearch = nameSearch;
    return this;
  }

   /**
   * Get nameSearch
   * @return nameSearch
  **/
  @javax.annotation.Nullable
  public String getNameSearch() {
    return nameSearch;
  }

  public void setNameSearch(String nameSearch) {
    this.nameSearch = nameSearch;
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
   * @return the CharacterProfileSummaryDTO instance itself
   */
  public CharacterProfileSummaryDTO putAdditionalProperty(String key, Object value) {
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
    CharacterProfileSummaryDTO characterProfileSummaryDTO = (CharacterProfileSummaryDTO) o;
    return Objects.equals(this.id, characterProfileSummaryDTO.id) &&
        Objects.equals(this.name, characterProfileSummaryDTO.name) &&
        Objects.equals(this.gender, characterProfileSummaryDTO.gender) &&
        Objects.equals(this.faction, characterProfileSummaryDTO.faction) &&
        Objects.equals(this.race, characterProfileSummaryDTO.race) &&
        Objects.equals(this.characterClass, characterProfileSummaryDTO.characterClass) &&
        Objects.equals(this.activeSpec, characterProfileSummaryDTO.activeSpec) &&
        Objects.equals(this.realm, characterProfileSummaryDTO.realm) &&
        Objects.equals(this.guild, characterProfileSummaryDTO.guild) &&
        Objects.equals(this.level, characterProfileSummaryDTO.level) &&
        Objects.equals(this.experience, characterProfileSummaryDTO.experience) &&
        Objects.equals(this.achievementPoints, characterProfileSummaryDTO.achievementPoints) &&
        Objects.equals(this.lastLoginTimestamp, characterProfileSummaryDTO.lastLoginTimestamp) &&
        Objects.equals(this.averageItemLevel, characterProfileSummaryDTO.averageItemLevel) &&
        Objects.equals(this.equippedItemLevel, characterProfileSummaryDTO.equippedItemLevel) &&
        Objects.equals(this.activeTitle, characterProfileSummaryDTO.activeTitle) &&
        Objects.equals(this.nameSearch, characterProfileSummaryDTO.nameSearch)&&
        Objects.equals(this.additionalProperties, characterProfileSummaryDTO.additionalProperties);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, gender, faction, race, characterClass, activeSpec, realm, guild, level, experience, achievementPoints, lastLoginTimestamp, averageItemLevel, equippedItemLevel, activeTitle, nameSearch, additionalProperties);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CharacterProfileSummaryDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    faction: ").append(toIndentedString(faction)).append("\n");
    sb.append("    race: ").append(toIndentedString(race)).append("\n");
    sb.append("    characterClass: ").append(toIndentedString(characterClass)).append("\n");
    sb.append("    activeSpec: ").append(toIndentedString(activeSpec)).append("\n");
    sb.append("    realm: ").append(toIndentedString(realm)).append("\n");
    sb.append("    guild: ").append(toIndentedString(guild)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    achievementPoints: ").append(toIndentedString(achievementPoints)).append("\n");
    sb.append("    lastLoginTimestamp: ").append(toIndentedString(lastLoginTimestamp)).append("\n");
    sb.append("    averageItemLevel: ").append(toIndentedString(averageItemLevel)).append("\n");
    sb.append("    equippedItemLevel: ").append(toIndentedString(equippedItemLevel)).append("\n");
    sb.append("    activeTitle: ").append(toIndentedString(activeTitle)).append("\n");
    sb.append("    nameSearch: ").append(toIndentedString(nameSearch)).append("\n");
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
    openapiFields.add("gender");
    openapiFields.add("faction");
    openapiFields.add("race");
    openapiFields.add("character_class");
    openapiFields.add("active_spec");
    openapiFields.add("realm");
    openapiFields.add("guild");
    openapiFields.add("level");
    openapiFields.add("experience");
    openapiFields.add("achievement_points");
    openapiFields.add("last_login_timestamp");
    openapiFields.add("average_item_level");
    openapiFields.add("equipped_item_level");
    openapiFields.add("active_title");
    openapiFields.add("name_search");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
    openapiRequiredFields.add("id");
    openapiRequiredFields.add("name");
    openapiRequiredFields.add("gender");
    openapiRequiredFields.add("faction");
    openapiRequiredFields.add("race");
    openapiRequiredFields.add("character_class");
    openapiRequiredFields.add("active_spec");
    openapiRequiredFields.add("realm");
    openapiRequiredFields.add("level");
    openapiRequiredFields.add("experience");
    openapiRequiredFields.add("achievement_points");
    openapiRequiredFields.add("last_login_timestamp");
    openapiRequiredFields.add("average_item_level");
    openapiRequiredFields.add("equipped_item_level");
  }

 /**
  * Validates the JSON Element and throws an exception if issues found
  *
  * @param jsonElement JSON Element
  * @throws IOException if the JSON Element is invalid with respect to CharacterProfileSummaryDTO
  */
  public static void validateJsonElement(JsonElement jsonElement) throws IOException {
      if (jsonElement == null) {
        if (!CharacterProfileSummaryDTO.openapiRequiredFields.isEmpty()) { // has required fields but JSON element is null
          throw new IllegalArgumentException(String.format("The required field(s) %s in CharacterProfileSummaryDTO is not found in the empty JSON string", CharacterProfileSummaryDTO.openapiRequiredFields.toString()));
        }
      }

      // check to make sure all required properties/fields are present in the JSON string
      for (String requiredField : CharacterProfileSummaryDTO.openapiRequiredFields) {
        if (jsonElement.getAsJsonObject().get(requiredField) == null) {
          throw new IllegalArgumentException(String.format("The required field `%s` is not found in the JSON string: %s", requiredField, jsonElement.toString()));
        }
      }
        JsonObject jsonObj = jsonElement.getAsJsonObject();
      if (!jsonObj.get("name").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name").toString()));
      }
      // validate the required field `gender`
      TypeDTO.validateJsonElement(jsonObj.get("gender"));
      // validate the required field `faction`
      TypeDTO.validateJsonElement(jsonObj.get("faction"));
      // validate the required field `race`
      IndexDataDTO.validateJsonElement(jsonObj.get("race"));
      // validate the required field `character_class`
      IndexDataDTO.validateJsonElement(jsonObj.get("character_class"));
      // validate the required field `active_spec`
      IndexDataDTO.validateJsonElement(jsonObj.get("active_spec"));
      // validate the required field `realm`
      IndexRealmDataDTO.validateJsonElement(jsonObj.get("realm"));
      // validate the optional field `guild`
      if (jsonObj.get("guild") != null && !jsonObj.get("guild").isJsonNull()) {
        GuildIndexDTO.validateJsonElement(jsonObj.get("guild"));
      }
      // validate the optional field `active_title`
      if (jsonObj.get("active_title") != null && !jsonObj.get("active_title").isJsonNull()) {
        ActiveTitleDTO.validateJsonElement(jsonObj.get("active_title"));
      }
      if ((jsonObj.get("name_search") != null && !jsonObj.get("name_search").isJsonNull()) && !jsonObj.get("name_search").isJsonPrimitive()) {
        throw new IllegalArgumentException(String.format("Expected the field `name_search` to be a primitive type in the JSON string but got `%s`", jsonObj.get("name_search").toString()));
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!CharacterProfileSummaryDTO.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'CharacterProfileSummaryDTO' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<CharacterProfileSummaryDTO> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(CharacterProfileSummaryDTO.class));

       return (TypeAdapter<T>) new TypeAdapter<CharacterProfileSummaryDTO>() {
           @Override
           public void write(JsonWriter out, CharacterProfileSummaryDTO value) throws IOException {
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
           public CharacterProfileSummaryDTO read(JsonReader in) throws IOException {
             JsonElement jsonElement = elementAdapter.read(in);
             validateJsonElement(jsonElement);
             JsonObject jsonObj = jsonElement.getAsJsonObject();
             // store additional fields in the deserialized instance
             CharacterProfileSummaryDTO instance = thisAdapter.fromJsonTree(jsonObj);
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
  * Create an instance of CharacterProfileSummaryDTO given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of CharacterProfileSummaryDTO
  * @throws IOException if the JSON string is invalid with respect to CharacterProfileSummaryDTO
  */
  public static CharacterProfileSummaryDTO fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, CharacterProfileSummaryDTO.class);
  }

 /**
  * Convert an instance of CharacterProfileSummaryDTO to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

