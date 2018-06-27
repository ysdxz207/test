package com.puyixiaowo.jjap.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import spark.Request;
import spark.Response;

public class IndexController extends BaseController{

    private static final Logger logger = LoggerFactory.getLogger(IndexController.class);

    public static Object notify(Request request, Response response) {

        JSONObject params = getParams(request);
        logger.info("[body]" + request.body());
        logger.info("[params]" + JSON.toJSONString(request.params()));
        logger.info("[queryString]:" + request.queryString());
        logger.info("[接收到参数]:" + params);

        return params;
    }
}