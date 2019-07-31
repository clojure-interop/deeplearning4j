(ns org.nd4j.linalg.indexing.functions.StableNumber
  "Returns a stable number based on infinity
 or nan"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.functions StableNumber]))

(defn ->stable-number
  "Constructor.

  type - `org.nd4j.linalg.indexing.functions.StableNumber$Type`"
  (^StableNumber [^org.nd4j.linalg.indexing.functions.StableNumber$Type type]
    (new StableNumber type)))

(defn apply
  "number - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^StableNumber this ^java.lang.Number number]
    (-> this (.apply number))))

