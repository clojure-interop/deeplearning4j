(ns org.nd4j.linalg.indexing.functions.Zero
  "Created by agibsonccc on 10/8/14."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.indexing.functions Zero]))

(defn ->zero
  "Constructor."
  (^Zero []
    (new Zero )))

(defn apply
  "input - `java.lang.Number`

  returns: `java.lang.Number`"
  (^java.lang.Number [^Zero this ^java.lang.Number input]
    (-> this (.apply input))))

