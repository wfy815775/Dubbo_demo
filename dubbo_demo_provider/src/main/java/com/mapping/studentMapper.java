package com.mapping;

import com.dao.Student;
import org.apache.ibatis.annotations.Param;

//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Mapper;
//import org.apache.ibatis.annotations.Param;

/**
 * @author 王扶摇
 * @Title: studentMapper
 * @ProjectName Dubbo_demo
 * @Description: TODO
 * @date 2018/7/16 0:34
 */


public interface studentMapper {
    /**
     * 根据姓名查找学生的信息
     *
     * @Author 王扶摇
     * @Description //TODO
     * @Date 0:39 2018/7/16
     * @param aname 学生信息
     * @return com.dao.Student
     */
   public Student selstudent(@Param("aname") String aname);
   /**
    * 查询student表中的记录数
    *
    *
    * @Author 王扶摇
    * @Description //TODO
    * @Date 13:36 2018/7/16
    * @Param []
    * @return int
    *
    */
   public int selCount();
}
