import React from "react";
import styles from "./ExpenseList.module.css";
import Transaction from "../Transaction/Transaction";

const ExpenseList = ({ transactions, onDeleteTransaction, onEditTransaction }) => {
  return (
    <div className={styles.expenseListContainer}>
      <h3>Transactions</h3>
      <ul className={styles.transactionList}>
        {transactions.map((expense, index) => (
          <Transaction
            key={expense.id}
            index={index}
            expense={expense}
            onDeleteTransaction={onDeleteTransaction}
            onEditTransaction={onEditTransaction}
          />
        ))}
      </ul>
    </div>
  );
};

export default ExpenseList;
