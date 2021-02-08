package ru.netology.manager;

import org.junit.jupiter.api.Test;
import ru.netology.domain.PosterItem;

import static org.junit.jupiter.api.Assertions.*;

class CartManagerTest {
    @Test
    public void shouldDisplayLast10Films() {
        CartManager manager = new CartManager();

        PosterItem first = new PosterItem(1, 1654, "ALF", "comedy", 1);
        PosterItem second = new PosterItem(2, 5672, "Tangled ", "horror", 1);
        PosterItem third = new PosterItem(3, 3564, "The Holiday", "thriller", 1);
        PosterItem fourth = new PosterItem(4, 1234, "The Lion King", "comedy", 1);
        PosterItem fifth = new PosterItem(5, 58712, "Lost", "horror", 1);
        PosterItem sixth = new PosterItem(6, 9944, "Matrix", "thriller", 1);
        PosterItem seventh = new PosterItem(7, 1434, "The King's Speech", "comedy", 1);
        PosterItem eighth  = new PosterItem(8, 8467, "Sherlock", "horror", 1);
        PosterItem ninth = new PosterItem(9, 2224, "Girls", "thriller", 1);
        PosterItem tenth  = new PosterItem(10, 8256, "The Terminal", "comedy", 1);
        PosterItem eleventh  = new PosterItem(11, 1532, "The Jungle Book", "horror", 1);
        PosterItem twelve  = new PosterItem(12, 1789, "Forrest Gump", "thriller", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth, ninth, eighth, seventh, sixth, fifth, fourth, third};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDisplayLastFilmsLess10() {
        CartManager manager = new CartManager();

        PosterItem first = new PosterItem(1, 1654, "ALF", "comedy", 1);
        PosterItem second = new PosterItem(2, 5672, "Tangled ", "horror", 1);
        PosterItem third = new PosterItem(3, 3564, "The Holiday", "thriller", 1);
        PosterItem fourth = new PosterItem(4, 1234, "The Lion King", "comedy", 1);


        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{fourth, third, second, first};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldDisplay3FilmsFromAll() {
        CartManager manager = new CartManager(3);

        PosterItem first = new PosterItem(1, 1654, "ALF", "comedy", 1);
        PosterItem second = new PosterItem(2, 5672, "Tangled ", "horror", 1);
        PosterItem third = new PosterItem(3, 3564, "The Holiday", "thriller", 1);
        PosterItem fourth = new PosterItem(4, 1234, "The Lion King", "comedy", 1);
        PosterItem fifth = new PosterItem(5, 58712, "Lost", "horror", 1);
        PosterItem sixth = new PosterItem(6, 9944, "Matrix", "thriller", 1);
        PosterItem seventh = new PosterItem(7, 1434, "The King's Speech", "comedy", 1);
        PosterItem eighth  = new PosterItem(8, 8467, "Sherlock", "horror", 1);
        PosterItem ninth = new PosterItem(9, 2224, "Girls", "thriller", 1);
        PosterItem tenth  = new PosterItem(10, 8256, "The Terminal", "comedy", 1);
        PosterItem eleventh  = new PosterItem(11, 1532, "The Jungle Book", "horror", 1);
        PosterItem twelve  = new PosterItem(12, 1789, "Forrest Gump", "thriller", 1);

        manager.add(first);
        manager.add(second);
        manager.add(third);
        manager.add(fourth);
        manager.add(fifth);
        manager.add(sixth);
        manager.add(seventh);
        manager.add(eighth);
        manager.add(ninth);
        manager.add(tenth);
        manager.add(eleventh);
        manager.add(twelve);

        manager.getAll();

        PosterItem[] actual = manager.getAll();
        PosterItem[] expected = new PosterItem[]{twelve, eleventh, tenth};

//    assertEquals(expected, actual);
        assertArrayEquals(expected, actual);
    }


}