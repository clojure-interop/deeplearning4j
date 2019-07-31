(ns org.datavec.audio.fingerprint.QuickSort
  (:refer-clojure :only [require comment defn ->])
  (:import [org.datavec.audio.fingerprint QuickSort]))

(defn ->quick-sort
  "Constructor."
  (^QuickSort []
    (new QuickSort )))

(defn get-sort-indexes
  "returns: `int[]`"
  ([^QuickSort this]
    (-> this (.getSortIndexes))))

