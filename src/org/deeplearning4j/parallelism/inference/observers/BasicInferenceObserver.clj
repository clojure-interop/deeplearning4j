(ns org.deeplearning4j.parallelism.inference.observers.BasicInferenceObserver
  "Simple Observer implementation for
 sequential inference"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.parallelism.inference.observers BasicInferenceObserver]))

(defn ->basic-inference-observer
  "Constructor."
  (^BasicInferenceObserver []
    (new BasicInferenceObserver )))

(defn update
  "o - `java.util.Observable`
  arg - `java.lang.Object`"
  ([^BasicInferenceObserver this ^java.util.Observable o ^java.lang.Object arg]
    (-> this (.update o arg))))

(defn wait-till-done
  "FOR DEBUGGING ONLY, TO BE REMOVED BEFORE MERGE"
  ([^BasicInferenceObserver this]
    (-> this (.waitTillDone))))

