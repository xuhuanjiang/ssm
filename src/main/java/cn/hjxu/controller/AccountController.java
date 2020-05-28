package cn.hjxu.controller;

import cn.hjxu.domain.Account;
import cn.hjxu.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Resource(name="accountService")
    private AccountService service;

    @RequestMapping("/findAll")
    public String  findAll(Model model){
        //System.out.println("控制器查询所有。。。。");
        List<Account> all = service.findAll();
        model.addAttribute("accounts",all);
        return "success";
    }


    @RequestMapping("/save")
    public String save(Account account){
        //System.out.println("控制器查询所有。。。。");
        service.save(account);


        return "forward:/account/findAll";
    }
}
