package cn.itcast.travel.service;

import cn.itcast.travel.domain.User;

/**
 * @author wkj
 * @create 2019-04-23-下午8:00
 */
public interface UserService {
    /**
     * 注册用户
     * @param user
     * @return
     */
    boolean regist(User user);

    boolean active(String code);
}
