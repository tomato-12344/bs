package com.xtd.bs.mapper;

import com.xtd.bs.entity.Class;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
public interface ClassMapper extends BaseMapper<Class> {

    /**
     * 查询所有班级
     * @return
     */
    public List<Class> findAllClass();
}
