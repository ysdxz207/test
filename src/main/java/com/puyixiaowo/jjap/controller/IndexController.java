package com.puyixiaowo.jjap.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

public class IndexController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    public static Object notify(Request request, Response response) {

        logger.info("[queryString]:" + request.queryString());
        logger.info("[接收到参数]:" + getParams(request));

        return "";
    }
}