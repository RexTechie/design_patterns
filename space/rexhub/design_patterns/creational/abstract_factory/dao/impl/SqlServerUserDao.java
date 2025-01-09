package space.rexhub.design_patterns.creational.abstract_factory.dao.impl;

import space.rexhub.design_patterns.creational.abstract_factory.dao.UserDao;
import space.rexhub.design_patterns.creational.abstract_factory.entity.User;

/**
 * Description: 用于访问SQL Server的User
 *
 * @author Rex
 * @date 2025-01-09
 */
public class SqlServerUserDao implements UserDao {
    /**
     * 插入用户
     *
     * @param user 用户
     */
    @Override
    public void insert(User user) {
        System.out.println("在SQL Server中给User表增加一条记录");
    }

    /**
     * 获取用户
     *
     * @param id 用户id
     * @return 用户
     */
    @Override
    public User getUser(int id) {
        System.out.println("在SQL Server中根据id得到User表一条记录");
        return null;
    }
}
