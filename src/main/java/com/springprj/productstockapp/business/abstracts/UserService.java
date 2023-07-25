package com.springprj.productstockapp.business.abstracts;

import com.springprj.productstockapp.core.entities.User;
import com.springprj.productstockapp.core.utilities.results.DataResult;
import com.springprj.productstockapp.core.utilities.results.Result;

public interface UserService {

	Result add(User user);
	
	DataResult<User> findByEmail(String email);
}
