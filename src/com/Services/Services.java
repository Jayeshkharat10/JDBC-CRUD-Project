package com.Services;

import com.Dao.Dao;

public class Services {
	
	public void Insert() throws Exception {
		Dao sd = new Dao();
		sd.Insert();
	}
	
	public void Delete() throws Exception{
		Dao sd = new Dao();
		sd.Delete();
	}
	
	public void Select() throws Exception{
		Dao sd = new Dao();
		sd.Select();
	}

	public void Update() throws Exception {
		Dao sd = new Dao();
		sd.Update();
	}
}
 