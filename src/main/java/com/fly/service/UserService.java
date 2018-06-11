package com.fly.service;

import com.fly.dao.SystemRoleMapper;
import com.fly.dao.SystemUserMapper;
import com.fly.pojo.SystemRole;
import com.fly.pojo.SystemUser;
import com.fly.util.Page;
import com.fly.util.aop.SystemLogAnnotation;
import com.fly.util.aop.SystemLogProperties;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Autowired
    private SystemRoleMapper systemRoleMapper;

    @SystemLogAnnotation(describe = SystemLogProperties.USER_LOGIN)
    public SystemUser loginUser(String name, String pass) {
        return systemUserMapper.selectByNameAndPass(name,pass);
    }

    @SystemLogAnnotation(describe = SystemLogProperties.USER_PERMISSION_ALL)
    public List<String> getUserPermissionByUserId(Integer userid) {

        return systemUserMapper.getPermissionByUserId(userid);
    }

    @SystemLogAnnotation(describe = SystemLogProperties.USER_ROLES_ALL)
    public List<SystemRole> getUserRolesByUserId(Integer userid) {
        return systemUserMapper.getUserRolesByUserId(userid);
    }
    @SystemLogAnnotation(describe = SystemLogProperties.USER_ROLES_ID_ALL)
    public List<Integer> getUserRolesIDByUserId(Integer userid) {
        return systemUserMapper.getUserRolesIDByUserId(userid);
    }

    public List<Integer> getModuleByRoles(List<Integer> roles) {
        return null;
    }

    public Page queryUser(Integer page, Integer limit, String username) {

        PageHelper.startPage(page,limit);
        List<SystemUser> systemUsers = systemUserMapper.selectUser(username);
        PageInfo pageInfo = new PageInfo(systemUsers);
        return new Page(pageInfo);

    }

    public Page queryUserRoles(Integer page, Integer limit, Integer userId, String name) {
        PageHelper.startPage(page,limit);
        List<SystemRole> systemRoles = systemRoleMapper.selectUserRoles(userId,name);

        if(systemRoles!=null){
            for (SystemRole s: systemRoles) {
                if(s.getUserId()==null)
                    s.setUserId(Integer.MIN_VALUE);
            }
        }

        PageInfo pageInfo = new PageInfo(systemRoles);
        return new Page(pageInfo);
    }
}
