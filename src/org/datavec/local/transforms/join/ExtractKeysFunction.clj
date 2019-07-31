(ns org.datavec.local.transforms.join.ExtractKeysFunction
  "Created by huitseeker on 3/6/17."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.local.transforms.join ExtractKeysFunction]))

(defn ->extract-keys-function
  "Constructor."
  (^ExtractKeysFunction []
    (new ExtractKeysFunction )))

(defn apply
  "Description copied from interface: Function

  writables - Input - `java.util.List`

  returns: Result - `org.nd4j.linalg.primitives.Pair<java.util.List<org.datavec.api.writable.Writable>,java.util.List<org.datavec.api.writable.Writable>>`"
  (^org.nd4j.linalg.primitives.Pair [^ExtractKeysFunction this ^java.util.List writables]
    (-> this (.apply writables))))

