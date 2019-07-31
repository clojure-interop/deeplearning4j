(ns org.deeplearning4j.rl4j.learning.sync.SyncLearning
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.sync SyncLearning]))

(defn ->sync-learning
  "Constructor.

  conf - `org.deeplearning4j.rl4j.learning.ILearning$LConfiguration`"
  (^SyncLearning [^org.deeplearning4j.rl4j.learning.ILearning$LConfiguration conf]
    (new SyncLearning conf)))

(defn train
  ""
  ([^SyncLearning this]
    (-> this (.train))))

