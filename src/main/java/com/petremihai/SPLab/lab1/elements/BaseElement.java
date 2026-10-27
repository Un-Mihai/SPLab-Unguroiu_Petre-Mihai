package com.petremihai.SPLab.lab1.elements;

import com.petremihai.SPLab.lab1.Element;
import jakarta.persistence.*;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class BaseElement implements Element {
    @Id
    @GeneratedValue
    private Integer id;

    public Integer getId() { return id; }
}
