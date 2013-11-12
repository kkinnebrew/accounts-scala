package com.orangelit.accounting.models

class AccountType(val accountId: Int, var accountTypeId: String, var direction: Short) {

  override def toString(): String = {
    "{ accountId: " + accountId +
    ", accountTypeId: " + accountTypeId +
    ", direction: " + direction + " }"
  }

}