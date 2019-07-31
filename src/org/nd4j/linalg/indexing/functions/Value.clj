(ns org.nd4j.linalg.indexing.functions.Value
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.functions Value]))

(defn ->value
  "Constructor.

  number - `java.lang.Number`"
  (^Value [^java.lang.Number number]
    (new Value number)))

(defn apply
  "number - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^Value this ^java.lang.Number number]
    (-> this (.apply number))))

