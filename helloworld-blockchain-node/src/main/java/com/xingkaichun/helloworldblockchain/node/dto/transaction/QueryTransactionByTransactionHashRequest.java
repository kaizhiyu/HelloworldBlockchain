package com.xingkaichun.helloworldblockchain.node.dto.transaction;

/**
 *
 * @author 邢开春 微信HelloworldBlockchain 邮箱xingkaichun@qq.com
 */
public class QueryTransactionByTransactionHashRequest {

    private String transactionHash;




    //region get set

    public String getTransactionHash() {
        return transactionHash;
    }

    public void setTransactionHash(String transactionHash) {
        this.transactionHash = transactionHash;
    }

    //endregion
}