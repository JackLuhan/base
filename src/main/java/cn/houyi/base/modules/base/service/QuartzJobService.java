package cn.houyi.base.modules.base.service;

import cn.houyi.base.base.BaseService;
import cn.houyi.base.modules.base.entity.QuartzJob;

import java.util.List;

/**
 * 定时任务接口
 * @author Exrick
 */
public interface QuartzJobService extends BaseService<QuartzJob,String> {

    /**
     * 通过类名获取
     * @param jobClassName
     * @return
     */
    List<QuartzJob> findByJobClassName(String jobClassName);
}