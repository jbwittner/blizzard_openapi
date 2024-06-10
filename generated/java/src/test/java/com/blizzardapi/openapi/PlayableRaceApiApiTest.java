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
import com.blizzardapi.openapi.model.PlayableRaceDetailsDTO;
import com.blizzardapi.openapi.model.PlayableRacesIndexDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for PlayableRaceApiApi
 */
@Disabled
public class PlayableRaceApiApiTest {

    private final PlayableRaceApiApi api = new PlayableRaceApiApi();

    /**
     * Returns a playable race by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableRaceTest() throws ApiException {
        String namespace = null;
        Integer playableRaceId = null;
        PlayableRaceDetailsDTO response = api.getPlayableRace(namespace, playableRaceId);
        // TODO: test validations
    }

    /**
     * Returns an index of playable races.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableRacesIndexTest() throws ApiException {
        String namespace = null;
        PlayableRacesIndexDTO response = api.getPlayableRacesIndex(namespace);
        // TODO: test validations
    }

}
