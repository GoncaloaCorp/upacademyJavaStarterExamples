package io.altar.jseproject.praticaMysql.models;

import java.util.ArrayList;
import java.util.List;

public class ProductDTO {

	private List<Long> shelfIds = new ArrayList<Long>();
	private int discount;
	private int iva;
	private float pvp;

	public ProductDTO() {
	}

	public ProductDTO(List<Long> shelfIds, int discount, int iva, float pvp) {
		this.shelfIds = shelfIds;
		this.discount = discount;
		this.iva = iva;
		this.pvp = pvp;
	}

//	SHELVES
	public List<Long> getShelfIds() {
		return shelfIds;
	}

	public void setShelfIds(List<Long> shelfIds) {
		this.shelfIds = shelfIds;
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
