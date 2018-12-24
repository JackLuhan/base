package cn.houyi.base.modules.base.dao;

import cn.houyi.base.base.BaseDao;
import cn.houyi.base.modules.base.entity.Dict;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * 字典数据处理层
 * @author Exrick
 */
public interface DictDao extends BaseDao<Dict,String> {

    /**
     * 通过type获取
     * @param type
     * @return
     */
    List<Dict> findByType(String type);

    /**
     * 模糊搜索
     * @param key
     * @return
     */
    @Query(value = "select * from t_dict d where d.title like %:key% or d.type like %:key%", nativeQuery = true)
    List<Dict> findByTitleOrTypeLike(@Param("key") String key);
}