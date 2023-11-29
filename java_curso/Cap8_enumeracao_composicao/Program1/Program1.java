package java_curso.Cap8_enumeracao_composicao.Program1;

import java.util.Date;

public class  Program1 {

    public static void  main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatusenum.PENDING_PAYMENT);
        
        System.out.println(order);

        OrderStatusenum os1 = OrderStatusenum.DELIVERED;
        OrderStatusenum os2 = OrderStatusenum.valueOf("DELIVERED");

        System.out.println(os1);
        System.out.println(os2);


    }
}