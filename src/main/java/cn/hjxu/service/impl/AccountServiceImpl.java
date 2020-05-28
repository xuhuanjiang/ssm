package cn.hjxu.service.impl;

import cn.hjxu.dao.AccountDao;
import cn.hjxu.domain.Account;
import cn.hjxu.service.AccountService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("accountService")
public class AccountServiceImpl implements AccountService {

    @Resource(name="accountDao")
    private AccountDao dao;
    @Override
    public List<Account> findAll() {
        //System.out.println("查询所有");
        return dao.findAll();
    }

    @Override
    public void save(Account account) {
        dao.save(account);
    }
}
