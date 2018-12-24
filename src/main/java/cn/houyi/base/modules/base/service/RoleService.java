package cn.houyi.base.modules.base.service;


import cn.houyi.base.base.BaseService;
import cn.houyi.base.modules.base.entity.Role;

import java.util.List;

/**
 * 角色接口
 * @author houyi
 */
public interface RoleService extends BaseService<Role,String> {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<Role> findByDefaultRole(Boolean defaultRole);
}
