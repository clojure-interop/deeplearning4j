(ns org.nd4j.linalg.util.MultiValueMap
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.util MultiValueMap]))

(defn get-first
  "var-1 - `K`

  returns: `V`"
  ([^MultiValueMap this var-1]
    (-> this (.getFirst var-1))))

(defn add
  "var-1 - `K`
  var-2 - `V`"
  ([^MultiValueMap this var-1 var-2]
    (-> this (.add var-1 var-2))))

(defn set
  "var-1 - `K`
  var-2 - `V`"
  ([^MultiValueMap this var-1 var-2]
    (-> this (.set var-1 var-2))))

(defn set-all
  "var-1 - `java.util.Map`"
  ([^MultiValueMap this ^java.util.Map var-1]
    (-> this (.setAll var-1))))

(defn to-single-value-map
  "returns: `java.util.Map<K,V>`"
  (^java.util.Map [^MultiValueMap this]
    (-> this (.toSingleValueMap))))

