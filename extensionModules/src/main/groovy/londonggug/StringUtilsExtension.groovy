// src/main/groovy/londonggug/StringUtilsExtension.groovy
package londonggug
class StringUtilsExtension {
    static String truncate(String self, Integer length, Boolean overflow = false) {
        self.take(length) + (overflow ? '...' : '')
    }
}