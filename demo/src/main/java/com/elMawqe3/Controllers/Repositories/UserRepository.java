package com.elMawqe3.Controllers.Repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.elMawqe3.Models.User;

@Repository
public interface UserRepository  extends JpaRepository<User,Long>{
	public List<User> findByEmail(String email);
}
