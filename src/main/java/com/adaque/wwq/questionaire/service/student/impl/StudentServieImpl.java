package com.adaque.wwq.questionaire.service.student.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.adaque.wwq.questionaire.dao.student.StudentMapper;
import com.adaque.wwq.questionaire.model.easyuimodel.UserForm;
import com.adaque.wwq.questionaire.model.easyuimodel.UserRole;
import com.adaque.wwq.questionaire.model.student.StudentModel;
import com.adaque.wwq.questionaire.po.Ability;
import com.adaque.wwq.questionaire.po.Student;
import com.adaque.wwq.questionaire.service.student.StudentServie;
@Service
public class StudentServieImpl implements StudentServie {

	@Autowired
	private StudentMapper studentMapper;
	
	public Student getStudentById(String id) {
		Student student = studentMapper.getStudentById(id);
		return student;
	}

	public Student getStduentByNameAndPwd(StudentModel studentModel) {
		Student student = studentMapper.getStduentByNameAndPwd(studentModel);
		return student;
	}

	public List<Student> getAllStudent() {
		List<Student> studentList = studentMapper.getAllStudent();
		return studentList;
	}

	public void deleteStudentById(String id) {
		studentMapper.deleteStudentById(id);
	}

	public void updateStudentById(Student student) {
		studentMapper.updateStudentById(student);
	}

	public List<Student> getStudentByNumAndName(UserForm userForm) {
		return studentMapper.getStudentByNumAndName(userForm);
	}

	@Override
	public void addFormStudent(Student student) {
		studentMapper.addFormStudent(student);
	}

	@Override
	public void addStudentRole(UserRole userRole) {
		studentMapper.addStudentRole(userRole);
	}

	@Override
	public Student getStudentByNum(String num) {
		return studentMapper.getStudentByNum(num);
	}

	@Override
	public void updatePasswordById(UserForm userForm) {
		studentMapper.updatePasswordById(userForm);
	}

	@Override
	public void updateStudentInfoById(Student student) {
		studentMapper.updateStudentInfoById(student);
		
	}

	@Override
	public void addAbilityByStudentId(Ability ability) {
		studentMapper.addAbilityByStudentId(ability);
	}

	@Override
	public void updateAbilityByAbilityId(Ability ability) {
		studentMapper.updateAbilityByAbilityId(ability);
	}

	@Override
	public Ability getStudentAbilityByAbilityId(String id) {
		return studentMapper.getStudentAbilityByAbilityId(id);
	}
	
	
	
}
