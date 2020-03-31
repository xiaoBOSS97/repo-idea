package com.djc.vertx;

import io.vertx.core.Vertx;
import io.vertx.core.http.HttpServer;

/*
下面的代码进行了简单的服务器搭建，但是功能过于单一，访问该ip的被监听端口下的任何路径，得到的response都是一样的，功能过于单一
因而使用vertx框架做web开发需要进一步导入jar包
 */
public class demo1 {
    //vertx实现http服务器
    public static void main(String[] args) {
        //vertx核心
        Vertx vertx = Vertx.vertx();

        //创建http的server
        HttpServer httpServer = vertx.createHttpServer();

        //服务器响应
        httpServer.requestHandler(httpServerRequest -> {
            httpServerRequest.response().end("hello,djc!!");
        });
        httpServer.listen(8080);
    }
}
