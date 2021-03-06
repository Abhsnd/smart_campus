package com.winghao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winghao.mapper.TeacherMapper;
import com.winghao.pojo.Teacher;
import com.winghao.service.TeacherService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("teacherServiceImpl")
@Transactional
public class TeacherServiceImpl extends ServiceImpl<TeacherMapper, Teacher> implements TeacherService {



}
