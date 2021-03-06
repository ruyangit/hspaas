package com.huashi.mms.template.service;

import com.huashi.mms.template.domain.MmsPassageMessageTemplate;

import java.util.List;

/**
 * TODO 提供商彩信模板服务接口
 * 
 * @author zhengying
 * @version V1.0
 * @date 2019年1月15日 上午11:20:05
 */
public interface IMmsPassageTemplateService {

    /**
     * TODO 添加通道模板
     * 
     * @param template
     * @return
     */
    boolean save(MmsPassageMessageTemplate template);

    /**
     * 修改数据
     * 
     * @param template
     * @return
     */
    boolean update(MmsPassageMessageTemplate template);

    /**
     * TODO 删除模板
     * 
     * @param id
     * @return
     */
    boolean deleteById(long id);

    /**
     * TODO 根据模板ID查询模板
     * 
     * @param id
     * @return
     */
    MmsPassageMessageTemplate get(long id);

    /**
     * TODO 根据彩信模板ID获取通道模板信息
     * 
     * @param templateId
     * @return
     */
    List<MmsPassageMessageTemplate> getByMmsTemplateId(long templateId);

    /**
     * TODO 根据模板ID和通道ID获取通道模板信息
     * 
     * @param templateId
     * @param passageId
     * @return
     */
    MmsPassageMessageTemplate getByMmsTemplateIdAndPassageId(long templateId, int passageId);

    /**
     * TODO 根据模板ModelID和通道ID获取通道模板信息
     * 
     * @param modelId
     * @param passageId
     * @return
     */
    MmsPassageMessageTemplate getByMmsModelIdAndPassageId(String modelId, int passageId);

    /**
     * TODO 将模板数据加载到REDIS
     * 
     * @return
     */
    boolean reloadToRedis();
}
