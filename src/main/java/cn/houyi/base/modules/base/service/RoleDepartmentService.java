package cn.houyi.base.modules.base.service;

import cn.houyi.base.base.BaseService;
import cn.houyi.base.modules.base.entity.RoleDepartment;

import java.util.List;

/**
 * 角色部门接口
 * @author Exrick
 */
public interface RoleDepartmentService extends BaseService<RoleDepartment,String> {

    /**
     * 通过roleId获取
     * @param roleId
     * @return
     */
    List<RoleDepartment> findByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param roleId
     */
    void deleteByRoleId(String roleId);

    /**
     * 通过角色id删除
     * @param departmentId
     */
    void deleteByDepartmentId(String departmentId);
}