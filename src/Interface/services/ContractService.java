package Interface.services;

import java.time.LocalDate;

import Interface.entities.Contract;
import Interface.entities.Installment;

public class ContractService {
	
	private OnlinePaymentService onlinePaymentService;

	
	public ContractService(OnlinePaymentService onlinePaymentService) {
		this.onlinePaymentService = onlinePaymentService;
	}
	
	public void processContract(Contract contract, int months) {
	
		double basicQuoota = contract.getValue() / months;
		
		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);
			
			double interest = onlinePaymentService.interest(basicQuoota, i);
			
			double fee = onlinePaymentService.paymentFee(basicQuoota + interest);
			
			double quota = basicQuoota + interest + fee;
			
			contract.getInstallments().add(new Installment(dueDate, quota));
			
			
		}
	}

}
