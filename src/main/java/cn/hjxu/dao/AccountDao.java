package cn.hjxu.dao;


import cn.hjxu.domain.Account;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("accountDao")
public interface AccountDao {

    /**
     * 查询所有
     * @return
     */
    @Select("select * from account")
    List<Account> findAll();

    /**
     * 保存用户
     * @param account
     */
    @Insert("insert into account(name,money) values(#{name},#{money})")
    void save(Account account);
}
