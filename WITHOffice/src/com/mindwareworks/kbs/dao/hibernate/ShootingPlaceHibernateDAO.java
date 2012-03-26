package com.mindwareworks.kbs.dao.hibernate;

import java.util.List;

import com.mindwareworks.kbs.dao.GenericHibernateDAO;
import com.mindwareworks.kbs.dao.ShootingPlaceDAO;
import com.mindwareworks.kbs.model.ShootingPlace;

public class ShootingPlaceHibernateDAO extends GenericHibernateDAO<ShootingPlace,Long> implements ShootingPlaceDAO {

	@Override
	public List<ShootingPlace> searchByTitle(String search) {
		// TODO Auto-generated method stub
		return super.search("shootingPlace", search);
	}

	@Override
	public List<ShootingPlace> searchPageByTitle(String search,int page,int pageSize) {
		// TODO Auto-generated method stub
		return super.searchPage(page, pageSize, "shootingPlace", search);
	}

	

}
