(ns org.datavec.audio.fingerprint.QuickSortInteger
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint QuickSortInteger]))

(defn ->quick-sort-integer
  "Constructor.

  array - `int[]`"
  (^QuickSortInteger [array]
    (new QuickSortInteger array)))

(defn get-sort-indexes
  "returns: `int[]`"
  ([^QuickSortInteger this]
    (-> this (.getSortIndexes))))

