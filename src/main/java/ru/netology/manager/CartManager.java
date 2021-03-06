package ru.netology.manager;

import ru.netology.domain.PosterItem;

public class CartManager {
    private PosterItem[] items = new PosterItem[0];

    private int limitPosterItem = 10;

    public CartManager() {
    }    public CartManager(int limitPosterItem) {
        this.limitPosterItem = limitPosterItem;
    }




    public void add(PosterItem item) {
        // создаём новый массив размером на единицу больше
        int length = items.length + 1;
        PosterItem[] tmp = new PosterItem[length];
        // itar + tab
        // копируем поэлементно
        System.arraycopy(items, 0, tmp, 0, items.length);
        // }
//        System.arraycopy(items, 0, tmp, 0, items.length);
        // кладём последним наш элемент
        int lastIndex = tmp.length - 1;
        tmp[lastIndex] = item;
        items = tmp;
    }

    public PosterItem[] getAll() {
        PosterItem[] result;
        if (items.length > limitPosterItem) {
            result = new PosterItem[limitPosterItem];
        }
        else {
            result = new PosterItem [items.length];
        }

        // перебираем массив в прямом порядке
        // но кладём в результаты в обратном
        for (int i = 0; i < result.length; i++) {
            int index = items.length - i - 1;
            result[i] = items[index];
        }
        return result;
    }

    // наивная реализация

}