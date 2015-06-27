import groovy.time.TimeCategory

use (TimeCategory) {
    println (20.hours + 10.days.from.now)
}

println TimeCategory.getHours(20).plus(TimeCategory.getDays(10).from.now)

