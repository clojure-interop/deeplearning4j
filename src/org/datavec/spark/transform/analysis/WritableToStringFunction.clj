(ns org.datavec.spark.transform.analysis.WritableToStringFunction
  "Created by Alex on 4/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis WritableToStringFunction]))

(defn ->writable-to-string-function
  "Constructor."
  (^WritableToStringFunction []
    (new WritableToStringFunction )))

(defn call
  "writable - `org.datavec.api.writable.Writable`

  returns: `java.lang.String`

  throws: java.lang.Exception"
  (^java.lang.String [^WritableToStringFunction this ^org.datavec.api.writable.Writable writable]
    (-> this (.call writable))))

