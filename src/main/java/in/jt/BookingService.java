package in.jt;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookingService {

	@Autowired
	private StockService stockService;
	
	@Autowired
	private DeliveryService deliveryService;
	
	@Autowired
	private PaymentService paymentService;
	
	public void doBooking() {
		if(stockService.haveStocks()) {
			if(deliveryService.canDeliver()) {
				String doneOrNot = paymentService.doPayment();
				System.out.println(doneOrNot);
			}
		}
				
	}
}
