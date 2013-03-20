package com.xp.myblog.dao;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import com.xp.myblog.model.User;

@Repository
public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByUserEmail(String userEmail);
}
