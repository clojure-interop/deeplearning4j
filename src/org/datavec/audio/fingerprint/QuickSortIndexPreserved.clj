(ns org.datavec.audio.fingerprint.QuickSortIndexPreserved
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint QuickSortIndexPreserved]))

(defn ->quick-sort-index-preserved
  "Constructor.

  array - `int[]`"
  (^QuickSortIndexPreserved [array]
    (new QuickSortIndexPreserved array)))

(defn get-sort-indexes
  "returns: `int[]`"
  ([^QuickSortIndexPreserved this]
    (-> this (.getSortIndexes))))

