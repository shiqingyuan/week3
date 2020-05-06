package com.sqy.home.domain;

import java.io.Serializable;
import java.math.BigDecimal;
import java.math.BigInteger;
/**
 * 
 * @ClassName: HomeType 
 * @Description: 房间类型实体类
 * @author: HUAWEI
 * @date: 2020年5月6日 上午9:11:37
 */
public class HomeType implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private BigInteger tid;
	
	private String t_type;
	
	private BigDecimal price;

	public BigInteger getTid() {
		return tid;
	}

	public void setTid(BigInteger tid) {
		this.tid = tid;
	}

	public String getT_type() {
		return t_type;
	}

	public void setT_type(String t_type) {
		this.t_type = t_type;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public HomeType(BigInteger tid, String t_type, BigDecimal price) {
		super();
		this.tid = tid;
		this.t_type = t_type;
		this.price = price;
	}

	public HomeType() {
		super();
	}

	@Override
	public String toString() {
		return "HomeType [tid=" + tid + ", t_type=" + t_type + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((t_type == null) ? 0 : t_type.hashCode());
		result = prime * result + ((tid == null) ? 0 : tid.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HomeType other = (HomeType) obj;
		if (price == null) {
			if (other.price != null)
				return false;
		} else if (!price.equals(other.price))
			return false;
		if (t_type == null) {
			if (other.t_type != null)
				return false;
		} else if (!t_type.equals(other.t_type))
			return false;
		if (tid == null) {
			if (other.tid != null)
				return false;
		} else if (!tid.equals(other.tid))
			return false;
		return true;
	}
	
	
	
}
