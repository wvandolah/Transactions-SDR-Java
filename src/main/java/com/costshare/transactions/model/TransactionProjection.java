package com.costshare.transactions.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "transactionProjection" , types = Transaction.class)
public interface TransactionProjection {
    Person getPerson();
    String getDescription();
    double getAmount();
    long getDate();
}
