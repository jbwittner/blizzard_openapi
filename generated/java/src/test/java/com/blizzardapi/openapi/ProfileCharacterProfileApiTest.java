/*
 * Blizzard API
 * OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.4.1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blizzardapi.openapi;

import com.blizzardapi.ApiException;
import com.blizzardapi.openapi.model.ApiErrorDTO;
import com.blizzardapi.openapi.model.CharacterProfileSummaryDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileCharacterProfileApi
 */
@Disabled
public class ProfileCharacterProfileApiTest {

    private final ProfileCharacterProfileApi api = new ProfileCharacterProfileApi();

    /**
     * Returns a profile summary for a character.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getCharacterProfileTest() throws ApiException {
        String namespace = null;
        String realmSlug = null;
        String characterName = null;
        CharacterProfileSummaryDTO response = api.getCharacterProfile(namespace, realmSlug, characterName);
        // TODO: test validations
    }

}