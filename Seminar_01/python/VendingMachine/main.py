import sys
from PyQt5.QtWidgets import QApplication

from typing import List
from Domain.bottle import Bottle
from Domain.product import Product
from Services.coin_dispenser import CoinDispenser
from Services.display import Display
from Services.holder import Holder
from Services.vending_machine import VendingMachine
from Domain.hot_drink import HotDrink
from main_frame import MainFrame


if __name__ == "__main__":
    
    assort: List[Product] = []
    item1 = Product(100, 1, "Lays")
    item2 = Product(50, 2, "Cola")
    item3 = Bottle(150, 3, "Mineral Water", 101, 1.5)
    item4 = Bottle(105, 4, "Cola", 104, 0.5)
    item5 = HotDrink(130, 5, "Сappuccino", 105, 60)
    item6 = HotDrink(95, 6, "Latte", 106, 55)
    item7 = HotDrink(110, 7, "Espresso", 107, 90)

    assort.append(item1)
    assort.append(item2)
    assort.append(item3)
    assort.append(item4)
    assort.append(item5)
    assort.append(item6)
    assort.append(item7)

    hold1 = Holder(4, 4)
    coinDesp = CoinDispenser(0)
    disp = Display()

    venMachine = VendingMachine(hold1, coinDesp, assort, disp)

    for prod in venMachine.getProducts():
        print(prod)


    app = QApplication(sys.argv)
    myFrame = MainFrame()
    myFrame.show()
    sys.exit(app.exec_())

    #print("Hello, World!")