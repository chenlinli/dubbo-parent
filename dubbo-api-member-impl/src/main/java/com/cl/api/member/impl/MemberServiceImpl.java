package com.cl.api.member.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cl.api.member.IMemberService;
import org.springframework.beans.factory.annotation.Value;

@Service //发布服务（dubbo提供的）：注册到dubbo的注册中心
//spring提供的Service是注入spring 容器
public class MemberServiceImpl implements IMemberService {
    @Value("${server.port}")
    private  String port;
    @Override
    public String getMember() {
        System.out.println("调用会员服务：成功！！！:port"+port);
        return "member";
    }
}
