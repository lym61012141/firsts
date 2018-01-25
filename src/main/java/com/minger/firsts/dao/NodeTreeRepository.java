package com.minger.firsts.dao;

import com.minger.firsts.domain.NodeTree;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:18
 */
public interface NodeTreeRepository extends JpaRepository<NodeTree, Integer> {
    NodeTree findById(Integer id);

    List<NodeTree> findByIdIn(List<Integer> ids);

  /*无法执行,错误的
   @Query("delete from NodeTree where id in:ids")
    void delete(@Param("ids") List<Integer> ids);*/

    void deleteByIdIn(List<Integer> ids);

}
