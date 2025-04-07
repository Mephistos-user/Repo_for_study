<?php
class BankAccount {
    private $accountNumber;
    private $balance;

    public function __construct($accountNumber) {
        $this->accountNumber = $accountNumber;
        $this->balance = 0;
    }
    public function deposit($amount) {
        $this->balance += $amount;
    }
    public function withdraw($amount) {
        if ($amount <= $this->balance) {
            $this->balance -= $amount;
        } else {
            echo "Insufficient funds.";
        }
    }
    public function getBalance() {
        return $this->balance;
    }
}
$account = new BankAccount("123456789");
$account->deposit(1000);
$account->withdraw(500);
echo $account->getBalance(); // Выводит "500"