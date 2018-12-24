package cn.houyi.base.modules.base.serviceimpl.mybatis;

import cn.houyi.base.modules.base.dao.mapper.PermissionMapper;
import cn.houyi.base.modules.base.entity.Permission;
import cn.houyi.base.modules.base.service.mybatis.IPermissionService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author houyi
 */
@Service
public class IPermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements IPermissionService {

    @Autowired
    private PermissionMapper permissionMapper; ;

    @Override
    public List<Permission> findByUserId(String userId) {

        return permissionMapper.findByUserId(userId);
    }
}
