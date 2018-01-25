package com.minger.firsts.service.impl;

import com.minger.firsts.dao.NodeTreeRepository;
import com.minger.firsts.domain.NodeTree;
import com.minger.firsts.iservice.INodeTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:25
 */
@Service
@Transactional
public class NodeTreeServiceImpl implements INodeTreeService {
    @Autowired
    private NodeTreeRepository nodeTreeRepository;
    @Override
    public NodeTree findById(Integer id) {
        return nodeTreeRepository.findById(id);
    }

    @Override
    public List<NodeTree> findByIds(List<Integer> ids) {
        return nodeTreeRepository.findByIdIn(ids);
    }

    @Override
    public List<NodeTree> findAll() {
        return nodeTreeRepository.findAll();
    }

    @Override
    public void save(NodeTree nodeTree) {
        nodeTreeRepository.save(nodeTree);
    }

    @Override
    public void delete(List<Integer> ids) {
        nodeTreeRepository.deleteByIdIn(ids);
    }
}
