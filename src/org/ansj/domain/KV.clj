(ns org.ansj.domain.KV
  (:refer-clojure :only [require comment defn ->])
  (:import [org.ansj.domain KV]))

(defn *with
  "k - `K`
  v - `V`

  returns: `<K,V> org.ansj.domain.KV<K,V>`"
  ([k v]
    (KV/with k v)))

(defn set-k
  "k - `K`"
  ([^KV this k]
    (-> this (.setK k))))

(defn set-v
  "v - `V`"
  ([^KV this v]
    (-> this (.setV v))))

(defn get-k
  "returns: `K`"
  ([^KV this]
    (-> this (.getK))))

(defn get-v
  "returns: `V`"
  ([^KV this]
    (-> this (.getV))))

