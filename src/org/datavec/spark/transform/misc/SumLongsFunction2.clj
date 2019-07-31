(ns org.datavec.spark.transform.misc.SumLongsFunction2
  "Created by Alex on 03/09/2016."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.misc SumLongsFunction2]))

(defn ->sum-longs-function-2
  "Constructor."
  (^SumLongsFunction2 []
    (new SumLongsFunction2 )))

(defn call
  "l-1 - `java.lang.Long`
  l-2 - `java.lang.Long`

  returns: `java.lang.Long`

  throws: java.lang.Exception"
  (^java.lang.Long [^SumLongsFunction2 this ^java.lang.Long l-1 ^java.lang.Long l-2]
    (-> this (.call l-1 l-2))))

