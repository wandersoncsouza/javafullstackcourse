package service;
import java.util.Calendar;
import java.util.Date;

import entities.Contract;
import entities.Installments;

public class ContractService {
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    public  void processContract(Contract contract, int months){
        // Faz a divisão do valor total da dívvida pelas quantidades de meses
        double basicQuota = contract.getTotalValue() / months;
        for(int i =1; i<= months; i++){
            double updatedQuota = basicQuota + onlinePaymentService.interest(basicQuota, i);
            double fullQuota = updatedQuota + onlinePaymentService.paymentFee(updatedQuota);
            // Captura a data do contrato (contract.getDate()), e adiciona o mes (addMonths(*, i)))
            Date dueDate = addMonths(contract.getDate(), i);
            // Adicionar ao contrato uma nova instancia
            contract.getInstallments().add(new Installments(dueDate, fullQuota));
        }
    }

    private Date addMonths(Date date, int N){
        Calendar calendar = Calendar.getInstance();     // instanciando o calendário
        calendar.setTime(date);                         // Setando a data no calendar
        calendar.add(Calendar.MONTH, N);                // Adicionar meses ao valor do calendario setado
        return calendar.getTime();                      // Retornando o valor da data alterado
    }
}
