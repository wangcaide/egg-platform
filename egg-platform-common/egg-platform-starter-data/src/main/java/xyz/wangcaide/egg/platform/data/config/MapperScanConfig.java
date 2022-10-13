package xyz.wangcaide.egg.platform.data.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConditionalOnExpression("${mybatis.enabled:true}")
@MapperScan("xyz.wangcaide.egg.platform.**.entity")
public class MapperScanConfig {
}
