(ns org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning IHistoryProcessor$Configuration]))

(defn ->configuration
  "Constructor."
  (^IHistoryProcessor$Configuration []
    (new IHistoryProcessor$Configuration )))

(defn get-shape
  "returns: `int[]`"
  ([^IHistoryProcessor$Configuration this]
    (-> this (.getShape))))

