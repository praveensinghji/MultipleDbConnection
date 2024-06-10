package com.myapp.myapp.repo;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.myapp.myapp.model.MyModelClass;

@Repository
public class MyModelClassRepo {
	private JdbcTemplate jdbcTemplate;
    
    @Autowired
    public void setDataSource(@Qualifier("mySqlDataSource") DataSource dataSource) {
    	this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    
    public List<MyModelClass> findAllModelData(){
        String sql = "SELECT * FROM praveen.mytable";
        List<MyModelClass> modelClass = jdbcTemplate.query(sql, BeanPropertyRowMapper.newInstance(MyModelClass.class));
        System.out.println(modelClass);
        return modelClass;
    }
}
