package com.codecool;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class HashTableTest {

    @Test
    public void shouldAddElement() {
        HashTable hashTable = new HashTable(10, new BetterStringHasher());
        hashTable.add("first");
        assertTrue(hashTable.lookup("first"));
    }

}