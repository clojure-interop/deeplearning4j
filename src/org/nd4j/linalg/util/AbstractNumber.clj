(ns org.nd4j.linalg.util.AbstractNumber
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util AbstractNumber]))

(defn add
  "b - `org.nd4j.linalg.util.AbstractNumber`

  returns: `org.nd4j.linalg.util.AbstractNumber`"
  (^org.nd4j.linalg.util.AbstractNumber [^AbstractNumber this ^org.nd4j.linalg.util.AbstractNumber b]
    (-> this (.add b))))

(defn sub
  "b - `org.nd4j.linalg.util.AbstractNumber`

  returns: `org.nd4j.linalg.util.AbstractNumber`"
  (^org.nd4j.linalg.util.AbstractNumber [^AbstractNumber this ^org.nd4j.linalg.util.AbstractNumber b]
    (-> this (.sub b))))

(defn mult
  "b - `org.nd4j.linalg.util.AbstractNumber`

  returns: `org.nd4j.linalg.util.AbstractNumber`"
  (^org.nd4j.linalg.util.AbstractNumber [^AbstractNumber this ^org.nd4j.linalg.util.AbstractNumber b]
    (-> this (.mult b))))

(defn div
  "b - `org.nd4j.linalg.util.AbstractNumber`

  returns: `org.nd4j.linalg.util.AbstractNumber`"
  (^org.nd4j.linalg.util.AbstractNumber [^AbstractNumber this ^org.nd4j.linalg.util.AbstractNumber b]
    (-> this (.div b))))

