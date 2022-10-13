package xyz.wangcaide.egg.platform.upms.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import reactor.core.publisher.Mono;
import xyz.wangcaide.egg.platform.core.model.R;
import xyz.wangcaide.egg.platform.upms.model.AccountVO;

@RequestMapping("/account")
public interface AccountApi {

    @GetMapping("/info/{username}")
    Mono<R<AccountVO>> info(@PathVariable("username")String username);

}
