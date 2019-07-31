(ns org.datavec.spark.transform.join.ExtractKeysFunction
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.join ExtractKeysFunction]))

(defn ->extract-keys-function
  "Constructor."
  (^ExtractKeysFunction []
    (new ExtractKeysFunction )))

(defn call
  "writables - `java.util.List`

  returns: `scala.Tuple2<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`

  throws: java.lang.Exception"
  (^scala.Tuple2 [^ExtractKeysFunction this ^java.util.List writables]
    (-> this (.call writables))))

