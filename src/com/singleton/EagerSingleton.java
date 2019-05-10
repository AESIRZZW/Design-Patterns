package com.singleton;

/**
 * @ProjectName: Design Patterns
 * @Description: An Demonstration of Eager-Singleton
 * @Author: Aesir
 * @Date: 2019/3/13 12:05
 */

public class EagerSingleton {

    /*
     * Object will be initialized immediately when class loading, and this process is
     * naturally thread-safe due to the class loader mechanism.
     * However，this is a waste if the object is never used.
     */
    private static EagerSingleton instance = new EagerSingleton();

    /*
     * Privatized constructor.
     */
    private EagerSingleton() {
    }

    ;

    /*
     * There is no need for synchronization and it's efficient.
     */
    public static EagerSingleton getInstance() {
        return instance;
    }
}
