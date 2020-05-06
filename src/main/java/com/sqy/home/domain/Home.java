package com.sqy.home.domain;
/**
 *  房间预定
 * @ClassName: Home 
 * @Description: TODO
 * @author: HUAWEI
 * @date: 2020年5月6日 上午9:12:01
 */

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Home implements Serializable {

	/**
	 * @fieldName: serialVersionUID
	 * @fieldType: long
	 * @Description: TODO
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;
	
	private Date date;
	
	private String name;
	
	private String phone;
	
	private String t_type;
	
	private BigDecimal price;
	
	private String bz;
	
	private int tid;

	public Home(Integer id, Date date, String name, String phone, String t_type, BigDecimal price, String bz, int tid) {
		super();
		this.id = id;
		this.date = date;
		this.name = name;
		this.phone = phone;
		this.t_type = t_type;
		this.price = price;
		this.bz = bz;
		this.tid = tid;
	}

	public int getTid() {
		return tid;
	}

	public void setTid(int tid) {
		this.tid = tid;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
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

	public String getBz() {
		return bz;
	}

	public void setBz(String bz) {
		this.bz = bz;
	}


	public Home() {
		super();
	}

	

	@Override
	public String toString() {
		return "Home [id=" + id + ", date=" + date + ", name=" + name + ", phone=" + phone + ", t_type=" + t_type
				+ ", price=" + price + ", bz=" + bz + ", tid=" + tid + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bz == null) ? 0 : bz.hashCode());
		result = prime * result + ((date == null) ? 0 : date.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((phone == null) ? 0 : phone.hashCode());
		result = prime * result + ((price == null) ? 0 : price.hashCode());
		result = prime * result + ((t_type == null) ? 0 : t_type.hashCode());
		result = prime * result + tid;
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
		Home other = (Home) obj;
		if (bz == null) {
			if (other.bz != null)
				return false;
		} else if (!bz.equals(other.bz))
			return false;
		if (date == null) {
			if (other.date != null)
				return false;
		} else if (!date.equals(other.date))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (phone == null) {
			if (other.phone != null)
				return false;
		} else if (!phone.equals(other.phone))
			return false;
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
		if (tid != other.tid)
			return false;
		return true;
	}
}
