package com.xtd.bs.service.impl;

import com.xtd.bs.entity.Class;
import com.xtd.bs.mapper.ClassMapper;
import com.xtd.bs.service.ClassService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 谢腾达
 * @since 2021-11-28
 */
@Service
public class ClassServiceImpl extends ServiceImpl<ClassMapper, Class> implements ClassService {

    @Autowired
    private ClassMapper classMapper;

    /**
     * 查询所有班级
     * @return
     */
    public List<Class> findAllClass(){
        return classMapper.findAllClass();
    }
}
