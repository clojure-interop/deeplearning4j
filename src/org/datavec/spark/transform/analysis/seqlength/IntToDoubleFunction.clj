(ns org.datavec.spark.transform.analysis.seqlength.IntToDoubleFunction
  "Created by Alex on 12/03/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.analysis.seqlength IntToDoubleFunction]))

(defn ->int-to-double-function
  "Constructor."
  (^IntToDoubleFunction []
    (new IntToDoubleFunction )))

(defn call
  "integer - `java.lang.Integer`

  returns: `double`

  throws: java.lang.Exception"
  (^Double [^IntToDoubleFunction this ^java.lang.Integer integer]
    (-> this (.call integer))))

