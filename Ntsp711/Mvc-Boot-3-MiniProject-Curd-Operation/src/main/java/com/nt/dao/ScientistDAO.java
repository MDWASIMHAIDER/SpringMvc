package com.nt.dao;

import java.util.List;

import com.nt.bo.ScientistBO;

public interface ScientistDAO {
	public List<ScientistBO> getAllScientist();
	public int deleteScientist(int id);
	public int updateScientist(ScientistBO  bo);
	public ScientistBO getScientistById(int id);
	public int insertScientist(ScientistBO bo);
}
