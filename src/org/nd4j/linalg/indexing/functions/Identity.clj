(ns org.nd4j.linalg.indexing.functions.Identity
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.functions Identity]))

(defn ->identity
  "Constructor."
  (^Identity []
    (new Identity )))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^Identity this ^java.lang.Number input]
    (-> this (.apply input))))

