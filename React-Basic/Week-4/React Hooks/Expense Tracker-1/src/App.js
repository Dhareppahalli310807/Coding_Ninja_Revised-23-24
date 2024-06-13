import "./App.css";
import React, { useState } from "react";
import ExpenseForm from "./components/ExpenseForm/ExpenseForm";
import ExpenseInfo from "./components/ExpenseInfo/ExpenseInfo";
import ExpenseList from "./components/ExpenseList/ExpenseList";

const App = () => {
  const [transactions, setTransactions] = useState([]);

  const addTransaction = (transaction) => {
    setTransactions([...transactions, { ...transaction, id: Date.now() }]);
  };

  const deleteTransaction = (index) => {
    setTransactions(transactions.filter((_, i) => i !== index));
  };

  const editTransaction = (index) => {
    // Logic to edit a transaction
  };

  const calculateBalance = () => {
    const amounts = transactions.map(transaction => transaction.amount);
    return amounts.reduce((acc, item) => (acc += item), 0).toFixed(2);
  };

  const calculateIncome = () => {
    const amounts = transactions.map(transaction => transaction.amount);
    return amounts
      .filter(item => item > 0)
      .reduce((acc, item) => (acc += item), 0)
      .toFixed(2);
  };

  const calculateExpense = () => {
    const amounts = transactions.map(transaction => transaction.amount);
    return amounts
      .filter(item => item < 0)
      .reduce((acc, item) => (acc += item), 0)
      .toFixed(2);
  };

  return (
    <>
      <h2 className="mainHeading">Expense Tracker</h2>
      <div className="App">
        <ExpenseForm onAddTransaction={addTransaction} />
        <div className="expenseContainer">
          <ExpenseInfo
            balance={calculateBalance()}
            income={calculateIncome()}
            expense={calculateExpense()}
          />
          <ExpenseList
            transactions={transactions}
            onDeleteTransaction={deleteTransaction}
            onEditTransaction={editTransaction}
          />
        </div>
      </div>
    </>
  );
};

export default App;
