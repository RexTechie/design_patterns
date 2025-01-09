package space.rexhub.design_patterns.creational.abstract_factory.factory;

import space.rexhub.design_patterns.creational.abstract_factory.dao.DepartmentDao;
import space.rexhub.design_patterns.creational.abstract_factory.dao.UserDao;

/**
 * Description: 创建访问User表对象的抽象的工厂接口
 *
 * @author Rex
 * @date 2025-01-09
 */
public interface DaoFactory {
    /**
     * 创建UserDao对象
     * @return UserDao对象
     */
    UserDao createUserDao();

    /**
     * 创建DepartmentDao对象
     * @return DepartmentDao对象
     */
    DepartmentDao createDepartmentDao();

}
