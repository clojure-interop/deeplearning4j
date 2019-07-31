(ns org.ansj.domain.NumNatureAttr
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain NumNatureAttr]))

(defn ->num-nature-attr
  "Constructor."
  (^NumNatureAttr []
    (new NumNatureAttr )))

(def *-null
  "Static Constant.

  type: org.ansj.domain.NumNatureAttr"
  NumNatureAttr/NULL)

(defn num-freq
  "Instance Field.

  type: int"
  (^Integer [^NumNatureAttr this]
    (-> this .-numFreq)))

(defn num-end-freq
  "Instance Field.

  type: int"
  (^Integer [^NumNatureAttr this]
    (-> this .-numEndFreq)))

(defn flag
  "Instance Field.

  type: boolean"
  (^Boolean [^NumNatureAttr this]
    (-> this .-flag)))

