package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService) {
        this.onlinePaymentService = onlinePaymentService;
    }

    public static void processContract(Contract contract, int months) {
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 7, 25), 206.04));
        contract.getInstallments().add(new Installment(LocalDate.of(2018, 8, 25), 208.08));

    }  

    public OnlinePaymentService getOnlinePaymentService() {
        return onlinePaymentService;
    }
}
