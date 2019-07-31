(ns org.datavec.spark.transform.analysis.SelectColumnFunction
  "Select out the value from a single column"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis SelectColumnFunction]))

(defn ->select-column-function
  "Constructor."
  (^SelectColumnFunction []
    (new SelectColumnFunction )))

(defn call
  "writables - `java.util.List`

  returns: `org.datavec.api.writable.Writable`

  throws: java.lang.Exception"
  (^org.datavec.api.writable.Writable [^SelectColumnFunction this ^java.util.List writables]
    (-> this (.call writables))))

