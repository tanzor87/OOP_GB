package Interface;

/**
 * Интерфейс возврата товара покупателем в магазин
 */
public interface iReturnOrder {
    /**
     * Метод постановки покупателя в очередь для возврата товара
     * @param actor покупатель возвращающий товар
     */
    public void takeInQueue(iActorBehaviour actor);

    /**
     * Метод выхода покупателя из очереди
     */
    public void releaseFromQueue();

    /**
     * метод возврата товара покупателем в магазин
     */
    public void returnOrder();

}
