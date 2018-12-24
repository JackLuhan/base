package cn.houyi.base.modules.base.service;


import cn.houyi.base.base.BaseService;
import cn.houyi.base.modules.base.entity.UserRole;

import java.util.List;

/**
 * 用户角色接口
 * @author houyi
 */
public interface UserRoleService extends BaseService<UserRole,String> {

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
