package br.inatel.projeto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.inatel.projeto.dto.StockAndQuotes;
import br.inatel.projeto.entity.Stock;

public interface StockRepository extends JpaRepository<Stock, String> {

	@Query("SELECT new br.inatel.projeto.dto.StockAndQuotes(s.stockId, q.date, q.price) FROM Stock s LEFT JOIN s.quotes q")
	public List<StockAndQuotes> findAllStocksAndQuotes();
	
	//public List<Quotes> findQuotesByStockId(String stockId);

}
