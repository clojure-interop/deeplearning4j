(ns org.deeplearning4j.nn.conf.distribution.Distribution
  "An abstract distribution."
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.nn.conf.distribution Distribution]))

(defn ->distribution
  "Constructor."
  (^Distribution []
    (new Distribution )))

(defn clone
  "returns: `org.deeplearning4j.nn.conf.distribution.Distribution`"
  (^org.deeplearning4j.nn.conf.distribution.Distribution [^Distribution this]
    (-> this (.clone))))

