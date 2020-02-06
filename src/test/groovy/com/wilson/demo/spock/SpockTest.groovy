package com.wilson.demo.spock


import com.wilson.demo.spock.test.LambdaTest
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import spock.lang.Specification;
import spock.lang.Unroll

/**
 * Spock 单元测试
 * @author Wilson 2019/12/05
 * @version 0.0.0
 * @since 0.0.0
 */
@SpringBootTest
class SpockTest extends Specification {
    @Autowired
    private LambdaTest lambdaTest

    @Unroll
    def "test findByName with input #name return #result"() {
        given:
        println("given-----")

        expect:
        println("expect-----")
        lambdaTest.findByName(name) == result

        cleanup:
        println("cleanup-----")

        where:
        name | result
        "a"  | "a"
        "b"  | "b"
        "kk" | null


    }
}