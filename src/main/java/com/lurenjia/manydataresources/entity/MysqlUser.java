package com.lurenjia.manydataresources.entity;


import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author yanggt
 * @date 18-12-3
 */
@Entity
@Getter
@Setter
@Table(name = "MYSQLUSER")
public class MysqlUser {
    @Column(name = "ID")
    @Id
    private int id;
    @Column(name = "NAME")
    private String name;

    @Override
    public String toString() {
        return "MysqlUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
