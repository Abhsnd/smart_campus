package com.winghao.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.winghao.mapper.AdminMapper;
import com.winghao.pojo.Admin;
import com.winghao.service.AdminService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("adminServiceImpl")
@Transactional
public class AdminServiceImpl extends ServiceImpl<AdminMapper, Admin> implements AdminService {
}
