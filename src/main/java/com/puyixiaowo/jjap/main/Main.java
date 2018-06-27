package com.puyixiaowo.jjap.main;

import com.puyixiaowo.jjap.Routes;
import com.puyixiaowo.jjap.bean.sys.AppConfigBean;
import com.puyixiaowo.jjap.utils.AppUtils;

import static spark.Spark.port;

/**
 * @author Moses
 * @date 2017-08-01
 */
public class Main {

    /**
     * 默认启动端口8008
     *
     * @param args
     */
    public static void main(String[] args) {

        AppConfigBean config = AppUtils.getAppConfigBean(args);
        port(config.getPort());
        Routes.init();
    }
}
