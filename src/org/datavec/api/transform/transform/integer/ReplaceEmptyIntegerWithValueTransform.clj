(ns org.datavec.api.transform.transform.integer.ReplaceEmptyIntegerWithValueTransform
  "Replace an empty/missing integer with a certain value."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.api.transform.transform.integer ReplaceEmptyIntegerWithValueTransform]))

(defn ->replace-empty-integer-with-value-transform
  "Constructor.

  column-name - `java.lang.String`
  value - `int`"
  (^ReplaceEmptyIntegerWithValueTransform [^java.lang.String column-name ^Integer value]
    (new ReplaceEmptyIntegerWithValueTransform column-name value)))

(defn map
  "Transform an object
  in to another object

  input - the record to transform - `java.lang.Object`

  returns: the transformed writable - `java.lang.Object`"
  (^java.lang.Object [^ReplaceEmptyIntegerWithValueTransform this ^java.lang.Object input]
    (-> this (.map input))))

