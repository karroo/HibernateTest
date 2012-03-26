package com.mindwareworks.kbs.dao;

import java.util.List;

import com.mindwareworks.kbs.model.ShootingPlace;

public interface ShootingPlaceDAO extends GenericDAO<ShootingPlace,Long>{
	public List<ShootingPlace> searchByTitle(String search);
	public List<ShootingPlace> searchPageByTitle(String search,int page,int pageSize);
}
