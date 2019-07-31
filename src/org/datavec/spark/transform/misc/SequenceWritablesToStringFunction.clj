(ns org.datavec.spark.transform.misc.SequenceWritablesToStringFunction
  "Simple function to map sequence examples to a String format (such as CSV)
 with given quote around the string value if it contains the delimiter."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc SequenceWritablesToStringFunction]))

(defn ->sequence-writables-to-string-function
  "Constructor.

  function with default delimiter (\"\\n\") between time steps

  delim - Delimiter between values within a single time step - `java.lang.String`"
  (^SequenceWritablesToStringFunction [^java.lang.String delim]
    (new SequenceWritablesToStringFunction delim))
  (^SequenceWritablesToStringFunction []
    (new SequenceWritablesToStringFunction ))
  (^SequenceWritablesToStringFunction [^java.lang.String delim ^java.lang.String time-step-delimiter]
    (new SequenceWritablesToStringFunction delim time-step-delimiter)))

(def *-default-delimiter
  "Static Constant.

  type: java.lang.String"
  SequenceWritablesToStringFunction/DEFAULT_DELIMITER)

(def *-default-time-step-delimiter
  "Static Constant.

  type: java.lang.String"
  SequenceWritablesToStringFunction/DEFAULT_TIME_STEP_DELIMITER)

(defn call
  "c - `java.util.List`

  returns: `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^SequenceWritablesToStringFunction this ^java.util.List c]
    (-> this (.call c))))

