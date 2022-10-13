package xyz.wangcaide.egg.platform.upms.service;

import xyz.wangcaide.egg.platform.upms.model.AccountVO;

import java.util.Optional;

public interface AccountService {

    Optional<AccountVO> findByUsername(String username);

}
