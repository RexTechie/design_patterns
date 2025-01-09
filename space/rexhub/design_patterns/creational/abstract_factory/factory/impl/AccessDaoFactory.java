package space.rexhub.design_patterns.creational.abstract_factory.factory.impl;

import space.rexhub.design_patterns.creational.abstract_factory.dao.DepartmentDao;
import space.rexhub.design_patterns.creational.abstract_factory.dao.UserDao;
import space.rexhub.design_patterns.creational.abstract_factory.dao.impl.AccessDepartmentDao;
import space.rexhub.design_patterns.creational.abstract_factory.dao.impl.AccessUserDao;
import space.rexhub.design_patterns.creational.abstract_factory.factory.DaoFactory;

/**
 * Description: 实现SqlFactory接口，实例化AccessFactory类
 *
 * @author Rex
 * @date 2025-01-09
 */
public class AccessDaoFactory implements DaoFactory {
    /**
     * 创建UserDao对象
     *
     * @return UserDao对象
     */
    @Override
    public UserDao createUserDao() {
        return new AccessUserDao();
    }

    /**
     * 创建DepartmentDao对象
     *
     * @return DepartmentDao对象
     */
    @Override
    public DepartmentDao createDepartmentDao() {
        return new AccessDepartmentDao();
    }

}
