(ns org.ansj.domain.Nature
  "这里面封装了一些基本的词性."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain Nature]))

(defn ->nature
  "Constructor.

  nature-str - `java.lang.String`
  index - `int`
  nature-index - `int`
  all-frequency - `int`"
  (^Nature [^java.lang.String nature-str ^Integer index ^Integer nature-index ^Integer all-frequency]
    (new Nature nature-str index nature-index all-frequency))
  (^Nature [^java.lang.String nature-str]
    (new Nature nature-str)))

(defn nature-str
  "Instance Constant.

  type: java.lang.String"
  (^java.lang.String [^Nature this]
    (-> this .-natureStr)))

(defn index
  "Instance Constant.

  type: int"
  (^Integer [^Nature this]
    (-> this .-index)))

(defn nature-index
  "Instance Constant.

  type: int"
  (^Integer [^Nature this]
    (-> this .-natureIndex)))

(defn all-frequency
  "Instance Constant.

  type: int"
  (^Integer [^Nature this]
    (-> this .-allFrequency)))

(def *-nw
  "Static Constant.

  type: org.ansj.domain.Nature"
  Nature/NW)

(def *-nrf
  "Static Constant.

  type: org.ansj.domain.Nature"
  Nature/NRF)

(def *-nr
  "Static Constant.

  type: org.ansj.domain.Nature"
  Nature/NR)

(def *-null
  "Static Constant.

  type: org.ansj.domain.Nature"
  Nature/NULL)

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^Nature this]
    (-> this (.toString))))

