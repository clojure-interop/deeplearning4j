(ns org.deeplearning4j.eval.ROC$CountsForThreshold
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.eval ROC$CountsForThreshold]))

(defn ->counts-for-threshold
  "Constructor.

  threshold - `double`"
  (^ROC$CountsForThreshold [^Double threshold]
    (new ROC$CountsForThreshold threshold)))

(defn increment-true-positive
  "count - `long`"
  ([^ROC$CountsForThreshold this ^Long count]
    (-> this (.incrementTruePositive count))))

(defn increment-false-positive
  "count - `long`"
  ([^ROC$CountsForThreshold this ^Long count]
    (-> this (.incrementFalsePositive count))))

(defn clone
  "returns: `org.deeplearning4j.eval.ROC$CountsForThreshold`"
  (^org.deeplearning4j.eval.ROC$CountsForThreshold [^ROC$CountsForThreshold this]
    (-> this (.clone))))

