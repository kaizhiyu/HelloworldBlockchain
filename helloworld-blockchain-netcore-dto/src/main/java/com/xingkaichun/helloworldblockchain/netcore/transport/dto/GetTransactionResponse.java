package com.xingkaichun.helloworldblockchain.netcore.transport.dto;

/**
 *
 * @author 邢开春 409060350@qq.com
 */
public class GetTransactionResponse {

    private TransactionDTO transaction;

    public TransactionDTO getTransaction() {
        return transaction;
    }

    public void setTransaction(TransactionDTO transaction) {
        this.transaction = transaction;
    }
}