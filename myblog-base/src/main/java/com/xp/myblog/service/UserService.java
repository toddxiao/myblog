package com.xp.myblog.service;

import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xp.myblog.core.security.utils.Digests;
import com.xp.myblog.core.utils.Encodes;
import com.xp.myblog.dao.UserDao;
import com.xp.myblog.model.User;


// Spring Service Bean的标识.
@Service
public class UserService {

	//private static Logger logger = LoggerFactory.getLogger(AccountService.class);

	public static final String HASH_ALGORITHM = "SHA-1";
	public static final int HASH_INTERATIONS = 1024;
	private static final int SALT_SIZE = 8;
	
	@Autowired
	private UserDao userDao;

	public List<User> getAllUser() {
		return (List<User>) userDao.findAll();
	}

	public User getUser(Long id) {
		return userDao.findOne(id);
	}
	
	public User getUserByUserEmail(String userEmail){
		return userDao.findByUserEmail(userEmail);
	}
	
	public void registerUser(User user) {
		entryptPassword(user);
		user.setUserRole("defaultRole");

		userDao.save(user);
	}

	public void updateUser(User user) {
		if (StringUtils.isNotBlank(user.getUserPassword())) {
			entryptPassword(user);
		}
		userDao.save(user);
	}

	public void deleteUser(Long id) {
//		if (isSupervisor(id)) {
//			logger.warn("操作员{}尝试删除超级管理员用户", getCurrentUserName());
//			throw new ServiceException("不能删除超级管理员用户");
//		}
		userDao.delete(id);

	}
	
	/**
	 * 设定安全的密码，生成随机的salt并经过1024次 sha-1 hash
	 */
	private void entryptPassword(User user) {
		byte[] salt = Digests.generateSalt(SALT_SIZE);
		user.setSalt(Encodes.encodeHex(salt));

		byte[] hashPassword = Digests.sha1(user.getUserPassword().getBytes(), salt, HASH_INTERATIONS);
		user.setUserPassword(Encodes.encodeHex(hashPassword));
	}

}
