package xyz.wangcaide.egg.platform.upms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import xyz.wangcaide.egg.platform.core.constant.ApplicationName;
import xyz.wangcaide.egg.platform.upms.api.AccountApi;

@FeignClient(name = ApplicationName.UPMS_SERVICE, contextId = "AccountClient")
public interface AccountClient extends AccountApi {
}
