package learning.groovy

import spock.lang.Specification

/**
 * Created by ngandriau on 3/11/14.
 */
class CalculatorTest extends Specification {
    def "AddInteger"() {
        given:
            Calculator calc = new Calculator()

        when:
            def result = calc.addInteger(1, 1)
        then:
            result == 2
    }
}
