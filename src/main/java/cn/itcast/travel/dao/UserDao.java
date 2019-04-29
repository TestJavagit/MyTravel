package cn.itcast.travel.dao;

import cn.itcast.travel.domain.User;

/**
 * @author wkj
 * @create 2019-04-23-下午8:12
 */
public interface UserDao {
    /**
     * 根据用户名查询用户信息
     * @param username
     * @return
     */
    public User findByUsername(String username);

    /**
     * 用户保存
     * @param user
     */
    public void save(User user);
}
