package org.sample.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.Set;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    private Long id;
    private Date submitedTime;

    @ManyToMany
    private Set<Product> products;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getSubmitedTime() {
        return submitedTime;
    }

    public void setSubmitedTime(Date submitedTime) {
        this.submitedTime = submitedTime;
    }

    public Set<Product> getProducts() {
        return products;
    }

    public void setProducts(Set<Product> products) {
        this.products = products;
    }
}
