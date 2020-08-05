package com.offcn.dao;

import com.offcn.pojo.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @Auther: lhq
 * @Date: 2020/8/4 15:28
 * @Description:
 */
public interface UserDao extends JpaRepository<User,Long> {
}
