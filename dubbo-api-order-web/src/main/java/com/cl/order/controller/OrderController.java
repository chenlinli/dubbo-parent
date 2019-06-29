package com.cl.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cl.api.member.IMemberService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Reference //获取服务的注解（dubbo提供）
    private IMemberService iMemberService;
    @RequestMapping("/orderToMember")
    public String orderToMember() {
       return iMemberService.getMember();
    }
}