package com.minger.firsts.dao;

import com.minger.firsts.domain.NodeTree;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:18
 */
public interface NodeTreeRepository extends JpaRepository<NodeTree, Integer> {
    public NodeTree findById(Integer id);

    public List<NodeTree> findByIdIn(List<Integer> ids);

}
