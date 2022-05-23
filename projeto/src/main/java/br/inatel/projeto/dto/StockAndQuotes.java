package br.inatel.projeto.dto;

import java.math.BigDecimal;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class StockAndQuotes {

	private String stockId;
	private LocalDate date;
	private BigDecimal price;
}
