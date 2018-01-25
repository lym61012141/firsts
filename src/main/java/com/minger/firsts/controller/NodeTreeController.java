package com.minger.firsts.controller;

import com.minger.firsts.domain.NodeTree;
import com.minger.firsts.iservice.INodeTreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 22:31
 */
@RestController
@RequestMapping("firsts")
public class NodeTreeController {
    @Autowired
    private INodeTreeService iNodeTreeService;

    @GetMapping("{id}")
    public NodeTree findById(@PathVariable Integer id) {

        /*
        测试代码
        Map<String, Object> result = BeanConvertUtils.toMap(iNodeTreeService.findById(id));
        Iterator iterator = result.keySet().iterator();
        List<Object> collect1 = result.keySet().stream().map(k -> result.get(k)).collect(Collectors.toList());
        List<String> collect = result.keySet().stream().collect(Collectors.toList());
        while (iterator.hasNext()) {
            Object key = iterator.next();
            Object value = result.get(key);
        }
    */
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
        iNodeTreeService.save(nodeTree);
    }

    @DeleteMapping("delete")
    public void delete(List<Integer> ids) {
        iNodeTreeService.delete(ids);
    }
}
