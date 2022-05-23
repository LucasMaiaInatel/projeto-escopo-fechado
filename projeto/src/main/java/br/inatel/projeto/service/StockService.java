package br.inatel.projeto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import br.inatel.projeto.dto.StockAndQuotes;
import br.inatel.projeto.entity.Stock;
import br.inatel.projeto.repository.StockRepository;

@Service
@Transactional
public class StockService {
	
	@Autowired
	private StockRepository stockRepository;
	
	public List<StockAndQuotes> findAllStocksAndQuotes() {
		return stockRepository.findAllStocksAndQuotes();
	}
	
//	public List<Stock> findAllQuotesByStockId(String stockId) {
//		return stockRepository.findQuotesByStockId(stockId);
//	}
	
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}
}
