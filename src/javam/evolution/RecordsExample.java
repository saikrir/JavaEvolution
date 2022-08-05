package javam.evolution;

import java.util.List;

public class RecordsExample {
	
	private static int price(String ticker) {
		return (int)(Math.random()*1000);
	}
	
	private static void processStock(List<String> tickers) {
		
		record Stock(String ticker, int price) {
			
			public Stock{
				ticker = ticker.toUpperCase();
			}
			
			
			public String toString() {
				return """
						Ticker[ %s ] -----> $%d\
						""".formatted(this.ticker, this.price);
			}
		};
		
		tickers.stream()
		.map(t -> new Stock(t,  price(t)))
		.forEach(t -> System.out.println(t));
		
	}
	
	public static void main(String[] args) {
		List<String> tickers = List.of("msft","amzn","goog","meta","nflx"); 
		processStock(tickers);
	}

}
