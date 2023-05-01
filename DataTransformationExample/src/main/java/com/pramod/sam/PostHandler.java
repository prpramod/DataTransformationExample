package com.pramod.sam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyRequestEvent;
import com.amazonaws.services.lambda.runtime.events.APIGatewayProxyResponseEvent;

/**
 * Handler for requests to Lambda function.
 */
public class PostHandler implements RequestHandler<Map<String,String>, Map<String,String>> {

    public Map<String,String> handleRequest(final Map<String,String> input, final Context context) {

        Map<String,String> response = new HashMap<String,String>();
        return response;

    }

}
