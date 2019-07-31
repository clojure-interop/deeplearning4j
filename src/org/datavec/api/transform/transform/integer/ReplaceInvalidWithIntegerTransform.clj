(ns org.datavec.api.transform.transform.integer.ReplaceInvalidWithIntegerTransform
  "Replace an invalid (non-integer) value in a column with a specified integer"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer ReplaceInvalidWithIntegerTransform]))

(defn ->replace-invalid-with-integer-transform
  "Constructor.

  column-name - `java.lang.String`
  value - `int`"
  (^ReplaceInvalidWithIntegerTransform [^java.lang.String column-name ^Integer value]
    (new ReplaceInvalidWithIntegerTransform column-name value)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^ReplaceInvalidWithIntegerTransform this ^java.lang.Object input]
    (-> this (.map input))))

