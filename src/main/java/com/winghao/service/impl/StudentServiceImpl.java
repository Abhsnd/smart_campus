package com.winghao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winghao.mapper.StudentMapper;
import com.winghao.pojo.Student;
import com.winghao.service.StudentService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**

 */
@Service("studentServiceImpl")
@Transactional
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {


}
