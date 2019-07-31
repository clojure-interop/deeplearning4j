(ns org.datavec.api.conf.Configuration$IntegerRanges
  "A class that represents a set of positive integer ranges. It parses
 strings of the form: \"2-3,5,7-\" where ranges are separated by comma and
 the lower/upper bounds are separated by dash. Either the lower or upper
 bound may be omitted meaning all values up to or over. So the string
 above means 2, 3, 5, and 7, 8, 9, ..."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.conf Configuration$IntegerRanges]))

(defn ->integer-ranges
  "Constructor.

  new-value - `java.lang.String`"
  (^Configuration$IntegerRanges [^java.lang.String new-value]
    (new Configuration$IntegerRanges new-value))
  (^Configuration$IntegerRanges []
    (new Configuration$IntegerRanges )))

(defn included?
  "Is the given value in the set of ranges

  value - the value to check - `int`

  returns: is the value in the ranges? - `boolean`"
  (^Boolean [^Configuration$IntegerRanges this ^Integer value]
    (-> this (.isIncluded value))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Configuration$IntegerRanges this]
    (-> this (.toString))))

