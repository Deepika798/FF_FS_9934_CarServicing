package com.hcl.springmvc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Range;

/**
 * @author lingad2
 *
 */
@Entity
@Table(name = "role")
public class Role {
	@Id
	@Column(name = "Id")
	@Range(min = 1)
	@NotEmpty
	private int id;
	@Column
	@NotEmpty
	private String name;

	/**
	 * 
	 */
	public Role() {
		super();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 *            the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public @NotEmpty String getName() {
		return name;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(@NotEmpty String name) {
		this.name = name;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Role [id=" + id + ", name=" + name + "]";
	}
	

}
