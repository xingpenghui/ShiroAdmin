package com.qfedu.shiroadmin.realm;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

/**
 *@Author feri
 *@Date Created in 2019/3/5 09:57
 * 自定义用户的Realm类
 * 实现登录许可方法和用户授权方法
 */
public class UserRealm extends AuthorizingRealm {
    //授权   查询登录用户的所有的权限，并返回
    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {

        return null;
    }
    //认证  登录许可 标记是否登录成功
    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {

        return null;
    }
}
