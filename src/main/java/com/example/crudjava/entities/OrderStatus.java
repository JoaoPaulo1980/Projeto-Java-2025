package com.example.crudjava.entities;

//tipo enumerado por conversão  no java é maiusculas
public enum OrderStatus {
    //aguardando pagt,pago,enviado,entregue, e canceladp
    WAITING_PAYMENT, PAID,SHIPPED, DELIVERED,CANCELED;

}
