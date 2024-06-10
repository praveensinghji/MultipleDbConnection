package com.myapp.myapp.repo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.myapp.model.Student;

@Repository
public class StudentRepo {
	
    private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(@Qualifier("dataSource") DataSource dataSource) {
    	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public List<Student> findAllStudent(){
        String sql = "SELECT * FROM ftwdbo.Student";
        List<Student> students = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(Student.class));
        System.out.println(students);
        return students;
    }

    public String saveStudent(Student student){
        String sql = "INSERT INTO ftwdbo.Student (name,email,department,modifiedDate) VALUES (?,?,?,?);";
//        Timestamp timestamp = Timestamp.valueOf(LocalDateTime.now());

        jdbcTemplate.update(sql,student.getName(),student.getEmail(),student.getDepartment(),student.getModifiedDate());
        return "Data Saved Successfully";
    }

    public Student getStudentByName(String name){
        String sql = "SELECT * FROM ftwdbo.Student where name = ?";
        return jdbcTemplate.queryForObject(sql, BeanPropertyRowMapper.newInstance(Student.class),name);
    }

    public void deleteById(String name){
        String sql = "DELETE FROM ftwdbo.Student where name=?";
        jdbcTemplate.update(sql,name);
    }

    public  List<Student> getDate(){
        String sql = "Select * from ftwdbo.Student";
        return jdbcTemplate.query(sql,BeanPropertyRowMapper.newInstance(Student.class));
    }
}
