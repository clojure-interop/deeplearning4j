(ns org.deeplearning4j.earlystopping.saver.InMemoryModelSaver
  "Save the best (and latest) models for early stopping training to memory for later retrieval
 Note: Assumes that network is cloneable via .clone() method"
  (:refer-clojure :only [require comment defn ->])
  (:import [org.deeplearning4j.earlystopping.saver InMemoryModelSaver]))

(defn ->in-memory-model-saver
  "Constructor."
  (^InMemoryModelSaver []
    (new InMemoryModelSaver )))

(defn save-best-model
  "Description copied from interface: EarlyStoppingModelSaver

  net - `T`
  score - `double`

  throws: java.io.IOException"
  ([^InMemoryModelSaver this net ^Double score]
    (-> this (.saveBestModel net score))))

(defn save-latest-model
  "Description copied from interface: EarlyStoppingModelSaver

  net - `T`
  score - `double`

  throws: java.io.IOException"
  ([^InMemoryModelSaver this net ^Double score]
    (-> this (.saveLatestModel net score))))

(defn get-best-model
  "Description copied from interface: EarlyStoppingModelSaver

  returns: `T`

  throws: java.io.IOException"
  ([^InMemoryModelSaver this]
    (-> this (.getBestModel))))

(defn get-latest-model
  "Description copied from interface: EarlyStoppingModelSaver

  returns: `T`

  throws: java.io.IOException"
  ([^InMemoryModelSaver this]
    (-> this (.getLatestModel))))

(defn to-string
  "returns: `java.lang.String`"
  (^java.lang.String [^InMemoryModelSaver this]
    (-> this (.toString))))

