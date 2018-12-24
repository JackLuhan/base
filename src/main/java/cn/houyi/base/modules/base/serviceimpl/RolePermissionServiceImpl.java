package cn.houyi.base.modules.base.serviceimpl;

import cn.houyi.base.modules.base.dao.RolePermissionDao;
import cn.houyi.base.modules.base.entity.RolePermission;
import cn.houyi.base.modules.base.service.RolePermissionService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 角色权限接口实现
 * @author Exrick
 */
@Slf4j
@Service
@Transactional
public class RolePermissionServiceImpl implements RolePermissionService {

    @Autowired
    private RolePermissionDao rolePermissionDao;

    @Override
    public RolePermissionDao getRepository() {
        return rolePermissionDao;
    }

    @Override
    public List<RolePermission> findByPermissionId(String permissionId) {

        return rolePermissionDao.findByPermissionId(permissionId);
    }

    @Override
    public List<RolePermission> findByRoleId(String roleId) {

        return rolePermissionDao.findByRoleId(roleId);
    }

    @Override
    public void deleteByRoleId(String roleId) {

        rolePermissionDao.deleteByRoleId(roleId);
    }
}