package com.premium.stc.service;

import java.util.List;

import com.premium.stc.model.StockPrice;

public interface StockPriceService {
	public List<StockPrice> getStockPriceCompany(String companyName);
}
