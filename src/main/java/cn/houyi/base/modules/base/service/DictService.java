package cn.houyi.base.modules.base.service;

import cn.houyi.base.base.BaseService;
import cn.houyi.base.modules.base.entity.Dict;

import java.util.List;

/**
 * 字典接口
 * @author Exrick
 */
public interface DictService extends BaseService<Dict,String> {

    /**
     * 通过type获取
     * @param type
     * @return
     */
    Dict findByType(String type);

    /**
     * 模糊搜索
     * @param key
     * @return
     */
    List<Dict> findByTitleOrTypeLike(String key);
}