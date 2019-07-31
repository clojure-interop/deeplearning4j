(ns org.datavec.spark.transform.analysis.StringLengthFunction
  "Created by Alex on 4/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis StringLengthFunction]))

(defn ->string-length-function
  "Constructor."
  (^StringLengthFunction []
    (new StringLengthFunction )))

(defn call
  "writable - `org.datavec.api.writable.Writable`

  returns: `double`

  throws: java.lang.Exception"
  (^Double [^StringLengthFunction this ^org.datavec.api.writable.Writable writable]
    (-> this (.call writable))))

