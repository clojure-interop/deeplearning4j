(ns org.datavec.spark.transform.analysis.CategoricalToPairFunction
  "Created by Alex on 4/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis CategoricalToPairFunction]))

(defn ->categorical-to-pair-function
  "Constructor."
  (^CategoricalToPairFunction []
    (new CategoricalToPairFunction )))

(defn call
  "writable - `org.datavec.api.writable.Writable`

  returns: `scala.Tuple2<java.lang.String,java.lang.Integer>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^CategoricalToPairFunction this ^org.datavec.api.writable.Writable writable]
    (-> this (.call writable))))

