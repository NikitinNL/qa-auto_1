package com.demoqa;

import org.junit.jupiter.api.*;

public class FirstJUnitTest {

    @BeforeAll
    static void beforeAll() {        // анатация  Метод который будет выполняться ОДИН РАЗ перед всеми запусками
        System.out.println(" ##### @beforeAll");          // вывод в консоль
    }


    @AfterAll
    static void afterAll() {         // анатация  Метод который будет выполняться ОДИН РАЗ вконце всех запусков
        System.out.println(" ##### @afterAll");          // вывод в консоль
    }

    @BeforeEach                      //анатация  Метод который будет выполняться перед каждым тестом
    void beforeEach() {              // метод
        System.out.println("    ##### @beforeEach");          // вывод в консоль
    }


    @AfterEach                      //анатация  Метод который будет выполняться в конце каждого теста
    void AfterEach() {              // метод
        System.out.println("    ##### @AfterEach");          // вывод в консоль
    }



    @Test                           //анотация, ставится только над методом для распознания Junit что запускать, над class - не ставится!
    void firstTest() {
        Assertions.assertTrue(3 > 2);     // Assertion - проверка
        System.out.println("        ##### @Test_firstTest");
    }


    @Test                           //анотация, ставится только над методом для распознания Junit что запускать, над class - не ставится!
    void secondTest() {
        Assertions.assertTrue(3 > 2);     // Assertion - проверка
        System.out.println("        ##### @Test_secondTest");
    }
}
