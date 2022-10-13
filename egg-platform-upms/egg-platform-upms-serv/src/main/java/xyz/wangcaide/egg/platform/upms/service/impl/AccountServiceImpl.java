package xyz.wangcaide.egg.platform.upms.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import xyz.wangcaide.egg.platform.upms.entity.Account;
import xyz.wangcaide.egg.platform.upms.mapper.AccountMapper;
import xyz.wangcaide.egg.platform.upms.model.AccountVO;
import xyz.wangcaide.egg.platform.upms.service.AccountService;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountMapper mapper;

    @Override
    public Optional<AccountVO> findByUsername(String username) {
        Account account = mapper.selectOne(new QueryWrapper<Account>().eq("username", username));
        return Optional.ofNullable(account).map(a -> a.convertVO(new AccountVO()));
    }

}
