package com.hxut.team.junit;

import com.hxut.team.domain.Employee;
import com.hxut.team.service.NameListService;
import com.hxut.team.service.TeamException;
import org.junit.Test;

/**
 * @author weijiangquan
 * @date 2022/4/29 -21:00
 * @Description 对于NameListService的测试
 */
public class NameListServiceTest {

    /**
     * 输出所有的员工的测试
     */
    @Test
    public void testGetAllEmployee(){
        NameListService service = new NameListService();
        Employee[] allEmployees = service.getAllEmployees();
        for (Employee allEmployee : allEmployees) {
            System.out.println(allEmployee);
        }
    }

    /**
     * 测试单个员工有没有,没有的话就会抛出异常(这个异常是自己定义的异常)
     */
    @Test
    public void testGetEmployee(){
        NameListService service = new NameListService();
        try {
            Employee employee = service.getEmployee(22);
            System.out.println(employee);
        } catch (TeamException e) {
            System.out.println(e.getMessage());
        }
    }

}

