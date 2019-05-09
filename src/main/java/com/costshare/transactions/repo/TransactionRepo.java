package com.costshare.transactions.repo;

import com.costshare.transactions.model.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TransactionRepo extends CrudRepository<Transaction, Long> {
}
