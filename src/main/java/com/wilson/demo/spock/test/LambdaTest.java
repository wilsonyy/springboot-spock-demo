package com.wilson.demo.spock.test;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * 策略模式Lambda实现
 * @author Wilson 2019/12/05
 * @version 0.0.0
 * @since 0.0.0
 */
@Service
public class LambdaTest {
    private static List<String> list = new ArrayList<String>();

    static {
        list.add("a");
        list.add("b");
        list.add("c");
    }

    public interface StringPredicate {
        boolean test(String car);
    }

    public static List<String> filterA(List<String> list, StringPredicate p) {
        List<String> result = new ArrayList<String>();

        for (String a : list) {
            if (p.test(a)) {
                result.add(a);
            }
        }

        return result;
    }

    public String findByName(String name) {
        String result = null;
        for (String text : list) {
            if (name.equals(text)) {
                result = text;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<String> l = filterA(list, (String text) -> {
            return "b".equals(text);
        });
        System.out.println();
    }
}
