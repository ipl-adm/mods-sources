package ru.obvilion.mserver.utils;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Log {
    private static final String
            log    = "[L]: ", warn  = "[W]: ",
            err    = "[E]: ", debug = "[D]: ",
            custom = "[%]: ";

    private static String getTime() {
        return new SimpleDateFormat("dd.MM.yy HH:mm:ss.S ").format(Calendar.getInstance().getTime());
    }

    private static String getMessage(String message, String... n) {
        for(int i = 0; i < n.length; i++) {
            message = message.replace("{"+i+"}", n[i]);
        }
        return message;
    }

    private static String getFrom() {
        Throwable t = new Throwable();
        StackTraceElement elemem = t.getStackTrace()[3];

        return "[" + Thread.currentThread().getName() + "] " + elemem.getClassName() + ":" + elemem.getMethodName() + ":" + elemem.getLineNumber();
    }

    private static void print(String message) {
        System.out.println(message);
        System.out.println("   ⮑ " + getFrom());
    }

    private static void printw(String message) {
        System.out.println(message);
    }

    public static void info(Object message) {
        print(getTime() + log + message);
    }
    public static void info(String message, String... n) {
        print(getTime() + log + getMessage(message, n));
    }

    public static void warn(Object message) {
        print(getTime() + warn + message);
    }
    public static void warn(String message, String... n) {
        print(getTime() + warn + getMessage(message, n));
    }

    public static void err(Object message) {
        print(getTime() + err + message);
    }
    public static void err(String message, String... n) {
        print(getTime() + err + getMessage(message, n));
    }

    public static void debug(Object message) {
        print(getTime() + debug + message);
    }
    public static void debug(String message, String... n) {
        print(getTime() + debug + getMessage(message, n));
    }

    public static void debugw(Object message) {
        printw(getTime() + debug + message);
    }

    public static void custom(String name, Object message) {
        print(getTime() + custom.replace("%", name) + message);
    }
    public static void custom(String name, String message, String... n) {
        print(getTime() + custom.replace("%", name) + getMessage(message, n));
    }
}
