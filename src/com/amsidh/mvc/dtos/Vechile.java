/**
 * 
 */
package com.amsidh.mvc.dtos;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author VIRU
 * 
 */
@Entity
@Table(name = "VECHILEDETAILS")
public class Vechile implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3922412346919649468L;

	@Id
	@GeneratedValue
	@Column(name = "VECHILE_ID")
	private Integer vechileId;

	@Column(name = "VECHILE_TYPE")
	private String vechileType;

	@Column(name = "VECHILE_NUMBER")
	private String vechileNumber;

	/**
	 * 
	 */
	public Vechile() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param vechileType
	 * @param vechileNumber
	 */
	public Vechile(String vechileType, String vechileNumber) {
		super();
		this.vechileType = vechileType;
		this.vechileNumber = vechileNumber;
	}

	/**
	 * @return the vechileId
	 */
	public Integer getVechileId() {
		return vechileId;
	}

	/**
	 * @param vechileId
	 *            the vechileId to set
	 */
	public void setVechileId(Integer vechileId) {
		this.vechileId = vechileId;
	}

	/**
	 * @return the vechileType
	 */
	public String getVechileType() {
		return vechileType;
	}

	/**
	 * @param vechileType
	 *            the vechileType to set
	 */
	public void setVechileType(String vechileType) {
		this.vechileType = vechileType;
	}

	/**
	 * @return the vechileNumber
	 */
	public String getVechileNumber() {
		return vechileNumber;
	}

	/**
	 * @param vechileNumber
	 *            the vechileNumber to set
	 */
	public void setVechileNumber(String vechileNumber) {
		this.vechileNumber = vechileNumber;
	}

}
