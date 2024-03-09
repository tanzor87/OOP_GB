package Classes;

import Interface.iActorBehaviour;
import Interface.iReturnOrder;

/**
 * Класс описывает акционного клиента. Класс является наследником класса Actor
 */
public class OfferClient extends Actor implements iActorBehaviour, iReturnOrder {
    /**
     * Поля, укзывающие на отличие от класса Actor
     * nameOffer - название акции
     * idOffer - id акционного клиента, генерируется автоматически
     * numbersClientOffer - количество участников акции
     */
    private String nameOffer;
    private int idOffer;
    private static int generalIdOffer = 1;
    private static int numbersClientOffer;


    public OfferClient(String name) {
        super(name);
        this.idOffer = generalIdOffer;
        generalIdOffer++;
    }

    /**
     * Метод для получения колличества участников акции
     * @return колличество участников акции
     */
    public static int getNumbersClientOffer() {
        return numbersClientOffer;
    }

    /**
     * Метод устагавливает колличество участников акции
     * @param numbersClientOffer колличество участников акции
     */
    public static void setNumbersClientOffer(int numbersClientOffer) {
        OfferClient.numbersClientOffer = numbersClientOffer;
    }

    /**
     * Метод получения ID покупателя
     * @return ID покупателя
     */
    public int getIdOffer() {
        return idOffer;
    }

    /**
     * Метод получает название акции
     * @return имя акции
     */
    public String getNameOffer() {
        return nameOffer;
    }

    /**
     * Метод устанавливает название акции
     * @param nameOffer название акции
     */
    public void setNameOffer(String nameOffer) {
        this.nameOffer = nameOffer;
    }

    /**
     *Метод получения имени покупателя
     * @return имя покупателя
     */
    @Override
    public String getName() {
        return super.name;
    }

    /**
     * Метод устанавливает имя покупателя
     * @param name имя покупателя
     */
    @Override
    public void setName(String name) {
        super.name = name;
    }

    /**
     * Метод состояния получения товара
     * @return получил или не получил товар покупатель
     */
    @Override
    public boolean isTakeOrder() {
        return super.isTakeOrder;
    }

    /**
     * Метод состояния заказа покупателя
     * @return сделал или не сделал заказ покупатель
     */
    @Override
    public boolean isMakeOrder() {
        return super.isMakeOrder;
    }

    /**
     * Метод установки получения заказа
     * @param value переменная получения заказа, получет или не получен товар покупателем
     */
    @Override
    public void setTakeOrder(boolean value) {
        this.isTakeOrder = value;
    }

    /**
     * Метод установки сделанного заказа покупателем
     * @param value переменная состояния заказа, сделан или не сделан заказ покупателем
     */
    @Override
    public void setMakeOrder(boolean value) {
        this.isMakeOrder = value;
    }

    /**
     * Метод получения экземпляра акционного клиента
     * @return экземпляр акционного клиента
     */
    public Actor getActor() {
        return this;
    }

    /**
     * Метод показывает, является ли покупатель участником акции
     */
    public void participateOffer() {
        if (this.idOffer < numbersClientOffer + 1) {
            System.out.println(
                    "Покупатель " + super.name +
                    " с номером: " + this.idOffer +
                    " участвует в акции: " + this.nameOffer
                    );
        } else {
            System.out.println(
                    "Покупатель " + super.name +
                            " с номером: " + this.idOffer +
                            " не участвует в акции: " + this.nameOffer
            );
        }
    }

    /**
     * Метод постановки покупателя в очередь для возврата товара
     * @param actor покупатель возвращающий товар
     */
    @Override
    public void takeInQueue(iActorBehaviour actor) {

    }

    /**
     * Метод выхода покупателя из очереди
     */
    @Override
    public void releaseFromQueue() {

    }

    /**
     * метод возврата товара покупателем в магазин
     */
    @Override
    public void returnOrder() {

    }
}
