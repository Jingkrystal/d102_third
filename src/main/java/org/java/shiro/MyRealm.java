package org.java.shiro;

import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.AuthenticationInfo;
import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.SimpleAuthenticationInfo;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.authz.SimpleAuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;
import org.apache.shiro.util.ByteSource;
import org.java.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * @Author:
 * @Date: 2019/7/27 22:25
 * @Description:
 */
public class MyRealm extends AuthorizingRealm {

    @Autowired
   private UserService userService;

    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principals) {
        System.out.println("--------从数据库中查询用户权限--------");

        Map principal = (Map) principals.getPrimaryPrincipal();

        Integer userId = (Integer) principal.get("id");

        System.out.println("该用户的Id是:"+userId);

        List<String> list = userService.loadPermission(userId);

        SimpleAuthorizationInfo info = new SimpleAuthorizationInfo();
        info.addStringPermissions(list);
        return info;
    }

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken token) throws AuthenticationException {

        System.out.println("#######################3");

        String principal = (String) token.getPrincipal();

        Map user=userService.login(principal);

        if (user==null){

            return null;
        }
     Integer userId = (Integer) user.get("id");

        List<Map> menus = userService.loadMenus(userId);

        user.put("menus",menus);

        String pwd= (String) user.get("PASSWORD");

        String salt ="d102";

        SimpleAuthenticationInfo info = new SimpleAuthenticationInfo(user,pwd, ByteSource.Util.bytes(salt),"myRealm");

        return info;
    }
}
