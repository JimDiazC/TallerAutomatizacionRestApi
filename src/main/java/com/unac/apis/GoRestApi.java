package com.unac.apis;

import com.unac.restinteractions.RestInteractions;

public class GoRestApi {

    private static final String TOKEN = "6d38ebbe3409ec262a9461d9ce25f070e7d347b793e64fa1f27a99533296f8e7";

    public static void setBaseUrl(String baseUrl) {
        RestInteractions.setBaseUrl(baseUrl);
    }

    public static void executionPutToken(String endPoint, String idUser, String name, String email){
        RestInteractions.executionPutToken(endPoint, idUser, TOKEN, name, email);
    }

    public static void validatePutResponse(Integer statusCode, String name, String email) {
        RestInteractions.validatecode(statusCode);
        String pathName = "name";
        String pathEmail = "email";
        RestInteractions.validateDataResponse(name, email, pathName, pathEmail);
    }
}