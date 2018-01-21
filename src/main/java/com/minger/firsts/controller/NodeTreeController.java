package com.minger.firsts.controller;

import com.minger.firsts.dao.NodeTreeRepository;
import com.minger.firsts.domain.NodeTree;
import com.minger.firsts.iservice.INodeTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:31
 */
@RestController
public class NodeTreeController {
    @Autowired
    private INodeTreeService iNodeTreeService;
    @Autowired
    private NodeTreeRepository nodeTreeRepository;

    @GetMapping("/{id}")
    public NodeTree findById(@PathVariable Integer id) {
        return iNodeTreeService.findById(id);
    }

    @GetMapping("/node/{ids}")
    public List<NodeTree> findByIds(@PathVariable String idString) {
        String[] idSplit = idString.split(",");
        List<Integer> ids = new ArrayList<>();
        for (String id : idSplit) {
            ids.add(Integer.getInteger(id));
        }
        return iNodeTreeService.findByIds(ids);
    }

    @GetMapping("/all")
    public List<NodeTree> findAll() {
        return iNodeTreeService.findAll();
    }

    @PostMapping("/save")
    public void save(NodeTree nodeTree) {
        nodeTreeRepository.save(nodeTree);
    }
}
