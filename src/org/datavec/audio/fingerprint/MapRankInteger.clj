(ns org.datavec.audio.fingerprint.MapRankInteger
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint MapRankInteger]))

(defn ->map-rank-integer
  "Constructor.

  map - `java.util.Map`
  acsending - `boolean`"
  (^MapRankInteger [^java.util.Map map ^Boolean acsending]
    (new MapRankInteger map acsending)))

(defn get-ordered-key-list
  "num-keys - `int`
  sharp-limit - `boolean`

  returns: `java.util.List`"
  (^java.util.List [^MapRankInteger this ^Integer num-keys ^Boolean sharp-limit]
    (-> this (.getOrderedKeyList num-keys sharp-limit))))

