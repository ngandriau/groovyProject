package learning.groovy

import groovy.util.logging.Slf4j

/**
 * Created by ngandriau on 3/11/14.
 */
@Slf4j(value = 'LOG')
class FirstGroovyClass {

    public static void main(String[] args) {
        LOG.info "hello ${System.properties.'user.name'}"
        println "hello ${System.properties.'user.name'}"
    }
}
