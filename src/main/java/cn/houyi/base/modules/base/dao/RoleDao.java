package cn.houyi.base.modules.base.dao;

import cn.houyi.base.base.BaseDao;
import cn.houyi.base.modules.base.entity.Role;

import java.util.List;

/**
 * 角色数据处理层
 * @author houyi
 */
public interface RoleDao extends BaseDao<Role,String> {

    /**
     * 获取默认角色
     * @param defaultRole
     * @return
     */
    List<Role> findByDefaultRole(Boolean defaultRole);
}
