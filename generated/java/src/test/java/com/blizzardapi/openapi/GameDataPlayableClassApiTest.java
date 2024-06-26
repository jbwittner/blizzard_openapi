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


package com.blizzardapi.openapi;

import com.blizzardapi.ApiException;
import com.blizzardapi.openapi.model.ApiErrorDTO;
import com.blizzardapi.openapi.model.PlayableClassDetailsDTO;
import com.blizzardapi.openapi.model.PlayableClassesIndexDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for GameDataPlayableClassApi
 */
@Disabled
public class GameDataPlayableClassApiTest {

    private final GameDataPlayableClassApi api = new GameDataPlayableClassApi();

    /**
     * Returns a playable class by ID.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableClassTest() throws ApiException {
        String namespace = null;
        Integer classId = null;
        PlayableClassDetailsDTO response = api.getPlayableClass(namespace, classId);
        // TODO: test validations
    }

    /**
     * Returns an index of playable class.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getPlayableClassesIndexTest() throws ApiException {
        String namespace = null;
        PlayableClassesIndexDTO response = api.getPlayableClassesIndex(namespace);
        // TODO: test validations
    }

}
