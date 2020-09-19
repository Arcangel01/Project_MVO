package com.project.mvo.interfaces;

import java.util.List;

import com.project.mvo.models.Test;

public interface ITest {


	public List<Test> listAllUser();
	
	public Test listUser(int id);
}
