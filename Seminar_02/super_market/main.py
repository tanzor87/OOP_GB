from Classes.market import Market
from Classes.ordinary_client import OrdinaryClient
from Classes.special_client import SpecialClient
from Classes.tax_inspector import TaxInspector


magnit = Market()

client1 = OrdinaryClient("Boris")
client2 = OrdinaryClient("Olga")
client3 = SpecialClient("Prezident", 1)
client4 = TaxInspector()

magnit.acceptToMarket(client1)
magnit.acceptToMarket(client2)
magnit.acceptToMarket(client3)

magnit.update()
