(ns org.datavec.audio.fingerprint.MapRank
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint MapRank]))

(defn get-ordered-key-list
  "num-keys - `int`
  sharp-limit - `boolean`

  returns: `java.util.List`"
  (^java.util.List [^MapRank this ^Integer num-keys ^Boolean sharp-limit]
    (-> this (.getOrderedKeyList num-keys sharp-limit))))

