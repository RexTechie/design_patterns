package space.rexhub.design_patterns.creational.abstract_factory.dao;

import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Properties;

/**
 * Description: 数据访问
 *
 * @author Rex
 * @date 2025-01-09
 */
public class DataAccess {
    private static final String PACKAGE_NAME = "space.rexhub.design_patterns.creational.abstract_factory.dao.impl";
    private static String DB;

    static{
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("space/rexhub/design_patterns/creational/abstract_factory/database_config.properties"));
            DB = (String) properties.get("DB");
        } catch (IOException e) {
            DB = null;
        }
    }
    /**
     * 创建用户Dao
     * @return UserDao
     */
    public static UserDao createUserDao(){
        UserDao userDao = null;
        String className = PACKAGE_NAME + "." + DB + "UserDao";
        try {
            Constructor<?> constructor = Class.forName(className).getDeclaredConstructor();
            userDao = (UserDao) constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return userDao;
    }

    /**
     * 创建部门Dao
     * @return DepartmentDao
     */
    public static DepartmentDao createDepartmentDao(){
        DepartmentDao departmentDao = null;
        String className = PACKAGE_NAME + "." + DB + "DepartmentDao";
        try {
            Constructor<?> constructor = Class.forName(className).getConstructor();
            departmentDao = (DepartmentDao) constructor.newInstance();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return departmentDao;
    }
}
