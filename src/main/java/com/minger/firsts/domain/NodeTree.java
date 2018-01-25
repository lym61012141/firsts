package com.minger.firsts.domain;

import javax.persistence.*;

/**
 * Created by Yuming-Liu
 * 日期： 2018-01-21
 * 时间： 18:41
 */
@Entity
@Table(name = "nodetree")
public class NodeTree {
    @Id
    @GeneratedValue
    private Integer id;
    @Column(name = "PARENT_ID")
    private Integer parentId;
    @Column(name = "NAME")
    private String name;

    public NodeTree() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
