(ns org.nd4j.jita.allocator.time.Ring
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.jita.allocator.time Ring]))

(defn get-average
  "returns: `float`"
  (^Float [^Ring this]
    (-> this (.getAverage))))

(defn store
  "rate - `float`"
  ([^Ring this ^Float rate]
    (-> this (.store rate))))

