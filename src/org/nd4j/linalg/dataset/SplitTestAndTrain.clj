(ns org.nd4j.linalg.dataset.SplitTestAndTrain
  "SplitV test and train"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.nd4j.linalg.dataset SplitTestAndTrain]))

(defn ->split-test-and-train
  "Constructor.

  train - `org.nd4j.linalg.dataset.DataSet`
  test - `org.nd4j.linalg.dataset.DataSet`"
  (^SplitTestAndTrain [^org.nd4j.linalg.dataset.DataSet train ^org.nd4j.linalg.dataset.DataSet test]
    (new SplitTestAndTrain train test)))

(defn get-test
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^SplitTestAndTrain this]
    (-> this (.getTest))))

(defn set-test
  "test - `org.nd4j.linalg.dataset.DataSet`"
  ([^SplitTestAndTrain this ^org.nd4j.linalg.dataset.DataSet test]
    (-> this (.setTest test))))

(defn get-train
  "returns: `org.nd4j.linalg.dataset.DataSet`"
  (^org.nd4j.linalg.dataset.DataSet [^SplitTestAndTrain this]
    (-> this (.getTrain))))

(defn set-train
  "train - `org.nd4j.linalg.dataset.DataSet`"
  ([^SplitTestAndTrain this ^org.nd4j.linalg.dataset.DataSet train]
    (-> this (.setTrain train))))

