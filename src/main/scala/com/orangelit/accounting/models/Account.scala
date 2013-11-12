package com.orangelit.accounting.models

class Account(val accountId: Int, var accountType: AccountType) {

  override def toString(): String = {
    "{ accountId: " + accountId +
    ", accountType: " + accountType.toString + " }"
  }

}