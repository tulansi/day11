package com.xiaoshu.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaoshu.dao.StudentMapper;
import com.xiaoshu.entity.Course;
import com.xiaoshu.entity.Student;
import com.xiaoshu.entity.StudentVo;

@Service
public class StudentService {
	@Autowired
	private StudentMapper sm;
	
	public PageInfo<StudentVo> findUserPage(StudentVo sv, Integer pageNum, Integer pageSize, String ordername,
			String order) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<StudentVo> list=sm.findUserPage(sv);
		return new PageInfo<>(list);
	}

	public void updateStu(Student stu) {
		// TODO Auto-generated method stub
		sm.updateStu(stu);
	}

	public void addStu(Student stu) {
		// TODO Auto-generated method stub
		sm.addStu(stu);
	}

	public void deleteStu(int parseInt) {
		// TODO Auto-generated method stub
		sm.deleteStu(parseInt);
	}

	public List<StudentVo> echartsFindAll() {
		// TODO Auto-generated method stub
		return sm.echartsFindAll();
	}

	public List<StudentVo> findAll(StudentVo studentVo) {
		// TODO Auto-generated method stub
		return sm.findUserPage(studentVo);
	}


}
