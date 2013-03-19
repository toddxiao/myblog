package com.xp.myblog.dao;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.xp.myblog.model.User;

public interface UserDao extends PagingAndSortingRepository<User, Long> {
	User findByUserEmail(String userEmail);
}
