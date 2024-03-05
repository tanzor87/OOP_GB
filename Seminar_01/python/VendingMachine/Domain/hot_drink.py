from VendingMachine.Domain.product import Product


class HotDrink(Product):
    def __init__(self, price, place, name, id, temperature):
        super().__init__(price, place, name, id)
        self.temperature = temperature

    def get_temperature(self):
        return self.temperature

    def set_temperature(self, temperature):
        self.temperature = temperature

    def __str__(self):
        return super().__str__() + \
               "Temperature = " + str(self.temperature) + "°C" + "\n"
