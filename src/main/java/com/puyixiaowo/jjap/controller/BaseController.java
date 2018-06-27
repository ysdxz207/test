package com.puyixiaowo.jjap.controller;

import com.alibaba.fastjson.JSONObject;
import spark.Request;

import java.util.Iterator;
import java.util.Set;

public class BaseController {

    public static JSONObject getParams(Request request) {
        JSONObject jsonObject = new JSONObject();

        Set<String> params = request.queryParams();

        Iterator<String> it = params.iterator();
        while (it.hasNext()) {
            String key = it.next();
            Object value = request.queryParams(key);
            jsonObject.put(key, value);
        }
        return jsonObject;
    }
}
