/*
 * Blizzard API
 * An OpenAPI specification for Blizzard API
 *
 * The version of the OpenAPI document: 0.1.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.blizzardapi.openapi;

import com.blizzardapi.ApiException;
import com.blizzardapi.openapi.model.ApiErrorDTO;
import com.blizzardapi.openapi.model.PlayableSpecializationDetailsDTO;
import com.blizzardapi.openapi.model.PlayableSpecializationIndexDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayableSpecializationApiApi
 */
@Disabled
public class PlayableSpecializationApiApiTest {

    private final PlayableSpecializationApiApi api = new PlayableSpecializationApiApi();

    /**
     * Returns a playable race by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableSpecializationTest() throws ApiException {
        String namespace = null;
        Integer specId = null;
        PlayableSpecializationDetailsDTO response = api.getPlayableSpecialization(namespace, specId);
        // TODO: test validations
    }

    /**
     * Returns an index of playable specializations.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableSpecializationsIndexTest() throws ApiException {
        String namespace = null;
        PlayableSpecializationIndexDTO response = api.getPlayableSpecializationsIndex(namespace);
        // TODO: test validations
    }

}
