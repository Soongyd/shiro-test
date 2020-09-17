package com.syd.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.realm.AuthenticatingRealm;

/**
 * @ClassName MyRealm
 * @Author song
 * @Date 2020/9/15 8:35
 * @Description DOOO
 */
public class MyRealm extends AuthenticatingRealm {
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {
        String username = (String) token.getPrincipal();
        System.out.println("自定义的realm:" + username);
        //通过username去数据库查询当前数据
        //admin username password
        //SimpleAuthenticationInfo simpleAuthenticationInfo = new SimpleAuthenticationInfo(admin.getUsername(),admin.getPassword,this.getName());
        SimpleAuthenticationInfo simpleAuthenticationInfo = null;
        if ("bobo".equals(username)) {
            //凭证信息的判断
            simpleAuthenticationInfo = new SimpleAuthenticationInfo("bobo", "123456", this.getName());
        }
        return simpleAuthenticationInfo;
    }
}
