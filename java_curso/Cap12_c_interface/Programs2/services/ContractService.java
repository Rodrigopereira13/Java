package java_curso.Cap12_c_interface.Programs2.services;

import java.time.LocalDate;

import java_curso.Cap12_c_interface.Programs2.entities.Contract;
import java_curso.Cap12_c_interface.Programs2.entities.Installment;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }

    public void processContract(Contract contract, int months){

        double basicQuota = contract.getTotalValue() / months; //o valor do contrato

        for (int i = 1; i <= months; i++){
            LocalDate dueDate = contract.getDate().plusMonths(i); //fazendo as parcelas

            double interest = onlinePaymentService.interest(basicQuota, i);//o valor do juros

            double fee = onlinePaymentService.paymentFee(basicQuota + interest);// o valor da taxa

            double quota = basicQuota + interest + fee; //valor total com juros e taxa

            contract.getInstalments().add(new Installment(dueDate, quota));//criando o objeto instanciamento installment em contract
        }
    }
}
