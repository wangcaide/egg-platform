package xyz.wangcaide.egg.platform.upms.controller;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import xyz.wangcaide.egg.platform.core.model.R;
import xyz.wangcaide.egg.platform.upms.api.AccountApi;
import xyz.wangcaide.egg.platform.upms.model.AccountVO;
import xyz.wangcaide.egg.platform.upms.service.AccountService;

import java.util.Optional;

/**
 * <p>
 * account controller
 * </p>
 * @author Caide,Wang (wangcaide@outlook.com)
 * @version v1.0.0
 * @date 2022-10-12 23:20:47
 */
@RestController
@RequiredArgsConstructor
@Slf4j
public class AccountController implements AccountApi {

    private final AccountService service;

    @Override
    public Mono<R<AccountVO>> info(String username) {
        Optional<AccountVO> optionalVO = service.findByUsername(username);
        return Mono.just(optionalVO.isPresent() ? R.ok(optionalVO.get()) : R.empty());
    }
    
}
