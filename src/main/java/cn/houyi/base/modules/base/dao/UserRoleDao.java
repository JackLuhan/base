package cn.houyi.base.modules.base.dao;

import cn.houyi.base.base.BaseDao;
import cn.houyi.base.modules.base.entity.UserRole;

import java.util.List;

/**
 * 用户角色数据处理层
 * @author houyi
 */
public interface UserRoleDao extends BaseDao<UserRole,String> {

    /**
     * 通过roleId查找
     * @param roleId
     * @return
     */
    List<UserRole> findByRoleId(String roleId);

    /**
     * 删除用户角色
     * @param userId
     */
    void deleteByUserId(String userId);
}
