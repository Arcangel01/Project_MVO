package com.project.mvo.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.project.mvo.interfaces.ITest;
import com.project.mvo.models.Test;

@Service
public class TestService implements ITest {
	
	private static List<Test> miBeans = new ArrayList<>();

	static {
	    miBeans.add(new Test(1, "Arcangel", "Cataño", 25, "Developer"));
	    miBeans.add(new Test(2, "Sara", "Rojo", 19, "Asesora Comercial"));
	  }

	@Override
	public List<Test> listAllUser() {
		return miBeans;
	}

	@Override
	public Test listUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
