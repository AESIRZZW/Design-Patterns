package com.singleton;

/**
 * @ProjectName: Design Patterns
 * @Description: An Demonstration of Lazy-Singleton
 * @Author: Aesir
 * @Date: 2019/3/13 12:44
 */

public class LazySingleton {

    /*
     * Object will not be initialized when class loading,
     * only will be created when it's actually used.
     * This mechanism is known as Lazy Loading.
     */
    private static LazySingleton instance;

    /*
     * Privatized constructor.
     */
    private LazySingleton(){};

    /*
     * Synchronization makes each invocation inefficient.
     * Failure to do so, however, can result in the creation of multiple object instances.
     */
    public static synchronized LazySingleton getInstance(){
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
