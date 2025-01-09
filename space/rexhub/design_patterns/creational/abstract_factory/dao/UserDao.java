package space.rexhub.design_patterns.creational.abstract_factory.dao;

import space.rexhub.design_patterns.creational.abstract_factory.entity.User;

/**
 * 用户dao
 */
public interface UserDao {
    /**
     * 插入用户
     * @param user 用户
     */
    void insert(User user);

    /**
     * 获取用户
     * @param id 用户id
     * @return 用户
     */
    User getUser(int id);
}
