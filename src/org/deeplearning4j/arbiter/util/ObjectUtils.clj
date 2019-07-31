(ns org.deeplearning4j.arbiter.util.ObjectUtils
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.arbiter.util ObjectUtils]))

(defn *value-to-string
  "Get the string representation of the object. Arrays, including primitive arrays, are printed using
  Arrays.toString(...) methods.

  v - Value to convert to a string - `java.lang.Object`

  returns: String representation - `java.lang.String`"
  (^java.lang.String [^java.lang.Object v]
    (ObjectUtils/valueToString v)))

