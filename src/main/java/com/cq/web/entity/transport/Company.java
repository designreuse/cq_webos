package com.cq.web.entity.transport;

import com.cq.web.entity.BaseEntity;

import javax.persistence.*;
import java.util.Set;

/**
 * @Author Celine Q
 * @Create 19/10/2018 10:30 AM
 **/
@Entity
@Table(name = "t_company")
public class Company extends BaseEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    /**
     * 公司名
     */
    private String name;

    /**
     * 英文名
     */
    private String eName;

    /**
     * 公司地址
     */
    private String address;

    /**
     * 公司联系人
     */
    @OneToMany
    @JoinTable(name = "t_company_contact", joinColumns = {@JoinColumn(name = "company_id")}, inverseJoinColumns = {@JoinColumn(name = "contact_id")})
    private Set<Passenger> contacts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Set<Passenger> getContacts() {
        return contacts;
    }

    public void setContacts(Set<Passenger> contacts) {
        this.contacts = contacts;
    }

    @Override
    public String toString() {
        return "Company{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", eName='" + eName + '\'' +
                ", address='" + address + '\'' +
                ", contacts=" + contacts +
                '}';
    }
}
