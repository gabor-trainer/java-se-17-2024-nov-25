package com.example;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

public class MyListTest {

    // A method to provide an instance of MyList
    private static MyList createSut() {
        return new NaiveMyList();
    }

    @ParameterizedTest
    @CsvSource({
            "0, TestValue1",
    })
    void testAppendAndGet(int index, String value) {
        MyList myList = createSut();
        myList.append(value);
        assertEquals(value, myList.get(index));
    }

    @ParameterizedTest
    @CsvSource({
            "0, InsertValue1",
            "1, InsertValue2"
    })
    void testInsertAndGet(int index, String value) {
        MyList myList = createSut();
        myList.append("InitialValue1"); // To avoid IndexOutOfBounds
        myList.append("InitialValue2"); // To avoid IndexOutOfBounds
        myList.insert(index, value);
        Object object = myList.get(index);
        assertEquals(value, object);
    }

    @ParameterizedTest
    @CsvSource({
            "0, SetValue1",
            "1, SetValue2"
    })
    void testSetAndGet(int index, String value) {
        MyList myList = createSut();
        myList.append("InitialValue1");
        myList.append("InitialValue2");
        myList.set(index, value);
        assertEquals(value, myList.get(index));
    }

    @ParameterizedTest
    @CsvSource({
            "1, 1", // Start with 1 item and check length 1
            "2, 2" // Append 2 items and check length 2
    })
    void testAppendAndGetLength(int numAppends, int expectedLength) {
        MyList myList = createSut();
        for (int i = 0; i < numAppends; i++) {
            myList.append("Value" + i);
        }
        assertEquals(expectedLength, myList.getLength());
    }

    @ParameterizedTest
    @CsvSource({
            "0", "1"
    })
    void testRemove(int indexToRemove) {
        MyList myList = createSut();
        myList.append("Value0");
        myList.append("Value1");
        myList.append("Value2");
        Object removedValue = myList.get(indexToRemove);
        myList.remove(indexToRemove);
        assertNotEquals(removedValue, myList.get(indexToRemove % myList.getLength()));
    }

    @ParameterizedTest
    @MethodSource("provideListsForGetLength")
    void testGetLengthWithMultipleOperations(String[] operations, int expectedLength) {
        MyList myList = createSut();
        for (String operation : operations) {
            switch (operation) {
                case "append":
                    myList.append("Value");
                    break;
                case "remove":
                    if (myList.getLength() > 0) {
                        myList.remove(0);
                    }
                    break;
                default:
                    break;
            }
        }
        assertEquals(expectedLength, myList.getLength());
    }

    static Stream<Object[]> provideListsForGetLength() {
        return Stream.of(
                new Object[] { new String[] { "append", "append", "remove" }, 1 },
                new Object[] { new String[] { "append", "remove", "remove" }, 0 });
    }
}
