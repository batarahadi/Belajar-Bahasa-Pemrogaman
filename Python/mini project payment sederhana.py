from abc import ABC, abstractmethod

class PaymentMethod(ABC):
    @abstractmethod
    def pay(self, amount):
        pass

class CreditCard(PaymentMethod):
    def pay(self, amount):
        return f"Bayar {amount} pakai kartu kredit"

class EWallet(PaymentMethod):
    def pay(self, amount):
        return f"Bayar {amount} pakai e-wallet"

print("aku")