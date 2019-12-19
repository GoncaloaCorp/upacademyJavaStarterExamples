package io.altar.jseproject.TISM.States;

import io.altar.jseproject.business.ProductBusiness;
import io.altar.jseproject.textinterface.ScannerUtils.ScannerUtils;

public abstract class State {

	public static final ScannerUtils sc = new ScannerUtils();
	ProductBusiness PB = new ProductBusiness();

	public abstract int run();
}
