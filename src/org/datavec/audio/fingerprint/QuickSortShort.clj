(ns org.datavec.audio.fingerprint.QuickSortShort
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint QuickSortShort]))

(defn ->quick-sort-short
  "Constructor.

  array - `short[]`"
  (^QuickSortShort [array]
    (new QuickSortShort array)))

(defn get-sort-indexes
  "returns: `int[]`"
  ([^QuickSortShort this]
    (-> this (.getSortIndexes))))

