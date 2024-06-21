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
import com.blizzardapi.openapi.model.WowProfileDTO;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for ProfileAccountProfileApi
 */
@Disabled
public class ProfileAccountProfileApiTest {

    private final ProfileAccountProfileApi api = new ProfileAccountProfileApi();

    /**
     * Returns a profile summary for an account.
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getAccountProfileTest() throws ApiException {
        String namespace = null;
        WowProfileDTO response = api.getAccountProfile(namespace);
        // TODO: test validations
    }

}
