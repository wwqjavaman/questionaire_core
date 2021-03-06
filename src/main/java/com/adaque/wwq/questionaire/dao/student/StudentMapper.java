package com.adaque.wwq.questionaire.dao.student;

import java.util.List;

import com.adaque.wwq.questionaire.model.easyuimodel.UserForm;
import com.adaque.wwq.questionaire.model.easyuimodel.UserRole;
import com.adaque.wwq.questionaire.model.student.StudentModel;
import com.adaque.wwq.questionaire.po.Ability;
import com.adaque.wwq.questionaire.po.Student;

public interface StudentMapper {
	
	public Student getStudentById(String id);
	
	public Student getStduentByNameAndPwd(StudentModel studentModel);
	
	public List<Student> getAllStudent();
	
	public void deleteStudentById(String id);
	
	public void updateStudentById(Student student);
	
	public void addFormStudent(Student student);
	
	public List<Student> getStudentByNumAndName(UserForm userForm);
	
	public void addStudentRole(UserRole userRole);
	
	public Student getStudentByNum(String num);
	
	public void updatePasswordById(UserForm userForm);
	
	
	public void updateStudentInfoById(Student student);
	
	public void addAbilityByStudentId(Ability ability);
	
	public void updateAbilityByAbilityId(Ability ability);
	
	public Ability getStudentAbilityByAbilityId(String id);
}
