package java_curso.c_interface.Programs2.services;

public interface OnlinePaymentService {

    double paymentFee(double amount);
    double interest(double amount, int months);    
} 

