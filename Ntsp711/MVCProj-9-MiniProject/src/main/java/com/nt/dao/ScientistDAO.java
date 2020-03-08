package com.nt.dao;

import java.util.List;

import com.nt.bo.ScientistBO;

public interface ScientistDAO {
	public List<ScientistBO> getAllScientist();
	public int addScientist(ScientistBO bo);
	public ScientistBO getScientist(int id);
}
