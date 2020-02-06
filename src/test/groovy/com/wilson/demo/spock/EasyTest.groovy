package com.wilson.demo.spock

import com.jayway.jsonpath.internal.function.numeric.Sum
import spock.lang.Specification

class EasyTest extends Specification {
    def "sum should return param1+param2"() {
        expect:
        1 + 1 == 2
    }
}

