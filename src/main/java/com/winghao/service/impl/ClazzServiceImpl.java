package com.winghao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winghao.mapper.ClazzMapper;
import com.winghao.pojo.Clazz;
import com.winghao.service.ClazzService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("clazzServiceImpl")
@Transactional
public class ClazzServiceImpl extends ServiceImpl<ClazzMapper, Clazz> implements ClazzService {
}
