package space.rexhub.design_patterns.creational.abstract_factory.dao.impl;

import space.rexhub.design_patterns.creational.abstract_factory.dao.DepartmentDao;
import space.rexhub.design_patterns.creational.abstract_factory.entity.Department;

/**
 * Description: 用于访问Access的Department
 *
 * @author Rex
 * @date 2025-01-09
 */
public class AccessDepartmentDao implements DepartmentDao {
    /**
     * 插入部门
     *
     * @param department 部门
     */
    @Override
    public void insert(Department department) {
        System.out.println("在Access中给Department表增加一条记录");
    }

    /**
     * 根据id查询部门
     *
     * @param id id
     * @return 部门
     */
    @Override
    public Department getDepartment(Integer id) {
        System.out.println("在Access中根据id得到Department表一条记录");
        return null;
    }
}

