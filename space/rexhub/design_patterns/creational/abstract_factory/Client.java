package space.rexhub.design_patterns.creational.abstract_factory;

import space.rexhub.design_patterns.creational.abstract_factory.dao.DataAccess;
import space.rexhub.design_patterns.creational.abstract_factory.dao.DepartmentDao;
import space.rexhub.design_patterns.creational.abstract_factory.dao.UserDao;
import space.rexhub.design_patterns.creational.abstract_factory.entity.Department;
import space.rexhub.design_patterns.creational.abstract_factory.entity.User;

/**
 * Description: 客户端
 *
 * @author Rex
 * @date 2025-01-09
 */
public class Client {
    public static void main(String[] args) {
        User user = new User();
        Department department = new Department();

        UserDao userDao = DataAccess.createUserDao();
        userDao.insert(user);
        userDao.getUser(1);

        DepartmentDao departmentDao = DataAccess.createDepartmentDao();
        departmentDao.insert(department);
        departmentDao.getDepartment(1);
    }
}


