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
@Table(name = "DMUSER")
@Getter
@Setter
@Entity
public class DMUser {
    @Column(name = "ID")
    @Id
    private int id;
    @Column(name = "NAME")
    private String name;

    @Override
    public String toString() {
        return "DMUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
