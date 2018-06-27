package com.puyixiaowo.jjap;

import com.puyixiaowo.jjap.controller.IndexController;
import com.puyixiaowo.jjap.main.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Spark;

import static spark.Spark.get;
import static spark.Spark.post;

public class Routes {

    private static final Logger logger = LoggerFactory.getLogger(Main.class);

    public static void init() {
        Spark.staticFileLocation("static_resources");


        get("/notify", ((request, response) ->
                IndexController.notify(request, response)));
        post("/notify", ((request, response) ->
                IndexController.notify(request, response)));
    }
}
