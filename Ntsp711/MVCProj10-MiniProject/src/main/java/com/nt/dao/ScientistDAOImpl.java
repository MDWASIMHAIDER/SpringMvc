package com.nt.dao;

import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;

import com.nt.bo.ScientistBO;

public class ScientistDAOImpl implements ScientistDAO {
	private static final String GET_ALL_SCIENTIST="SELECT ID,NAME,DOMAIN,EXPERIANCE,PATENTSCOUNT  FROM INDIAN_SCIENTIST";
	private static final String DELETE_SCIENTIST="DELETE  FROM INDIAN_SCIENTIST WHERE ID=?";
	private static final String UPDATE_SCIENTIST="UPDATE INDIAN_SCIENTIST SET NAME=?,DOMAIN=?,EXPERIANCE=?,PATENTSCOUNT=? WHERE ID=?";
	private static final String GET_SCIENTIST_BY_ID="SELECT ID,NAME,DOMAIN,EXPERIANCE,PATENTSCOUNT FROM INDIAN_SCIENTIST WHERE ID=?";
	private static final String INSERT_SCIENTIST="INSERT INTO INDIAN_SCIENTIST VALUES(?,?,?,?,?)";
	
	private JdbcTemplate jt;
	
	public ScientistDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}

	public List<ScientistBO> getAllScientist() {
		List<ScientistBO>listbo=null;
		BeanPropertyRowMapper<ScientistBO>rowMapper=null;
		rowMapper=new BeanPropertyRowMapper<ScientistBO>(ScientistBO.class);
		listbo=jt.query(GET_ALL_SCIENTIST, new RowMapperResultSetExtractor<ScientistBO>(rowMapper));
		return listbo;
	}

	@Override
	public int deleteScientist(int id) {
		int count=0;
		count=jt.update(DELETE_SCIENTIST,id);
		return count;
	}

	@Override
	public int updateScientist(ScientistBO bo) {
		int count=0;
		count=jt.update(UPDATE_SCIENTIST, bo.getName(),bo.getDomain(),bo.getExperiance(),bo.getPatentsCount(),bo.getId());
		return count;
	}

	@Override
	public ScientistBO getScientistById(int id) {
		ScientistBO bo=null;
		bo=jt.queryForObject(GET_SCIENTIST_BY_ID,new BeanPropertyRowMapper<ScientistBO>(ScientistBO.class),id);
			return bo;
	}

	@Override
	public int insertScientist(ScientistBO bo) {
		int count=0;
		count=jt.update(INSERT_SCIENTIST, bo.getId(),bo.getName(),bo.getDomain(),bo.getExperiance(),bo.getPatentsCount());
		return count;
	}

}
