(ns org.datavec.spark.transform.utils.adapter.BiFunctionAdapter
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.spark.transform.utils.adapter BiFunctionAdapter]))

(defn ->bi-function-adapter
  "Constructor.

  fn - `org.nd4j.linalg.function.BiFunction`"
  (^BiFunctionAdapter [^org.nd4j.linalg.function.BiFunction fn]
    (new BiFunctionAdapter fn)))

(defn call
  "v-1 - `A`
  v-2 - `B`

  returns: `R`

  throws: java.lang.Exception"
  ([^BiFunctionAdapter this v-1 v-2]
    (-> this (.call v-1 v-2))))

