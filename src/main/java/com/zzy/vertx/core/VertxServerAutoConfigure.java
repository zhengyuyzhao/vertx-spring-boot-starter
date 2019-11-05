package com.zzy.vertx.core;

import com.zzy.vertx.core.deploy.SpringVerticleDeployer;
import com.zzy.vertx.core.deploy.SpringVerticleFactory;
import com.zzy.vertx.core.router.VertxRouterAutoConfigure;
import com.zzy.vertx.core.vertx.VertxAutoConfigure;
import com.zzy.vertx.core.webconfig.VertxWebConfigSupport;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({VertxAutoConfigure.class , VertxWebConfigSupport.class, VertxRouterAutoConfigure.class, VertxServer.class, SpringVerticleFactory.class, SpringVerticleDeployer.class,})
public class VertxServerAutoConfigure {
}
