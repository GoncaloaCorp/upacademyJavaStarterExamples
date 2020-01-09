package io.altar.jseproject.praticaMysql.models.DTOs;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

	private List<Long> shelvesIds = new ArrayList<Long>();
	private int discount;
	private int iva;
	private float pvp;

	public ProductDTO() {
	}

	public ProductDTO(List<Long> shelvesIds, int discount, int iva, float pvp) {
		this.shelvesIds = shelvesIds;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}

//	SHELVES
	public List<Long> getShelfIds() {
		return shelvesIds;
	}

	public void setShelfIds(List<Long> shelvesIds) {
		this.shelvesIds = shelvesIds;
	}

//	DISCOUNT
	public int getDiscount() {
		return discount;
	}

	public void setDiscount(int discount) {
		this.discount = discount;
	}

//	IVA
	public int getIva() {
		return iva;
	}

	public void setIva(int iva) {
		this.iva = iva;
	}

//	PVP
	public float getPvp() {
		return pvp;
	}

	public void setPvp(float pvp) {
		this.pvp = pvp;
	}
}
