package com.orangelit.accounting.models

class TransactionLine(val transactionLineId: Int, var account: Account, var debitAmount: Long = 0, var creditAmount: Long = 0) {

  override def toString(): String = {
    "{ transactionLineId: " + transactionLineId +
    ", account: " + account.toString() +
    ", debitAmount: " + debitAmount +
    ", creditAmount: " + creditAmount + " }"
  }

}
