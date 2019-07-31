(ns org.datavec.audio.fingerprint.QuickSortDouble
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint QuickSortDouble]))

(defn ->quick-sort-double
  "Constructor.

  array - `double[]`"
  (^QuickSortDouble [array]
    (new QuickSortDouble array)))

(defn get-sort-indexes
  "returns: `int[]`"
  ([^QuickSortDouble this]
    (-> this (.getSortIndexes))))

