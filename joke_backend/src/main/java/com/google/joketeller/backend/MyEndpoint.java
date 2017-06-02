/*
   For step-by-step instructions on connecting your Android application to this backend module,
   see "App Engine Java Endpoints Module" template documentation at
   https://github.com/GoogleCloudPlatform/gradle-appengine-templates/tree/master/HelloEndpoints
*/

package com.google.joketeller.backend;

import com.google.api.server.spi.config.Api;
import com.google.api.server.spi.config.ApiMethod;
import com.google.api.server.spi.config.ApiNamespace;
import com.udacity.gradle.jokes.Joker;

/**
 * An endpoint class we are exposing
 */
@Api(
        name = "myApi",
        version = "v1",
        namespace = @ApiNamespace(
                ownerDomain = "backend.joketeller.google.com",
                ownerName = "backend.joketeller.google.com",
                packagePath = ""
        )
)
public class MyEndpoint {

    /**
     * A simple endpoint method that gets the jokes from JavaJokes Library
     */
    @ApiMethod(name = "getJokes")
    public MyBean getJokes(){

        Joker jokes = new Joker();
        String joke = jokes.getJoke();
        MyBean response = new MyBean();
        response.setData(joke);
        return response;
    }


}
