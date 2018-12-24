package cn.houyi.base.modules.base.dao;

import cn.houyi.base.base.BaseDao;
import cn.houyi.base.modules.base.entity.RolePermission;

import java.util.List;

/**
 * 角色权限数据处理层
 * @author Exrick
 */
public interface RolePermissionDao extends BaseDao<RolePermission,String> {

    /**
     * 通过permissionId获取
     * @param permissionId
     * @return
     */
    List<RolePermission> findByPermissionId(String permissionId);

    /**
     * 通过roleId获取
     * @param roleId
     */
    List<RolePermission> findByRoleId(String roleId);

    /**
     * 通过roleId删除
     * @param roleId
     */
    void deleteByRoleId(String roleId);
}