package com.xtd.bs.service;

import com.xtd.bs.entity.Class;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
public interface ClassService extends IService<Class> {

    /**
     * 查询所有班级
     * @return
     */
    public List<Class> findAllClass();

}
