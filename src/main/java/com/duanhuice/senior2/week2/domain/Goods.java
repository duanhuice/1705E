/**   
 * Copyright © 2019 公司名. All rights reserved.
 * 
 * @Title: Goods.java 
 * @Prject: duanhuice-senior2-week2
 * @Package: com.duanhuice.senior2.week2 
 * @Description: TODO
 * @author: Administrator
 * @date: 2019年10月14日 上午9:02:35 
 * @version: V1.0   
 */
package com.duanhuice.senior2.week2.domain;

import java.io.Serializable;
import java.math.BigDecimal;

/** 
 * @ClassName: Goods 
 * @Description: TODO
 * @author:Administrator
 * @date: 2019年10月14日 上午9:02:35  
 */
public class Goods  implements Serializable{

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = -4161923184027730245L;
  
	private  Integer  id;//商品编号
	private  String  name;//商品名称
	private   BigDecimal  monkey;//商品价格
	private   String  bf;//商品百分比
	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the monkey
	 */
	public BigDecimal getMonkey() {
		return monkey;
	}
	/**
	 * @param monkey the monkey to set
	 */
	public void setMonkey(BigDecimal monkey) {
		this.monkey = monkey;
	}
	/**
	 * @return the bf
	 */
	public String getBf() {
		return bf;
	}
	/**
	 * @param bf the bf to set
	 */
	public void setBf(String bf) {
		this.bf = bf;
	}
	/** 
	 * @Title:Goods
	 * @Description:TODO 
	 * @param id
	 * @param name
	 * @param monkey
	 * @param bf 
	 */
	public Goods(Integer id, String name, BigDecimal monkey, String bf) {
		super();
		this.id = id;
		this.name = name;
		this.monkey = monkey;
		this.bf = bf;
	}
	/** 
	 * @Title:Goods
	 * @Description:TODO  
	 */
	public Goods() {
		super();
	}
	/* (non Javadoc) 
	 * @Title: hashCode
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#hashCode() 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bf == null) ? 0 : bf.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((monkey == null) ? 0 : monkey.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	/* (non Javadoc) 
	 * @Title: equals
	 * @Description: TODO
	 * @param obj
	 * @return 
	 * @see java.lang.Object#equals(java.lang.Object) 
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Goods other = (Goods) obj;
		if (bf == null) {
			if (other.bf != null)
				return false;
		} else if (!bf.equals(other.bf))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (monkey == null) {
			if (other.monkey != null)
				return false;
		} else if (!monkey.equals(other.monkey))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	/* (non Javadoc) 
	 * @Title: toString
	 * @Description: TODO
	 * @return 
	 * @see java.lang.Object#toString() 
	 */
	@Override
	public String toString() {
		return "Goods [id=" + id + ", name=" + name + ", monkey=" + monkey + ", bf=" + bf + "]";
	}
	
	
	
	
}
