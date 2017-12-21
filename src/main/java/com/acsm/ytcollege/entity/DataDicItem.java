package com.acsm.ytcollege.entity;// default package
// Generated 2017-12-19 15:31:33 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * DataDicItem generated by hbm2java
 */
@Entity
@Table(name = "data_dic_item", catalog = "yt_college")
public class DataDicItem implements java.io.Serializable {

	private Integer id;
	private Integer dicId;
	private Integer dicItemId;
	private String dicItemName;

	public DataDicItem() {
	}

	public DataDicItem(Integer dicId, Integer dicItemId, String dicItemName) {
		this.dicId = dicId;
		this.dicItemId = dicItemId;
		this.dicItemName = dicItemName;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@Column(name = "dic_id")
	public Integer getDicId() {
		return this.dicId;
	}

	public void setDicId(Integer dicId) {
		this.dicId = dicId;
	}

	@Column(name = "dic_item_id")
	public Integer getDicItemId() {
		return this.dicItemId;
	}

	public void setDicItemId(Integer dicItemId) {
		this.dicItemId = dicItemId;
	}

	@Column(name = "dic_item_name")
	public String getDicItemName() {
		return this.dicItemName;
	}

	public void setDicItemName(String dicItemName) {
		this.dicItemName = dicItemName;
	}

}
