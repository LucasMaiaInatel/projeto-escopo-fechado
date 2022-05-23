package br.inatel.projeto.service;

import java.util.List;
import java.util.Optional;

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
		List<StockAndQuotes> findAllStocksAndQuotes = stockRepository.findAllStocksAndQuotes();
		return findAllStocksAndQuotes;
	}
	
	public Optional<Stock> findQuotesById(String id) {
		Optional<Stock> findQuotesById = stockRepository.findById(id);
		findQuotesById.get().getQuotes().size();
		return findQuotesById;
	}
	
	public Stock saveStock(Stock stock) {
		return stockRepository.save(stock);
	}
}
