(ns org.deeplearning4j.rl4j.learning.async.AsyncThread
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.rl4j.learning.async AsyncThread]))

(defn ->async-thread
  "Constructor.

  async-global - `org.deeplearning4j.rl4j.learning.async.AsyncGlobal`
  thread-number - `int`"
  (^AsyncThread [^org.deeplearning4j.rl4j.learning.async.AsyncGlobal async-global ^Integer thread-number]
    (new AsyncThread async-global thread-number)))

(defn set-history-processor
  "conf - `org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration`"
  ([^AsyncThread this ^org.deeplearning4j.rl4j.learning.IHistoryProcessor$Configuration conf]
    (-> this (.setHistoryProcessor conf))))

(defn run
  ""
  ([^AsyncThread this]
    (-> this (.run))))

