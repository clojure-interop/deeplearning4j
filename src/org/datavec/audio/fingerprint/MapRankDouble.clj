(ns org.datavec.audio.fingerprint.MapRankDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint MapRankDouble]))

(defn ->map-rank-double
  "Constructor.

  map - `java.util.Map`
  acsending - `boolean`"
  (^MapRankDouble [^java.util.Map map ^Boolean acsending]
    (new MapRankDouble map acsending)))

(defn get-ordered-key-list
  "num-keys - `int`
  sharp-limit - `boolean`

  returns: `java.util.List`"
  (^java.util.List [^MapRankDouble this ^Integer num-keys ^Boolean sharp-limit]
    (-> this (.getOrderedKeyList num-keys sharp-limit))))

