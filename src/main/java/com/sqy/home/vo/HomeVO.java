package com.sqy.home.vo;

import java.math.BigDecimal;
import java.util.Date;

import com.sqy.home.domain.Home;
/**
 * 	条件查询VO类
 * @ClassName: HomeVO 
 * @Description: TODO
 * @author: HUAWEI
 * @date: 2020年5月6日 上午11:54:34
 */
public class HomeVO extends Home {

	private BigDecimal p1;
	private BigDecimal p2;
	
	private Date d1;
	private Date d2;
	public BigDecimal getP1() {
		return p1;
	}
	public void setP1(BigDecimal p1) {
		this.p1 = p1;
	}
	public BigDecimal getP2() {
		return p2;
	}
	public void setP2(BigDecimal p2) {
		this.p2 = p2;
	}
	public Date getD1() {
		return d1;
	}
	public void setD1(Date d1) {
		this.d1 = d1;
	}
	public Date getD2() {
		return d2;
	}
	public void setD2(Date d2) {
		this.d2 = d2;
	}
	
	

}
