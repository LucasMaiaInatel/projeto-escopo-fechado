package br.inatel.projeto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.inatel.projeto.dto.StockAndQuotes;
import br.inatel.projeto.entity.Stock;
import br.inatel.projeto.service.StockService;

@RestController
@RequestMapping("/stocks")
public class StockController {
	
	@Autowired
	private StockService stockService;
	
	@GetMapping
	public List<StockAndQuotes> findAllStocks() {
		return stockService.findAllStocksAndQuotes();
	}

//	@GetMapping("/{stockId}")
//	public List<Stock> findAllQuotesByStockId(@PathVariable String stockId) {
//		return stockService.findAllQuotesByStockId(stockId);
//	}
	
	@PostMapping
	public Stock saveStock(@RequestBody Stock newstock) {
		Stock createdStock = stockService.saveStock(newstock);
		return createdStock;
	}
}