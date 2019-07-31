(ns org.datavec.spark.transform.misc.StringToWritablesFunction
  "Convert a String to a List using a DataVec record reader"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc StringToWritablesFunction]))

(defn ->string-to-writables-function
  "Constructor."
  (^StringToWritablesFunction []
    (new StringToWritablesFunction )))

(defn call
  "s - `java.lang.String`

  returns: `java.util.List<org.datavec.api.writable.Writable>`

  throws: java.lang.Exception"
  (^java.util.List [^StringToWritablesFunction this ^java.lang.String s]
    (-> this (.call s))))

