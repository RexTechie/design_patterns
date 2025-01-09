package space.rexhub.design_patterns.creational.abstract_factory.dao;

import space.rexhub.design_patterns.creational.abstract_factory.entity.Department;

/**
 * Description: DepartmentDao
 *
 * @author Rex
 * @date 2025-01-09
 */
public interface DepartmentDao {

    /**
     * 插入部门
     * @param department 部门
     */
    void insert(Department department);

    /**
     * 根据id查询部门
     * @param id id
     * @return 部门
     */
    Department getDepartment(Integer id);
}
