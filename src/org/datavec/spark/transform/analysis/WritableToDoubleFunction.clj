(ns org.datavec.spark.transform.analysis.WritableToDoubleFunction
  "Created by Alex on 4/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis WritableToDoubleFunction]))

(defn ->writable-to-double-function
  "Constructor."
  (^WritableToDoubleFunction []
    (new WritableToDoubleFunction )))

(defn call
  "writable - `org.datavec.api.writable.Writable`

  returns: `double`

  throws: java.lang.Exception"
  (^Double [^WritableToDoubleFunction this ^org.datavec.api.writable.Writable writable]
    (-> this (.call writable))))

