package com.springprj.productstockapp.business.concretes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springprj.productstockapp.business.abstracts.UserService;
import com.springprj.productstockapp.core.dataAccess.UserDao;
import com.springprj.productstockapp.core.entities.User;
import com.springprj.productstockapp.core.utilities.results.DataResult;
import com.springprj.productstockapp.core.utilities.results.Result;
import com.springprj.productstockapp.core.utilities.results.SuccessDataResult;
import com.springprj.productstockapp.core.utilities.results.SuccessResult;

@Service
public class UserManager implements UserService {
    
	private UserDao userDao;

	@Autowired
	public UserManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public Result add(User user) {
		this.userDao.save(user);
		return new SuccessResult("Kullanıcı eklendi");
	}

	@Override
	public DataResult<User> findByEmail(String email) {
		return new SuccessDataResult<User>(this.userDao.findByEmail(email),"Kullanıcı bulundu");
	}
	
	
}
