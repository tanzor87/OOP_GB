from Classes.actor import Actor


class OfferClient(Actor):

    def __init__(self, name: str, name_offer: str, id: int, numbersClientOffer: str):
        super().__init__(name)
        self.nameOffer = name_offer
        self.idOffer = id
        self.numbersClientOffer = numbersClientOffer

    def getName(self):
        return super().getName()

    def setName(self, name):
        super().name = name

    def isTakeOrder(self):
        return super().getTakeOrder()

    def setTakeOrder(self, takenOrder):
        super().setTakeOrder(takenOrder)

    def isMakeOrder(self):
        return super().getMakeOrder()

    def setMakeOrder(self, makeOrder):
        super().setMakeOrder(makeOrder)

    def getActor(self) -> str:
        return self.getName()