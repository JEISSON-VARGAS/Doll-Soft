package com.app.Doll.Utilites.Http;

import com.app.Doll.Utilites.Exceptions.CustomException;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.util.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResponseHttpApi {
    private boolean processNegOK;
    private boolean processServOK;
    private String message;
    private Object data;

    public static Map<String, Object> responseHttpFind(String result, List<?> data, HttpStatus codeMessage) {
        Map<String, Object> response = createBaseResponse(result, codeMessage);
        response.put("data", data != null ? data : new ArrayList<>());
        return response;
    }

    public static Map<String, Object> responseHttpPost(String result, HttpStatus codeMessage) {
        return createBaseResponse(result, codeMessage);
    }

    public static Map<String, Object> responseHttpPut(String result, HttpStatus codeMessage) {
        return createBaseResponse(result, codeMessage);
    }

    public static Map<String, Object> responseHttpDelete(String result, HttpStatus codeMessage) {
        return createBaseResponse(result, codeMessage);
    }

    public static Map<String, Object> responseHttpError(String result, HttpStatus codeMessage, String errorMessage) {
        Map<String, Object> response = createBaseResponse(result, codeMessage);
        response.put("error", errorMessage);
        return response;
    }

    private static Map<String, Object> createBaseResponse(String result, HttpStatus codeMessage) {
        Map<String, Object> response = new HashMap<>();
        response.put("date", new Date());
        response.put("code", codeMessage.value());
        response.put("message", result);
        return response;
    }
}
