package com.minger.firsts.iservice;

import com.minger.firsts.domain.NodeTree;

import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:23
 */
public interface INodeTreeService {
    NodeTree findById(Integer id);

    List<NodeTree> findByIds(List<Integer> ids);

    List<NodeTree> findAll();

    void save(NodeTree nodeTree);

    void delete(List<Integer> ids);
}
